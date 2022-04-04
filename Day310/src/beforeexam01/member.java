package beforeexam01;

public class member {
	
	public String memberId;
	public String memberPwd;
	public String memberName;
	public int age;
	public char gender;
	public String phone;
	public String email;
	

	
	public member() {};
	
	public member(String memberName) {
		setMemberName(memberName);
		}
	
	public void setMemberName(String changeName) {
		this.memberName = changeName;
		}
	
	public String changeName() {
		return memberName;
	}
	
	
	
	
}


