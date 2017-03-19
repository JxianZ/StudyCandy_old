package com.studycandy.service;

import com.studycandy.model.User;

import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface UserService {
    List<User> getAllUser();

    User getUserById(Integer userId);

    void setUser(User u);
}
