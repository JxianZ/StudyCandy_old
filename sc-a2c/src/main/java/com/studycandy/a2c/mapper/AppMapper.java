package com.studycandy.a2c.mapper;

import com.studycandy.a2c.model.App;

import java.util.List;

public interface AppMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(App record);

    App selectByPrimaryKey(Integer id);

    List<App> selectAll();

    int updateByPrimaryKey(App record);
}