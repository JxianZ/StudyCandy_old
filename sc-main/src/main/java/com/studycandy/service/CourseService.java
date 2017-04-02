package com.studycandy.service;

import com.studycandy.mapper.CourseMapper;
import com.studycandy.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/4/3 0003.
 */
@Service
public class CourseService {
    @Autowired
    CourseMapper courseMapper;


}
