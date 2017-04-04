package com.studycandy.service;

import com.studycandy.mapper.SchoolMapper;
import com.studycandy.model.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/4/4 0004.
 */
@Service
public class SchoolService {
    @Autowired
    private SchoolMapper mapper;
    public School getSchoolByid(Integer id){
        return mapper.selectByPrimaryKey(id);
    }

}
