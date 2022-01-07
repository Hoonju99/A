package com.yedam.java.Fexample2;

public class Subtracter extends Calculator {

	
	public Subtracter() {
		super.run();
	}
	
	
	
	@Override
	protected int calc() {
		return a-b;
	}

}
