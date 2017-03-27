package com.studycandy.a2c.mapper;

import com.studycandy.a2c.model.UserAppPermission;

import java.util.List;

public interface UserAppPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserAppPermission record);

    UserAppPermission selectByPrimaryKey(Long id);

    List<UserAppPermission> selectAll();

    int updateByPrimaryKey(UserAppPermission record);
}