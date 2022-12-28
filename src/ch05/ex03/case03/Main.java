package ch05.ex03.case03;

public class Main {
	public static void main(String[] args) {
		House house1 = new House();
		House house2 = null;
		
		house1.setAddress("서울 강남구 역삼동");
		
		// 과제: house1 의 키를 house2에 넘겨줫다.
		house2 = house1;
		System.out.println(house2.getAddress());
	}
}
