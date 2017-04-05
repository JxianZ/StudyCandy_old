package com.studycandy.a2c.service.impl;

import com.studycandy.a2c.mapper.UserMapper;
import com.studycandy.a2c.model.User;
import com.studycandy.a2c.service.UserService;
import com.studycandy.a2c.util.PasswordHelper;
import com.studycandy.core.mybatis.SqlRunner;
import com.studycandy.core.sql.Row;
import com.studycandy.core.sql.SQLBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Coding with Intellij IDEA
 l * Author: Chenls
 * Time: 2017/3/29
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserMapper mapper;
    private final SqlRunner sqlRunner;

    @Autowired
    public UserServiceImpl(UserMapper mapper, SqlRunner sqlRunner) {
        this.mapper = mapper;
        this.sqlRunner = sqlRunner;
    }

    @Override
    public Integer addUser(User entity) {
        PasswordHelper passwordHelper = new PasswordHelper();
        passwordHelper.encryptPassword(entity);
        return mapper.insert(entity);
    }

    @Override
    public Integer deleteUserById(Long id) {
        return mapper.deleteByPrimaryKey(id);
    }

    @Override
    public Integer updateUser(User entity) {
        PasswordHelper passwordHelper = new PasswordHelper();
        if (entity.getPassword() != getUserById(entity.getId()).getPassword())
            passwordHelper.encryptPassword(entity);
        return mapper.updateByPrimaryKey(entity);
    }

    @Override
    public User getUserById(Long id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getAllUser() {
        return mapper.selectAll();
    }

    @Override
    public User getUserByUsername(String username) {
        Long id = this.getIdByUsername(username);
        if (id.equals(0L))
            return this.getUserById(id);
        return null;
    }

    @Override
    public Long getIdByUsername(String username) {
        SQLBuilder sqlBuilder = new SQLBuilder(User.class);
        String sql = sqlBuilder
                .fields("id")
                .where("username=", username)
                .selectSql();
        List<Row> rowList = sqlRunner.select(sql);
        if (rowList.size() != 0)
            return rowList.get(0).getLong("id");
        return 0L;
    }
}
