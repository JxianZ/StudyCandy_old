package com.studycandy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.studycandy.mapper", "flybear.hziee.core.mybatis"})
public class ScBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ScBootApplication.class, args);
    }
}
