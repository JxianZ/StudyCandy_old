package com.studycandy.core.base;

import com.alibaba.fastjson.JSON;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/18
 */

public class BaseController {
    private static Logger logger = Logger.getLogger(BaseController.class);

    public BaseController() {
    }

    public static String ajaxReturn(HttpServletResponse response, Object data) {
        render(response, JSON.toJSONString(data), new String[]{"json"});
        return null;
    }

    public static String ajaxReturn(HttpServletResponse response, Object data, String info, int status) {
        HashMap jsonData = new HashMap();
        jsonData.put("data", data);
        jsonData.put("info", info);
        jsonData.put("status", Integer.valueOf(status));
        render(response, JSON.toJSONString(jsonData), new String[]{"json"});
        return null;
    }

    public static void render(HttpServletResponse response, String text, String... contentType) {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Cache-Control", "no-cache");
        response.setDateHeader("Expires", 0L);
        PrintWriter pw = null;

        try {
            pw = response.getWriter();
            pw.write(text);
        } catch (IOException var8) {
            var8.printStackTrace();
        } finally {
            pw.close();
        }

    }

    protected HttpSession getHttpSession(HttpServletRequest request) {
        return request.getSession();
    }
}
