package com.studycandy.a2c.remote;

import com.studycandy.a2c.service.AuthorizationService;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.SessionDAO;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/24
 */
// TODO: 2017/3/31 Created By Chenls
// 须重写为appSecret need
public class RemoteService implements RemoteServiceInterface {
    private final AuthorizationService authorizationService;
    private final SessionDAO sessionDAO;

    @Autowired
    public RemoteService(AuthorizationService authorizationService, SessionDAO sessionDAO) {
        this.authorizationService = authorizationService;
        this.sessionDAO = sessionDAO;
    }

    @Override
    public Session getSession(String appKey, Serializable sessionId) {
        return sessionDAO.readSession(sessionId);
    }

    @Override
    public PermissionContext getPermissions(String appKey, String username) {
        PermissionContext pc = new PermissionContext();
        pc.setRoles(authorizationService.findRoles(appKey, username));
        pc.setPermissions(authorizationService.findPermissions(appKey, username));
        return pc;
    }

    @Override
    public void deleteSession(String appKey, Session session) {
        sessionDAO.delete(session);
    }

    @Override
    public void updateSession(String appKey, Session session) {
        sessionDAO.update(session);
    }

    @Override
    public Serializable createSession(Session session) {
        return sessionDAO.create(session);
    }
}
