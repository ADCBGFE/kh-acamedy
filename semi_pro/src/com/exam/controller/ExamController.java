package com.exam.controller;

import com.exam.dao.ExamDAO;
import com.exam.vo.ExamVO;

public class ExamController {
	
	private ExamDAO dao = new ExamDAO();
	
	// 회원가입
	public boolean signup(ExamVO data) {
		
		if(data.getAge() < 22) {
			return false;
		}
		
		ExamVO account = dao.get(data.getUserid());
		if(account != null) {
			return false;
		}
		
		boolean reuslt = dao.register(data);
		return reuslt;
	}
	
	// 로그인
	public ExamVO login(String userid, String userpw) {
		ExamVO data = dao.get(userid);
		if(data.getUserpw().equals(userpw)) {
			return data;
		}
		return null;
	}
	
	// 비밀번호 변경
	public boolean update(ExamVO data) {
		return dao.update(data);

	}
	
	// 회원탈퇴
	public boolean signout(ExamVO data) {
		return dao.signout(data);
	}

	// 과목 점수 입력
	public boolean scoreupdate(ExamVO score) {
		boolean result = dao.scoreupdate(score);
		return result;
	}
	
	// 장소 선택
	public boolean setlocate(ExamVO location) {
		
		switch(location.getLocation()) {
			case "1":
				location.setLocation("서울");	break;
			case "2":
				location.setLocation("경기");	break;
			case "3":
				location.setLocation("인천");	break;
			default:
				return false;
		}
		
		boolean result = dao.locationupdate(location);
		return result;
	}
	
	// 장소 선택
	public boolean setsch(ExamVO location) {
		
			switch(location.getSchool()) {
			case "1":
				location.setSchool("광양고등학교");	break;
			case "2":
				location.setSchool("기락중학교");	break;
			case "3":
				location.setSchool("석촌중학교");	break;
			case "4":
				location.setSchool("망포중학교");	break;
			case "5":
				location.setSchool("선부중학교");	break;
			case "6":
				location.setSchool("경기고등학교");	break;
			case "7":
				location.setSchool("인천고등학교");	break;
			case "8":
				location.setSchool("선학중학교");	break;
			case "9":
				location.setSchool("연수중학교");	break;
			default:
				return false;
			}
		
		boolean result = dao.schoolnupdate(location);
		return result;
		
	}
	
	// 수험번호 생성
	public boolean setcode(ExamVO code) {
		
		boolean result = dao.testcode(code);
		return result;
		
	}

}
