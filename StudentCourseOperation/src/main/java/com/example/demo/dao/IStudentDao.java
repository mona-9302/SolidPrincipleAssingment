package com.example.demo.dao;

import java.util.List;

import com.example.demo.request.StudentRequest;
import com.example.demo.response.StudentResponse;

public interface IStudentDao {
    
	public StudentResponse createStudent(StudentRequest request);
	public List<StudentResponse> showAllStudent();
	public List<StudentResponse> getStudentByCourseName(String courseName);
	public List<StudentResponse> getStudentsWithoutCourse();
	public List<StudentResponse> searchStudentsByCityAndInstructor(String city, String instructor);
	public boolean updateInstructor(Long courseId, String newInstructor);
}
