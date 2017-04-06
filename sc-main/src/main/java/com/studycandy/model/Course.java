package com.studycandy.model;

import java.util.Date;

public class Course {
    private Integer id;

    private Integer userId;

    private Integer classId;

    private String courseTitle;

    private String courseContent;

    private Date gmtCreate;

    private Date gmtModified;

    private Integer likeNum;

    private Integer todayNum;

    private Integer unlikeNum;

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

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle == null ? null : courseTitle.trim();
    }

    public String getCourseContent() {
        return courseContent;
    }

    public void setCourseContent(String courseContent) {
        this.courseContent = courseContent == null ? null : courseContent.trim();
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

    public Integer getLikeNum() {
        return likeNum;
    }

    public void setLikeNum(Integer likeNum) {
        this.likeNum = likeNum;
    }

    public Integer getTodayNum() {
        return todayNum;
    }

    public void setTodayNum(Integer todayNum) {
        this.todayNum = todayNum;
    }

    public Integer getUnlikeNum() {
        return unlikeNum;
    }

    public void setUnlikeNum(Integer unlikeNum) {
        this.unlikeNum = unlikeNum;
    }
}