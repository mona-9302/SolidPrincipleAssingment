package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.entity.Course;

@SpringBootApplication
public class StudentCourseOperationApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentCourseOperationApplication.class, args);
		
		Course course = new Course();
	}

}
