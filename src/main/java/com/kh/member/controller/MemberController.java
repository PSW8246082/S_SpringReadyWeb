package com.kh.member.controller;

import com.kh.member.service.MemberService;
import com.kh.member.service.logic.MemberServiceImpl;

public class MemberController {
	
	private MemberService mService;
	
	public MemberController() {
		mService = new MemberServiceImpl();
	}

	public void memberInsert() {}
	
	public void memberUpdate() {}
	
	public void memberDelete() {}
	
	public void checkLogin() {}
	
	public void memberLoout() {}
	
	public void memberDetailView() {}
	
	
	
	}

