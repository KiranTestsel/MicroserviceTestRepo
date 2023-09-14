package com.perftesting.PerfTesting.service;

import com.perftesting.PerfTesting.bean.Subject;
import com.perftesting.PerfTesting.repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SubjectService {

    @Autowired
    SubjectRepository repository;
    public Subject getAllSubjects() {
        List<Subject> subjects = new ArrayList<>();
        repository.findAll().forEach(subjects::add);
        Subject subject = new Subject();
       for(int i=0;i<subjects.size();i++) {
            subject =subjects.get(i);
       }
        return subject;
    }

    public void addSubjects(Subject subject) {
        repository.save(subject);
    }

}
