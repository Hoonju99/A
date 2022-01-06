package com.yedam.java.Fexample2;

public class SalaryMan {

	//필드
	
	private int salary;
	
	//기본생성자에서 필드 셀러리를 사용
	
	//생성자
	public SalaryMan() {
		salary = 1000000;
		
	}
	SalaryMan(int salary){
		this.salary = salary;
		
	}

		
	
	
	//메서드    리턴타입--------> void->문자 or int->숫자   메서드이름(매개변수,,....){  실행구문   }
	int getAnnualGross(){
		int salarys = 0; //-----> 팁
		salarys = salary * 12 +salary * 5;
		
		
		
		
		return salarys; //----> 팁
	}
	
	
}
