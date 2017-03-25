package com.studycandy.core;

import com.studycandy.model.User;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import static com.studycandy.constant.Constant.SESSION_CURRENT_USER;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/18
 */
public class BaseController extends flybear.hziee.core.base.BaseController {
    private static Logger logger = Logger.getLogger(BaseController.class);

    public BaseController() {
    }

    protected HttpSession getHttpSession(HttpServletRequest request) {
        return request.getSession();
    }

    protected User getCurrentUser(HttpServletRequest request) {
        User cu = (User) getHttpSession(request).getAttribute(SESSION_CURRENT_USER);
        logger.debug(cu);
        return cu;
    }
}
