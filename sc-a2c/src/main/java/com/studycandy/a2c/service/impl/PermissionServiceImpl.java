package com.studycandy.a2c.service.impl;

import com.studycandy.a2c.mapper.PermissionMapper;
import com.studycandy.a2c.model.Permission;
import com.studycandy.a2c.service.PermissionService;
import com.studycandy.core.mybatis.SqlRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/29
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    private final PermissionMapper mapper;
    private final SqlRunner sqlRunner;

    @Autowired
    public PermissionServiceImpl(PermissionMapper mapper, SqlRunner sqlRunner) {
        this.mapper = mapper;
        this.sqlRunner = sqlRunner;
    }

    @Override
    public Integer addPermission(Permission entity) {
        return mapper.insert(entity);
    }

    @Override
    public Integer deleteById(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updatePermission(Permission entity) {
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public Permission getPermissionById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Permission> getAll() {
        return mapper.selectAll();
    }

    @Override
    public Set<String> findPermissions(Set<Long> permissionIds) {
        Set<String> permissions = new HashSet<>();
        for (Long permissionsId : permissionIds) {
            Permission permission = getPermissionById(permissionsId);
            if (permission != null && !StringUtils.isEmpty(permission.getPermissionValue()))
                permissions.add(permission.getPermissionValue());
        }
        return permissions;
    }
}
