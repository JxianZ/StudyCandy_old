package com.studycandy.service;

import com.studycandy.mapper.UserInfoMapper;
import flybear.hziee.core.mybatis.SqlRunner;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/21
 */
public class UserInfoService {
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private SqlRunner sqlRunner;

    Integer getLvByUserId(Integer id) {
        return 0;
    }
}
