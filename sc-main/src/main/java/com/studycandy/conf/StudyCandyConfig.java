package com.studycandy.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/21
 */
@ConfigurationProperties(prefix = "sc")
public class StudyCandyConfig {
    private String loginUrl;

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }
}
