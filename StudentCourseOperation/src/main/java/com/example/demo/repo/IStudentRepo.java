package com.example.demo.repo;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Student;
import com.example.demo.response.StudentCountResponse;
import com.example.demo.response.StudentCourseResponse;
import com.example.demo.response.StudentNotCourseResponse;

public interface IStudentRepo extends JpaRepository<Student, Integer> {

	@Query("SELECT c.courseName FROM Student s JOIN s.courses c WHERE s.id = :studentId")
	List<String> findAllCourseName(@Param("studentId") Integer studentId);
    
	@Query("SELECT DISTINCT new com.example.demo.response.StudentCourseResponse(s.id,s.name) FROM Student s JOIN s.courses c WHERE c.courseName=:courseName")
	List<StudentCourseResponse> findStudentsByCourseName(@Param("courseName") String courseName);
	
	@Query("SELECT new com.example.demo.response.StudentCountResponse(c.id, c.courseName, COUNT(s.id)) FROM Course c JOIN c.students s GROUP BY c.id, c.courseName")
	List<StudentCountResponse> getStudentCount();
	
	@Query("SELECT new com.example.demo.response.StudentNotCourseResponse(s.id, s.name, s.email, s.city) "
	         + "FROM Student s LEFT JOIN s.courses c "
	         + "WHERE c.id IS NULL")
	List<StudentNotCourseResponse>getNotEnrolledStudent();
	
	@Query("SELECT new com.example.demo.response.StudentNotCourseResponse(s.id, s.name, s.email, s.city) " +
		       "FROM Student s JOIN s.courses c " +
		       "WHERE s.city = :city AND c.instructor = :instructor")
	List<StudentNotCourseResponse>searchStudent(@Param("city")String city,@Param("instructor") String instructor);
}
