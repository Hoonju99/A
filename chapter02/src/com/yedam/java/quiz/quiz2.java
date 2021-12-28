package com.yedam.java.quiz;

public class quiz2 {

	public static void main(String[] args) {
	
	int x = 10;
	int y = 10;
	int result;
	
	
	//1-1
	int result1 = -x  ;
	System.out.println("result1 = " + result1);
	
	
	
	//1-2
	int result2 = x + y++ ;
	System.out.println("result2 = " + result2);
	System.out.println("y =" + y);	

	
	
	//1-3
	int result3 = x + --y ;
	System.out.println("result3 = " + result3);
	
	//1-4
	int result4 = x / y ;
	System.out.println("result4 = " + result4);
	System.out.println("나머지 = "+ x%y);
	
	
	}

}
