package com.studycandy.controller;

import com.studycandy.core.BaseController;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/18
 */
@Controller
@RequestMapping("/")
public class IndexController extends BaseController {
    private Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value = {"index", "/"})
    public String index(HttpServletRequest request, HttpServletResponse response, Model model) {
        logger.info("index");

        return "index";
    }
}
