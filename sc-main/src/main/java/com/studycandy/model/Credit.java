package com.studycandy.model;

public class Credit {
    private Integer id;

    private Integer userId;

    private Integer creditFromId;

    private String creditContent;

    private Integer creditEvaluate;

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

    public Integer getCreditFromId() {
        return creditFromId;
    }

    public void setCreditFromId(Integer creditFromId) {
        this.creditFromId = creditFromId;
    }

    public String getCreditContent() {
        return creditContent;
    }

    public void setCreditContent(String creditContent) {
        this.creditContent = creditContent == null ? null : creditContent.trim();
    }

    public Integer getCreditEvaluate() {
        return creditEvaluate;
    }

    public void setCreditEvaluate(Integer creditEvaluate) {
        this.creditEvaluate = creditEvaluate;
    }
}