package com.studycandy.a2c.service.impl;

import com.studycandy.a2c.constant.Constants;
import com.studycandy.a2c.mapper.UserAppPermissionMapper;
import com.studycandy.a2c.mapper.UserAppRoleMapper;
import com.studycandy.a2c.model.*;
import com.studycandy.a2c.service.*;
import com.studycandy.core.mybatis.SqlRunner;
import com.studycandy.core.sql.Row;
import com.studycandy.core.sql.SQLBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/29
 */
@Service
public class AuthorizationServiceImpl implements AuthorizationService {
    private final AppService appService;
    private final UserService userService;
    private final RoleService roleService;
    private final PermissionService permissionService;
    private final UserAppPermissionMapper permissionMapper;
    private final UserAppRoleMapper roleMapper;
    private final SqlRunner sqlRunner;

    @Autowired
    public AuthorizationServiceImpl(AppService appService, UserService userService, RoleService roleService, PermissionService permissionService, UserAppPermissionMapper permissionMapper, UserAppRoleMapper roleMapper, SqlRunner sqlRunner) {
        this.appService = appService;
        this.userService = userService;
        this.roleService = roleService;
        this.permissionService = permissionService;
        this.permissionMapper = permissionMapper;
        this.roleMapper = roleMapper;
        this.sqlRunner = sqlRunner;
    }

    // TODO: 2017/3/31 Created By Chenls
    // 数据进表时保证role_ids 和 per*_ids没有重复值
    // 获取时也需要去重
    @Override
    public Integer addAppRole(UserAppRole entity) {
        return roleMapper.insert(entity);
    }

    @Override
    public Integer deleteAppRoleById(Long id) {
        return roleMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateAppRole(UserAppRole entity) {
        return roleMapper.updateByPrimaryKey(entity);
    }

    @Override
    public Integer addAppPermission(UserAppPermission entity) {
        return permissionMapper.insert(entity);
    }

    @Override
    public Integer deleteAppPermissionById(Long id) {
        return permissionMapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateAppPermission(UserAppPermission entity) {
        return permissionMapper.updateByPrimaryKey(entity);
    }

    @Override
    public UserAppRole getAppRoleById(Long id) {
        return roleMapper.selectByPrimaryKey(id);
    }

    @Override
    public UserAppPermission getAppPermissionById(Long id) {
        return permissionMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<UserAppRole> getAllAppRole() {
        return roleMapper.selectAll();
    }

    @Override
    public List<UserAppPermission> getAllAppPermission() {
        return permissionMapper.selectAll();
    }

    @Override
    public List<Role> getRoleByAppUser(Integer appid, Long userid) {
        SQLBuilder sqlBuilder = new SQLBuilder(UserAppRole.class, Constants.TABLE_PREFIX);
        String sql = sqlBuilder
                .fields("*")
                .where("app_id=" + appid)
                .where("user_id=" + userid)
                .selectSql();
        List<Row> rowList = sqlRunner.select(sql);

        if (rowList.size() == 0)
            return Collections.EMPTY_LIST;

        List<Role> roleList = new ArrayList<>();
        String[] roleIds = rowList.get(0).getString("role_ids").split(",");
        for (String roleId : roleIds) {
            Role role = roleService.getRoleById(Long.parseLong(roleId));
            if (role != null)
                roleList.add(role);
        }
        return roleList;
    }

    @Override
    public List<Permission> getPermissionByAppUser(Integer appid, Long userid) {
        SQLBuilder sqlBuilder = new SQLBuilder(UserAppPermission.class, Constants.TABLE_PREFIX);
        String sql = sqlBuilder
                .fields("*")
                .where("app_id=" + appid)
                .where("user_id=" + userid)
                .selectSql();
        List<Row> rowList = sqlRunner.select(sql);
        if (rowList.size() == 0)
            return Collections.EMPTY_LIST;

        List<Permission> permissionList = new ArrayList<>();
        String[] permissionIds = rowList.get(0).getString("permission_ids").split(",");
        for (String permissionId : permissionIds) {
            Permission permission = permissionService.getPermissionById(Long.parseLong(permissionId));
            if (permission != null)
                permissionList.add(permission);
        }
        return permissionList;
    }

    /*
     * 获取权限
     * 来源 1.直接赋予的权限 2.继承自Role的权限
     */
    @Override
    public Set<String> findPermissions(String appkey, String username) {
        User user = userService.getUserByUsername(username);
        App app = appService.getAppById(
                appService.getAppIdByAppKey(appkey)
        );
        if (user == null || app == null)
            return Collections.EMPTY_SET;

        Set<String> permissions = new HashSet<>();

        //获取直接赋予的权限
        List<Permission> permissionList = getPermissionByAppUser(app.getId(), user.getId());
        for (Permission permission : permissionList) {
            permissions.add(permission.getPermissionValue());
        }
        //获取继承自Role的权限
        List<Role> roleList = getRoleByAppUser(app.getId(), user.getId());
        for (Role role : roleList) {
            for (Long id : role.getRolePermissionIdList())
                permissions.add(
                        permissionService.getPermissionById(id).getPermissionValue()
                );
        }

        return permissions;
    }

    /*
     * 获取用户所属的Role
     */
    @Override
    public Set<String> findRoles(String appkey, String username) {
        User user = userService.getUserByUsername(username);
        App app = appService.getAppById(
                appService.getAppIdByAppKey(appkey)
        );
        if (user == null || app == null)
            return Collections.EMPTY_SET;

        Set<String> roleSet = new HashSet<>();

        List<Role> list = getRoleByAppUser(app.getId(), user.getId());
        for (Role role : list)
            roleSet.add(role.getRoleName());

        return roleSet;
    }
}
