package com.exam.view;


import java.util.Scanner;

import com.exam.controller.ExamController;
import com.exam.menu.Menu;
import com.exam.vo.ExamVO;

public class ExamView {
	private Scanner sc = new Scanner(System.in);
	private ExamController ec = new ExamController();
	private Menu menu = new Menu();
	
	// 프로그램 메뉴
	public void show() {
		
		while(true) {
			System.out.print(menu.getMain());
			System.out.print(">>>");
			String input = sc.nextLine();
			switch(input) {
				case "1":
					this.signupMenu();	break;
				case "2":
					this.loginMenu();	break;
				case "3":
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				default:
					System.out.println("잘못된 번호 입니다. 다시 입력해주세요");
			}
		}
	}
	
	// 회원가입
	private void signupMenu() {
		System.out.println("회원가입을 시작합나다.");
		
		ExamVO data = new ExamVO();
		System.out.print(" 아이디 : ");
		data.setUserid(sc.nextLine());
		System.out.print("비밀번호 : ");
		data.setUserpw(sc.nextLine());
		System.out.print("  이름  : ");
		data.setName(sc.nextLine());
		System.out.print("나이(22세 이상) : ");
		data.setAge(sc.nextLine());
		
		boolean result = ec.signup(data);
		if(result) {
			System.out.println("회원가입 되었습니다.");
		} else {
			System.out.println("회원가입을 할 수 없습니다.");
		}
	}
	
	// 로그인
	private void loginMenu() {
		System.out.print("아이디 : ");
		String userid = sc.nextLine();
		System.out.print("비밀번호 : ");
		String userpw = sc.nextLine();

		ExamVO account = ec.login(userid, userpw);
		if(account != null) {
			System.out.printf("%s 님이 로그인 되었습니다.\n", account.getUserid());
			afterLoginMenu(account);
		} else {
			System.out.println("아이디 또는 비밀번호를 잘못 입력했습니다.");
		}
	}
	
	// 로그인 후 메뉴
	public void afterLoginMenu(ExamVO account) {
		while(true) {
			System.out.print(menu.getAfterLogin(account.getUserid()));
			System.out.print(">>>");
			
			String input = sc.nextLine();
			switch(input) {
			
				case "1":
					// 지역및 학교 입력
					ExamVO location = new ExamVO();
					location.setUserid(account.getUserid());
					
					System.out.println("원하는 지역번호를 선택하세요.(1.서울, 2.경기, 3.인천)");
					System.out.println(">>>");
					location.setLocation(sc.nextLine());

					boolean locate = ec.setlocate(location);
					if(locate) {
						
						String i = location.getLocation();
						if(i == "서울") {
							System.out.println(i + "지역의 학교번호를 선택하세요. (1.광양고등학교, 2.가락중학교, 3.석촌중학교)");
							System.out.println(">>>");
							location.setSchool(sc.nextLine());
							}
						if(i == "경기") {
							System.out.println(i + "지역의 학교번호를 선택하세요. (4.망포중학교, 5.선부중학교, 6.경기고등학교)");
							System.out.println(">>>");
							location.setSchool(sc.nextLine());
							}
						if(i == "인천") {
							System.out.println(i + "지역의 학교번호를 선택하세요. (7.인천고등하학교, 8.선학중학교, 9.연수중학교)");
							System.out.println(">>>");
							location.setSchool(sc.nextLine());
							}
						boolean schoollocate = ec.setsch(location);
						if(schoollocate) {
							System.out.println("지역등록이 완료되었습니다.");	
						
						}
					} else {
						System.out.println("잘못된 지역 번호를 입력했습니다.");
					}
					break;
				
				case "2":
					// 수험번호 생성
					ExamVO newCode = new ExamVO();
					newCode.setUserid(account.getUserid());
				
					int min = 100000;
					int max = 999999;
					int random = (int)(Math.random() * (max - min) + min);
					newCode.setTestcode(random);
				
					boolean resultcode = ec.setcode(newCode);
					if(resultcode) {
						System.out.println("수험번호는 " + random + " 입니다.");
					}
					break;
				
				case "3":
					// 점수입력 후 과락 및 합격여부 확인
					ExamVO score = new ExamVO();
					score.setUserid(account.getUserid());
					
					System.out.print("sw설계 점수 : ");
					score.setSwdesign(sc.nextLine());
					System.out.print("sw개발 점수 : ");
					score.setSwdev(sc.nextLine());
					System.out.print("db활용 점수 : ");
					score.setDbutil(sc.nextLine());
					System.out.print("pl활용 점수 : ");
					score.setPlutil(sc.nextLine());
					System.out.print("info관리 점수 : ");
					score.setInfomgt(sc.nextLine());

					boolean testscore = ec.scoreupdate(score);
					if(testscore) {
						System.out.println("점수가 입력되었습니다.");
						if(score.getSwdesign() < 40) {
							System.out.println("SW설계 점수가 40점 아래로 과락입니다.");
						} else if(score.getSwdev() < 40) {
							System.out.println("SW개발 점수가 40점 아래로 과락입니다.");
						} else if(score.getDbutil() < 40) {
							System.out.println("DB활용 점수가 40점 아래로 과락입니다.");
						} else if(score.getPlutil() < 40) {
							System.out.println("PL활용 점수가 40점 아래로 과락입니다.");
						} else if(score.getInfomgt() < 40) {
							System.out.println("INFO관리 점수가 40점 아래로 과락입니다.");
						} else {
							System.out.println("평균 점수 : " + score.getAvgscore() + " 점");
							if(score.getAvgscore() < 60) {
								System.out.println("평균 점수가 60점 아래로 불합격입니다.");
							} else {
								System.out.println("합격입니다.");
							}
						}
					}
					break;								
					
				case "4":
					// 비밀번호 변경
					ExamVO newAccount = new ExamVO();
					newAccount.setUserid(account.getUserid());
					
					System.out.println("변경할 비밀번호를 입력하세요.");
					System.out.println(">>>");
					input = sc.nextLine();
					account.setUserpw(input);
					
					boolean result = ec.update(account);
					
					if(result) {
						System.out.println("수정이 완료되었습니다.");
					}
					break;
					
				case "5":
					// 로그아웃
					account = null;
					System.out.println("로그아웃 되었습니다.");
					return;
					
				case "6":
					// 회원탈퇴
					if(ec.signout(account)) {
						System.out.println("회원탈퇴 되었습니다.");
						return;
					}
					break;

			}
		}
	}
}
