package com.studycandy.mapper;

import com.studycandy.model.Classroom;
import java.util.List;

public interface ClassroomMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Classroom record);

    Classroom selectByPrimaryKey(Integer id);

    List<Classroom> selectAll();

    int updateByPrimaryKey(Classroom record);
}