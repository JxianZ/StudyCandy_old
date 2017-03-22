package com.studycandy.conf;

import flybear.hziee.core.mybatis.SqlRunner;
import flybear.hziee.core.util.SpringContextUtil;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {
    private static Logger logger = Logger.getRootLogger();

    @Bean
    public SpringContextUtil springContextUtil() {
        logger.info("springContextUtil....");
        return new SpringContextUtil();
    }

    @Bean
    public SqlRunner sqlRunner() {
        logger.info("SQLRunner Initialized.");
        return new SqlRunner();
    }

    /*@Bean
    public ExceptionHandler exceptionHandler() {
        System.out.println("ExceptionHandler.....");
        return new ExceptionHandler();
    }*/
}
