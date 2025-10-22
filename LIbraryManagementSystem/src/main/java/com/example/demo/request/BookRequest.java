package com.example.demo.request;
import java.util.List;
import lombok.Data;

@Data
public class BookRequest {
     
	 private Integer bookPrice;
	 private Integer bookStock;
	 private String description;
	 private String title;
	 private List<Integer>authorId;
}
