package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10;// decimal
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; // octal 0은 8진수임을 표현하기위한것
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA;// hexa 0x는 16진수임을 표현하기 위한것
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010;//0b는 2진수임을 표현하기 위한것
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567;
		System.out.println(x + 1);
		
		double y = 1e1;//10의 1승
		System.out.println(y);
	}
}
