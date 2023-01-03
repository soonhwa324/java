package ch06.ex03.case02;

public class Cat extends Animal{
	@Override // annotation 메타데이타를 표현할떄
	public void shout() {
		System.out.println("야옹야옹.");
	}
}
