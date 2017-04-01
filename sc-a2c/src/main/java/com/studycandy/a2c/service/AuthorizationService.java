package com.studycandy.a2c.service;

import com.studycandy.a2c.model.Permission;
import com.studycandy.a2c.model.Role;
import com.studycandy.a2c.model.UserAppPermission;
import com.studycandy.a2c.model.UserAppRole;

import java.util.List;
import java.util.Set;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/27
 */
public interface AuthorizationService {
    Integer addAppRole(UserAppRole entity);

    Integer deleteAppRoleById(Long id);

    Integer updateAppRole(UserAppRole entity);

    Integer addAppPermission(UserAppPermission entity);

    Integer deleteAppPermissionById(Long id);

    Integer updateAppPermission(UserAppPermission entity);

    UserAppRole getAppRoleById(Long id);

    UserAppPermission getAppPermissionById(Long id);

    List<UserAppRole> getAllAppRole();

    List<UserAppPermission> getAllAppPermission();

    List<Role> getRoleByAppUser(Integer appid, Long userid);

    List<Permission> getPermissionByAppUser(Integer appid, Long userid);

    Set<String> findPermissions(String appkey, String username);

    Set<String> findRoles(String appkey, String username);
}
