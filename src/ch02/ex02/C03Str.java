package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum;//class타입의 변수는 4byte
		System.out.println(sumStr);
	}
}
