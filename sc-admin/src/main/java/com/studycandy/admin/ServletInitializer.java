package com.studycandy.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/7
 */
@SpringBootApplication
@MapperScan(basePackages = {
        "com.studycandy.core.mybatis"
})
public class ServletInitializer extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(ServletInitializer.class);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ServletInitializer.class);
    }
}
