package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public static final int VOLAGE = 200;
	static final String MAKER_NAME = "LG"; //public 잇음
	final int WEIGHT = 10;					//public static 있음
	LocalDate PRODUCED_DATE = LocalDate.now();//public static final 있음
	
	public abstract void displayMsg();
	abstract int getTemperature();
	String getModelName();
}
