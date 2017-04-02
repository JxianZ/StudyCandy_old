package com.studycandy.controller;

import com.studycandy.core.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Administrator on 2017/4/3 0003.
 */

/*
 * 自习室首页：selfstudyroom
 *
 *
 *
 *
 *
 *
 */
@Controller
@RequestMapping(value = "/selfstudy")
public class SelfController extends BaseController{
    @RequestMapping(value = {"","/"})
    public String selfstudy(HttpServletRequest request, HttpServletResponse response, Model model){
        return "classroom/selfStudyRoom";
    }
}
