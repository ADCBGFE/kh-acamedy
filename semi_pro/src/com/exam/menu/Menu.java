package com.exam.menu;

public class Menu {
	
	public String getMain() {
		String s = "";
		s += "<<< 시험응시 프로그램 >>>\n";
		s += "┌────────────────────┐\n";
		s += "     1. 회원가입        \n";
		s += "     2. 로그인         \n";
		s += "     3. 프로그램종료     \n";
		s += "└────────────────────┘\n";
		
		return s;
	}
	
	public String getAfterLogin(String name) {
		String s = "";
		s += "┌────────────────────┐\n";
		s += "     1. 시험장소선택     \n";
		s += "     2. 수험번호생성     \n";
		s += "     3. 점수입력        \n";
		s += "     4. 비밀번호변경     \n";
		s += "     5. 로그아웃        \n";
		s += "     6. 회원탈퇴        \n";
		s += "└────────────────────┘\n";
		
		return s;
	}

}
