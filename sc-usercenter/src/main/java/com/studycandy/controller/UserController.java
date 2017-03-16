package com.studycandy.controller;

import com.studycandy.service.IUserService;
import com.studycandy.model.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Zhangxq on 2016/7/15.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    private Logger log = Logger.getLogger(UserController.class);
    @Resource
    private IUserService userService;

    @RequestMapping("/")
    public String me(HttpServletRequest request, Model model){
        return mine(request,model);
    }

    @RequestMapping("/mine")
    public String mine(HttpServletRequest request, Model model){
        User user=null;
        user=(User) request.getSession().getAttribute("user");
        if (user!=null){
            return "user";
        }
        return "login";
    }

    @RequestMapping("/showUser")
    public String showUser(HttpServletRequest request, Model model){
        log.info("查询所有用户信息");
        List<User> userList = userService.getAllUser();
        model.addAttribute("userList",userList);
        return "showUser";
    }

    @RequestMapping("/log")
    public String log(HttpServletRequest request, Model model){
        User user=null;
        user=(User) request.getSession().getAttribute("user");
        if (user!=null){
            return "user";
        }
        log.info("用户跳转到登录界面");
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpServletRequest request, Model model){
        User user=null;
        user=(User) request.getSession().getAttribute("user");
        if (user!=null){
            return "user";
        }
        log.info("用户登录");
        user = null;
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        if (username==null||"".equals(username)||password==null||"".equals(password)){
            model.addAttribute("flag","请将登录信息填写完整");
            return "login";
        }
        String image=request.getParameter("image");
        user=userService.getUserByName(username);
        if (user==null){
            model.addAttribute("flag","未找到该用户！");
            return "login";
        }
        /*
        if (!user.getUserPwd().equals(MD5String.getMD5Str(password))){
            model.addAttribute("flag","用户名或密码错误");
            return "login";
        }*/
        request.getSession().setAttribute("user",user);
        return "user";
    }

    @RequestMapping("/reg")
    public String reg(HttpServletRequest request, Model model){
        User user=null;
        user=(User) request.getSession().getAttribute("user");
        if (user!=null){
            return "user";
        }
        log.info("用户跳转到注册界面");
        return "register";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request, Model model){
        User user=null;
        user=(User) request.getSession().getAttribute("user");
        if (user!=null){
            return "user";
        }
        log.info("用户注册");
        user=null;
        String username=request.getParameter("username");
        user=userService.getUserByName(username);
        if (user!=null){
            model.addAttribute("flag","该用户名已被注册！");
            return "register";
        }
        String password=request.getParameter("password");
        if (username==null||"".equals(username)||password==null||"".equals(password)){
            model.addAttribute("flag","请将注册信息填写完整");
            return "register";
        }
        userService.setUser(username,password);
        user=userService.getUserByName(username);
        request.getSession().setAttribute("user",user);
        return "user";
    }
}
