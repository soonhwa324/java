package ch04.home.ex01;

import java.util.Scanner;

public class Grede {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	int point = 0;
	String grade = "";
	System.out.print("점수: ");
	point = sc.nextInt();
	
	if(point >= 90) grade = "A"; if(point >= 98);
	else if(point >=80) grade = "B";
	else grade = "C";
	System.out.println(grade);
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