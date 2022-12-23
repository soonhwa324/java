package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 2 -> "good.";
		default -> "too long.";
		};
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 11 -> {yield "I don't know.";}
		case 2 -> {
			String message = comment + " is good.";
			yield message;
		}
		default -> {yield comment + " is too long.";}
		};
		//yield: keyword X, restructed identifier O
		//yield case의 return 값이에요 라는걸 표현하는것
		int yield = 1;
		System.out.println(yield);
		
	}
}
