package com.learnercourse.LNC.course.controller;

import com.learnercourse.LNC.course.model.Course;
//import com.learnercourse.LNC.course.model.Learner;
import com.learnercourse.LNC.course.service.CourseService;
//import com.learnercourse.LNC.course.service.LearnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lnc")
public class CourseController {
    private CourseService courseService;

    @Autowired
    public CourseController(CourseService service){
        this.courseService = service;
    }

    @RequestMapping(value = "/course/save", method = RequestMethod.POST) //save()
    public String saveCourse(@RequestBody Course payload){
        return courseService.saveCourse(payload);
    }

    @RequestMapping(value = "/course/delete/{id}", method = RequestMethod.DELETE) //DeleteById()
    public Course deleteCourse(@PathVariable("id") int id){
        return courseService.deleteCourseById(id);
    }

    @RequestMapping(value = "/course/exist/{id}", method = RequestMethod.GET) //ExistById()
    public boolean existCourse(@PathVariable("id") int id){
        return courseService.existsById(id);
    }

    @RequestMapping(value = "/courses/deleteall") //DeleteAll()
    public String deleteAllCourses(){
        return courseService.deleteAll();
    }

    @GetMapping("/courses") //FindAll()
    public List<Course> courseList() {
        return courseService.getCourseList();
    }

    @GetMapping("/courses/{id}") //FindById()
    public Course courseById(@PathVariable("id") int id) {
        return courseService.getCourseById(id);
    }

    @GetMapping("/courses/count") //count()
    public long courseCount(){
        return courseService.count();
    }

}
