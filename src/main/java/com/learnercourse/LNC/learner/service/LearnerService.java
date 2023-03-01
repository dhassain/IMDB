package com.learnercourse.LNC.learner.service;

import com.learnercourse.LNC.learner.model.Learner;
import com.learnercourse.LNC.learner.repository.LearnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LearnerService {
    private LearnerRepository learnerRepository;

    @Autowired
    public LearnerService(LearnerRepository learnerRepository){
        this.learnerRepository = learnerRepository;
    }

    public String saveLearner(Learner learner){
        Learner savedLearner = learnerRepository.save(learner); //save comes in JSON format
        return "New learner: " + savedLearner;
    }
    public List<Learner> getLearnerList() {
        return learnerRepository.findAll();
    }
    public Learner getLearnerById(int id) {
        return learnerRepository.findById(id);
    }
    public Learner deleteLearnerById(int id){
        return learnerRepository.deleteById(id);
    }
    public long count(){
        return learnerRepository.count();
    }
    public boolean existsById( int id){
        return learnerRepository.existsById(id);
    }
    public String deleteAll(){
        learnerRepository.deleteAll();
        return "All learner deleted.";
    }

}