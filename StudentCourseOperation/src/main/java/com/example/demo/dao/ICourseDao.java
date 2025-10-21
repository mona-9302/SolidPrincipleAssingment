package com.example.demo.dao;
import java.util.List;

import com.example.demo.request.CourseRequest;
import com.example.demo.response.CourseResponse;
import com.example.demo.response.StudentWithCoursesCount;

public interface ICourseDao {

	public CourseResponse createCourse(CourseRequest request);
	public List<CourseResponse> showCourse();
	public List<CourseResponse> getCourses();
	public CourseResponse updateCourse(Integer id,String instructor);
	public List<StudentWithCoursesCount> getCoursesWithStudent();
	public List<StudentWithCoursesCount> topStudents(Integer n);

}
