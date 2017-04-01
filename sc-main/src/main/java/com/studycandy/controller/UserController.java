package com.studycandy.controller;

import com.studycandy.core.BaseController;
import com.studycandy.model.User;
import com.studycandy.service.UserService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.studycandy.constant.Constant.SESSION_CURRENT_USER;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    private Logger log = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

    @RequestMapping(value = {"mine", "/"})
    public String mine(HttpServletRequest request, Model model) {
        if (this.getHttpSession(request).getAttribute(SESSION_CURRENT_USER) != null) {
            return "user/user";
        }
        return "user/login";
    }

    @RequestMapping("/log")
    public String log(HttpServletRequest request, Model model) {
        if (this.getHttpSession(request).getAttribute(SESSION_CURRENT_USER) != null) {

            return "user/user";
        }
        log.info("用户跳转到登录界面");
        return "user/login";
    }

    @RequestMapping(value = "/login", method = GET)
    public String login(HttpServletRequest request, Model model) {
        return "user/login";
    }

    @RequestMapping(value = "/login", method = POST)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model,
                        @RequestParam String username,
                        @RequestParam String password) {
        User entity = userService.loginGetObj(username, password);
        if (entity == null) {
            return ajaxReturn(response, null, "用户名或密码错误", -1);
        } else {
            this.getHttpSession(request).setAttribute(SESSION_CURRENT_USER, entity);
            return ajaxReturn(response, entity, "登陆成功", 0);
        }
    }

    @RequestMapping("/reg")
    public String reg(HttpServletRequest request, Model model) {
        if (this.getHttpSession(request).getAttribute(SESSION_CURRENT_USER) != null) {

            return "user/user";
        }
        log.info("用户跳转到注册界面");
        return "register";
    }

    @RequestMapping(value = "/register",method = GET)
    public String register(HttpServletRequest request,Model model){
        return "user/register";
    }

    @RequestMapping(value = "/register",method = POST)
    public String register(HttpServletRequest request,HttpServletResponse response, Model model,
                           @RequestParam String username,
                           @RequestParam String password,
                           @RequestParam String email) {
        if (this.getHttpSession(request).getAttribute(SESSION_CURRENT_USER) != null) {
            return "user/user";
        }
        log.info("用户注册");
        if (userService.getUserByUsername(username) != null) {
            return ajaxReturn(response,null,"该用户名已被注册",-1);
        }
        User user = new User();
        user.setUserUsername(username);
        user.setUserPassword(password);
        user.setUserEmail(email);
        try {
            userService.setUser(user);
            this.getHttpSession(request).setAttribute(SESSION_CURRENT_USER, user);
            return ajaxReturn(response, user, "注册成功", 0);
        } catch (Exception e) {
            return ajaxReturn(response, null, "注册失败", -1);
        }
    }

    @RequestMapping("/edit")
    public String edit(HttpServletRequest request, Model model){
        User user = (User) this.getHttpSession(request).getAttribute(SESSION_CURRENT_USER);
        if (user == null){
            model.addAttribute("flag","用户未登录");
            return "log";
        }else{
            HttpSession session = this.getHttpSession(request);
            String password = (String) session.getAttribute("password");
            String editPassword = (String) session.getAttribute("editpassword");
            String nickname = (String) session.getAttribute("nickname");
            String email = (String) session.getAttribute("email");
            String phone = (String) session.getAttribute("phone");
            if (password != null && editPassword!=null){
                user = userService.editPassword(user.getId(),password,editPassword);
            }else if (nickname != null) {
                user = userService.editNickname(user.getId(), nickname);
            }else if (email != null){
                user = userService.editEmail(user.getId(),email);
            }else if (phone != null){
                user = userService.editPhone(user.getId(),phone);
            }else{
                model.addAttribute("flag","请将更改信息填写完整");
            }
        }
        this.getHttpSession(request).setAttribute(SESSION_CURRENT_USER, user);
        return "user/user";
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request,Model model){
        this.getHttpSession(request).setAttribute(SESSION_CURRENT_USER, null);
        return "user/login";
    }

    @RequestMapping("/search")
    public String search(HttpServletRequest request,Model model){
        String condition = (String) this.getHttpSession(request).getAttribute("condition");
//        userService
        return "search";
    }
}