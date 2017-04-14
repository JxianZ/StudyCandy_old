package com.studycandy.a2c.remote;

import com.studycandy.a2c.exception.AppUnavailableException;
import com.studycandy.a2c.service.AppService;
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

public class RemoteService implements RemoteServiceInterface {
    private final AuthorizationService authorizationService;
    private final SessionDAO sessionDAO;
    private final AppService appService;

    @Autowired
    public RemoteService(AuthorizationService authorizationService, SessionDAO sessionDAO, AppService appService) {
        this.authorizationService = authorizationService;
        this.sessionDAO = sessionDAO;
        this.appService = appService;
    }

    @Override
    public Session getSession(String appKey, Serializable sessionId) {
        if (!appService.getAppById(appService.getAppIdByAppKey(appKey)).getAvailable()) {
            throw new AppUnavailableException();
        }
        return sessionDAO.readSession(sessionId);
    }

    @Override
    public PermissionContext getPermissions(String appKey, String username) {
        if (!appService.getAppById(appService.getAppIdByAppKey(appKey)).getAvailable()) {
            throw new AppUnavailableException();
        }
        PermissionContext pc = new PermissionContext();
        pc.setRoles(authorizationService.findRoles(appKey, username));
        pc.setPermissions(authorizationService.findPermissions(appKey, username));
        return pc;
    }

    @Override
    public void deleteSession(String appKey, Session session) {
        if (!appService.getAppById(appService.getAppIdByAppKey(appKey)).getAvailable()) {
            throw new AppUnavailableException();
        }
        sessionDAO.delete(session);
    }

    @Override
    public void updateSession(String appKey, Session session) {
        if (!appService.getAppById(appService.getAppIdByAppKey(appKey)).getAvailable()) {
            throw new AppUnavailableException();
        }
        sessionDAO.update(session);
    }

    @Override
    public Serializable createSession(Session session) {
        return sessionDAO.create(session);
    }
}
