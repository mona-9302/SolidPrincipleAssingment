package com.example.demo.response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentNotCourseResponse {

	 private Integer id;
	 private String name;
	 private String email;
	 private String city;
}
