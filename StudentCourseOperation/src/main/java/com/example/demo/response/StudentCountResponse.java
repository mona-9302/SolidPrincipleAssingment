package com.example.demo.response;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentCountResponse {
    
	 private Integer id;
	 private String courseName;
	 private Long totalCounts;
	 
}
