package com.example.demo.response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentWithCoursesCount {
     
	 private Integer id;
	 private String courseName;
	 private String instructor;
	 private Long totalCounts;
}
