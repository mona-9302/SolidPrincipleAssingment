package com.example.demo.daoImpl;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.demo.dao.IMemberDao;
import com.example.demo.entity.Member;
import com.example.demo.repo.IMemberRepo;
import com.example.demo.request.MemberRequest;
import com.example.demo.response.MemberResponse;

@Component
public class MemberDaoImpl implements IMemberDao{
   
	@Autowired
	private IMemberRepo repo;
	
	@Override
	public MemberResponse insert(MemberRequest request) {
		Member member = new Member();
		member.setName(request.getName());
		member.setEmail(request.getEmail());
		
		repo.save(member);
		MemberResponse response = new MemberResponse();
		response.setEmail(member.getEmail());
		response.setName(member.getName());
		response.setId(member.getId());
		
		return response;
	}

	@Override
	public List<MemberResponse> showMembers() {
		List<Member> members = repo.findAll();
		List<MemberResponse> member = new ArrayList<>();
		
		for(Member memberData : members) {
			MemberResponse response = new MemberResponse();
			response.setName(memberData.getName());
			response.setEmail(memberData.getEmail());
			response.setId(memberData.getId());
			
			member.add(response);
		}
		return member;
	}
    

}
