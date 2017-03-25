/**
 * Copyright (c) 2005-2012 https://github.com/zhangkaitao
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 */
package com.studycandy.a2c.remote;

import org.apache.shiro.session.Session;

import java.io.Serializable;

public interface RemoteServiceInterface {

    Session getSession(String appKey, Serializable sessionId);

    Serializable createSession(Session session);

    void updateSession(String appKey, Session session);

    void deleteSession(String appKey, Session session);

    PermissionContext getPermissions(String appKey, String username);
}
