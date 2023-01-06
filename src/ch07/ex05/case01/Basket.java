package ch07.ex05.case01;

public class Basket<E> {//generic type 선언<아무 문자> 
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
