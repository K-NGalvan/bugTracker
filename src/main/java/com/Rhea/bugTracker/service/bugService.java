package com.Rhea.bugTracker.service;

import com.Rhea.bugTracker.model.bug;
import com.Rhea.bugTracker.repo.bugRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class bugService {

 @Autowired
 bugRepository bugRepo;

 //Read
 public List<bug> getbug() {
  return bugRepo.findAll();
 }

 //create
 public bug createbug(bug repo) {
  return bugRepo.save(repo);
 }

 //delete
 public void deletebug(Long bug_id) {
  bugRepo.deleteById(bug_id);
 }

 //update
 public bug updatebug(Long bug_ID, bug bugInfo){
  bug repo = bugRepo.findById(bug_ID).get();
  repo.setTittle(bugInfo.getTittle());
  repo.setDescription(bugInfo.getDescription());
  repo.setStatus(bugInfo.getStatus());
  repo.setPriority(bugInfo.getPriority());

  return bugRepo.save(repo);
 }

}
