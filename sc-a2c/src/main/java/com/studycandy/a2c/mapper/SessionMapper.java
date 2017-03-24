package com.studycandy.a2c.mapper;

import com.studycandy.a2c.model.Session;
import com.studycandy.a2c.model.SessionWithBLOBs;

import java.util.List;

public interface SessionMapper {
    int deleteByPrimaryKey(String id);

    int insert(Session record);

    SessionWithBLOBs selectByPrimaryKey(String id);

    List<Session> selectAll();

    int updateByPrimaryKey(Session record);
}