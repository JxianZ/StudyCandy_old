package com.studycandy.a2c.util.impl;

import com.studycandy.a2c.util.PasswordHelper;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/24
 */
public class SimplePasswordHelper implements PasswordHelper {
    @Override
    public String encryptPassword(String password, String salt) {
        return password;
    }
}
