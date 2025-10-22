package com.example.demo.request;
import lombok.Data;

@Data
public class BorrowedRequest {
   
	private Integer bookId;
	private Integer memberId;
}
