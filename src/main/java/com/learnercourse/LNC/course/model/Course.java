package com.learnercourse.LNC.course.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id //representing as a Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto-generates values one by one for Id integer.
    private Integer courseId;
    private String courseName;
    private String courseDescription;

//----------constructor------------------
//Constructor has the same name as the class name

    @Override
    public String toString() { //JSON .. looks like an object but it's not an object .. coz "Moive{"
        return "Course{" +
                "id=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseDescription='" + courseDescription + '\'' +
                '}';
    }

    public Course(){
        this.courseId = 0;
        this.courseName = "";
        this.courseDescription = "";
    }
    public Course(String courseName, String courseDescription, int id){
        //'this' keywords represents current context of java class
        this.courseId = id;
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

//----------getters-----------------------
//Getters are used to get the values of the local variables of the class
    public Integer getCourseId(){
        return courseId;
    }
    public String getCourseName(){
        return courseName;
    }
    public String getCourseDescription(){
        return courseDescription;
    }

//-----------setters-----------------------
//Setters are used to assign value to the local variables of the class
    public void setCourseId(Integer id) {
        this.courseId = id;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }
}
