package com.studycandy.a2c.configuaration;

import com.studycandy.core.mybatis.SqlRunner;
import com.studycandy.core.util.SpringContextUtil;
import org.apache.log4j.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/6
 */
@Configuration
public class CommonBeans {
    private Logger logger = Logger.getLogger(CommonBeans.class);

    @Bean
    public SqlRunner getSqlRunner() {
        logger.debug("sqlrunner loading");
        return new SqlRunner();
    }

    @Bean
    public SpringContextUtil springContextUtil() {
        logger.debug("spring context util loading");
        return new SpringContextUtil();
    }
}
