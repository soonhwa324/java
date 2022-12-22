package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false;// flag variable 2가지 상태만 나타내는 변수 전원이 꺼져잇다
		power = !power;
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
	}
}
