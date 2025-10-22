package com.example.demo.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.request.AuthorRequest;
import com.example.demo.response.AuthorResponse;
import com.example.demo.service.IAuthorService;

@RequestMapping("/author")
@RestController
public class AuthorController {
   
	@Autowired
	private IAuthorService service;
	
	@PostMapping("/insert")
	public ResponseEntity<AuthorResponse>create(@RequestBody AuthorRequest request){
		
	   AuthorResponse insert = service.insert(request);
		return new ResponseEntity<AuthorResponse>(insert,HttpStatus.CREATED);
	}
	
	@GetMapping("/show")
	public ResponseEntity<List<AuthorResponse>>show(){
		return new ResponseEntity<List<AuthorResponse>>(service.showAll(),HttpStatus.OK);
	}
	
	@GetMapping("/getById/{id}")
	public ResponseEntity<AuthorResponse> getAuthorById(@PathVariable("id")Integer id){
		return new ResponseEntity<AuthorResponse>(service.getAuthorById(id),HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<AuthorResponse>update(@PathVariable("id")Integer id,@RequestBody AuthorRequest request){
		return new ResponseEntity<AuthorResponse>(service.update(id,request),HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String>deleteAuthor(@PathVariable("id")Integer id){
		return new ResponseEntity<String>(service.delete(id),HttpStatus.OK);
	}
}
