package com.studycandy.conf;

import flybear.hziee.core.util.SpringContextUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public SpringContextUtil springContextUtil() {
        System.out.println("springContextUtil....");
        return new SpringContextUtil();
    }

    /*@Bean
    public ExceptionHandler exceptionHandler() {
        System.out.println("ExceptionHandler.....");
        return new ExceptionHandler();
    }*/
}
