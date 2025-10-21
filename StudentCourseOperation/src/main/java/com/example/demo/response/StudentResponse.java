package com.example.demo.response;
import java.util.List;
import lombok.Data;

@Data
public class StudentResponse {
     
	 private Integer id;
	 private String city;
	 private String name;
	 private String email;
	 private List<String> courseName;
}
