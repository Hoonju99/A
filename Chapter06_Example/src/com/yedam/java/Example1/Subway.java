package com.yedam.java.Example1;

public class Subway {
	private int lineNumber;
	private int money;
	private int passengerCount;
	
	public Subway(String subwayNumber) {
		this.lineNumber = lineNumber;
	}
	public void take(int money) {
		this.money += money;
		this.passengerCount++;
	}
	public void showInfo()
	{
		System.out.println("지하철" + lineNumber + "승객수" + passengerCount + "이고 , 수입은" + money +"입니다");
	}

}
