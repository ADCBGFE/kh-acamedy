package exam02;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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

	@Override
	public String toString() {
		return "Person [ name = " + name + ", age = " + age + " ]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	
}

public class Sample04 {
	
	public static void main(String[] args) {
		Set<Person> pSet = new HashSet<Person>();
		pSet.add(new Person("홍길동", 23));
		pSet.add(new Person("김철수", 25));	//toString 안쓰고 출력해보면 이름 나이 전부 다른 코드
		pSet.add(new Person("김철수", 25));	//소스의 hashCode() & equals() 를 넣으면 중복처리되어 두개중 하나만 출력됨
											//이름 나이 둘다 같아야 중복처리됨. 하나만 다르면 중복으로 안해서 3개출력됨
		System.out.println(pSet);
	}

}
