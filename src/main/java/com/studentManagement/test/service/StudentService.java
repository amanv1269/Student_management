package com.studentManagement.test.service;


import java.util.List;

import com.studentManagement.test.entity.Student;

public interface StudentService {
	List<Student> getallStydent();
	
	Student saveStudent(Student student);
	
	Student getStudentById(Long id);
	Student updateStudent(Student student);
	
	void deleteStudent(Long id);
	

}
