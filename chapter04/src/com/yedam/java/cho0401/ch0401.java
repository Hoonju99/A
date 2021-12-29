package com.yedam.java.cho0401;

import java.util.Scanner;

public class ch0401 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// if문

		// 예제1 - 점수를 입력받아서 70점 이상이면 합격 , 미만이면 불합격 출력
		//
		/*
		 * int score = Integer.parseInt(scanner.nextLine());
		 * 
		 * if (score >= 70) { System.out.println("합격"); } else {
		 * System.out.println("불합격"); }
		 * 
		 * 
		 * 
		 * //예제2 - 정수 한개를 입력받아 해당 정수가 2의 배수인지 확인 int num =
		 * Integer.parseInt(scanner.nextLine());
		 * 
		 * if(num%2 == 0) { System.out.println("2의 배수입니다."); }else {
		 * System.out.println("2의 배수가 아닙니다."); }
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * //예제3 - 점수는 0~100점 사이 값이여야 하며 // 벗어날 경우 "점수 입력 오류!" 출력 // 60점 이상이면 합격, 미만이면
		 * 불합격
		 * 
		 * int score = Integer.parseInt(scanner.nextLine());
		 * 
		 * if((score >=0) && (score<=100)) if(score >= 60) { System.out.println("합격");
		 * }else { System.out.println("불합격"); }
		 * 
		 * else { System.out.println("점수 입력 오류"); }
		 * 
		 * 
		 * 
	
		double height = Double.parseDouble(scanner.nextLine());

		if (height >= 110) {
			System.out.println("탑승가능");
		} else {
			System.out.println("함께오셨나요");
			System.out.println("1.보호자와 동행 2:혼자");
			int selected = Integer.parseInt(scanner.nextLine());
			if (selected == 1) {
				System.out.println("보호자와 함께 탑승");
			} else {
				System.out.println("보호자와 함께 오세요");

			}
		}
		
		
		
		
		
		
		
		//switch 문
		//예제 1 정수를 입력받아 0일 경우 false, 1일경우 true 둘다아닐경우 체크오류
		
		
		
		int a = Integer.parseInt(scanner.nextLine());
		
		switch(a)	{
		case 0:
			System.out.println("false");
			break;
		case 1:
			System.out.println("true");
			break;
		default:
			System.out.println("체크오류");
			
			
		}
		
		
		
		
		*/
		
		
		//정수를 입력받아 홀수인지 짝수인지를 판별
		//default 해당될 경우 어떤 수인지 출력
		
		int num = Integer.parseInt(scanner.nextLine());
		
		switch(num%2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
		}
		
		
		
		
		
		

	}

}
