package com.studycandy.a2c.web.intercepter;

import com.studycandy.a2c.constant.Constants;
import com.studycandy.a2c.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.web.filter.PathMatchingFilter;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/3
 */
public class CurrentUserInterceptor extends PathMatchingFilter {
    @Autowired
    private UserService userService;

    @Override
    protected boolean onPreHandle(ServletRequest request, ServletResponse response, Object mappedValue) throws Exception {
        String username = (String) SecurityUtils.getSubject().getPrincipal();
        request.setAttribute(Constants.CURRENT_USER, userService.getUserByUsername(username));
        return true;
    }
}
