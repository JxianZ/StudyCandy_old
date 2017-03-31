package com.studycandy.service;

import com.studycandy.mapper.AnswerMapper;
import com.studycandy.mapper.CoachMapper;
import com.studycandy.mapper.QuestionMapper;
import com.studycandy.model.Answer;
import com.studycandy.model.Coach;
import com.studycandy.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/3/30 0030.
 */
@Service
public class QAService {
    @Autowired
    private QuestionMapper questionMapper;
    @Autowired
    private AnswerMapper answerMapper;
    @Autowired
    private CoachMapper coachMapper;

    /*悬赏制 Start*/
    public List<Question> getAllQuestion(){
        return questionMapper.selectAll();
    }
    public List<Question> getQustionsByUserId(Integer userId){
        return questionMapper.selectByUserId(userId);
    }
    public Question getQuestion(Integer id){
        return questionMapper.selectByPrimaryKey(id);
    }
    public int saveQuestion(Question question){
        return questionMapper.insert(question);
    }
    public int deleteQuestion(Integer id){
        return questionMapper.deleteByPrimaryKey(id);
    }
    public int modifyQuestion(Question question){
        return questionMapper.updateByPrimaryKey(question);
    }

    public List<Answer> getAnswersByQuestionId(Integer questionId){
        return answerMapper.selectByQuestionId(questionId);
    }
    public Answer getAnswer(Integer id){
        return answerMapper.selectByPrimaryKey(id);
    }
    public int saveAnswer(Answer answer){
        return answerMapper.insert(answer);
    }
    public int deleteAnswer(Integer id){
        return answerMapper.deleteByPrimaryKey(id);
    }
    public int modeifyAnswer(Answer answer){
        return answerMapper.updateByPrimaryKey(answer);
    }
    /*悬赏制 End*/
    /*预约制 Start*/
    public List<Coach> getAllCoach(){
        return coachMapper.selectAll();
    }
    public List<Coach> getCoachesByUserId(Integer userId){
        return coachMapper.selectByUserId(userId);
    }
    public List<Coach> getCoachesByCoachId(Integer coachId){
        return coachMapper.selectByCoachId(coachId);
    }
    public Coach getCoach(Integer id){
        return coachMapper.selectByPrimaryKey(id);
    }
    public int saveCoach(Coach coach){
        return coachMapper.insert(coach);
    }
    public int deleteCoach(Integer id){
        return coachMapper.deleteByPrimaryKey(id);
    }
    public int modifyCoach(Coach coach){
        return coachMapper.updateByPrimaryKey(coach);
    }
    /*预约制 End*/
}
