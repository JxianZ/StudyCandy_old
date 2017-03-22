package com.studycandy.mapper;

import com.studycandy.model.CommentNote;

import java.util.List;

public interface CommentNoteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CommentNote record);

    CommentNote selectByPrimaryKey(Integer id);

    List<CommentNote> selectAll();

    int updateByPrimaryKey(CommentNote record);
}