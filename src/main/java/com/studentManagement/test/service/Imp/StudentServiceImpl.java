package com.studentManagement.test.service.Imp;

import java.util.List;

import org.springframework.stereotype.Service;

import com.studentManagement.test.entity.Student;
import com.studentManagement.test.reposatory.StudentReposatory;
import com.studentManagement.test.service.StudentService;


@Service
public class StudentServiceImpl implements StudentService{
	
	
	private StudentReposatory studentReposatory;
	
	

	public StudentServiceImpl(StudentReposatory studentReposatory) {
		super();
		this.studentReposatory = studentReposatory;
	}



	@Override
	public List<Student> getallStydent() {
		// TODO Auto-generated method stub
		return (List<Student>) studentReposatory.findAll();
	}



	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentReposatory.save(student);
	}



	@Override
	public Student getStudentById(Long id) {
		return studentReposatory.findById(id).get();
	}



	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return this.studentReposatory.save(student);
	}



	@Override
	public void deleteStudent(Long id) {
		// TODO Auto-generated method stub
		studentReposatory.deleteById(id);
	}
	
	

}
