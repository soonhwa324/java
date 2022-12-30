package ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Man man = new Man();
		Phone phone = new Phone();
		
		phone.setPhoneName("삼성");
		phone.setPrice(1_000_000);
		
		man.setManName("최한석");
		
		man.setPhone(phone);
		
		man.sendMessege();
		man.call();
		man.playGame();
	}
}
/*
최한석은 삼성폰을 1백만원 주고 샀습니다.
손에 든 폰을 보니 흐뭇합니다.

메세지를 보내봅니다.
답장이 없어 전화를 걸어보니, 연결이 안됩니다.
잠시뒤에 다시 연락해 보렵니다.
기다리는 동안 폰으로 게임을 합니다.

*/