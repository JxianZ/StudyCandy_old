package com.studycandy.conf;

import com.studycandy.interceptor.CoreInterceptor;
import com.studycandy.interceptor.RoleInterceptor;
import flybear.hziee.core.base.BaseInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new BaseInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new RoleInterceptor()).addPathPatterns("/**");
        registry.addInterceptor(new CoreInterceptor()).addPathPatterns("/**").excludePathPatterns("/public");
        super.addInterceptors(registry);
    }
}
