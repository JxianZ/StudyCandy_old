package com.studycandy.a2c.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/31
 */
@ConfigurationProperties("client")
public class A2cClientProperties {
    private String appKey;
    //远程服务URL地址 client.app.key client.remote.service.url
    private String remoteServiceUrl;
    //登录地址 client.login.url
    private String loginUrl;
    //登录成功后，默认重定向到的地址  client.success.url
    private String successUrl;
    //未授权重定向到的地址 client.unauthorized.url
    private String unauthorizedUrl;
    //session id 域名 client.cookie.domain
    private String cookieDomain;
    //session id 路径  client.cookie.path
    private String cookiePath;
    //cookie中的session id名称 client.session.id
    private String sessionId;
    //cookie中的remember me名称 client.rememberMe.id
    private String rememberMeCookieId;
    /*
     * 过滤器 name=filter-ref;name=filter-ref
     * client.filters
     */
    private String filters;
    /*
     * 过滤器链 格式 url=filters;url=filters
     * client.filter.chain.definitions=/**=anon
     */
    private String filterChains;

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getRemoteServiceUrl() {
        return remoteServiceUrl;
    }

    public void setRemoteServiceUrl(String remoteServiceUrl) {
        this.remoteServiceUrl = remoteServiceUrl;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }

    public String getSuccessUrl() {
        return successUrl;
    }

    public void setSuccessUrl(String successUrl) {
        this.successUrl = successUrl;
    }

    public String getUnauthorizedUrl() {
        return unauthorizedUrl;
    }

    public void setUnauthorizedUrl(String unauthorizedUrl) {
        this.unauthorizedUrl = unauthorizedUrl;
    }

    public String getCookieDomain() {
        return cookieDomain;
    }

    public void setCookieDomain(String cookieDomain) {
        this.cookieDomain = cookieDomain;
    }

    public String getCookiePath() {
        return cookiePath;
    }

    public void setCookiePath(String cookiePath) {
        this.cookiePath = cookiePath;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getRememberMeCookieId() {
        return rememberMeCookieId;
    }

    public void setRememberMeCookieId(String rememberMeCookieId) {
        this.rememberMeCookieId = rememberMeCookieId;
    }

    public String getFilters() {
        return filters;
    }

    public void setFilters(String filters) {
        this.filters = filters;
    }

    public String getFilterChains() {
        return filterChains;
    }

    public void setFilterChains(String filterChains) {
        this.filterChains = filterChains;
    }
}
