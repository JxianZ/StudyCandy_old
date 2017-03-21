package com.studycandy.service.impl;

import com.studycandy.mapper.UserMapper;
import com.studycandy.model.User;
import com.studycandy.service.UserService;
import com.studycandy.util.MD5String;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public User getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public List<User> getAllUser() {
        return userMapper.selectAll();
    }

    public void setUser(User u) {
        u.setUserPassword(MD5String.getMD5Str(u.getUserPassword()));
        userMapper.insert(u);
    }

    @Override
    public User getUserByUsername(String username) {
        return userMapper.selectByUserName(username);
    }

    @Override
    public User checkOut(String username, String password) {
        User user = getUserByUsername(username);
        if (user.getUserPassword().equals(MD5String.getMD5Str(password))){
            return user;
        }else{
            return null;
        }
    }

    @Override
    public User editPassword(Integer userId, String password, String editPassword) {
        User user = getUserById(userId);
        if (!user.getUserPassword().equals(MD5String.getMD5Str(password))){
            return null;
        }else{
            user.setUserPassword(MD5String.getMD5Str(editPassword));
            userMapper.updateByPrimaryKey(user);
            return user;
        }
    }

    @Override
    public User editEmail(Integer userId, String email) {
        User user = getUserById(userId);
        user.setUserEmail(email);
        userMapper.updateByPrimaryKey(user);
        return user;
    }

    @Override
    public User editNickname(Integer userId, String nickname) {
        User user = getUserById(userId);
        user.setUserNickname(nickname);
        userMapper.updateByPrimaryKey(user);
        return user;
    }

    @Override
    public User editPhone(Integer userId, String phone) {
        User user = getUserById(userId);
        user.setUserPhone(phone);
        userMapper.updateByPrimaryKey(user);
        return user;
    }
}
