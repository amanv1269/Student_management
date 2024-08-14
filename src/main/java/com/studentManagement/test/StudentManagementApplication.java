package com.studentManagement.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentManagement.test.entity.Student;
import com.studentManagement.test.reposatory.StudentReposatory;

@SpringBootApplication
public class StudentManagementApplication implements CommandLineRunner{
	@Autowired
	private StudentReposatory studentReposatory;
	public static void main(String[] args) {
		SpringApplication.run(StudentManagementApplication.class, args);
	
	}
	@Override
	public void run(String... args)throws Exception {
//		Student s1 = new Student(1L,"aman","verma","amanv1269@gmail.com");
//		studentReposatory.save(s1);
				
	}
	

}
