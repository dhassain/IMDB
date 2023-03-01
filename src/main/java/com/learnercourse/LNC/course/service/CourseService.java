package com.learnercourse.LNC.course.service;

import com.learnercourse.LNC.course.model.Course;
//import com.learnercourse.LNC.course.model.Learner;
import com.learnercourse.LNC.course.repository.CourseRepository;
//import com.learnercourse.LNC.course.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    private CourseRepository courseRepository;

    @Autowired
    public CourseService(CourseRepository learnerRepository){
        this.courseRepository = learnerRepository;
    }

    public String saveCourse(Course learner){
        Course savedLearner = courseRepository.save(learner); //save(course) comes in JSON format
        return "New course: " + savedLearner;
    }
    public List<Course> getCourseList() {
        return courseRepository.findAll();
    }
    public Course getCourseById(int id) {
        return courseRepository.findById(id);
    }
    public Course deleteCourseById(int id){
        return courseRepository.deleteById(id);
    }
    public long count(){
        return courseRepository.count();
    }
    public boolean existsById( int id){
        return courseRepository.existsById(id);
    }
    public String deleteAll(){
        courseRepository.deleteAll();
        return "All course deleted.";
    }

}