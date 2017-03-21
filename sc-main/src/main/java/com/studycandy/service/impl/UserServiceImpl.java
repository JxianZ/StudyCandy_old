package com.studycandy.service.impl;

import com.studycandy.mapper.UserMapper;
import com.studycandy.model.User;
import com.studycandy.service.UserService;
<<<<<<< HEAD
import com.studycandy.util.MD5String;
=======
import flybear.hziee.core.mybatis.SqlRunner;
import flybear.hziee.core.sql.Row;
import flybear.hziee.core.sql.SQLBuilder;
import org.apache.log4j.Logger;
>>>>>>> master
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
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
        u.setUserPassword(MD5String.getMD5Str(u.getUserPassword()));
        userMapper.insert(u);
    }

    @Override
<<<<<<< HEAD
    public User getUserByUsername(String username) {
        return userMapper.selectByUsername(username);
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
=======
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
>>>>>>> master
        }
    }

    @Override
<<<<<<< HEAD
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

    @Override
    public List<User> search(String condition) {

        return null;
=======
    public User loginGetObj(String username, String password) {
        HashMap<String, Object> where = new HashMap<String, Object>();
        where.put("user_username", username);
        where.put("user_password", password);
        SQLBuilder sb = SQLBuilder.getSQLBuilder(User.class);
        String sql = sb.fields("id")
                .where(where).selectSql();
        List<Row> list = sqlRunner.select(sql);
        if (list.size() > 0)
            return this.getUserById(list.get(0).getInt("id"));
        else
            return null;
>>>>>>> master
    }
}
