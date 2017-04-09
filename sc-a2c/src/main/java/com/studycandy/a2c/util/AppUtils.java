package com.studycandy.a2c.util;

import com.studycandy.a2c.model.App;

import java.util.UUID;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/9
 */
public class AppUtils {
    public static App getApp(String appname) {
        App app = new App();
        app.setAppName(appname);
        app.setAppKey(UUID.randomUUID().toString());
        app.setAppSecret(UUID.randomUUID().toString());
        app.setAvailable(true);

        return app;
    }

    public static String generateAccessToken(App entity) {
        // TODO: 2017/4/9 Created By Chenls
        return null;
    }
}
