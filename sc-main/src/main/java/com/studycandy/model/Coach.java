package com.studycandy.model;

public class Coach {
    private Integer id;

    private Integer userId;

    private Integer coachId;

    private Integer coachStatus;

    private String coachContent;

    private Integer coachMode;

    private Integer coachReward;

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

    public Integer getCoachId() {
        return coachId;
    }

    public void setCoachId(Integer coachId) {
        this.coachId = coachId;
    }

    public Integer getCoachStatus() {
        return coachStatus;
    }

    public void setCoachStatus(Integer coachStatus) {
        this.coachStatus = coachStatus;
    }

    public String getCoachContent() {
        return coachContent;
    }

    public void setCoachContent(String coachContent) {
        this.coachContent = coachContent == null ? null : coachContent.trim();
    }

    public Integer getCoachMode() {
        return coachMode;
    }

    public void setCoachMode(Integer coachMode) {
        this.coachMode = coachMode;
    }

    public Integer getCoachReward() {
        return coachReward;
    }

    public void setCoachReward(Integer coachReward) {
        this.coachReward = coachReward;
    }
}