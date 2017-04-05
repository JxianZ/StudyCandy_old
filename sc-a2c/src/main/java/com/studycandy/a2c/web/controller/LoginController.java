package com.studycandy.a2c.web.controller;

import com.studycandy.core.base.BaseController;
import org.apache.log4j.Logger;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/28
 */
@Controller
public class LoginController extends BaseController {
    private Logger logger = Logger.getLogger(LoginController.class);

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(HttpServletRequest request, HttpServletResponse response, Model model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String loginPost(HttpServletRequest request, HttpServletResponse response, Model model,
                            @RequestParam String username,
                            @RequestParam String password,
                            @RequestParam String rememberMe) {
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        if (rememberMe.equals("true"))
            token.setRememberMe(true);
        Subject subject = SecurityUtils.getSubject();

        try {
            subject.login(token);
        } catch (LockedAccountException e) {
            return ajaxReturn(response, null, "账号被锁定", 503);
        } catch (UnknownAccountException e) {
            return ajaxReturn(response, null, "账号不存在", 404);
        } catch (AuthenticationException e) {
            logger.warn(e);
            return ajaxReturn(response, null, "未知错误", -1);
        }

        return ajaxReturn(response, null, "登录成功", 0);
    }

    @RequestMapping(value = "/logout", method = RequestMethod.GET)
    public String logout(HttpServletRequest request, HttpServletResponse response, Model model) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        // TODO: 2017/4/4 Created By Chenls
        return "redirect:/";
    }
}
