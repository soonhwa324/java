package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String op = "";
		int result = 0;
		
		String tmp = "";
		boolean isGood = false;
		String errMsg = "input 0 or natural number.";
		
		do {
			do {
				isGood = false;
				System.out.print("a: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) a = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("op: "); op = sc.nextLine();
				isGood = op.matches("[+-/\\*]");//regular expressrion
				if(!isGood) System.out.println("input one of them(+, -, *, /)."); 
			} while(!isGood);
			
			do {
				isGood = false;
				System.out.print("b: "); tmp = sc.nextLine();
				isGood = tmp.matches("[0-9]+");
				if(isGood) b = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			} while(!isGood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
			System.out.println("continue(y/n)?");
		} while(sc.nextLine().equalsIgnoreCase("y"));
		
		System.out.println("end.");
	}
}
/*
과제: 계산기를 만들어라.
연산자는 +, -, *, / 이다.
/ 는 몫만을 구한다.
입력값 a, b는 자연수, 0 이다.

continue(y/n)?에서 y 또는 Y 를 입력하면 계산 작업을 재수행한다.
y 또는 Y 외를 입력하면 앱을 종료한다.

---
a: 1
op: +
b: 2
1 + 2 = 3
continue(y/n)?y
a: 2
op: *
b: 2
2 * 2 = 4
continue(y/n)? n
end.

	/*
		String a = "";
		String b = "";
		String op = "";
		String anser = "";
		int numA = 0;
		int numB = 0;
		int result = 0;
		boolean isGood = false;
		boolean asd = false;
		
		do {
			System.out.print("a: ");
			a = sc.nextLine();
			numA = Integer.parseInt(asd);
				
			System.out.print("op: ");
			op = sc.nextLine();
			
			System.out.print("b: ");
			b = sc.nextLine();
			numB = Integer.parseInt(b);
			
			
			if(numA >= 0 && numB >= 0) {
				switch(op) {
				case "+" -> {
					result = numA + numB;
					System.out.printf("%d %s %d = %d\n", numA, op, numB, result);
				}
				case "-" -> {
					result = numA - numB;
					System.out.printf("%d %s %d = %d\n", numA, op, numB, result);
				}
				case "*" -> {
					result = numA * numB;
					System.out.printf("%d %s %d = %d\n", numA, op, numB, result);
				}
				case "/" -> {
					result = numA / numB;
					System.out.printf("%d %s %d = %d\n", numA, op, numB, result);
				}
				default -> System.out.println("연산자를 잘못입력했다.");
				};
				
			}else System.out.println("0이상의 수를 입력하세요.");
			
			System.out.println("continue(y/n)?");
			isGood = sc.nextLine().matches("[y,Y]");
			
		} while(isGood);
		System.out.println("end.");
		*/
