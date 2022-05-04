package com.example.demo;

import java.util.List;

public interface Student_Service {
	
	//To save Data
	public Student saveStudent(Student student);
	
	//To Update Data
	public Student updateStudent(Student student);
	
	//To get list
	public List<Student>getall();
	
	
	//To delete Data
	public String deleteStudent(int id);
		


}
