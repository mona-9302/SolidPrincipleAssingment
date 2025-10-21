package com.example.demo.repo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.entity.Course;
import com.example.demo.response.CourseResponse;
import com.example.demo.response.StudentWithCoursesCount;

import jakarta.transaction.Transactional;

public interface ICourseRepo extends JpaRepository<Course, Integer> {

	@Query("SELECT new com.example.demo.response.CourseResponse(c.id, c.courseName, c.instructor) "
		     + "FROM Course c LEFT JOIN c.students s "
		     + "WHERE s.id IS NULL")
	List<CourseResponse> findCourseWithoutStudent();
    
	@Modifying
	@Transactional
	@Query("UPDATE Course c SET c.instructor = :instructor WHERE c.id = :id")
	int updateCourse(@Param("id") Integer id, @Param("instructor") String instructor);
	
	@Query("SELECT new com.example.demo.response.StudentWithCoursesCount(c.id,c.courseName,c.instructor,COUNT(s.id)) from "
			+ "Course c Left Join c.students s Group by c.id,c.courseName,c.instructor")
	List<StudentWithCoursesCount> getCourseWithStudent();
	
	@Query("SELECT new com.example.demo.response.StudentWithCoursesCount(c.id, c.courseName, c.instructor, COUNT(s.id)) " +
		       "FROM Course c LEFT JOIN c.students s " +
		       "GROUP BY c.id, c.courseName, c.instructor " +
		       "ORDER BY COUNT(s.id) DESC")
	List<StudentWithCoursesCount> findAllCoursesWithStudentCount();
}
