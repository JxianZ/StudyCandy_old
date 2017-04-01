package com.studycandy.a2c.service;

import com.studycandy.a2c.model.User;

import java.util.List;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/24
 */
public interface UserService {
    Integer addUser(User entity);

    Integer deleteUserById(Long id);

    Integer updateUser(User entity);

    User getUserById(Long id);

    List<User> getAllUser();

    User getUserByUsername(String username);

    Long getIdByUsername(String username);
}
