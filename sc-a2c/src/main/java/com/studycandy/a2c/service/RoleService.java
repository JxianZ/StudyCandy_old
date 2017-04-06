package com.studycandy.a2c.service;

import com.studycandy.a2c.model.Role;

import java.util.List;
import java.util.Set;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/27
 */
public interface RoleService {
    Integer addRole(Role entity);

    Integer deleteRoleById(Long id);

    Integer updateRole(Role entity);

    Role getRoleById(Long id);

    List<Role> getAll();

    Set<String> findRoles(Long... roleIds);

    Set<String> findPermissions(Long[] roleIds);
}
