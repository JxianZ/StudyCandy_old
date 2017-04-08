package com.studycandy.controller;

import com.studycandy.core.BaseController;
import com.studycandy.model.CommentPost;
import com.studycandy.model.Post;
import com.studycandy.service.CommentPostService;
import com.studycandy.service.PostService;
import com.studycandy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Timestamp;
import java.util.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/22
 */


/*
     *广场首页 ：campusSquare
     *显示用户所有帖子界面 ：userpostlist
     *帖子详细界面 ：post
     *帖子修改界面 ：modifypostview
     *添加帖子界面 ：addpostview
     *
     *帖子的所有回复界面：postcomments
     *
     *
     */
@RequestMapping("/square")
@Controller
public class SquareController extends BaseController {
    @Autowired
    private PostService postService;
    @Autowired
    private UserService userService;
    @Autowired
    private CommentPostService commentPostService;

    @RequestMapping(value = "", method = GET)
    public String square(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<Post> l = postService.getAllDayPost();
        Map<Integer,String> m = new HashMap<Integer, String>();
        String nickname="";
        for(Post p : l){
            if(userService.getUserById(p.getUserId())!=null)
                nickname=userService.getUserById(p.getUserId()).getUserNickname();
            else
                nickname="null";
            m.put(p.getUserId(),nickname);
        }
        model.addAttribute("allpostlist", l);
        model.addAttribute("postusername",m);

        return "square/campusSquare";
    }
    //获取白天所有帖子
    @RequestMapping(value = "/day", method = POST)
    public String squareDay(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<Post> l = postService.getAllDayPost();
        model.addAttribute("allpostlist", l);
        return ajaxReturn(response,l,"",0);
    }
    //进入黑夜
    @RequestMapping(value = "/night")
    public String squareNight(HttpServletRequest request, HttpServletResponse response, Model model) {
        List<Post> l = postService.getAllNightPost();
        model.addAttribute("allpostlist", l);
        return "square/campusSquareNight";
    }
    //白天发帖
    @RequestMapping(value = "/addDayPost", method = POST)
    public String addDayPost(HttpServletRequest request, HttpServletResponse response, Model model,
                          @RequestParam String title,
                          @RequestParam String content) {
        Post entity = new Post();
        entity.setPostTitle(title);
        entity.setPostContent(content);
        entity.setGmtCreate(
                new Timestamp(new Date().getTime())
        );
        entity.setGmtModified(new Timestamp(new Date().getTime()));
        entity.setIsNight(0);
        try {
            if(this.getCurrentUser(request)==null) throw new Exception("请您先登录");
            entity.setUserId(this.getCurrentUser(request).getId());
            postService.save(entity);
        } catch (Exception e) {
            return ajaxReturn(response, null, e.getMessage(), -1);
        }
        return ajaxReturn(response, null, "发帖成功！", 0);
    }
    //黑夜发帖
    @RequestMapping(value = "/addNightPost", method = POST)
    public String addNightPost(HttpServletRequest request, HttpServletResponse response, Model model,
                          @RequestParam String title,
                          @RequestParam String content) {
        Post entity = new Post();
        entity.setPostTitle(title);
        entity.setPostContent(content);
        entity.setGmtCreate(
                new Timestamp(new Date().getTime())
        );
        entity.setGmtModified(new Timestamp(new Date().getTime()));
        entity.setIsNight(1);
        try {
            if(this.getCurrentUser(request)==null) throw new Exception("请您先登录");
            entity.setUserId(this.getCurrentUser(request).getId());
            postService.save(entity);
        } catch (Exception e) {
            return ajaxReturn(response, null, e.getMessage(), -1);
        }
        return ajaxReturn(response, null, "发帖成功！", 0);
    }
    //支持ajax取出帖子最新
    @RequestMapping(value = "/postList", method = GET)
    public String postList(HttpServletRequest request, HttpServletResponse response, Model model) {
            List<Post> list= new ArrayList<Post>();
            List<Post> t =  postService.getAllPost();
            int t_size = t.size(),m = 0;
            m=t_size>5 ? 5 : t_size;
            for(int i =1;i<=m;i++){
                list.add(t.get(t.size()-i));
            }
        return ajaxReturn(response, list, "", 0);
    }
    //获取用户发布的所有帖子
    @RequestMapping(value = "/allpost")
    public String postList(HttpServletRequest request, HttpServletResponse response, Model model,
                           @RequestParam Integer userId) {
        model.addAttribute("allpostlist", postService.getUserPostList(userId));
        return "userpostlist";
    }
    //删除帖子
    @RequestMapping(value = "/deletePost", method = POST)
    public String deletePost(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam Integer id) {
        //判断是否是帖子主人删除
        if(this.getCurrentUser(request).getId()==postService.getPostById(id).getUserId())
            postService.deleteById(id);
        return "square/campusSquare";
    }
    //获取单个帖子详细界面
    @RequestMapping(value = "/postview/{id}")
    public String getPost(HttpServletRequest request, HttpServletResponse response, Model model,
                          @PathVariable("id") Integer id) {
        List<CommentPost> l = commentPostService.getCommentPostListByPostId(id);
        Map<Integer, String> m = new HashMap<Integer, String>();
        for(CommentPost p : l) {
            m.put(p.getUserId(),userService.getUserById(p.getUserId()).getUserNickname());
        }
        model.addAttribute("postComments",l);
        model.addAttribute("postCommentsUserName",m);
        model.addAttribute("post",postService.getPostById(id));
        model.addAttribute("user",userService.getUserById(postService.getPostById(id).getUserId()));
        return "square/post";
    }
    //进入修改帖子界面
    @RequestMapping(value = "/modify/{id}", method = POST)
    public String modify(HttpServletRequest request, HttpServletResponse response, Model model,
                         @PathVariable("id") Integer id) {
        Post t = postService.getPostById(id);
        //判断是否是帖子主人要进行修改
        if(this.getCurrentUser(request).getId()==t.getUserId()){
            t.setGmtModified(new Timestamp(new Date().getTime()));
            model.addAttribute("post",t);
            return "modifypostview";
        }else{
            return "campusSquare";
        }
    }
    //提交帖子修改
    @RequestMapping(value = "/postmodify", method = POST)
    public String modifyPost(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam Post post) {
        //判断是否是帖子主人修改
        if(this.getCurrentUser(request).getId()==post.getUserId())
            postService.modifyPost(post);
        model.addAttribute("post",post);
        //修改完之后转到帖子详细界面
        return "redirect:square/postview/"+post.getId();
    }
    /*评论功能 Start*/
    //获取帖子的所有回复
    @RequestMapping(value = "/postcomments/{postId}")
    public String postComments(HttpServletRequest request, HttpServletResponse response, Model model,
                               @PathVariable("postId") Integer id){
        List<CommentPost> l = commentPostService.getCommentPostListByPostId(id);
        Map<Integer, String> m = new HashMap<Integer, String>();
        for(CommentPost p :l) {
            m.put(p.getId(),userService.getUserById(p.getUserId()).getUserNickname());
        }
        model.addAttribute("postComments",l);
        model.addAttribute("postCommentsUserName",m);
        return "postcomments";
    }
    //添加回复
    @RequestMapping(value = "/addcomment",method = POST)
    public String addcomment(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam Integer postId,
                             @RequestParam String commentContent){
        CommentPost entity = new CommentPost();
        entity.setPostId(postId);
        entity.setFollowId(-1);
        try {
            entity.setUserId(this.getCurrentUser(request).getId());
        }catch (Exception e){

        }
        entity.setGmtCreate(new Timestamp(new Date().getTime()));
        entity.setGmtModified(new Timestamp(new Date().getTime()));
        entity.setCommentContent(commentContent);
        commentPostService.saveCommentPost(entity);
        return "postcomments";
    }
    //添加回复的回复
    @RequestMapping(value = "/addCommentToComment",method = POST)
    public String addCommentToComment(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam Integer postId,
                             @RequestParam String commentContent,
                             @RequestParam Integer followId){
        CommentPost entity = new CommentPost();
        entity.setPostId(postId);
        entity.setFollowId(followId);
        try {
            entity.setUserId(this.getCurrentUser(request).getId());
        }catch (Exception e){

        }
        entity.setGmtCreate(new Timestamp(new Date().getTime()));
        entity.setGmtModified(new Timestamp(new Date().getTime()));
        entity.setCommentContent(commentContent);
        commentPostService.saveCommentPost(entity);
        return "postcomments";
    }
    //删除回复
    @RequestMapping(value = "deletecomment",method = POST)
    public String deleteComment(HttpServletRequest request, HttpServletResponse response, Model model,
                                @RequestParam Integer commentId){
        CommentPost t = commentPostService.getCommentPost(commentId);
        //判断是否是评论主人要进行修改
        if(this.getCurrentUser(request).getId()==t.getUserId())
            commentPostService.deleteCommentPost(commentId);
        return "postcomments";
    }
    /*评论功能 End*/
}
