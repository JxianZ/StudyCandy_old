package com.studycandy.mapper;

import com.studycandy.model.UserSec;

import java.util.List;

public interface UserSecMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserSec record);

    UserSec selectByPrimaryKey(Integer id);

    List<UserSec> selectAll();

    int updateByPrimaryKey(UserSec record);
}