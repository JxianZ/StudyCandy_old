package com.studycandy.mapper;

import com.studycandy.model.Credit;

import java.util.List;

public interface CreditMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Credit record);

    Credit selectByPrimaryKey(Integer id);

    List<Credit> selectAll();

    int updateByPrimaryKey(Credit record);
}