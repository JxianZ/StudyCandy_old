package com.studycandy.core.base;

import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/15
 */
public class BaseController extends com.zlzkj.core.base.BaseController {
    @Autowired
    protected HttpSession httpSession;

    public BaseController(){
    }

    public HttpSession getSession(){
        return httpSession;
    }
}
