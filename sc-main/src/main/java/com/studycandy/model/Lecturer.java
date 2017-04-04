package com.studycandy.model;

public class Lecturer {
    private Integer id;

    private String lecturerTag;

    private Integer classId;

    private Integer lecturerId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLecturerTag() {
        return lecturerTag;
    }

    public void setLecturerTag(String lecturerTag) {
        this.lecturerTag = lecturerTag == null ? null : lecturerTag.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public Integer getLecturerId() {
        return lecturerId;
    }

    public void setLecturerId(Integer lecturerId) {
        this.lecturerId = lecturerId;
    }
}