package com.perftesting.PerfTesting.repository;

import com.perftesting.PerfTesting.bean.Subject;
import org.springframework.data.repository.CrudRepository;

public interface SubjectRepository extends CrudRepository<Subject,String> {
}
