package com.studycandy.a2c.mapper;

import com.studycandy.a2c.model.UserAppRole;

import java.util.List;

public interface UserAppRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserAppRole record);

    UserAppRole selectByPrimaryKey(Long id);

    List<UserAppRole> selectAll();

    int updateByPrimaryKey(UserAppRole record);
}