package com.studycandy.a2c.starter;

import com.studycandy.a2c.client.filter.ClientAuthenticationFilter;
import com.studycandy.a2c.client.filter.ClientShiroFilterFactoryBean;
import com.studycandy.a2c.client.realm.ClientRemoteRealm;
import com.studycandy.a2c.client.session.ClientSessionDAO;
import com.studycandy.a2c.remote.RemoteServiceInterface;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.httpinvoker.HttpInvokerProxyFactoryBean;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/31
 */
@Configuration
@EnableConfigurationProperties(A2cClientProperties.class)
@ConditionalOnClass(ClientRemoteRealm.class)
@ConditionalOnProperty(prefix = "client", name = "appkey")
public class A2cClientAutoConfiguration {
    private A2cClientProperties properties;

    public A2cClientAutoConfiguration(A2cClientProperties properties) {
        this.properties = properties;
    }

    @Bean
    public Realm getRemoteRealm() {
        ClientRemoteRealm realm = new ClientRemoteRealm();
        realm.setCachingEnabled(false);
        realm.setAppKey(properties.getAppKey());
        realm.setRemoteService(getRemoteService());
        return realm;
    }

    @Bean
    private RemoteServiceInterface getRemoteService() {
        HttpInvokerProxyFactoryBean b = new HttpInvokerProxyFactoryBean();
        b.setServiceInterface(RemoteServiceInterface.class);
        b.setServiceUrl(properties.getRemoteServiceUrl());
        b.afterPropertiesSet();
        return (RemoteServiceInterface) b.getObject();
    }

