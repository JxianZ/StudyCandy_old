package com.studycandy.controller;

import com.studycandy.core.BaseController;
import com.studycandy.model.Classroom;
import com.studycandy.service.ClassRoomService;
import com.studycandy.service.CourseService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * Coding with Intellij IDEA
 * Author: Chenls
 * Time: 2017/3/18
 */
@Controller
@RequestMapping("/classroom")
public class BigClassroomController extends BaseController {
    private Logger logger = Logger.getLogger(this.getClass());
    @Autowired
    private ClassRoomService classRoomService;
    @Autowired
    private CourseService courseService;

    //大教室临时入口
    @RequestMapping(value = {"", "/"})
    public String classList(HttpServletRequest request, HttpServletResponse response, Model model) {
        //推荐课表 TODO 获取推荐课程列表
        List<Classroom> l = new ArrayList<Classroom>();
        l.add(classRoomService.getClassRoomById(1));
        l.add(classRoomService.getClassRoomById(3));

        model.addAttribute("classRoomList",l);
        
        return "classroom/bigClassroom";
    }

    //校区所有的教室列表
    @RequestMapping(value = {"/{schoolId}"})
    public String classList(HttpServletRequest request, HttpServletResponse response, Model model,
                            @PathVariable("schoolId")Integer schoolId) {
        //TODO 按校区获取教室
        model.addAttribute("classRoomList",classRoomService.getClassRoomsBySchoolId(schoolId));
        return "classroom/bigClassroom";
    }
    //
    @RequestMapping(value = "/smallClassroom/{classId}")
    public String classView(HttpServletRequest request, HttpServletResponse response, Model model,
                            @PathVariable("classId")Integer classId){
        model.addAttribute("courseList",courseService.getCourseByClassId(classId));
       return "classroom/smallClassroom";
    }
    @RequestMapping(value = {"/courseVideo/{courseId}"})
    public String toCourse(HttpServletRequest request, HttpServletResponse response, Model model,
                           @PathVariable("courseId")Integer courseId) {
            model.addAttribute("Course",courseService.getCourseById(courseId));
        return "classroom/courseVideo";

    }
}
