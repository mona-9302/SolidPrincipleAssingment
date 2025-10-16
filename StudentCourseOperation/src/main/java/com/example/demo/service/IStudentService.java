package com.example.demo.service;

import java.util.List;

import com.example.demo.request.StudentRequest;
import com.example.demo.response.StudentResponse;

public interface IStudentService {
      
	 public StudentResponse insert(StudentRequest request);
	 public List<StudentResponse>showStudent();
	 public List<StudentResponse> getStudentsByCourseName(String courseName);
	 public List<StudentResponse> getStudentsWithoutCourse();
	
}
