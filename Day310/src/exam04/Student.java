package exam04;

import java.util.Random;

public class Student {
	private String name;	// 이름
	private int age;		// 나이
	private int classlevel;	// 학년
	private int classRoom;	// 반
	private int classNum;	// 번호
	
	public Student(String name, int age, int classlevel) {
		this.name = name;
		this.age = age;
		this.classlevel = classlevel;
	}
	
	public String getname() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	

	
	public void nexYear() {
		this.age++;
		
		if(this.classlevel == 3) {
			this.classlevel = -1;
			this.classRoom = -1;
		} else {
			this.classlevel++;
			this.classRoom = this._assignClassRoom();	
		}
	}
	
	private int _assignClassRoom() {
		Random rand = new Random();
		return rand.nextInt(9) + 1;
	}
	
	private void _graduate() {
		this.classlevel = -1;
		this.classRoom = -1;
		this.classNum = -1;
	}
}