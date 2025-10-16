package com.example.demo.response;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class CourseStudentDTOCount {
     
	private String courseName;
    private Long studentCount;
}
