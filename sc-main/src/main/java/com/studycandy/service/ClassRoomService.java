package com.studycandy.service;

import com.studycandy.mapper.ClassroomMapper;
import com.studycandy.model.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/4 0004.
 */
@Service
public class ClassRoomService {
    @Autowired
    ClassroomMapper classroomMapper;

    public List<Classroom> getClassRoomsBySchoolId(Integer schoolId){
        return classroomMapper.selectBySchoolId(schoolId);
    }

    public Classroom getClassRoomById(Integer id){
        return classroomMapper.selectByPrimaryKey(id);
    }
}
