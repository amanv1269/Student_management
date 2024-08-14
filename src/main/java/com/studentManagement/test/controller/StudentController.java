package com.studentManagement.test.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.studentManagement.test.entity.Student;
import com.studentManagement.test.reposatory.StudentReposatory;
import com.studentManagement.test.service.StudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class StudentController {

	private StudentReposatory studentReposatory;
	@Autowired
	private StudentService studentService;
	
	public StudentController(StudentReposatory studentReposatory) {
		super();
		this.studentReposatory = studentReposatory;
	}

	//@GetMapping("/student")
	@GetMapping("/")
	public String allStudent(Model model){
		System.out.println("application is running ");
		model.addAttribute("allStudent", studentReposatory.findAll());
		return "student";
	}
	
	@GetMapping("/addStudent")
	public String addStudent(Model model){
		System.out.println("add is running ");
		Student student =new Student();
		model.addAttribute("student", student);
		return "addStudent";
	}
	
	@PostMapping("/student")
	public String addStudents(@ModelAttribute("student") Student student) {
	    // Process POST request
	    studentService.saveStudent(student);
	    System.out.println(student);

	    return "redirect:/";
	}
	
	@GetMapping("/student/edit/{id}")
	public String editStudent(@PathVariable Long id , Model model) {
		model.addAttribute("student", studentService.getStudentById(id));
		return "edit_student";
	}
	
	@PostMapping("/student/{id}")
	public String updateStudent(@PathVariable Long id, @ModelAttribute("student") Student student, Model model) {
	Student existing=studentService.getStudentById(id);
		existing.setId(id);
		existing.setFirstName(student.getFirstName());
		existing.setLastName(student.getLastName());
		existing.setEmail(student.getEmail());
		
		studentService.updateStudent(existing);
		return "redirect:/";
	}
	
	@GetMapping("/student/delete/{id}")
	public String delete(@PathVariable Long id,Model model) {
	
		studentService.deleteStudent(id);
		return "redirect:/";
	}
	
	
	
	
}
