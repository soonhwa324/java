package ch02.home.ex01;

import java.util.Scanner;

public class H02Replace {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int b = 0;
		int temp = 0;
		
		System.out.print("a를 입력하세요\n >");//presentation logic, IO(Input.oytput)
		a = sc.nextInt();
		System.out.print("b를 입력하세요\n >");
		b = sc.nextInt();
		System.out.printf("a는 %d, b는 %d\n", a, b);
		
		System.out.println("->a, b 값을 교체합니다.");
		temp = a;// business logic
		a = b;
		b = temp;
		
		System.out.printf("a는 %d, b는 %d\n", a, b);
	}
}
/*
과제: H01을 확장성 있게 고도화하라.
*/