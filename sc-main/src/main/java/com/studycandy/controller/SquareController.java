package com.studycandy.controller;

import com.studycandy.annotation.Role;
import com.studycandy.core.BaseController;
import com.studycandy.model.Post;
import com.studycandy.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/22
 */
@RequestMapping("square")
@Controller
public class SquareController extends BaseController {
    @Autowired
    private PostService postService;

    @RequestMapping(value = "", method = GET)
    public String square(HttpServletRequest request, HttpServletResponse response, Model model) {
        model.addAttribute("postlist", postService.getAllPost());
        return "campusSquare";
    }

    @Role
    @RequestMapping(value = "addpost", method = POST)
    public String addPost(HttpServletRequest request, HttpServletResponse response, Model model,
                          @RequestParam String title,
                          @RequestParam String content) {
        Post entity = new Post();
        entity.setPostTitle(title);
        entity.setPostContent(content);
        entity.setGmtCreate(
                new Timestamp(new Date().getTime())
        );
      
        entity.setUserId(this.getCurrentUser(request).getId());

        try {
            postService.save(entity);
        } catch (Exception e) {
            return ajaxReturn(response, null, "", -1);
        }
        return ajaxReturn(response, null, "发帖成功！", 0);
    }
}
