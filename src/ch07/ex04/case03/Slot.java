package ch07.ex04.case03;

import ch07.home.ex04.case02.Card;

public class Slot {
	private Ball[] balls;
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++) 
			balls[i] = new Ball(i + 1);
	}
	
	public Ball chuck() {
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45);
			ball = balls[i];
			balls[i] = null;
		} while(ball == null);
		
		return ball;
	}
	/*
	public Ball chuck() { //공이 중복된다
		return balls[(int)(Math.random() * 45)];
	}
	*/
}
