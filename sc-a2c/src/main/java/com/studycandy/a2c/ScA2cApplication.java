package com.studycandy.a2c;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/24
 */
@SpringBootApplication
@MapperScan(basePackages = {
        "com.studycandy.core.mybatis",
        "com.studycandy.a2c.mapper",
        "com.studycandy.a2c.session.mapper"
})
public class ScA2cApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScA2cApplication.class, args);
    }
}
