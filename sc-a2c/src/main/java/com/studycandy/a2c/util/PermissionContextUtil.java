package com.studycandy.a2c.util;

import com.studycandy.a2c.remote.PermissionContext;
import com.studycandy.a2c.service.AuthorizationService;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/29
 */
public class PermissionContextUtil {
    public static PermissionContext getPermissionContextByAppKeyAndUsername(String appkey, String username,
                                                                            AuthorizationService authorizationService) {
        PermissionContext pc = new PermissionContext();
        pc.setPermissions(authorizationService.findPermissions(appkey, username));
        pc.setRoles(authorizationService.findRoles(appkey, username));
        return pc;
    }
}
