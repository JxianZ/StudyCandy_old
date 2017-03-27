package com.studycandy.a2c.service;

import com.studycandy.a2c.model.Permission;
import com.studycandy.a2c.model.Role;

import java.util.List;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/27
 */
public interface AuthorizationService {
    List<Permission> findPermissions(String appkey, String username);

    List<Role> findRoles(String appkey, String username);
}
