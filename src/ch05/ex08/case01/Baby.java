package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {}
	
	public Baby(String babyName) {//new 로 호출 객체 생성직후 멤버변수 write
		this.babyName = babyName;
	}
	
	public void setBabyName(String babyName) {//객체.set....로호출 객체 생성후 멤버변수 write
		this.babyName = babyName;
	}
}
