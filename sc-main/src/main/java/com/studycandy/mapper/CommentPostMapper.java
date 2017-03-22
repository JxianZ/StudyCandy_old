package com.studycandy.mapper;

import com.studycandy.model.CommentPost;

import java.util.List;

public interface CommentPostMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentPost record);

    CommentPost selectByPrimaryKey(Integer id);

    List<CommentPost> selectAll();

    int updateByPrimaryKey(CommentPost record);
}