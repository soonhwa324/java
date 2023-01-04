package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		Chrome chrome = new Chrome();
		
		console.out();
		browser.out();
		
		UI.in();
		//console.in();//인터페이스에 스테틱 메소드는 상속대상 x
		//Console.in();
		
		chrome.out();
		//chrome.in();
	}
}
