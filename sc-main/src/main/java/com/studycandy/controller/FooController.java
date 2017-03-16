package com.studycandy.controller;

import com.studycandy.core.base.BaseController;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/16
 */
@Controller
public class FooController extends BaseController {
    public static final Logger logger = Logger.getLogger(FooController.class);

    FooController(){
        super();
    }
    @RequestMapping("/")
    public String FooHandler(HttpServletRequest request, HttpServletResponse response, Model model){
        HttpSession session = this.httpSession;
        logger.info(session.getCreationTime());
        return "index";
    }
}
