package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Student_Service_implementation implements Student_Service{
	
	@Autowired
	private Student_Repository student_Repository;
	
	public Student saveStudent(Student student) {
		return student_Repository.save(student);
		
	}
	@Override
	public Student updateStudent(Student student){
		return student_Repository.save(student);
		
	}
	@Override
	public List<Student>getall(){
		return student_Repository.findAll();
	}
	@Override
	public String deleteStudent(int id)
	{
		student_Repository.deleteById(id);
		return "delete succes";
		
	}
	
	

}
