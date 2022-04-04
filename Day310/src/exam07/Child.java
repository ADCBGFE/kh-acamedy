package exam07;

public class Child extends Parent {
	
	public Child() {
		super(1);		//이걸 넣는다.
	}
	
	public void printNumber() {
		setNumber(2);
		System.out.println(getNumber());
	}
	
	// 안해도 상관없지만 오버라이딩이 가능한 메서드인지 확인시키는 용도로 쓰인다.
	@Override
	public void setNumber(int number) {	// 오버라이딩. 기존 기능 수정/변경...
		System.out.println("자식의 setNumber 메서드 동작 시작" );
		super.setNumber(number);
		System.out.println("부모의 setNumber 메서드 동작 끝" );
	}

}
