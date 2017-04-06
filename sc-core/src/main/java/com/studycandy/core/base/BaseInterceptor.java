package com.studycandy.core.base;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/28
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import com.studycandy.core.constants.Constants;
import com.studycandy.core.util.Fn;
import com.studycandy.core.util.SpringContextUtil;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseInterceptor implements HandlerInterceptor {
    public BaseInterceptor() {
    }

    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String contextPath = Fn.rtrim(SpringContextUtil.getContextPath(), "/");
        request.setAttribute("__root__", contextPath);
        if (Constants.CONTEXT_PATH == null) {
            Constants.CONTEXT_PATH = contextPath;
        }

        request.setAttribute("__static__", contextPath + "/" + Fn.ltrim(Constants.STATIC_PATH, "/"));
        request.setAttribute("__url_with_query__", request.getRequestURI() + "?" + Fn.nullToEmpty(request.getQueryString()));
        request.setAttribute("__url__", request.getRequestURI());
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
    }
}