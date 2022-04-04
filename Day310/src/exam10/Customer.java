package exam10;

import java.util.Objects;

public class Customer {
	private String name;
	private int Age;
	private char gender;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return Age;
	}
	
	public void setAge(int age) {
		Age = age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void buy(String productName, int price) {
		System.out.printf("%s 상품을 %d 원에 구입하였습니다. " ,productName, price);
	}
	@Override
	public int hashCode() {
		return Objects.hash(Age, gender, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Age == other.Age && gender == other.gender && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", Age=" + Age + ", gender=" + gender + "]";
	}
	
}
