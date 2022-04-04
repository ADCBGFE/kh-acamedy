package exam08;

public class Student extends Person{
	private int classLevel;	//학력
	private int classRoom;	//반
	
	
	public int getClassLevel() {
		return classLevel;
	}
	
	public void setClassLevel(int classLevel) {
		this.classLevel = classLevel;
	}
	
	public int getClassRoom() {
		return classRoom;
	}
	
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	@Override
	public String toString() {
		return super.toString() + " | " + getClassLevel() +  " | " + getClassRoom();
	}

}
