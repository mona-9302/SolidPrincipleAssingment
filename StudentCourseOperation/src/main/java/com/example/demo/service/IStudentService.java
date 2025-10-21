package com.example.demo.service;
import java.util.List;

import com.example.demo.request.StudentRequest;
import com.example.demo.response.StudentCountResponse;
import com.example.demo.response.StudentCourseResponse;
import com.example.demo.response.StudentNotCourseResponse;
import com.example.demo.response.StudentResponse;

public interface IStudentService {
     
	 public StudentResponse insert(StudentRequest request);
	 public List<StudentResponse> showStudent();
	 public List<StudentCourseResponse> showStudentByCourseName(String name);
	public List<StudentCountResponse> getStudentCount();
	public List<StudentNotCourseResponse> getStudentNotEnroll();
	public List<StudentNotCourseResponse> searchStudent(String city, String instructor);
}
