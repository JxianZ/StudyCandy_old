package com.studycandy.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/7
 */
public class FileUploaderConfig {
    @Bean("multipartResolver")
    public CommonsMultipartResolver multipartResolver() {
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver();
        multipartResolver.setMaxUploadSize(100000);
        multipartResolver.setMaxInMemorySize(100000);
        multipartResolver.setDefaultEncoding("utf-8");
        return multipartResolver;
    }
}
