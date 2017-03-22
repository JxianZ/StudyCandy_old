package com.studycandy.mapper;

import com.studycandy.model.CommentCourse;

import java.util.List;

public interface CommentCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentCourse record);

    CommentCourse selectByPrimaryKey(Integer id);

    List<CommentCourse> selectAll();

    int updateByPrimaryKey(CommentCourse record);
}