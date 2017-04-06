package com.studycandy.a2c.session.mapper;

import com.studycandy.a2c.session.model.Session;

import java.util.List;

public interface SessionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Session record);

    Session selectByPrimaryKey(String id);

    List<Session> selectAll();

    int updateByPrimaryKey(Session record);
}