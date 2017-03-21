package com.studycandy.service.impl;

import com.studycandy.mapper.UserMapper;
import com.studycandy.model.User;
import com.studycandy.service.UserService;
import flybear.hziee.core.mybatis.SqlRunner;
import flybear.hziee.core.sql.Row;
import flybear.hziee.core.sql.SQLBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private SqlRunner sqlRunner;

    private static Logger logger = Logger.getLogger(UserService.class);

    public User getUserById(Integer userId) {
        return userMapper.selectByPrimaryKey(userId);
    }

    public List<User> getAllUser() {
        return userMapper.selectAll();
    }

    public void setUser(User u) {
        userMapper.insert(u);
    }

    @Override
    public User getUserByUserName(String username) {
        String where = "user_username=\'" + username + "\'";
        SQLBuilder sqlBuilder = SQLBuilder.getSQLBuilder(User.class);
        String sql = sqlBuilder.fields("id").where(where).selectSql();
        logger.debug(sql);

        List<Row> result = sqlRunner.select(sql);

        if (result.size() > 0) {
            return this.getUserById(
                    result.get(0).getInt("id")
            );
        } else {
            return null;
        }
    }
}
