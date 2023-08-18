package com.kh.member.service.logic;

import com.kh.member.domain.Member;
import com.kh.member.service.MemberService;
import com.kh.member.store.MemberStore;
import com.kh.member.store.logic.MemberStoreLogic;

public class MemberServiceImpl  implements MemberService{
	private MemberStore mStore;
	
	public MemberServiceImpl() {
		mStore = new MemberStoreLogic();
	}
	
	//추상메소드 오버라이딩 해줘야함

	@Override
	public int insertMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMember(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member selectCheckLogin(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectOneById(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}
}
