package com.studycandy.service.impl;

import com.studycandy.mapper.UserMapper;
import com.studycandy.model.User;
import com.studycandy.service.IUserService;

import com.zlzkj.core.mybatis.SqlRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private SqlRunner sqlRunner;

    @Override
    public List<User> getAllUser() {
        return null;
    }

    @Override
    public User getUserByPhoneOrEmail(String emailOrPhone, Short state) {
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public User getUserByName(String username) {
        return null;
    }

    @Override
    public void setUser(String username, String password) {

    }
}
