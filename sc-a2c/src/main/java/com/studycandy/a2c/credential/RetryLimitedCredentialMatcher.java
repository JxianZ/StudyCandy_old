package com.studycandy.a2c.credential;

import org.apache.log4j.Logger;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.cache.Cache;
import org.apache.shiro.cache.CacheManager;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/24
 */

public class RetryLimitedCredentialMatcher extends HashedCredentialsMatcher {
    private Logger logger = Logger.getLogger(RetryLimitedCredentialMatcher.class);
    private Cache<String, AtomicInteger> passwordRetryCache;

    public RetryLimitedCredentialMatcher(CacheManager cacheManager) {
        passwordRetryCache = cacheManager.getCache("passwordRetryCache");
    }

    @Override
    public boolean doCredentialsMatch(AuthenticationToken token, AuthenticationInfo info) {
        String username = (String) token.getPrincipal();
        AtomicInteger retryCount = passwordRetryCache.get(username);
        if (retryCount == null) {
            retryCount = new AtomicInteger(0);
            passwordRetryCache.put(username, retryCount);
        }
        if (retryCount.incrementAndGet() > 5) {
            // TODO: 2017/3/24 Created By Chenls
            // 5次失败锁定账户

            throw new ExcessiveAttemptsException();
        }

        boolean matches = super.doCredentialsMatch(token, info);
        if (matches) {
            passwordRetryCache.remove(username);
        }
        return matches;
    }
}