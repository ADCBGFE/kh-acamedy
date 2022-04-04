package exam08;

public class Teacher extends Person{
	private int ClassLevel;	// 학년
	private int ClassRoom;	// 반
	private String subject;	// 담당 과목
	
	
	public int getClassLevel() {
		return ClassLevel;
	}
	
	public void setClassLevel(int classLevel) {
		ClassLevel = classLevel;
	}
	
	public int getClassRoom() {
		return ClassRoom;
	}
	
	public void setClassRoom(int classRoom) {
		ClassRoom = classRoom;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | " + getClassLevel() +  " | " + getClassRoom()+  " | " + getSubject();
	}

}
