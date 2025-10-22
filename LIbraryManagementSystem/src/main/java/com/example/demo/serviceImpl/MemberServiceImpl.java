package com.example.demo.serviceImpl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IMemberDao;
import com.example.demo.request.MemberRequest;
import com.example.demo.response.MemberResponse;
import com.example.demo.service.IMemberService;

@Service
public class MemberServiceImpl implements IMemberService {

	@Autowired
	private IMemberDao dao;
	
	@Override
	public MemberResponse save(MemberRequest request) {
		return dao.insert(request);
	}

	@Override
	public List<MemberResponse> showMember() {
		// TODO Auto-generated method stub
		return dao.showMembers();
	}

}
