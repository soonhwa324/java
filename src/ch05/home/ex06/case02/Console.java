package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}
	
	public static String inStr(String msg) {
		Console.inMsg(msg);
		String input = "";
		String tmp = "";
		boolean isGood = false;
		
		do {
			tmp = sc.nextLine();
			isGood = tmp.matches("[a-zA-Z가-힣]+");
			if(isGood) input = tmp;
			else System.out.println("ss");
			return input;
		} while(!isGood);
		
		
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR] " + msg);
	}
}
/*
과제: ch05.ex06.case02.Console을 고도화하라.
예외 처리를 하라.
Console.inStr(): 문자를 입력한다.
console.inNum(): 자연수를 입력한다.
--
문자를 입력하세요.
> 
ERROR] 문자가 아님니다.
문자를 입력하세요.
> hello
자연수를 입력하세요.
> 
ERROR] 자연수가 아닙니다.
자연수를 입력하세요.
> 12
ERROR] 자연수를 입력하세요.
> 1
끝
*/