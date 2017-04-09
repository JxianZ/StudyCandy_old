package com.studycandy.controller;

import com.studycandy.core.BaseController;
import com.studycandy.model.Answer;
import com.studycandy.model.Coach;
import com.studycandy.model.Question;
import com.studycandy.model.UserInfo;
import com.studycandy.service.QAService;
import com.studycandy.service.UserInfoService;
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
import java.util.Date;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;
/**
 * Created by Administrator on 2017/3/30 0030.
 */
@Controller
@RequestMapping(value = "/QARoom")
public class QAController extends BaseController {
    @Autowired
    private QAService qaService;
    @Autowired
    private UserInfoService userInfoService;
    @Autowired
    private UserService userService;
    /*
     *辅导室首页 ：QuestionAndQuestionRoom
     *显示用户提问界面 ：userquestions
     *问题详细界面 ：questionview
     *
     */
    /*悬赏制 Start*/
    /*
    * 问题 0:未解决 1:解决
    *
    * */
    //获取所有问题
    @RequestMapping(value = {"/","","/allquestion"})
    public String getAllQuestion(HttpServletRequest request, HttpServletResponse response, Model model){
        List<Question> l = qaService.getAllQuestion();
        model.addAttribute("allquestionlist", l);
        model.addAttribute("questionUserList", userService.getUserByQuestion(l));
        return "classroom/assistRoom";
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
        List<Answer> l = qaService.getAnswersByQuestionId(id);
        model.addAttribute("question", qaService.getQuestion(id));
        model.addAttribute("answerList",l);
        model.addAttribute("userList",userService.getUserByAnswer(l));
        return "classroom/qaDetail";
    }
    //添加问题
    @RequestMapping(value = "/addquestion", method = POST)
    public String addQuestion(HttpServletRequest request, HttpServletResponse response, Model model,
                              @RequestParam String title,
                              @RequestParam String content,
                              @RequestParam Integer reward){
        Question entity = new Question();
        entity.setQuestionTitle(title);
        entity.setQuestionStatus(0);
        entity.setQuestionContent(content);
        entity.setGmtCreate(new Timestamp(new Date().getTime()));
        entity.setGmtModified(new Timestamp(new Date().getTime()));
        entity.setQuestionReward(reward);
        try {
            Integer u = this.getCurrentUser(request).getId();
            entity.setUserId(u);
            userInfoService.getByUserId(u);
            UserInfo userInfo = userInfoService.getByUserId(u);
            int integral = userInfo.getUserIntegral()-reward;
            if(integral<0) throw new Exception("糖豆不足");
            userInfoService.changeUserIntegral(u, integral);
            qaService.saveQuestion(entity);
            return ajaxReturn(response,null,"成功",0);
        }catch (Exception e){
            return ajaxReturn(response,null,e.getMessage(),-1);
        }
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
    @RequestMapping(value = "/modifyQuestion/{id}", method = POST)
    public String modifyQuestion(HttpServletRequest request, HttpServletResponse response, Model model,
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
    @RequestMapping(value = "/postmodifyquestion", method = POST)
    public String modifyPostQuestion(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam Question question) {
        //判断是否是问题主人修改
        if(this.getCurrentUser(request).getId()==question.getUserId())
            qaService.modifyQuestion(question);
        model.addAttribute("question",question);
        //修改完之后转到问题详细界面
        return "redirect:QARoom/questionview/"+question.getId();
    }
    //回答问题
    @RequestMapping(value = "/addAnswer", method = POST)
    public String addAnswer(HttpServletRequest request, HttpServletResponse response, Model model,
                            @RequestParam String answerContent,
                            @RequestParam Integer questionId){
        Answer answer = new Answer();
        answer.setAnswerContent(answerContent);
        answer.setGmtCreate(new Timestamp(new Date().getTime()));
        answer.setGmtModified(new Timestamp(new Date().getTime()));
        answer.setQuestionId(questionId);
        try {
            answer.setUserId(this.getCurrentUser(request).getId());
            qaService.saveAnswer(answer);
            return ajaxReturn(response,null,"回答成功",0);
        }catch (Exception e){
            return ajaxReturn(response,null,"回答无效",-1);
        }
    }
    //选取最佳答案
    @RequestMapping(value = "setBestAnswer/{questionId}", method = POST)
    public String setBestAnswer(HttpServletRequest request, HttpServletResponse response, Model model,
                                @RequestParam Integer answerId,
                                @PathVariable("questionId") Integer questionId){
        Question question = qaService.getQuestion(questionId);
        try {
            if(question.getUserId()==this.getCurrentUser(request).getId()) {
                question.setQuestionAnswerId(answerId);
                question.setQuestionStatus(1);
                qaService.modifyQuestion(question);
                UserInfo u = userInfoService.getByUserId(qaService.getAnswer(answerId).getUserId());
                userInfoService.changeUserIntegral(u.getId(),u.getUserIntegral()+question.getQuestionReward());
            }
            else throw new Exception("非问题主人");
            return ajaxReturn(response,null,"成功",0);
        }catch (Exception e){
            return ajaxReturn(response,null,e.getMessage(),-1);
        }
    }
    /*悬赏制 End*/

    /*预约制  Start*/
    /*
    * 预约状态 CoachStatus -1:未接受 0:已接受 1:已解决
    * 预约模式 CoachMode 0:线上 1:线下
    * */
    //进入预约
    @RequestMapping(value = "/order")
    public String getAllOrder(HttpServletRequest request, HttpServletResponse response, Model model){
        model.addAttribute("allquestionlist", qaService.getAllCoach());
        return "classroom/orderRoom";
    }
    //获取用户提出的所有预约
    @RequestMapping(value = "/usercoachlist", method = POST)
    public String getuserCoach(HttpServletRequest request, HttpServletResponse response, Model model,
                                  @RequestParam Integer userId){
        model.addAttribute("usercoachlist", qaService.getCoachesByUserId(userId));
        return "classroom/usercoaches";
    }
    //获取预约详细界面
    @RequestMapping(value = "/coachview/{id}")
    public String coachView(HttpServletRequest request, HttpServletResponse response, Model model,
                               @PathVariable("id") Integer id){
        model.addAttribute("question", qaService.getCoach(id));
        return "classroom/coachview";
    }
    //添加预约
    @RequestMapping(value = "/addcoach", method = POST)
    public String addCoach(HttpServletRequest request, HttpServletResponse response, Model model,
                              @RequestParam String content,
                              @RequestParam Integer reward,
                              @RequestParam Integer mode){
        Coach entity = new Coach();
        entity.setCoachStatus(-1);
        entity.setCoachMode(mode);
        entity.setCoachContent(content);
        entity.setCoachReward(reward);
        try{
            entity.setUserId(this.getCurrentUser(request).getId());
            qaService.saveCoach(entity);
            return ajaxReturn(response,null,"成功",0);
        }catch (Exception e){
            return ajaxReturn(response,null,"无效",-1);
        }
    }
    //删除预约
    @RequestMapping(value = "deletecoach", method = POST)
    public String deleteCoach(HttpServletRequest request, HttpServletResponse response, Model model,
                                 @RequestParam Integer id){
        //判断是否是问题主人要进行删除
        if(this.getCurrentUser(request).getId()==qaService.getCoach(id).getUserId())
            qaService.deleteCoach(id);
        return "redirect:QARoom/coach";
    }
    //进入修改预约界面
    @RequestMapping(value = "/modifyCoach/{id}", method = POST)
    public String modifyCoach(HttpServletRequest request, HttpServletResponse response, Model model,
                         @PathVariable("id") Integer id) {
        Coach t = qaService.getCoach(id);
        //判断是否是预约主人要进行修改
        if(this.getCurrentUser(request).getId()==t.getUserId()){
            model.addAttribute("question",t);
            return "classroom/modifyquestionview";
        }else{
            return "classroom/coachRoom";
        }
    }
    //提交预约修改
    @RequestMapping(value = "/postmodifycoach", method = POST)
    public String modifyPostCoach(HttpServletRequest request, HttpServletResponse response, Model model,
                             @RequestParam Coach coach) {
        //判断是否是问题主人修改
        if(this.getCurrentUser(request).getId()==coach.getUserId())
            qaService.modifyCoach(coach);
        model.addAttribute("coach",coach);
        //修改完之后转到预约详细界面
        return "redirect:QARoom/coachview/"+coach.getId();
    }
    //接受预约
    @RequestMapping(value = "/acceptCoach/{coachId}", method = POST)
    public String acceptCoach(HttpServletRequest request, HttpServletResponse response, Model model,
                              @PathVariable("coachId")Integer coachId){
        qaService.acceptCoach(coachId);
        return ajaxReturn(response,null,null,0);
    }
    //预约解决
    @RequestMapping(value = "/solveCoach/{coachId}", method = POST)
    public String solveCoach(HttpServletRequest request, HttpServletResponse response, Model model,
                              @PathVariable("coachId")Integer coachId){
        if(this.getCurrentUser(request).getId()==qaService.getCoach(coachId).getUserId()) {
            qaService.solveCoach(coachId);
            return ajaxReturn(response, null, "成功", 0);
        }else {
            return ajaxReturn(response, null, "失败", -1);
        }
    }






    /*预约制  End*/


}
