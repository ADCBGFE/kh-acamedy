package com.exam.vo;

public class ExamVO {
	private String userid;
	private String userpw;
	private String name;
	private int age;
	private int testcode;
	private String location;
	private String school;
	private int swdesign;
	private int swdev;
	private int dbutil;
	private int plutil;
	private int infomgt;
	private int avgscore;

	public String getUserid() {
		return userid;
	}
	
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getUserpw() {
		return userpw;
	}
	
	public void setUserpw(String userpw) {
		this.userpw = userpw;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setAge(String age) {
		this.age = Integer.parseInt(age);
	}
	
	public int getTestcode() {
		return testcode;
	}

	public void setTestcode(int testcode) {
		this.testcode = testcode;
	}
	
	public void setTestcode(String testcode) {
		this.testcode = Integer.parseInt(testcode);
	}
	
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	public int getSwdesign() {
		return swdesign;
	}
	
	public void setSwdesign(int swdesign) {
		this.swdesign = swdesign;
	}
	
	public void setSwdesign(String swdesign) {
		this.swdesign = Integer.parseInt(swdesign);
	}
	
	public int getSwdev() {
		return swdev;
	}
	
	public void setSwdev(int swdev) {
		this.swdev = swdev;
	}
	
	public void setSwdev(String swdev) {
		this.swdev = Integer.parseInt(swdev);
	}
	
	public int getDbutil() {
		return dbutil;
	}
	
	public void setDbutil(int dbutil) {
		this.dbutil = dbutil;
	}
	
	public void setDbutil(String dbutil) {
		this.dbutil = Integer.parseInt(dbutil);
	}
	
	public int getPlutil() {
		return plutil;
	}
	
	public void setPlutil(int plutil) {
		this.plutil = plutil;
	}
	
	public void setPlutil(String plutil) {
		this.plutil = Integer.parseInt(plutil);
	}
	
	public int getInfomgt() {
		return infomgt;
	}
	
	public void setInfomgt(int infomgt) {
		this.infomgt = infomgt;
	}
	
	public void setInfomgt(String infomgt) {
		this.infomgt = Integer.parseInt(infomgt);
	}
	
	public int getAvgscore() {
		this.avgscore = (swdesign + swdev + dbutil + plutil + infomgt) / 5;
		return avgscore;
	}
	
	public void setAvgscore(int avgscore) {
		this.avgscore = avgscore;
	}
	
	public void setAvgscore(String avgscore) {
		this.avgscore = Integer.parseInt(avgscore);
	}
	
}
