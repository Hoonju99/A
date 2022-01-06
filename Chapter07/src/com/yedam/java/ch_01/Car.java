package com.yedam.java.ch_01;

public class Car {
	//필드
	public int speed;
	//메서드
	public void speedUp() {
		speed+=1;
		
	}
	public void stop() {
		System.out.println("stop");
		speed = 0;
	}
}
