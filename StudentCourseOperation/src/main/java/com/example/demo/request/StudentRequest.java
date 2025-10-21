package com.example.demo.request;
import java.util.List;
import lombok.Data;

@Data
public class StudentRequest {
     
	 private String city;
	 private String name;
	 private String email;
	 private List<Integer>id;
}
