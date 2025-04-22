package com.itp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.itp.model.Student;

@Service
public class StudentService {
	
	public List<Student> listOfStudent()
	{
		Student s1=new Student(101,"Alice",97.5);
		Student s2=new Student(102,"Ben",98.5);
		Student s3=new Student(103,"Chris",88.5);
		Student s4=new Student(104,"David",78.5);
		
		List<Student> students =new ArrayList();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		return students;
	}

}
