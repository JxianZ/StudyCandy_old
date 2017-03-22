package com.studycandy.mapper;

import com.studycandy.model.RankDay;

import java.util.List;

public interface RankDayMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RankDay record);

    RankDay selectByPrimaryKey(Integer id);

    List<RankDay> selectAll();

    int updateByPrimaryKey(RankDay record);
}