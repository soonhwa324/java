package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String s = "|" + " a happy ".trim() + "|";// 머리와 꼬리의 스페이스를 지운다
		s = s.concat(" dog");// 원문에 파라미터를 붙인다
		s = s.substring(2); // 파라미터값의 인덱스 이하의 문자열을 나타낸다
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1));// 파라미터값의 인덱스 문자하나만
		
		int i = "apple".codePointAt(1);//유니코드 
		i = "a".hashCode();
		i = "b".hashCode();
		i = "b".compareTo("a");//b에서 a뺴기 (유니코드)
		i = "a".compareTo("b");
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a");
		i = s.indexOf("l");//첫번째ㅣ의 인덱스
		i = s.lastIndexOf("l");//마지막 l의 인덱스
		i = s.length();
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de");
		b = s.endsWith("lop");
		b = s.equals("develop");//b와 develop같은지
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop");
		b = "".isEmpty();
		b = s.matches("[a-zA-Z]*");
		b = s.matches("[0-9]");
		
		System.out.println(b);
	}
}
