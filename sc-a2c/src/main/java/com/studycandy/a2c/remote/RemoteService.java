package com.studycandy.a2c.remote;

import org.apache.shiro.session.Session;

import java.io.Serializable;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/24
 */
public class RemoteService implements RemoteServiceInterface {
    @Override
    public Session getSession(String appKey, Serializable sessionId) {
        return null;
    }

    @Override
    public PermissionContext getPermissions(String appKey, String username) {
        return null;
    }

    @Override
    public void deleteSession(String appKey, Session session) {

    }

    @Override
    public void updateSession(String appKey, Session session) {

    }

    @Override
    public Serializable createSession(Session session) {
        return null;
    }
}
