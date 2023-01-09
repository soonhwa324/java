package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {//Set은 중복이 값이 없다 key가 없어서 그래 value로 구분한다
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set);
	}
}
