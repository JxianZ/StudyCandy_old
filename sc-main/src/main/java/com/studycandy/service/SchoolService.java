package com.studycandy.service;

import com.studycandy.mapper.SchoolMapper;
import com.studycandy.model.School;
import com.studycandy.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public Map<Integer,String> getSchoolMap(){
        Map<Integer,String> m = new HashMap<Integer,String>();
        for(School s : mapper.selectAll()){
            m.put(s.getId(),s.getSchoolName());
        }
        return m;
    }

}
