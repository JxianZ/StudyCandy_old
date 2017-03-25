package com.studycandy.a2c.model;

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

    public String getRolePermissionids() {
        return rolePermissionids;
    }

    public void setRolePermissionids(String rolePermissionids) {
        this.rolePermissionids = rolePermissionids == null ? null : rolePermissionids.trim();
    }
}