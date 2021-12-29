package com.yedam.java.cho0401;

import java.util.Scanner;

public class quiz1229 {

	public static void main(String[] args) {

		// 문제1) 두 개의 정수가 주어졌을 때 두 정수의 합이 자연수이면 'Natural Number'을 출력하도록 하세요.
		int x = 1;
		int y = 2;
		int result;

		if ((x + y) > 0) {
			System.out.println("Natural Number");
		}

		// 문제2) 두 개의 정수가 주어졌을 때 두 수의 대소관계에 따라 부등호( > or = or < )를 출력하도록 하세요.

		if (x > y) {
			System.out.println("x > y");
		} else if (x == y) {
			System.out.println("x = y");
		} else if (x < y) {
			System.out.println("x < y");
		}

		/*
		 * 문제3) 체질량 지수인 BMI에 따라 비만도를 네가지 단계로 구분하여 결과값을 출력하도록 하세요. BMI = 체중 / ( 키 * 키 )
		 * 저체중(18.5미만), 정상(18.5 이상 25미만), 과체중(25이상 30미만), 비만(30이상)
		 */

		double BMI = 93 / (1.80 * 1.80);

		if (BMI >= 30) {
			System.out.println("비만(30이상)");
		} else if ((BMI >= 25) && (BMI < 30)) {
			System.out.println("과체중(25이상 30미만)");
		} else if ((BMI >= 18.5) && (BMI < 25)) {
			System.out.println("정상(18.5 이상 25 미만)");
		} else if (BMI < 18.5) {
			System.out.println("저체중(18.5미만)");
		}

		/*
		 * 문제4) 선택한 단의 6번째 값을 출력하도록 하세요. 예를 들어, 2단일 경우 2 X 6 = 12 단, 출력문에 변수를 사용하지 않는다.
		 */

		/*
		 * %d * 6 = %d Scanner scanner = new Scanner(System.in);
		 * 
		 * int num =Integer.parseInt(scanner.nextLine());
		 * 
		 * switch (num) { case 1: System.out.println("2 x 1=1"); break; case 2:
		 * System.out.println("2 x 2=4"); break; case 3: System.out.println("2 x 3=6");
		 * break; case 4: System.out.println("2 x 4=8"); break; case 5:
		 * System.out.println("2 x 5=10"); break; case 6:
		 * System.out.println("2 x 6=12"); break;
		 * 
		 * }
		 * 
		 * /* 문제5) 다음과 같이 점수 범위에 따라 등급을 구분하여 해당 점수에 대한 등급을 출력하도록 하세요. 90점 이상 100점 이하 : A
		 * 9x 100 등급, 80점 이상 90점미만 : B 등급, 8x 70점 이상 80점미만 : C 등급, 7x 60점 이상 70점미만 : D
		 * 등급, 6x 60점미만 :E등급
		 */
		Scanner scanner = new Scanner(System.in);
		int grade = Integer.parseInt(scanner.nextLine());

		int score = 87;

		switch (grade / 10) {
		case 10:
		case 9:
			System.out.println("A등급");
			break;
		case 8:
			System.out.println("B등급");
			break;
		case 7:
			System.out.println("C등급");
			break;
		case 6:
			System.out.println("D등급");
			break;
		case 5:
			System.out.println("E등급");
			break;

		}

	}

}
