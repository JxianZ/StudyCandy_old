package com.studycandy.interceptor;

import com.studycandy.annotation.Role;
import com.studycandy.model.User;
import org.apache.log4j.Logger;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static com.studycandy.constant.Constant.SESSION_CURRENT_USER;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/21
 */

/**
 * @author Chenls
 */
public class RoleInterceptor implements HandlerInterceptor {
    private Logger logger = Logger.getLogger(RoleInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        HandlerMethod handler = (HandlerMethod) o;
        Role role = handler.getMethodAnnotation(Role.class);
        if (role == null)
            return true;

        User cu = (User) httpServletRequest.getSession().getAttribute(SESSION_CURRENT_USER);

        if (cu == null && role.value() > -1) {
            httpServletRequest.getRequestDispatcher("/user/login").forward(httpServletRequest, httpServletResponse);
            return false;
        }

        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
