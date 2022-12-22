package ch03.ex07;

public class C02StrCompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a";
		b = s == "a";
		
		s = new String("a");
		System.out.println(s);
		b = s == "a";
		
		b = s.equals("a");//논리적인 값의 비교
		
		System.out.println(b);
	}
}
