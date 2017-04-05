package com.studycandy.a2c.service.impl;

import com.studycandy.a2c.mapper.RoleMapper;
import com.studycandy.a2c.model.Role;
import com.studycandy.a2c.service.PermissionService;
import com.studycandy.a2c.service.RoleService;
import com.studycandy.core.mybatis.SqlRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/29
 */
@Service
public class RoleServiceImpl implements RoleService {
    private final RoleMapper mapper;
    private final PermissionService permissionService;
    private final SqlRunner sqlRunner;

    @Autowired
    public RoleServiceImpl(RoleMapper mapper, PermissionService permissionService, SqlRunner sqlRunner) {
        this.mapper = mapper;
        this.permissionService = permissionService;
        this.sqlRunner = sqlRunner;
    }

    @Override
    public Integer addRole(Role entity) {
        return mapper.insert(entity);
    }

    @Override
    public Integer deleteRoleById(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateRole(Role entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public Role getRoleById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Role> getAll() {
        return mapper.selectAll();
    }

    @Override
    public Set<String> findRoles(Long... roleIds) {
        Set<String> roles = new HashSet<>();
        for (Long roleId : roleIds) {
            Role role = getRoleById(roleId);
            if (role != null)
                roles.add(role.getRoleName());
        }
        return roles;
    }

    @Override
    public Set<String> findPermissions(Long[] roleIds) {
        Set<Long> permissionsIds = new HashSet<>();
        for (Long roleId : roleIds) {
            Role role = getRoleById(roleId);
            if (role == null)
                permissionsIds.addAll(role.getRolePermissionIdList());
        }
        return permissionService.findPermissions(permissionsIds);
    }
}