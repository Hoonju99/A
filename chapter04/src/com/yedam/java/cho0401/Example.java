package com.yedam.java.cho0401;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		// for문

		// 예제1 - 0부터 90까지 10단위 출력

		for (int i = 0; i <= 90; i += 10) {
			System.out.println(i);

		}

		// 0-20 짝수만 출력
		for (int i = 0; i <= 20; i++) {
			if (i % 2 != 0)

				continue;
			System.out.println(i);
		}

		// 숫자를 5번 입력하고, 입력받을때마다 더해지는 값을 출력

		// 숫자를 5개를 입력하세요
		// 숫자를 이력하세요.
		// 5
		// 출력:5
		// 숫자를 입력하세요.
		// 6
		// 출력:11

		/*
		 * Scanner scanner =new Scanner(System.in); System.out.println("숫자 5개를 입력하세요");
		 * 
		 * int sum = 0; for(int i=1; i<=5; i++) { System.out.println("숫자를 입력하세요"); int
		 * value =Integer.parseInt(scanner.nextLine()); sum += value;
		 * System.out.println("출력:"+sum); }
		 * 
		 */

		Scanner scanner = new Scanner(System.in);

		int max = Integer.parseInt(scanner.nextLine());
		int sum = 0;
		for (int i = 1; i <= max; i++) {
			sum += i;

		}
		System.out.println("1~"+max+"까지 합:"+sum);
		
	}

}
