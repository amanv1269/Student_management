package com.studentManagement.test.reposatory;

import org.springframework.data.repository.CrudRepository;

import com.studentManagement.test.entity.Student;

public interface StudentReposatory extends CrudRepository<Student, Long> {

}
