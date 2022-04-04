package exam05;

import java.util.Arrays;

public class whateverMain01 {
	
	public static void main(String[] args) {
		whatever01 report = new whatever01("홍길동");
		
		double[] grades = new double[] {78.5, 79.3, 87.2, 93.8, 93.4};
		String[] subjects = new String[] {"국어", "영어", "수학", "사회", "체육"};
		
		report.setGrades(grades);
		report.setSubjects(subjects);
		
		report.setGrades("수학", 92.5);
		System.out.println("점수 : " + report.getGrade("수학"));
		
		report.addSubject("과학", 80);
		System.out.println("점수 : " + report.getGrade("과학"));
	}

}
