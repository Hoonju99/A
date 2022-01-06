package com.yedam.java.Fexample2;

public class StudentScores {
	//필드
	
	private String studentName;
	private int num;
	private int korean;
	private int english;
	private int math;
	//생성자
	
	
	public StudentScores(String studentName, int num) {
		this.studentName = studentName;
		this.num = num;
	}
	
	
	
	
	
	
	
	
	
	
	public String getstudentName() {
		return studentName;
	}
	public void setstudentName(String name) {
		this.studentName = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKorean() {
		return korean;
	}
	public void setKorean(int korean) {
		this.korean = korean;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	
	//메서드

	public int getTotal() {
		int sum = 0;
		
		sum = korean + english + math ;
		
		
		return sum;
	}

	public double  getAverage() {
		double avg=0;
		
		avg = getTotal()/ 3.0;
		
		return avg;
	}
	
	
}
