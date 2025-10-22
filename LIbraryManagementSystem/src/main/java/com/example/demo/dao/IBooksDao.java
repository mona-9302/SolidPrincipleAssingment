package com.example.demo.dao;

import java.util.List;

import com.example.demo.request.BookRequest;
import com.example.demo.request.BorrowedRequest;
import com.example.demo.request.ShowBorrowedBooksResponse;
import com.example.demo.response.BooksResponse;
import com.example.demo.response.BorrowedResponse;

public interface IBooksDao {

	public BooksResponse insertBooks(BookRequest request);
	public List<BooksResponse> showBooks();
	public BooksResponse findBook(Integer id);
	public String deleteBooks(Integer id);
	public BorrowedResponse borrowBooks(BorrowedRequest request);
	public List<ShowBorrowedBooksResponse> showBorrowBooks();
	
}
