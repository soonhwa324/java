package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate today;
	boolean isGood;
	
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
			//isGood = false;
		//	isGood = userName.matches("[a-z]+");
		//	if(isGood) {
				this.userName = userName;
			//}
		//	else System.out.println("영어로 입력");

	}
	
	public LocalDate getToday() {
		return today;
	}

	public void setToday(LocalDate today) {
		this.today = today;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
