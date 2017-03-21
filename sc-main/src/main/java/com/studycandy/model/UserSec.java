package com.studycandy.model;

public class UserSec {
    private Integer id;

    private String userQuestion1;

    private String userQuestion2;

    private String userQuestion3;

    private String userAnswer1;

    private String userAnswer2;

    private String userAnswer3;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserQuestion1() {
        return userQuestion1;
    }

    public void setUserQuestion1(String userQuestion1) {
        this.userQuestion1 = userQuestion1 == null ? null : userQuestion1.trim();
    }

    public String getUserQuestion2() {
        return userQuestion2;
    }

    public void setUserQuestion2(String userQuestion2) {
        this.userQuestion2 = userQuestion2 == null ? null : userQuestion2.trim();
    }

    public String getUserQuestion3() {
        return userQuestion3;
    }

    public void setUserQuestion3(String userQuestion3) {
        this.userQuestion3 = userQuestion3 == null ? null : userQuestion3.trim();
    }

    public String getUserAnswer1() {
        return userAnswer1;
    }

    public void setUserAnswer1(String userAnswer1) {
        this.userAnswer1 = userAnswer1 == null ? null : userAnswer1.trim();
    }

    public String getUserAnswer2() {
        return userAnswer2;
    }

    public void setUserAnswer2(String userAnswer2) {
        this.userAnswer2 = userAnswer2 == null ? null : userAnswer2.trim();
    }

    public String getUserAnswer3() {
        return userAnswer3;
    }

    public void setUserAnswer3(String userAnswer3) {
        this.userAnswer3 = userAnswer3 == null ? null : userAnswer3.trim();
    }
}