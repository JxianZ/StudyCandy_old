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
            return "user";
        }
        return "login";
    }

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model) {
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList", userList);
        return "showUser";
    }

    @RequestMapping("/log")
    public String log(HttpServletRequest request, Model model) {
        User user = this.getCurrentUser();
        if (user != null) {
            return "user";
        }
        log.debug("用户跳转到登录界面");
        return "redirect:/user/login";
    }

    @RequestMapping(value = "/login", method = GET)
    public String login(HttpServletRequest request, Model model) {
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
    }

    @RequestMapping("/reg")
    public String reg(HttpServletRequest request, Model model) {
        User user = null;
        user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            return "user";
        }
        log.info("用户跳转到注册界面");
        return "register";
    }

    @RequestMapping(value = "/register", method = POST)
    public String register(HttpServletRequest request, Model model) {
        User user = null;
        user = (User) request.getSession().getAttribute("user");
        if (user != null) {
            return "user";
        }
        log.info("用户注册");
        user = null;
        String username = request.getParameter("username");
        user = userService.getUserByUserName(username);
        if (user != null) {
            model.addAttribute("flag", "该用户名已被注册！");
            return "register";
        }
        String password = request.getParameter("password");
        if (username == null || "".equals(username) || password == null || "".equals(password)) {
            model.addAttribute("flag", "请将注册信息填写完整");
            return "register";
        }
        user = new User();
        user.setUserUsername(username);
        user.setUserPassword(password);
        userService.setUser(user);
        request.getSession().setAttribute("user", user);
        return "user";
    }
}