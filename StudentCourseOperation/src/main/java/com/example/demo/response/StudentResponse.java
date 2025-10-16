package com.example.demo.response;

import lombok.Data;
import java.util.Set;

@Data
public class StudentResponse {
    private Long id;
    private String name;
    private String email;
    private String city;
    private Set<String> courses; // Course names
}
