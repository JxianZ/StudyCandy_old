package com.studycandy.mapper;

import com.studycandy.model.RankWeek;

import java.util.List;

public interface RankWeekMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RankWeek record);

    RankWeek selectByPrimaryKey(Integer id);

    List<RankWeek> selectAll();

    int updateByPrimaryKey(RankWeek record);
}