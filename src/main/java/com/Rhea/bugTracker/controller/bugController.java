package com.Rhea.bugTracker.controller;

import com.Rhea.bugTracker.model.bug;
import com.Rhea.bugTracker.service.bugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class bugController {

    @Autowired
    bugService bugServ;

    @RequestMapping(value = "/bugs", method = RequestMethod.POST)
    public bug createbug(@RequestBody bug repo) {
        return bugServ.createbug(repo);
    }

    @RequestMapping(value = "/bugs", method = RequestMethod.GET)
    public List<bug>readbug(){
        return bugServ.getbug();
    }

    @RequestMapping(value = "/bugs/{bug_ID}", method = RequestMethod.PUT)
    public bug readbug(@PathVariable(value = "bug_ID") Long ID, @RequestBody bug bugInfo){
        return bugServ.updatebug(ID, bugInfo);
    }

    @RequestMapping(value = "/bugs/{bug_ID}", method = RequestMethod.DELETE)
    public void deletebug(@PathVariable(value = "bug_ID") Long ID){
        bugServ.deletebug(ID);
    }
}


