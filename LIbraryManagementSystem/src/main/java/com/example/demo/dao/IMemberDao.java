package com.example.demo.dao;

import java.util.List;

import com.example.demo.request.MemberRequest;
import com.example.demo.response.MemberResponse;

public interface IMemberDao {
    
	public MemberResponse insert(MemberRequest request);
	public List<MemberResponse> showMembers();
}
