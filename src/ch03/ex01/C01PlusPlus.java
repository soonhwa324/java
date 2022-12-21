package ch03.ex01;

public class C01PlusPlus {
	public static void main(String[] args) {
		int i = 0;
		++i;
		System.out.println(i);
		i++;
		System.out.println(i);
		
		i = 0;
		int j = ++i;
		System.out.printf("i: %d, j: %d\n", i ,j);
		
		i = 0;
		j = i++; // =가 먼저 실행 그다음 ++
		System.out.printf("i: %d, j: %d\n", i ,j);
	}
}
