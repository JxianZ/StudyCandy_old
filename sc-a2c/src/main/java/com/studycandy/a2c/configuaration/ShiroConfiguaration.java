package com.studycandy.a2c.configuaration;

import com.studycandy.a2c.credential.RetryLimitedCredentialMatcher;
import com.studycandy.a2c.realm.MysqlRealm;
import com.studycandy.a2c.session.mapper.MySqlSessionDAO;
import com.studycandy.a2c.session.scheduler.MySqlSessionValidationScheduler;
import com.studycandy.a2c.web.intercepter.CurrentUserInterceptor;
import org.apache.shiro.cache.ehcache.EhCacheManager;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.session.mgt.eis.JavaUuidSessionIdGenerator;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.CookieRememberMeManager;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.servlet.SimpleCookie;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import java.util.HashMap;
import java.util.Map;


/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/28
 */

@Configuration
public class ShiroConfiguaration {
    @Bean("cacheManager")
    public EhCacheManager getEhCacheManager() {
        EhCacheManager cacheManager = new EhCacheManager();
        return cacheManager;
    }

    @Bean
    private RetryLimitedCredentialMatcher getCredentialMatcher() {
        RetryLimitedCredentialMatcher credentialMatcher = new RetryLimitedCredentialMatcher(getEhCacheManager());
        credentialMatcher.setHashAlgorithmName("md5");
        credentialMatcher.setHashIterations(2);
        credentialMatcher.setStoredCredentialsHexEncoded(true);
        return credentialMatcher;
    }

    @Bean("MyRealm")
    private MysqlRealm getRealm() {
        MysqlRealm realm = new MysqlRealm();
        realm.setCredentialsMatcher(getCredentialMatcher());
        realm.setCachingEnabled(false);
        return realm;
    }

    @Bean
    private JavaUuidSessionIdGenerator getSessionIdGenerator() {
        return new JavaUuidSessionIdGenerator();
    }

    private SimpleCookie getSessionIdCookie() {
        SimpleCookie cookie = new SimpleCookie("sid");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(-1);
        cookie.setDomain("");
        cookie.setPath("/");
        return cookie;
    }

    @Bean
    private SimpleCookie getRememberMeCookie() {
        SimpleCookie cookie = new SimpleCookie("rememberMe");
        cookie.setHttpOnly(true);
        cookie.setMaxAge(2592000);
        cookie.setDomain("");
        cookie.setPath("/");
        return cookie;
    }

    private CookieRememberMeManager getRememberMeManager() {
        CookieRememberMeManager rememberMeManager = new CookieRememberMeManager();
        rememberMeManager.setCipherKey(Base64.decode("4AvVhmFLUs0KTA3Kprsdag=="));
        rememberMeManager.setCookie(getRememberMeCookie());
        return rememberMeManager;
    }

    @Bean("sessionDAO")
    private MySqlSessionDAO getSessionDAO() {
        MySqlSessionDAO sessionDAO = new MySqlSessionDAO();
        sessionDAO.setSessionIdGenerator(getSessionIdGenerator());
        sessionDAO.setActiveSessionsCacheName("shiro-activeSessionCache");
        return sessionDAO;
    }

    @Bean
    private MySqlSessionValidationScheduler getSessionValidationScheduler() {
        MySqlSessionValidationScheduler sessionValidationScheduler = new MySqlSessionValidationScheduler();
        sessionValidationScheduler.setInterval(1800000);
        sessionValidationScheduler.setSessionManager(getSessionManager());
        return sessionValidationScheduler;
    }

    @Bean
    public DefaultWebSessionManager getSessionManager() {
        DefaultWebSessionManager sessionManager = new DefaultWebSessionManager();
        sessionManager.setGlobalSessionTimeout(1800000);
        sessionManager.setDeleteInvalidSessions(true);
        sessionManager.setSessionValidationSchedulerEnabled(true);
        sessionManager.setSessionValidationScheduler(getSessionValidationScheduler());
        sessionManager.setSessionDAO(getSessionDAO());
        sessionManager.setSessionIdCookieEnabled(true);
        sessionManager.setSessionIdCookie(getSessionIdCookie());
        return sessionManager;
    }

    @Bean
    public DefaultWebSecurityManager getSecurityManager() {
        DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
        securityManager.setRealm(getRealm());
        securityManager.setSessionManager(getSessionManager());
        securityManager.setRememberMeManager(getRememberMeManager());
        return securityManager;
    }

    @Bean
    public MethodInvokingFactoryBean getMethodInvokingFactoryBean() {
        MethodInvokingFactoryBean factoryBean = new MethodInvokingFactoryBean();
        factoryBean.setStaticMethod("org.apache.shiro.SecurityUtils.setSecurityManager");
        factoryBean.setArguments(new Object[]{getSecurityManager()});
        return factoryBean;
    }

    @Bean
    private CurrentUserInterceptor currentUserInterceptor() {
        return new CurrentUserInterceptor();
    }

    @Bean("shiroFilter")
    public Object getShiroFilter() throws Exception {
        ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();

        Map<String, Filter> filters = new HashMap<>();
        Map<String, String> filterChains = new HashMap<>();

        filters.put("cufilter", currentUserInterceptor());

        filterChains.put("/remoteService", "anon");
        filterChains.put("/login", "authc");
        filterChains.put("/logout", "logout");

        factoryBean.setSecurityManager(getSecurityManager());
        factoryBean.setLoginUrl("/login");
        factoryBean.setFilters(filters);
        factoryBean.setFilterChainDefinitionMap(filterChains);
        return factoryBean.getObject();
    }

    @Bean("lifecycleBeanPostProcessor")
    public LifecycleBeanPostProcessor getLifecycleBeanPostProcessor() {
        return new LifecycleBeanPostProcessor();
    }
}
