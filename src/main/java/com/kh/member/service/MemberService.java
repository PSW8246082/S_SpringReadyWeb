package com.kh.member.service;

import com.kh.member.domain.Member;

public interface MemberService {

	//MemberService에서 가져옴
	public int insertMember(Member member);
	public int updateMember(Member member);
	public int deleteMember(String memberId);
	public Member selectCheckLogin(Member member);
	public Member selectOneById(String memberId);
	
}
