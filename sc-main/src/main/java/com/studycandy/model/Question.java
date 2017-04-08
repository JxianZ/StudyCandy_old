package com.studycandy.model;

import java.util.Date;

public class Question {
    private Integer id;

    private Integer userId;

    private Integer questionStatus;

    private Integer questionPremise;

    private String premiseContent;

    private String questionContent;

    private Integer questionMode;

    private Integer questionReward;

    private Integer questionAnswerId;

    private Date gmtCreate;

    private Date gmtModified;

    private String questionTitle;

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionStatus() {
        return questionStatus;
    }

    public void setQuestionStatus(Integer questionStatus) {
        this.questionStatus = questionStatus;
    }

    public Integer getQuestionPremise() {
        return questionPremise;
    }

    public void setQuestionPremise(Integer questionPremise) {
        this.questionPremise = questionPremise;
    }

    public String getPremiseContent() {
        return premiseContent;
    }

    public void setPremiseContent(String premiseContent) {
        this.premiseContent = premiseContent == null ? null : premiseContent.trim();
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent == null ? null : questionContent.trim();
    }

    public Integer getQuestionMode() {
        return questionMode;
    }

    public void setQuestionMode(Integer questionMode) {
        this.questionMode = questionMode;
    }

    public Integer getQuestionReward() {
        return questionReward;
    }

    public void setQuestionReward(Integer questionReward) {
        this.questionReward = questionReward;
    }

    public Integer getQuestionAnswerId() {
        return questionAnswerId;
    }

    public void setQuestionAnswerId(Integer questionAnswerId) {
        this.questionAnswerId = questionAnswerId;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}