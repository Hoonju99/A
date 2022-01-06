package com.yedam.java.ch02_03;

public class ImplementC implements InterfaceC {

	@Override
	public void methodA() {
		System.out.println("ImplementC - methocA() 실행");
	}

	@Override
	public void methodB() {
		System.out.println("ImplementC - methocB 실행");

	}

	@Override
	public void methodC() {
		System.out.println("ImplementC - methocC() 실행");

	}

}
