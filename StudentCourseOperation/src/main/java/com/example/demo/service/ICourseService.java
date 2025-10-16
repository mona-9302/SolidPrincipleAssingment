package com.example.demo.service;

import java.util.List;

import com.example.demo.response.CourseResponse;
import com.example.demo.response.CourseResponseDTO;
import com.example.demo.response.CourseStudentDTOCount;

public interface ICourseService {
     
	public boolean updateInstructor(Long courseId, String newInstructor);
	public List<CourseResponse> getCoursesWithStudentCount();
	public List<CourseResponseDTO> getCourseWithoutStudent();
	public List<CourseStudentDTOCount> getCountStudentEachCourse();
}
