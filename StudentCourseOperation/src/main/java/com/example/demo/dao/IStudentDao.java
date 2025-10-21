package com.example.demo.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.request.StudentRequest;
import com.example.demo.response.StudentCountResponse;
import com.example.demo.response.StudentCourseResponse;
import com.example.demo.response.StudentNotCourseResponse;
import com.example.demo.response.StudentResponse;

@Repository
public interface IStudentDao {

	public StudentResponse insert(StudentRequest request);
	public List<StudentResponse> showStudents();
	public List<StudentCourseResponse> findStudentByCourseName(String name);
	public List<StudentCountResponse> getStudentCount();
	public List<StudentNotCourseResponse> getNotEnrollStudent();
	public List<StudentNotCourseResponse> searchStudent(String city, String instructor);

}
