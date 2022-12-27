package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		boolean isGood;
		System.out.print("이름: ");
		do {
			isGood = false;
			isGood = sc.nextLine().matches("[a-z]+");
			if(isGood) {
				user.setUserName(null);
			}
		} while(!isGood);
		
		
		System.out.print("나이: ");
		user.setAge(sc.nextInt());
		
		user.setToday(LocalDate.now());
		
		System.out.println();
		System.out.printf("이름: %s\n나이: %d\n가입일: %s\n", user.getUserName(), user.getAge(), user.getToday());
	}
}
/*
과제: 사용자를 생성하라.
user가 user의 이름, 나이를 수동 입력한다.
app이 user의 가입일을 자동 입력한다.
---
이름: gambit
나이: 25

이름: gambit
나이: 25
가입일: 2022-12-27
*/