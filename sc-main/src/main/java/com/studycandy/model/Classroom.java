package com.studycandy.model;

import java.math.BigDecimal;

public class Classroom {
    private Integer id;

    private String className;

    private String classTag;

    private Integer classSchool;

    private Integer classAdminId;

    private BigDecimal classPrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }

    public String getClassTag() {
        return classTag;
    }

    public void setClassTag(String classTag) {
        this.classTag = classTag == null ? null : classTag.trim();
    }

    public Integer getClassSchool() {
        return classSchool;
    }

    public void setClassSchool(Integer classSchool) {
        this.classSchool = classSchool;
    }

    public Integer getClassAdminId() {
        return classAdminId;
    }

    public void setClassAdminId(Integer classAdminId) {
        this.classAdminId = classAdminId;
    }

    public BigDecimal getClassPrice() {
        return classPrice;
    }

    public void setClassPrice(BigDecimal classPrice) {
        this.classPrice = classPrice;
    }
}