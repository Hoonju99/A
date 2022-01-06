package com.yedam.java.ch_01;

public class SportsCar extends Car {
	@Override
	public void speedUp() {
		speed+=10;
	}
	@Override
	public void stop() {
		System.out.println("스포츠카멈춤");
		speed=0;
	}
}
