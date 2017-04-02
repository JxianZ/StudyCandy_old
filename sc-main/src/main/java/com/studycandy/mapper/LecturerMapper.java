package com.studycandy.mapper;

import com.studycandy.model.Lecturer;
import java.util.List;

public interface LecturerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Lecturer record);

    Lecturer selectByPrimaryKey(Integer id);

    List<Lecturer> selectAll();

    int updateByPrimaryKey(Lecturer record);
}