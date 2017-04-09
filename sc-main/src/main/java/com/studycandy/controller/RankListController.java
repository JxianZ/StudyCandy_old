package com.studycandy.controller;

import com.studycandy.core.BaseController;
import com.studycandy.model.UserInfo;
import com.studycandy.service.RankListService;
import com.studycandy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Yxm on 2017/4/9.
 */
@Controller
@RequestMapping(value = "/rankList")
public class RankListController extends BaseController{
    @Autowired
    RankListService rankListService;
    @Autowired
    UserService userService;

    @RequestMapping(value = {"","/"})
    public String rankList(HttpServletRequest request, HttpServletResponse response, Model model){
        List<UserInfo> l = rankListService.getRankList();
        model.addAttribute("rankList",l);
        model.addAttribute("userList",userService.getUserByUserInfo(l));
        return "rankList/rankList";
    }

}
