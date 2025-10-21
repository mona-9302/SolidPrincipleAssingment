package com.example.demo.service;
import java.util.List;

import com.example.demo.request.CourseRequest;
import com.example.demo.response.CourseResponse;
import com.example.demo.response.StudentWithCoursesCount;

public interface ICourseService {

	public CourseResponse insert(CourseRequest request);
	public List<CourseResponse> show();
	public List<CourseResponse> getCourses();
	public CourseResponse updateCourse(Integer id,String insctrutor);
	public List<StudentWithCoursesCount> getStudentWithCourses();
	public List<StudentWithCoursesCount> topStudent(Integer n);

}
