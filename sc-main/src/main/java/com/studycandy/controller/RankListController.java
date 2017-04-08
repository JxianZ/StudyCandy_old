package com.studycandy.controller;

import com.studycandy.core.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Yxm on 2017/4/9.
 */
@Controller
@RequestMapping(value = "/RankList")
public class RankListController extends BaseController{


    @RequestMapping(value = {"","/"})
    public String rankList(HttpServletRequest request, HttpServletResponse response, Model model){
        return "rankList/rankList";
    }

}
