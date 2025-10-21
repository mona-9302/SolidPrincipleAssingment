package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

import com.example.demo.request.CourseRequest;
import com.example.demo.request.UpdateCourseRequest;
import com.example.demo.response.CourseResponse;
import com.example.demo.response.StudentWithCoursesCount;
import com.example.demo.service.ICourseService;

@RestController
@RequestMapping("/course")
public class CourseController {
   
	@Autowired
	private ICourseService service;

	@PostMapping("/insert")
	public ResponseEntity<CourseResponse>create(@RequestBody CourseRequest request){
		return new ResponseEntity<CourseResponse>(service.insert(request),HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<CourseResponse>>showCourse(){
		return new ResponseEntity<List<CourseResponse>>(service.show(),HttpStatus.OK);
	}
	
	@GetMapping("getCourses")
	public ResponseEntity<List<CourseResponse>> getCourseWithoutStudent(){
		return new ResponseEntity<List<CourseResponse>>(service.getCourses(),HttpStatus.OK);
	}
	
	@PatchMapping("/updateCourse/{id}")
	public ResponseEntity<CourseResponse>updateCourse(@PathVariable("id")Integer id,@RequestParam String instructor){
		return new ResponseEntity<CourseResponse>(service.updateCourse(id,instructor),HttpStatus.OK);
	}
	
	@GetMapping("/getCoursesWithStudent")
	public ResponseEntity<List<StudentWithCoursesCount>> getCourseDetails(){
		return new ResponseEntity<List<StudentWithCoursesCount>>(service.getStudentWithCourses(),HttpStatus.OK);
	}
	
	@GetMapping("/topStudents")
	public ResponseEntity<List<StudentWithCoursesCount>> getTop(@RequestParam("n")Integer n){
		return new ResponseEntity<List<StudentWithCoursesCount>>(service.topStudent(n),HttpStatus.OK);
	}
}
