package com.studycandy.mapper;

import com.studycandy.model.User;
import com.studycandy.model.UserInfo;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);

    List<User> find(String condition);
}