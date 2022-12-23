package ch04.home.ex01;

import java.util.Scanner;

public class Grede {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		int tenDigit = 0;
		int oneDigit = 0;
		String grade = "";
		
		System.out.print("점수: ");
		score = sc.nextInt();
		
		tenDigit = score / 10;
		oneDigit = score % 10;
		
		if(tenDigit >= 9) grade = "A";
		else if(tenDigit >= 8) grade = "B";
		else grade = "C";
		
		if(score >= 80) {
			if(oneDigit >= 8 || tenDigit == 10) grade += "+";
			else if(0 <= oneDigit && oneDigit < 4) grade += "-";
		}
		
		System.out.println(grade);
		/*
		int point = 0;
		String grade = "";
		System.out.print("점수: ");
		point = sc.nextInt();
		
		if(point >= 90 && point % 10 >= 8 || point ==100) grade = "A+";
		else if(point >= 90 && point % 10 >= 4) grade = "A";
		else if(point >= 90 && point % 10 >= 0) grade = "A-";
		else if(point >= 80 && point % 10 >= 8) grade = "B+";
		else if(point >= 80 && point % 10 >= 4) grade = "B";
		else if(point >= 80 && point % 10 >= 0) grade = "B-";
		else grade = "C";
		System.out.println(grade);
		*/
	}
}
/*
다음 구간별로 학점을 부여하라.
98이상 A+
94이상 A
90이상 A-
88이상 B+
84이상 B
80이상 B-
80미만 C

점수: 100
A+
*/