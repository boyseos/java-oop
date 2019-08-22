package com.bitcamp.services;

import com.bitcamp.domains.MemberBean;
/**
 * 요구사항 (기능정의)
 * 1. 회원가입
 * 2. 마이페이지 회원정보보기
 * 3. 비번수정
 * 4. 회원탈퇴
 **/
public class MemberService {
	 /**
	  *1. 회원가입
	  */
	public String join(MemberBean param) {
		String msg = "회원가입 성공";
		
		return msg;
	}
	/**
	 * 2.마이페이지
	 */
	public String getMyPage(MemberBean param) {
		return "마이페이지";
	}
	/**
	 * 3.비번수정
	 */
	public String changePw(MemberBean param) {
		return "비번번호가 변경되었습니다.";
	}
	/**
	 * 4.회원탈퇴
	 */
	public String withDrawMember(MemberBean param) {
		return "회원탈퇴 완료";
	}
}
