package com.studycandy.a2c.service;

import com.studycandy.a2c.model.App;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/27
 */
public interface AppService {
    Integer addApp(App entity);

    Integer deleteAppById(Integer id);

    Integer updateApp(App entity);

    App getAppById(Integer id);
}
