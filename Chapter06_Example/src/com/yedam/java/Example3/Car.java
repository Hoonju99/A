package com.yedam.java.Example3;

public class Car {
	//필드
	private static int serialNum = 100;
	private int carNumber;
	
	private int cardNumber;
	
	
	//생성자
	public Car() {
		serialNum++;
		this.serialNum++;
		carNumber = serialNum;
		
		cardNumber = carNumber + 100;
	}
	
	
	
	//메서드
	
	public static int getSerialNum() {
		return serialNum;
	}
	public static void setSerialNum(int serialNum) {
		Car.serialNum = serialNum;
	}
	public int  carNumber() {
		return carNumber;
	}
	public void carNumber(int carNumber) {
		this.carNumber = carNumber;
	}



	public int getCarNumber() {
		return carNumber;
	}



	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}



	public int getCardNumber() {
		return cardNumber;
	}



	public void setCardNumber(int cardNumber) {
		this.cardNumber = cardNumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
