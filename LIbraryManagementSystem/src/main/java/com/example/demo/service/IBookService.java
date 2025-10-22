package com.example.demo.service;

import java.util.List;

import com.example.demo.request.BookRequest;
import com.example.demo.request.BorrowedRequest;
import com.example.demo.request.ShowBorrowedBooksResponse;
import com.example.demo.response.BooksResponse;
import com.example.demo.response.BorrowedResponse;

public interface IBookService {

	public BooksResponse insert(BookRequest request);
	public List<BooksResponse> show();
	public BooksResponse findBookById(Integer id);
	public String deleteBooks(Integer id);
	public BorrowedResponse borrow(BorrowedRequest request);
	public List<ShowBorrowedBooksResponse> showBorrowBooks();
	
}
