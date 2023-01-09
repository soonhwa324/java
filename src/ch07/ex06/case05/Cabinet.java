package ch07.ex06.case05;
					// super는 ~ 이상
public class Cabinet<T extends A> {//A 를 상속받을것들(A 이하)
	public T getLastVal(T[] arr) {
		return arr[arr.length -1];
	}
	
	public <S extends C > S getFinalVal(S[] arr){
		return arr[arr.length - 1];
	}
}
