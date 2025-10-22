package com.example.demo.response;
import java.util.List;
import lombok.Data;

@Data
public class BooksResponse {
    
	private Integer bookId;
	private String bookTitle;
	private Integer bookPrice;
	private String bookDesc;
	private Integer bookStock;
	private List<String> authorName;
}
