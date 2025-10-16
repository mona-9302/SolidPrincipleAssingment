package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.response.CourseResponse;
import com.example.demo.response.CourseResponseDTO;
import com.example.demo.response.CourseStudentDTOCount;
import com.example.demo.service.ICourseService;

@RequestMapping("/course")
@RestController
public class CourseController {
    
	@Autowired
	private ICourseService courseService;
	
	@PutMapping("/courses/{id}/instructor")
	public ResponseEntity<String> updateCourseInstructor(
	        @PathVariable Long id,
	        @RequestParam String instructor) {

	    boolean updated = courseService.updateInstructor(id, instructor);
	    System.out.println("controller id "+id);
	    if (updated) {
	        return ResponseEntity.ok("Instructor updated successfully");
	    } else {
	        return ResponseEntity.status(404).body("Course not found");
	    }
	}
	
	 @GetMapping("/student-count")
	 public ResponseEntity<List<CourseResponse>> getCoursesWithStudentCount() {
	        List<CourseResponse> courses = courseService.getCoursesWithStudentCount();
	        return ResponseEntity.ok(courses);
	    }
	 
	 @GetMapping("/course-without-student")
	 public ResponseEntity<List<CourseResponseDTO>>showCourseWithoutStudent(){
		 System.out.println("course without student ====================>");
		 return new ResponseEntity<List<CourseResponseDTO>>(courseService.getCourseWithoutStudent(),HttpStatus.OK);
	 }
	 
	 @GetMapping("/get-student-each-course")
	 public ResponseEntity<List<CourseStudentDTOCount>> getStudentCountEachCourse(){
			return new ResponseEntity<List<CourseStudentDTOCount>>(courseService.getCountStudentEachCourse(),HttpStatus.OK);
		}
}