    /*
    <!-- Shiro生命周期处理器-->
    <bean id="lifecycleBeanPostProcessor" class="org.apache.shiro.spring.LifecycleBeanPostProcessor"/>
    */
    @Bean
    public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }

    /*
    <!-- 会话ID生成器 -->
    <bean id="sessionIdGenerator" class="org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator"/>
    */
    @Bean("sessionIdGenerator")
    public JavaUuidSessionIdGenerator getSessionIdGenerator() {
        return new JavaUuidSessionIdGenerator();
    }
    /*
    <!-- 会话Cookie模板 -->
    <bean id="sessionIdCookie" class="org.apache.shiro.web.servlet.SimpleCookie">
        <constructor-arg value="${client.session.id}"/>
        <property name="httpOnly" value="true"/>
        <property name="maxAge" value="-1"/>
        <property name="domain" value="${client.cookie.domain}"/>
        <property name="path" value="${client.cookie.path}"/>
    </bean>
    */

    @Bean(value = "sessionIdCookie", autowire = Autowire.NO)
    private SimpleCookie getSessionIdCookie() {
        SimpleCookie cookie = new SimpleCookie(properties.getSessionId());
        cookie.setHttpOnly(true);
        cookie.setMaxAge(-1);
        cookie.setDomain(properties.getCookieDomain());
        cookie.setPath(properties.getCookiePath());
        return cookie;
    }

    /*
    <bean id="rememberMeCookie" class="org.apache.shiro.web.servlet.SimpleCookie">
        <constructor-arg value="${client.rememberMe.id}"/>
        <property name="httpOnly" value="true"/>
        <property name="maxAge" value="2592000"/><!-- 30天 -->
        <property name="domain" value="${client.cookie.domain}"/>
        <property name="path" value="${client.cookie.path}"/>
    </bean>
    */
    @Bean(value = "rememberMeCookie", autowire = Autowire.NO)
    private SimpleCookie getRememberMeCookie() {
        SimpleCookie cookie = new SimpleCookie(properties.getRememberMeCookieId());
        cookie.setHttpOnly(true);
        //此处设置rememberMe生效时间 30d
        cookie.setMaxAge(2592000);
        cookie.setPath(properties.getCookiePath());
        cookie.setDomain(properties.getCookieDomain());
        return cookie;
    }

    /*
    <!-- rememberMe管理器 -->
    <bean id="rememberMeManager" class="org.apache.shiro.web.mgt.CookieRememberMeManager">
        <!-- rememberMe cookie加密的密钥 建议每个项目都不一样 默认AES算法 密钥长度（128 256 512 位）-->
        <property name="cipherKey"
    value="#{T(org.apache.shiro.codec.Base64).decode('4AvVhmFLUs0KTA3Kprsdag==')}"/>
        <property name="cookie" ref="rememberMeCookie"/>
    </bean>
    */
    @Bean("rememberMeManager")
    public CookieRememberMeManager getRememberMeManager() {
        CookieRememberMeManager manager = new CookieRememberMeManager();
        manager.setCipherKey(
                Base64.decode("4AvVhmFLUs0KTA3Kprsdag==")
        );
        manager.setCookie(getRememberMeCookie());
        return manager;
    }

    /*
    <!-- 会话DAO -->
    <bean id="sessionDAO" class="com.github.zhangkaitao.shiro.chapter23.client.ClientSessionDAO">
        <property name="sessionIdGenerator" ref="sessionIdGenerator"/>
        <property name="appKey" value="${client.app.key}"/>
        <property name="remoteService" ref="remoteService"/>
    </bean>
    */
    @Bean("sessionDAO")
    public ClientSessionDAO getSessionDAO() {
        ClientSessionDAO sessionDAO = new ClientSessionDAO();
        sessionDAO.setAppKey(properties.getAppKey());
        sessionDAO.setRemoteService(getRemoteService());
        sessionDAO.setSessionIdGenerator(getSessionIdGenerator());
        return sessionDAO;
    }

    /*
    <!-- 会话管理器 -->
    <bean id="sessionManager" class="org.apache.shiro.web.session.mgt.DefaultWebSessionManager">
        <property name="deleteInvalidSessions" value="false"/>
        <property name="sessionValidationSchedulerEnabled" value="false"/>
        <property name="sessionDAO" ref="sessionDAO"/>
        <property name="sessionIdCookieEnabled" value="true"/>
        <property name="sessionIdCookie" ref="sessionIdCookie"/>
    </bean>
     */
    @Bean("sessionManager")
    public DefaultWebSessionManager getSessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        //??????
        sessionManager.setDeleteInvalidSessions(false);
        sessionManager.setSessionValidationSchedulerEnabled(false);

        sessionManager.setSessionDAO(getSessionDAO());
        sessionManager.setSessionIdCookieEnabled(true);
        sessionManager.setSessionIdCookie(getSessionIdCookie());
        return sessionManager;
    }

    /*
    <!-- 安全管理器 -->
    <bean id="securityManager" class="org.apache.shiro.web.mgt.DefaultWebSecurityManager">
        <property name="realm" ref="remoteRealm"/>
        <property name="sessionManager" ref="sessionManager"/>
        <property name="rememberMeManager" ref="rememberMeManager"/>
    </bean>
    */
    @Bean("securityManager")
    public DefaultWebSecurityManager getSecurityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(getRemoteRealm());
        securityManager.setRememberMeManager(getRememberMeManager());
        securityManager.setSessionManager(getSessionManager());
        return securityManager;
    }

    /*
    <!-- 相当于调用SecurityUtils.setSecurityManager(securityManager) -->
    <bean class="org.springframework.beans.factory.config.MethodInvokingFactoryBean">
        <property name="staticMethod" value="org.apache.shiro.SecurityUtils.setSecurityManager"/>
        <property name="arguments" ref="securityManager"/>
    </bean>
    */
    @Bean
    public MethodInvokingFactoryBean getMethodInvokingFactoryBean() {
        MethodInvokingFactoryBean factoryBean = new MethodInvokingFactoryBean();
        factoryBean.setStaticMethod("org.apache.shiro.SecurityUtils.setSecurityManager");
        factoryBean.setArguments(new Object[]{getSecurityManager()});
        return factoryBean;
    }

    @Bean("clientAuthenticationFilter")
    public ClientAuthenticationFilter getClientAuthenticationFilter() {
        return new ClientAuthenticationFilter();
    }

    /*
    <!-- Shiro的Web过滤器 -->
    <bean id="shiroFilter" class="com.github.zhangkaitao.shiro.chapter23.client.ClientShiroFilterFactoryBean">
        <property name="securityManager" ref="securityManager"/>
        <property name="loginUrl" value="${client.login.url}"/>
        <property name="successUrl" value="${client.success.url}"/>
        <property name="unauthorizedUrl" value="${client.unauthorized.url}"/>
        <property name="filters">
            <storage:map>
                <entry key="authc" value-ref="clientAuthenticationFilter"/>
            </storage:map>
        </property>
        <property name="filtersStr" value="${client.filters}"/>
        <property name="filterChainDefinitionsStr" value="${client.filter.chain.definitions}"/>
    </bean>
    */
    @Bean("shiroFilter")
    public Object getShiroFilter() throws Exception {
        ClientShiroFilterFactoryBean factoryBean = new ClientShiroFilterFactoryBean();
        factoryBean.setSecurityManager(getSecurityManager());
        factoryBean.setLoginUrl(properties.getLoginUrl());
        factoryBean.setSuccessUrl(properties.getSuccessUrl());
        factoryBean.setUnauthorizedUrl(properties.getUnauthorizedUrl());
        factoryBean.setFiltersStr(properties.getFilters());
        factoryBean.setFilterChainDefinitionsStr(properties.getFilterChains());

        return factoryBean.getObject();
    }
}
