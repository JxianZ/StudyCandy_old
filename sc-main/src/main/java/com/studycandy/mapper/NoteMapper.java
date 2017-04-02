package com.studycandy.mapper;

import com.studycandy.model.Note;

import java.util.List;

public interface NoteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Note record);

    Note selectByPrimaryKey(Integer id);

    List<Note> selectAll();

    int updateByPrimaryKey(Note record);

    List<Note> selectByUserId(Integer userId);
}