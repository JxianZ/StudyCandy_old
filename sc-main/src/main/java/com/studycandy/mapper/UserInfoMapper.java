package com.studycandy.mapper;

import com.studycandy.model.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);

    List<UserInfo> selectByIntegral();

    int updateUserIntegral(@Param("id") Integer id, @Param("userIntegral")Integer userIntegral);
}