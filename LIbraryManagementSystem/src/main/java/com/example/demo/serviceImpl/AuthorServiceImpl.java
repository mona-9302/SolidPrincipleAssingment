package com.example.demo.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.IAuthorDao;
import com.example.demo.request.AuthorRequest;
import com.example.demo.response.AuthorResponse;
import com.example.demo.service.IAuthorService;

@Service
public class AuthorServiceImpl implements IAuthorService {
    
	@Autowired
	private IAuthorDao dao;
	
	@Override
	public AuthorResponse insert(AuthorRequest request) {
		return dao.insert(request);
	}

	@Override
	public List<AuthorResponse> showAll() {
		return dao.showAuthor();
	}

	@Override
	public AuthorResponse getAuthorById(Integer id) {
		return dao.getAuthorById(id);
	}

	@Override
	public AuthorResponse update(Integer id, AuthorRequest request) {
		// TODO Auto-generated method stub
		return dao.updateAuthor(id,request);
	}

	@Override
	public String delete(Integer id) {
		// TODO Auto-generated method stub
		return dao.deleteAuthor(id);
	}

}
