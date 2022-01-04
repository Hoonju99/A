package com.yedam.java.example;

public class TV {

	
	String company = "LG" ;
	int year = 2017 ;
	int inch = 32;
	
	
	
	
	TV(){
		
	}

	TV(String company, int year, int inch ){
		this.company = company;
		this.year = year ;
		this.inch = inch ;
	}

	
	
	void showInfo() {
		System.out.println("회사 : "+ company+ " | 년도 : "+ year + " | 크기 : " + inch);
	}





}

