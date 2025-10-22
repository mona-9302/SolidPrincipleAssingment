package com.example.demo.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IBooksDao;
import com.example.demo.request.BookRequest;
import com.example.demo.request.BorrowedRequest;
import com.example.demo.request.ShowBorrowedBooksResponse;
import com.example.demo.response.BooksResponse;
import com.example.demo.response.BorrowedResponse;
import com.example.demo.service.IBookService;

@Service
public class BookServiceImpl implements IBookService {

	@Autowired
	private IBooksDao dao;
	
	@Override
	public BooksResponse insert(BookRequest request) {
		return dao.insertBooks(request);
	}

	@Override
	public List<BooksResponse> show() {
		return dao.showBooks();
	}

	@Override
	public BooksResponse findBookById(Integer id) {
		return dao.findBook(id);
	}

	@Override
	public String deleteBooks(Integer id) {
		return dao.deleteBooks(id);
	}

	@Override
	public BorrowedResponse borrow(BorrowedRequest request) {
		return dao.borrowBooks(request);
	}

	@Override
	public List<ShowBorrowedBooksResponse> showBorrowBooks() {
		return dao.showBorrowBooks();
	}

	

}
