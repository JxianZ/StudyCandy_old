package com.studycandy.controller;

import com.studycandy.annotation.Role;
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
import java.util.List;

import static com.studycandy.constant.Constant.SESSION_CURRENT_USER;
import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;


@Controller
@RequestMapping("/user")
public class UserController extends BaseController {

    private Logger log = Logger.getLogger(UserController.class);
    @Autowired
    private UserService userService;

<<<<<<< HEAD
    @RequestMapping(value = {"mine", "/"})
    public String mine(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute("user") != null) {
=======
    @RequestMapping("/")
    public String me(HttpServletRequest request, Model model) {
        return mine(request, model);
    }

    @Role(0)
    @RequestMapping("/mine")
    public String mine(HttpServletRequest request, Model model) {
        User user = this.getCurrentUser();
        if (user != null) {
            model.addAttribute("user", user);
>>>>>>> master
            return "user";
        }
        return "login";
    }

    @RequestMapping("/log")
    public String log(HttpServletRequest request, Model model) {
<<<<<<< HEAD
        if (request.getSession().getAttribute("user") != null) {
=======
        User user = this.getCurrentUser();
        if (user != null) {
>>>>>>> master
            return "user";
        }
        log.debug("用户跳转到登录界面");
        return "redirect:/user/login";
    }

    @RequestMapping(value = "/login", method = GET)
    public String login(HttpServletRequest request, Model model) {
<<<<<<< HEAD
        if (request.getSession().getAttribute("user") != null) {
            return "user";
        }
        log.info("用户登录");

//        User user = userService.checkOut(username,password);
//        if (user!=null){
//            model.addAttribute("flag","用户名或密码错误");
//            return "login";
//        }
//        request.getSession().setAttribute("user", user);
        return "user";
=======
        return "login";
    }

    /**
     * @param username
     * @param password
     * @return
     */
    @RequestMapping(value = "/login", method = POST)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model,
                        @RequestParam String username,
                        @RequestParam String password) {
        User entity = userService.loginGetObj(username, password);
        if (entity == null) {
            return ajaxReturn(response, null, "用户名或密码错误", -1);
        } else {
            this.getHttpSession().setAttribute(SESSION_CURRENT_USER, entity);
            return ajaxReturn(response, entity, "登陆成功", 0);
        }
>>>>>>> master
    }

    @RequestMapping("/reg")
    public String reg(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute("user") != null) {
            return "user";
        }
        log.info("用户跳转到注册界面");
        return "register";
    }

    @RequestMapping(value = "/register", method = POST)
    public String register(HttpServletRequest request, Model model) {
        if (request.getSession().getAttribute("user") != null) {
            return "user";
        }
        log.info("用户注册");
        String username = request.getParameter("username");
<<<<<<< HEAD
        if (userService.getUserByUsername(username) != null) {
=======
        user = userService.getUserByUserName(username);
        if (user != null) {
>>>>>>> master
            model.addAttribute("flag", "该用户名已被注册！");
            return "register";
        }
        String password = request.getParameter("password");
        if (username == null || "".equals(username) || password == null || "".equals(password)) {
            model.addAttribute("flag", "请将注册信息填写完整");
            return "register";
        }
        User user = new User();
        user.setUserUsername(username);
        user.setUserPassword(password);
        userService.setUser(user);
        request.getSession().setAttribute("user", user);
        return "user";
    }
<<<<<<< HEAD

    @RequestMapping("/edit")
    public String edit(HttpServletRequest request, Model model){
        User user = (User)request.getSession().getAttribute("user");
        if (user == null){
            model.addAttribute("flag","用户未登录");
            return "log";
        }else{
            String password = (String)request.getSession().getAttribute("password");
            String editPassword = (String)request.getSession().getAttribute("editpassword");
            String nickname = (String)request.getSession().getAttribute("nickname");
            String email = (String)request.getSession().getAttribute("email");
            String phone = (String)request.getSession().getAttribute("phone");
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
        request.getSession().setAttribute("user", user);
        return "user";
    }

    @RequestMapping("logout")
    public String logout(HttpServletRequest request,Model model){
        request.getSession().setAttribute("user",null);
        return "login";
    }

    @RequestMapping("/search")
    public String search(HttpServletRequest request,Model model){
        String condition = (String)request.getSession().getAttribute("condition");
//        userService
        return "search";
    }
}
=======
}
>>>>>>> master
