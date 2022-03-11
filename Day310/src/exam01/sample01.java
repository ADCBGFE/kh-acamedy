package exam01;

import java.util.Scanner;

public class sample01 {

	public static void main(String[] args) {
		/*
		 * Scanner를 사용하여 사용자 입력을 받고 다음의 결과가 나오도록 하시오.
		 * 	1. 사용자 입력을 통해 국어, 영어, 수학 점수를 입력 받는다. ( 정수 데이터를 입력 )
		 * 	2. 입력받은 정수 데이터의 값에 대해 종점과 평균을 구한다.
		 * 	3. 평균 점수가 60점 이상인 경우에만 다음의 메시지르 출력한다.
		 * 		축하 합니다. 합격입니다.
		 * 			충점 : 213 점
		 * 			국어 : 75점
		 * 			영어 : 70점
		 * 			수학 : 68점
		 * 			평군 : 71.0점
		 * 	4. 평균 점수가 60점 미만인 경우에는 다음의 메시지를 출력한다.
		 * 		평균 점수가 미달하였습니다.
		 * 	5. 국어, 영어 수학과목죽 40점 미만의 과목이 있는 경우 다음의 메시지를 출력한다.
		 * 		과락된 과목이 있어 불합격 되었습니다.
		 *
		 */
		
		Scanner sc = new Scanner(System.in);
		
		int korean, english, math;
		int tot;
		double avg;
		
		System.out.print("국어 점수 입력( 0 ~ 100 ) : ");
		korean = sc.nextInt();
		System.out.print("영어 점수 입력( 0 ~ 100 ) : ");
		english = sc.nextInt();
		System.out.print("수학 점수 입력( 0 ~ 100 ) : ");
		math = sc.nextInt();
		
		tot = korean + english + math;
		avg = tot / 3.0;
		
		if(korean < 40 || english < 40 || math < 40) {
			System.out.println("과락된 과목이 있어 불합격 되었습니다.");
			System.out.println("과락된 과목은 다음과 같습니다.");
			if(korean < 40) {
				System.out.println("국어 : ");
			}
			if(english < 40) {
				System.out.println("영어 : ");
			}
			if(math < 40) {
				System.out.println("수학 : ");
			}
		} else {
			if(avg >= 60) {
				System.out.println(" 축하합니다. 합격입니다.");
				System.out.printf("충점 : %d 점\n", tot);
				System.out.printf("국어 : %d 점\n", korean);
				System.out.printf("영어 : %d 점\n", english);
				System.out.printf("수학 : %d 점\n", math);
				System.out.printf("평균 : %.1f 점\n", avg);
			} else {
				System.out.println("평균 점수가 미달하였습니다.");
			}
		}
	}

}
