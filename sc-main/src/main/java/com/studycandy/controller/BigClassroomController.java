package com.studycandy.controller;

import com.studycandy.core.BaseController;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/18
 */
@Controller
@RequestMapping("/classroom")
public class BigClassroomController extends BaseController {
    private Logger logger = Logger.getLogger(this.getClass());

    //校区所有的教室列表
    @RequestMapping(value = {"", "/"})
    public String classList(HttpServletRequest request, HttpServletResponse response, Model model) {
        //TODO 按校区获取教室
        return "classroom/bigClassroom";
    }
    //
    @RequestMapping(value = "/smallClassroom/{classId}")
    public String classView(HttpServletRequest request, HttpServletResponse response, Model model,
                            @PathVariable("classId")Integer classId){
       return "classroom/smallClassroom";
    }
    @RequestMapping(value = {"/course"})
    public String toCourse(HttpServletRequest request, HttpServletResponse response, Model model) {
        return "classroom/course";

    }
}
