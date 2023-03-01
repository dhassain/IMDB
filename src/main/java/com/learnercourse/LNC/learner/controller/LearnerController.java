package com.learnercourse.LNC.learner.controller;

import com.learnercourse.LNC.learner.model.Learner;
import com.learnercourse.LNC.learner.service.LearnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lnc")
public class LearnerController {
    private LearnerService learnerService;

    @Autowired
    public LearnerController(LearnerService service){
        this.learnerService = service;
    }

    @RequestMapping(value = "/learner/save", method = RequestMethod.POST) //save()
    public String saveLearner(@RequestBody Learner payload){
        return learnerService.saveLearner(payload);
    }

    @RequestMapping(value = "/learner/delete/{id}", method = RequestMethod.DELETE) //DeleteById()
    public Learner deleteLearner(@PathVariable("id") int id){
        return learnerService.deleteLearnerById(id);
    }

    @RequestMapping(value = "/learner/exist/{id}", method = RequestMethod.GET) //ExistById()
    public boolean existLearner(@PathVariable("id") int id){
        return learnerService.existsById(id);
    }

    @RequestMapping(value = "/learners/deleteall") //DeleteAll()
    public String deleteAllLearners(){
        return learnerService.deleteAll();
    }

    @GetMapping("/learners") //FindAll()
    public List<Learner> learnerList() {
        return learnerService.getLearnerList();
    }

    @GetMapping("/learners/{id}") //FindById()
    public Learner learnerById(@PathVariable("id") int id) {
        return learnerService.getLearnerById(id);
    }

    @GetMapping("/learners/count") //count()
    public long learnerCount(){
        return learnerService.count();
    }

}
