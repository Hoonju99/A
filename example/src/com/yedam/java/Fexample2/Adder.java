package com.yedam.java.Fexample2;

public class Adder extends Calculator {
	
	
	
	// 사용자 불러오기
	public Adder ( ) {
		super.run();
	}
	
  //메서드 재정의
	@Override
	protected int calc() {
		return a+b;
	}

}
