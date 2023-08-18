package com.kh.member.store.logic;

import org.apache.ibatis.session.SqlSession;

import com.kh.member.domain.Member;
import com.kh.member.store.MemberStore;

public class MemberStoreLogic implements MemberStore{
	
	//인터페이스를 가져오면 반드시 오버라이딩 해줘야함

	@Override
	public int insertMember(SqlSession session, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMember(SqlSession session, Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int deleteMember(SqlSession session, String memberId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Member selectCheckLogin(SqlSession session, Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Member selectOneById(SqlSession session, String memberId) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
