package com.yedam.java.ch0204;

import java.util.Scanner;

public class VariableExample {

	public static void main(String[] args) {
		//println(), print()메소드
		System.out.println("오늘은 월요일입니다.");
		System.out.print("2021년");
		System.out.print("12월");
		System.out.print("27일 ");
		//print는 자동 줄바꿈 지원 x

		//printf()
		int x = 1;
		int y = 2;
		System.out.println("1. x : " + x + ", y : " + y	);
		System.out.printf("2. x : %d, y : %d\n", x, y );
		
		int result = x + y;
		System.out.printf("%d + %d = %d\n", x, y, result);
		
		
		//Scanner
		Scanner scanner = new Scanner(System.in);
		//ctrl + shift + O
		
		
        /*
		String testData = scanner.nextLine(); 
		System.out.println(testData);
	    */
		
		String inputData; //-> 변수선언
		while(true) { //구문 안 조건 무한 루프 -> 반복
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 : " + inputData);
			if(inputData.equals("exit")) { //-> 무한루프이기때문에 종료if문
				break;
				
			}
		}
		
		System.out.println("종료");
		
		
	}

}
