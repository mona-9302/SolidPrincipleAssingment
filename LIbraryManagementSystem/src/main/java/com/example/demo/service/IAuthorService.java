package com.example.demo.service;

import java.util.List;

import com.example.demo.request.AuthorRequest;
import com.example.demo.response.AuthorResponse;

public interface IAuthorService {
    
	public AuthorResponse insert(AuthorRequest request);
	public List<AuthorResponse> showAll();
	public AuthorResponse getAuthorById(Integer id);
	public AuthorResponse update(Integer id, AuthorRequest request);
	public String delete(Integer id);
}
