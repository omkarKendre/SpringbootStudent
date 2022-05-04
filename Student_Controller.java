package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student_Controller {

	@Autowired
	private Student_Service student_Service;

	@PostMapping("/save")
	public Student addStudent(@RequestBody Student student) {
	return student_Service.saveStudent(student);
	}

	@GetMapping("/getall")
	public List<Student> getList(@RequestBody Student student) {
		return student_Service.getall();
	}

	@PutMapping("/update")
	public Student updateStudent(@RequestBody Student student) {
		return student_Service.saveStudent(student);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
	    return student_Service.deleteStudent(id);
	}
}