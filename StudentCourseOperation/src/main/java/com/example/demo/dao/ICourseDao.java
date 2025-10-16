package com.example.demo.dao;
import java.util.List;
import com.example.demo.response.CourseResponse;
import com.example.demo.response.CourseResponseDTO;

public interface ICourseDao {
    
	 public boolean updateInstructor(Long courseId, String newInstructor);
	 public List<CourseResponse> getCoursesWithStudentCount();
	 public List<CourseResponseDTO> findCourseWithoutStudent();

}
