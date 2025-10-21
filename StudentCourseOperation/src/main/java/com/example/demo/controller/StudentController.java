package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.IStudentDao;
import com.example.demo.request.StudentRequest;
import com.example.demo.response.StudentCountResponse;
import com.example.demo.response.StudentCourseResponse;
import com.example.demo.response.StudentNotCourseResponse;
import com.example.demo.response.StudentResponse;
import com.example.demo.service.IStudentService;

@RestController
@RequestMapping("/students")
public class StudentController {
     
	@Autowired
	private IStudentService service;
	
	@PostMapping("/insert")
	public ResponseEntity<StudentResponse>create(@RequestBody StudentRequest request){
		return new ResponseEntity<StudentResponse>(service.insert(request),HttpStatus.CREATED);
	}
	
	@GetMapping("/getStudents")
	public ResponseEntity<List<StudentResponse>>showStudens(){
		return new ResponseEntity<List<StudentResponse>>(service.showStudent(),HttpStatus.OK);
	}
	
	@GetMapping("/getStudent")
	public ResponseEntity<List<StudentCourseResponse>>showStudentByCourseName(@RequestParam String name){
		return new ResponseEntity<List<StudentCourseResponse>>(service.showStudentByCourseName(name),HttpStatus.OK);
	}
	
	@GetMapping("/getCount")
	public ResponseEntity<List<StudentCountResponse>>getStudentCount(){
		return new ResponseEntity<List<StudentCountResponse>>(service.getStudentCount(),HttpStatus.OK);
	}
	
	@GetMapping("/notEnrollStudents")
	public ResponseEntity<List<StudentNotCourseResponse>>getStudents(){
		return new ResponseEntity<List<StudentNotCourseResponse>>(service.getStudentNotEnroll(),HttpStatus.OK);
	}
	
	@GetMapping("/searchStudents")
	public ResponseEntity<List<StudentNotCourseResponse>>searchStudents(@RequestParam String city,@RequestParam String instructor){
		return new ResponseEntity<List<StudentNotCourseResponse>>(service.searchStudent(city,instructor),HttpStatus.OK);
	}
}
