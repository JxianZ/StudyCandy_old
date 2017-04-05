package com.studycandy.a2c.model;

import java.util.ArrayList;
import java.util.List;

public class Role {
    private Long id;

    private String roleName;

    private String description;

    private String rolePermissionids;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public List<Long> getRolePermissionIdList() {
        List<Long> permissionIds = new ArrayList<>();
        String[] strs = rolePermissionids.split(",");
        for (String str : strs) {
            permissionIds.add(Long.parseLong(str));
        }
        return permissionIds;
    }

    public String getRolePermissionids() {
        return rolePermissionids;
    }

    public void setRolePermissionids(String rolePermissionids) {
        this.rolePermissionids = rolePermissionids == null ? null : rolePermissionids.trim();
    }

    public void setRolePermissionids(List<Long> rolePermissionids) {
        StringBuilder sb = new StringBuilder();
        for (Long rolePermissionid : rolePermissionids) {
            sb.append(rolePermissionid);
            sb.append(",");
        }
        String str = sb.toString().substring(0, sb.length() - 1);
        this.rolePermissionids = str == null ? null : str.trim();
    }
}