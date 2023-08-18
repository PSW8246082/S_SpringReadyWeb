package com.kh.member.store;

import org.apache.ibatis.session.SqlSession;

import com.kh.member.domain.Member;

public interface MemberStore {
	
	//DAO에서 가져옴 인터페이스라 추상메소드로 몸통없이 가져온다..
	public int insertMember(SqlSession session, Member member);
	public int updateMember(SqlSession session, Member member);
	public int deleteMember(SqlSession session, String memberId);
	public Member selectCheckLogin(SqlSession session, Member member);
	public Member selectOneById(SqlSession session, String memberId);
	
}
