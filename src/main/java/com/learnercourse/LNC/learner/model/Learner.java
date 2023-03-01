package com.learnercourse.LNC.learner.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Learner {
    @Id //representing as a Primary Key
    @GeneratedValue(strategy = GenerationType.AUTO) //auto-generates values one by one for Id integer.
    private Integer learnerId;
    private String learnerFirstName;
    private String learnerLastName;
    private String learnerEmail;
    private String learnerPassword;
    private int courseId;

//----------constructor------------------
//Constructor has the same name as the class name

    @Override
    public String toString() {
        return "Learner{" +
                "learnerId=" + learnerId +
                ", learnerFirstName='" + learnerFirstName + '\'' +
                ", learnerLastName='" + learnerLastName + '\'' +
                ", learnerEmail='" + learnerEmail + '\'' +
                ", learnerPassword='" + learnerPassword + '\'' +
                ", courseId='" + courseId + '\'' +
                '}';
    }

    public Learner(){
        this.learnerId = 0;
        this.learnerFirstName = "";
        this.learnerLastName = "";
        this.learnerEmail = "";
        this.learnerPassword = "";
        this.courseId = 0;
    }
    public Learner(int learnerId, String learnerFirstName, String learnerLastName, String learnerEmail, String learnerPassword, int courseId) {
        //'this' keywords represents current context of java class
        this.learnerId = learnerId;
        this.learnerFirstName = learnerFirstName;
        this.learnerLastName = learnerLastName;
        this.learnerEmail = learnerEmail;
        this.learnerPassword = learnerPassword;
        this.courseId = courseId;
    }

//----------getters-----------------------
//Getters are used to get the values of the local variables of the class


    public Integer getLearnerId() {
        return learnerId;
    }

    public String getLearnerFirstName() {
        return learnerFirstName;
    }

    public void setLearnerFirstName(String learnerFirstName) {
        this.learnerFirstName = learnerFirstName;
    }

    public String getLearnerLastName() {
        return learnerLastName;
    }

    public void setLearnerLastName(String learnerLastName) {
        this.learnerLastName = learnerLastName;
    }

    public String getLearnerEmail() {
        return learnerEmail;
    }

    public void setLearnerEmail(String learnerEmail) {
        this.learnerEmail = learnerEmail;
    }

    public String getLearnerPassword() {
        return learnerPassword;
    }

    public void setLearnerPassword(String learnerPassword) {
        this.learnerPassword = learnerPassword;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

}
