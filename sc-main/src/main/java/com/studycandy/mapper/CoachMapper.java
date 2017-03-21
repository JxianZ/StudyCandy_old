package com.studycandy.mapper;

import com.studycandy.model.Coach;

import java.util.List;

public interface CoachMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Coach record);

    Coach selectByPrimaryKey(Integer id);

    List<Coach> selectAll();

    int updateByPrimaryKey(Coach record);
}