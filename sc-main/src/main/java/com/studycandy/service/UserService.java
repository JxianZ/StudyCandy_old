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

    User getUserByUsername(String username);

    User loginGetObj(String username, String password);

    User editPassword(Integer userId,String password,String editPassword);

    User editNickname(Integer userId,String nickname);

    User editEmail(Integer userId,String email);

    User editPhone(Integer userId,String phone);

    List<User> search(String condition);
}
