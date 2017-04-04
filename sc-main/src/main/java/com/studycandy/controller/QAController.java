package com.studycandy.controller;

import com.studycandy.core.BaseController;
import com.studycandy.model.Question;
import com.studycandy.service.QAService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.Timestamp;
import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
/**
 * Created by Administrator on 2017/3/30 0030.
 */
@Controller
@RequestMapping(value = "QARoom")
public class QAController extends BaseController {
    @Autowired
    private QAService qaService;
    /*
     *辅导室首页 ：QuestionAndQuestionRoom
     *显示用户提问界面 ：userquestions
     *问题详细界面 ：questionview
     *
     */

    //获取所有问题
    @RequestMapping(value = "")
    public String getAllQuestion(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("allquestionlist", qaService.getAllQuestion());
        return "QuestionAndQuestionRoom";
    }
    //获取用户提出的所有问题
    @RequestMapping(value = "/userquestionlist", method = POST)
    public String getuserQuestion(HttpServletRequest request, HttpServletResponse response, Model model,
                                  @RequestParam Integer userId){
        model.addAttribute("userquestionlist", qaService.getQustionsByUserId(userId));
        return "userquestions";
    }
    //获取问题详细界面
    @RequestMapping(value = "/questionview/{id}")
    public String questionView(HttpServletRequest request, HttpServletResponse response, Model model,
                               @PathVariable("id") Integer id){
        model.addAttribute("question", qaService.getQuestion(id));
        return "questionview";
    }
    //添加问题
    @RequestMapping(value = "/addquestion", method = POST)
    public String addQuestion(HttpServletRequest request, HttpServletResponse response, Model model,
                              @RequestParam String content,
                              @RequestParam Integer reward){
        Question entity = new Question();
        entity.setQuestionContent(content);
        entity.setGmtCreate(new Timestamp(new Date().getTime()));
        entity .setUserId(this.getCurrentUser(request).getId());
        entity.setGmtModified(new Timestamp(new Date().getTime()));
        entity.setQuestionReward(reward);

        qaService.saveQuestion(entity);
        model.addAttribute("question", entity);
        return "questionview";
    }
    //删除问题
    @RequestMapping(value = "deletequestion", method = POST)
    public String deleteQuestion(HttpServletRequest request, HttpServletResponse response, Model model,
                                 @RequestParam Integer id){
        //判断是否是问题主人要进行删除
        if(this.getCurrentUser(request).getId()==qaService.getQuestion(id).getUserId())
            qaService.deleteQuestion(id);
        return "QuestionAndQuestionRoom";
    }
    //进入修改问题界面
    @RequestMapping(value = "/modify/{id}", method = POST)
    public String modify(HttpServletRequest request, HttpServletResponse response, Model model,
                         @PathVariable("id") Integer id) {
        Question t = qaService.getQuestion(id);
        //判断是否是问题主人要进行修改
        if(this.getCurrentUser(request).getId()==t.getUserId()){
            t.setGmtModified(new Timestamp(new Date().getTime()));
            model.addAttribute("question",t);
            return "modifyquestionview";
        }else{
            return "QuestionAndQuestionRoom";
        }
    }
    //提交问题修改
    @RequestMapping(value = "/postmodify", method = POST)
    public String modifyPost(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam Question question) {
        //判断是否是问题主人修改
        if(this.getCurrentUser(request).getId()==question.getUserId())
            qaService.modifyQuestion(question);
        model.addAttribute("question",question);
        //修改完之后转到问题详细界面
        return "redirect:QARoom/questionview/"+question.getId();
    }
}
