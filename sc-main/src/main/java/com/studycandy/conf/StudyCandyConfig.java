package com.studycandy.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/21
 */
@ConfigurationProperties(prefix = "sc")
public class StudyCandyConfig {
    @NotNull
    private String loginUrl;

    public String getLoginUrl() {
        return loginUrl;
    }

    public void setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
    }
}
