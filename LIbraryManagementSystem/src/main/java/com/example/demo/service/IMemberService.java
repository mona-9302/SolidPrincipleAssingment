package com.example.demo.service;

import java.util.List;

import com.example.demo.request.MemberRequest;
import com.example.demo.response.MemberResponse;

public interface IMemberService {
      
	 public MemberResponse save(MemberRequest request);
	 public List<MemberResponse> showMember();
}
