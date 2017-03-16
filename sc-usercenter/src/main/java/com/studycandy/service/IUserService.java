package com.studycandy.service;

import com.studycandy.model.User;

import java.util.List;

public interface IUserService {

    List<User> getAllUser();

    User getUserByPhoneOrEmail(String emailOrPhone, Short state);

    User getUserById(Long userId);

    User getUserByName(String username);

    void setUser(String username, String password);
}
