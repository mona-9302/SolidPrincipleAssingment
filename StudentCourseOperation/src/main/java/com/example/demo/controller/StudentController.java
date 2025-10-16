package com.example.demo.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.request.StudentRequest;
import com.example.demo.response.StudentResponse;
import com.example.demo.service.IStudentService;

@RestController
@RequestMapping("/controller")
public class StudentController {
    
	@Autowired
	private IStudentService service;
	
	@PostMapping("/insert")
    public ResponseEntity<StudentResponse> insertStudent(@RequestBody StudentRequest request) {
        try {
            StudentResponse response = service.insert(request);
            return ResponseEntity.ok(response);
        } catch (RuntimeException e) {
          
            return ResponseEntity.badRequest().body(null);
        }
    }
	
	@GetMapping("/AllStudent")
    public ResponseEntity<List<StudentResponse>> getAllStudentsWithCourses() {
        List<StudentResponse> students = service.showStudent();
        return ResponseEntity.ok(students);
    }
	
	@GetMapping("/getStudentCourse")
    public ResponseEntity<List<StudentResponse>> getStudentsByCourse(@RequestParam String courseName) {
        List<StudentResponse> students = service.getStudentsByCourseName(courseName);
        return ResponseEntity.ok(students);
    }
	
	@GetMapping("/withoutCourseStudent")
	public ResponseEntity<List<StudentResponse>> getStudentsWithoutCourse() {
	    List<StudentResponse> students = service.getStudentsWithoutCourse();
	    return ResponseEntity.ok(students);
	}
	
	}
