package com.studycandy.a2c.web.controller;

import com.studycandy.a2c.model.App;
import com.studycandy.a2c.service.AppService;
import com.studycandy.a2c.util.AppUtils;
import com.studycandy.core.base.BaseController;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/31
 */

@Controller
@RequestMapping("/admin/app")
public class AppManageController extends BaseController {
    private final Logger logger = Logger.getLogger(getClass());

    private final AppService appService;

    @Autowired
    public AppManageController(AppService appService) {
        this.appService = appService;
    }

    @PostMapping("")
    public String get(HttpServletResponse response,
                      @RequestParam String appname) {
        Integer appid = appService.getAppIdByAppName(appname);
        App entity = appService.getAppById(appid);

        return ajaxReturn(response, entity, "success", 1);
    }

    @PostMapping("create")
    public String test(HttpServletResponse response,
                       @RequestParam String appname) {
        App entity = AppUtils.getApp(appname);
        appService.addApp(entity);
        return ajaxReturn(response, entity, "", 0);
    }
}
