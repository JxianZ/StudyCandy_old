package com.studycandy.interceptor;


import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 核心拦截器，配置request的一些初始值
 *
 * @author Simon
 */
public class CoreInterceptor implements HandlerInterceptor {

    /**
     * 拦截器白名单列表
     */
//	public String[] exclude; 
//	
//	public void setExclude(String[] exclude) {
//		this.exclude = exclude;
//	}
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        String path = request.getServletPath();
        System.out.println("CoreInterceptor:" + path);
        return true;


    }

    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler,
                           ModelAndView modelAndView) throws Exception {

    }

    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex)
            throws Exception {

    }


}
