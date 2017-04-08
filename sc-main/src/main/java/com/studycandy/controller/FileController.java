package com.studycandy.controller;

import com.studycandy.core.BaseController;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/4/7
 */
@RequestMapping("file")
public class FileController extends BaseController {

    @RequestMapping("upload")
    public String fileUpload(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam("file_data") MultipartFile file_data) {
        return ajaxReturn(response, null);
    }
}
