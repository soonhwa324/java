package ch04.ex01;

public class C03If {
	public static void main(String[] args) {
		int hour = 22;
		
		if(hour < 12) {
			System.out.println("Good Morning");
		} else if(hour < 18) {
			System.out.println("Good Afternoon");
		} else if(hour < 21) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}
		// 과제: ~println() 을 한번만 사용하라 code 7 ~ 15 Line 을 계선하라.
		
		String message = "";
		
		if(hour < 12) {
			message = "Good Morning";
		} else if(hour < 18) {
			message = "Good Afternoon";
		} else if(hour < 21) {
			message = "Good evening";
		} else {
			message = "Good night";
		}
		System.out.println(message);
	}
}
