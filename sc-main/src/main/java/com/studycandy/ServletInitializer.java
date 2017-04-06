package com.studycandy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/5
 */
@SpringBootApplication
@MapperScan(basePackages = {"com.studycandy.mapper", "flybear.hziee.core.mybatis"})
public class ServletInitializer extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(ServletInitializer.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ServletInitializer.class);
    }

}
