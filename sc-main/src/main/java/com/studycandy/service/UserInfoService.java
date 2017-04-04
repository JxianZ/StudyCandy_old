package com.studycandy.service;

import com.studycandy.mapper.UserInfoMapper;
import com.studycandy.model.UserInfo;
import flybear.hziee.core.mybatis.SqlRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/21
 */
@Service
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private SqlRunner sqlRunner;

    Integer getLvByUserId(Integer id) {
        return 0;
    }

    public UserInfo getByUserId(Integer userId){
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    public Integer saveUserInfo(UserInfo userInfo){
        return userInfoMapper.insert(userInfo);
    }
}
