package ch05.home.ex05.case06;

public class Man {
	private String manName;
	private Phone phone;
		
	public void sendMessege() {
		phone.sendMessege();
	}
	
	public void call() {
		phone.call();
	}
	
	public void playGame() {
		phone.playGame();
	}
	
	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public String getManName() {
		return manName;
	}

	public void setManName(String manName) {
		this.manName = manName;
	}
}
