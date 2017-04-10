package com.studycandy.service;

import com.studycandy.model.Answer;
import com.studycandy.model.Question;
import com.studycandy.model.User;
import com.studycandy.model.UserInfo;

import java.util.List;
import java.util.Map;

/**
 * Created by Zhangxq on 2016/7/15.
 */
public interface UserService {
    List<User> getAllUser();

    User getUserById(Integer userId);

    void setUser(User u);

    User getUserByUsername(String username);

    User loginGetObj(String username, String password);

    User editPassword(Integer userId, String password, String editPassword);

    User editNickname(Integer userId, String nickname);

    User editEmail(Integer userId, String email);

    User editPhone(Integer userId, String phone);

    List<User> search(String condition);

    Integer deleteUser(Integer integer);

    /*非核心访问用户功能*/
    Map<Integer,User> getUserByUserInfo(List<UserInfo> l);

    Map<Integer,User> getUserByQuestion(List<Question> l);

    Map<Integer,User> getUserByAnswer(List<Answer> l);
}
