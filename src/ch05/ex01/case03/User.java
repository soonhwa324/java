package ch05.ex01.case03;

public class User {
	private String userName;//encapsulation 캡슐화
	private int age;
	
	//  return값의 type method name  parameter
	public void setUserName(String userName) {//method 선언문
		this.userName = userName; 
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public int getAge() {
		return this.age;
	}
}
