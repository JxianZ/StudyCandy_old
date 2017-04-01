package com.studycandy.a2c.client.session;

import com.studycandy.a2c.remote.RemoteServiceInterface;
import org.apache.shiro.session.Session;
import org.apache.shiro.session.mgt.eis.CachingSessionDAO;

import java.io.Serializable;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/31
 */
public class ClientSessionDAO extends CachingSessionDAO {
    private RemoteServiceInterface remoteService;
    private String appKey;

    public void setRemoteService(RemoteServiceInterface remoteService) {
        this.remoteService = remoteService;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    protected void doDelete(Session session) {
        remoteService.deleteSession(appKey, session);
    }

    protected void doUpdate(Session session) {
        remoteService.updateSession(appKey, session);
    }

    protected Serializable doCreate(Session session) {
        Serializable sessionId = remoteService.createSession(session);
        assignSessionId(session, sessionId);
        return sessionId;
    }

    protected Session doReadSession(Serializable sessionId) {
        return remoteService.getSession(appKey, sessionId);
    }
}
