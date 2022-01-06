package com.yedam.java.Example1;

public class Bus {

	private int busNumber;
	private int money;
	private int passengerCount;
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	
		}
	
	public void take(int money) {
		this.money +=money;
		this.passengerCount++;
		
	}
	
	public void showInfo()
	{
		System.out.println("버스 " + busNumber + " 번읜 승개객은" + passengerCount + "명이고, 수입은"+ money +"입니다"); 
	}
	
	
}
