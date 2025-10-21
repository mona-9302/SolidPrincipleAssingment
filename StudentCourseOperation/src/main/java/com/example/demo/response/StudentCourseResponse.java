package com.example.demo.response;
import java.util.Collections;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentCourseResponse {
    
	 private Integer id;
	 private List<String> name;
	 
	 public StudentCourseResponse(Integer id, String studentName) {
	        this.id = id;
	        this.name = Collections.singletonList(studentName);
	    }
}
