package com.learnercourse.LNC.course.repository;

import com.learnercourse.LNC.course.model.Course;
//import com.learnercourse.LNC.course.model.Learner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {
    //CrudRepository is extended by the empty repo MovieRepository

    public List<Course> findAll(); //general way to find all the movies
    public Course findById(int id); //find the movies based on id
    public Course save(Course learner);
    public Course deleteById(int id);
    public long count();
    public boolean existsById(int id);
    public void deleteAll();
}
