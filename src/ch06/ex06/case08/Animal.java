package ch06.ex06.case08;

public interface Animal {
	void move();
	
	default void eat() {}//default 바디를 쓰기위해 선언
}
