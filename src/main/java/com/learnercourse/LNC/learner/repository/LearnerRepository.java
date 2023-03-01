package com.learnercourse.LNC.learner.repository;

import com.learnercourse.LNC.learner.model.Learner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LearnerRepository extends CrudRepository<Learner, Integer> {

    public List<Learner> findAll();
    public Learner findById(int id);
    public Learner save(Learner learner);
    public Learner deleteById(int id);
    public long count();
    public boolean existsById(int id);
    public void deleteAll();
}
