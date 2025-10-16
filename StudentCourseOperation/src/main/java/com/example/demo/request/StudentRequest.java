package com.example.demo.request;

import lombok.Data;
import java.util.Set;

@Data
public class StudentRequest {
    private String name;
    private String email;
    private String city;
    private Set<Long> courseIds;
}
