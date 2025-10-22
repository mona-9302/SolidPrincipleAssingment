package com.example.demo.dao;
import java.util.List;

import com.example.demo.request.AuthorRequest;
import com.example.demo.response.AuthorResponse;


public interface IAuthorDao {
     
	public AuthorResponse insert(AuthorRequest request);
	public List<AuthorResponse> showAuthor();
	public AuthorResponse getAuthorById(Integer id);
	public AuthorResponse updateAuthor(Integer id, AuthorRequest request);
	public String deleteAuthor(Integer id);
	
}
