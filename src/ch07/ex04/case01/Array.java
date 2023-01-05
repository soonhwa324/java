package ch07.ex04.case01;

public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3];
		System.out.println(strs);
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
		
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]);
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		
		//iterating
		for(int i = 0; i < ints.length; i++) ints[i] = i;
		
		for(int i = 0; i< ints.length; i++)
			System.out.print(ints[i] + " ");
		System.out.println();
		
		// for each문법     collection
		for(int i: ints) System.out.print(i + " ");
		
		int[] array = {0, 1, 2};//객체 생성전 데이터가 있을때 
		array = new int[] {0, 1, 2};
	}
}
