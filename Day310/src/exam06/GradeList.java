package exam06;

import java.util.Arrays;

import exam06.Grade;

public class GradeList {
	/*
	 * Grade 객체를 배열로 만들어서 다루기 위한 객체
	 * 이 객체를 통해 데이터를 추가 수정 삭제 조회
	 * 할 수 있게 한다.
	 */
	
	private Grade[] gArr = new Grade[0];
	
	public GradeList( ) {}
	
	public GradeList(int size) {
		this.gArr = new Grade[size];
	}
	
	public GradeList(String ... subject) {
		
	}
	
	public GradeList(Grade[] grade) {
		
	}
}
