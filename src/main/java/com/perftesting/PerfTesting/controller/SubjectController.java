package com.perftesting.PerfTesting.controller;

import com.perftesting.PerfTesting.bean.Subject;
import com.perftesting.PerfTesting.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SubjectController {

@Autowired
SubjectService subjectService;

@RequestMapping("/Subjects")
    public Subject getAllSubjects() {
        return subjectService.getAllSubjects();
    }

    @RequestMapping(method = RequestMethod.POST, value ="/Subjects")
    public void addSubjects(@RequestBody Subject subject)
    {
        subjectService.addSubjects(subject);
    }
}
