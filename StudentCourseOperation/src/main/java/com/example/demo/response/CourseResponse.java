package com.example.demo.response;
import lombok.Data;

@Data
public class CourseResponse {
    
	private Long id;
    private String courseName;
    private String instructor;
    private int totalStudents;
}
