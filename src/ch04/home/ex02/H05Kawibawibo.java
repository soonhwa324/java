package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			result = switch(playerChoice - appChoice) {
			case -2, 1 -> "You win.";
			case -1, 2 -> "You lose.";
			default -> "Fair.";
			};
			
			choice = switch(playerChoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			default -> "보";
			};
			System.out.println("You: " + choice);
			
			choice = switch(appChoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			default -> "보";
			};
			System.out.println("Me: " + choice);
			
		}else result = "ERROR] 1, 2, 3 중에서 입력하세요.";
		
		System.out.println(result);
	}
}	
/*
과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라. 결과는
You win.
You lose.
Fair.
중하나이다.
---

1.가위, 2바위, 3.보
>1
you: 가위
me: 보

You win.
*/
		/*
		int UserChoice = 0;
		int ComChoice= 0;
		String User = "";
		String Com = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n> ");
		UserChoice = sc.nextInt();
		
		User = switch(UserChoice){
		case 1 -> "가위";
		case 2 -> "바위";
		case 3 -> "보";
		default -> "none" ;
		};
		System.out.println("you: " + User);
		
		ComChoice = (int)(Math.random() * 10) + 1;
		
		if(ComChoice <= 3) {
			Com = switch(ComChoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			case 3 -> "보";
			default -> "none";
			};
			System.out.println("me: " + Com);
		}else if(ComChoice >= 4) ComChoice = (int)(Math.random() * 10) + 1;
		
		System.out.println("me: " + Com);
		
		if(UserChoice == ComChoice) System.out.print("fair.");
		else if(UserChoice == 1 && ComChoice == 3 || UserChoice == 2 && ComChoice == 1 || UserChoice == 3 && ComChoice ==2)
			System.out.print("You win.");
		else if(UserChoice == 1 && ComChoice == 2 || UserChoice == 2 && ComChoice == 3 || UserChoice == 3 && ComChoice ==1)
			System.out.print("You lose");
			
		*/

