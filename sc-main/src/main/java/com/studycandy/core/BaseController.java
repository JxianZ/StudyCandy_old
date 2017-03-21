package com.studycandy.core;

import com.studycandy.model.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpSession;

import static com.studycandy.constant.Constant.SESSION_CURRENT_USER;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/18
 */
public class BaseController extends flybear.hziee.core.base.BaseController {
    private static Logger logger = Logger.getLogger(BaseController.class);
    @Autowired
    private HttpSession httpSession;

    public BaseController() {
    }

    protected HttpSession getHttpSession() {
        return httpSession;
    }

    protected User getCurrentUser() {
        User cu = (User) httpSession.getAttribute(SESSION_CURRENT_USER);
        logger.debug(cu);
        return cu;
    }
}
