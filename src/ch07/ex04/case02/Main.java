package ch07.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3];
		
		cats[0] = new Cat("헤롱이");
		cats[1] = new Cat("야코미");
		cats[2] = new Cat("새코미");
		
		//cats[2] = new Dog(); 타입이 다른 원소 할당 x
		
		for(Cat cat: cats) System.out.println(cat);
	}
}
