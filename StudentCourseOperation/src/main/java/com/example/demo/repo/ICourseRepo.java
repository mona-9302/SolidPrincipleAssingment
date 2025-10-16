package com.example.demo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Course;
import com.example.demo.response.CourseResponseDTO;
import com.example.demo.response.CourseStudentDTOCount;

@Repository
public interface ICourseRepo extends JpaRepository<Course, Long> {

	Course findByCourseName(String courseName);
    
	@Query("SELECT new com.example.demo.response.CourseResponseDTO(c.courseName, c.instructor) " +
		       "FROM Course c LEFT JOIN c.students s   WHERE s IS NULL")
	List<CourseResponseDTO> findCourseWithoutStudent();
	
	@Query("SELECT new com.example.demo.response.CourseStudentDTOCount(c.courseName, COUNT(s)) " +
		       "FROM Course c LEFT JOIN c.students s " +
		       "GROUP BY c.courseName")
	List<CourseStudentDTOCount> getStudentCountEachCourse();

}
