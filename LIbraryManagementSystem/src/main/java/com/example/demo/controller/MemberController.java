package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.request.MemberRequest;
import com.example.demo.response.MemberResponse;
import com.example.demo.service.IMemberService;

@RestController
@RequestMapping("/members")
public class MemberController {
    
	@Autowired
	private IMemberService service;
	
	@PostMapping("/insert")
	public ResponseEntity<MemberResponse> insert(@RequestBody MemberRequest request){
		return new ResponseEntity<MemberResponse>(service.save(request),HttpStatus.CREATED);
	}
	
	@GetMapping("/show")
	public ResponseEntity<List<MemberResponse>>showMember(){
		return new ResponseEntity<List<MemberResponse>>(service.showMember(),HttpStatus.OK);
	}
}
