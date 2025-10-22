package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.BookRequest;
import com.example.demo.request.BorrowedRequest;
import com.example.demo.request.ShowBorrowedBooksResponse;
import com.example.demo.response.BooksResponse;
import com.example.demo.response.BorrowedResponse;
import com.example.demo.service.IBookService;

@RestController
@RequestMapping("/books")
public class BooksController {
   
	@Autowired
	private IBookService service;
	
	@PostMapping("/insert")
	public ResponseEntity<BooksResponse>create(@RequestBody BookRequest request){
		return new ResponseEntity<BooksResponse>(service.insert(request),HttpStatus.CREATED);
	}
	
	@GetMapping("/get")
	public ResponseEntity<List<BooksResponse>>show(){
		return new ResponseEntity<List<BooksResponse>>(service.show(),HttpStatus.OK);
	}
	
	@GetMapping("/getBookById/{id}")
	public ResponseEntity<BooksResponse>getBookById(@PathVariable("id")Integer id){
		return new ResponseEntity<BooksResponse>(service.findBookById(id),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deleteBooks(@PathVariable("id")Integer id){
		return new ResponseEntity<String>(service.deleteBooks(id),HttpStatus.OK);
	}
	
	@PostMapping("/borrow")
	public ResponseEntity<BorrowedResponse> borrowBooks(@RequestBody BorrowedRequest request){
		return new  ResponseEntity<BorrowedResponse>(service.borrow(request),HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getBorrowBooks")
	public ResponseEntity<List<ShowBorrowedBooksResponse>> showAll(){
		return new ResponseEntity<List<ShowBorrowedBooksResponse>>(service.showBorrowBooks(),HttpStatus.OK);
	}
	
	
}
