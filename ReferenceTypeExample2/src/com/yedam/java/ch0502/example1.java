package com.yedam.java.ch0502;

import java.util.Scanner;

public class example1 {

	public static void main(String[] args) {
		// 예제 1 - 주어진 배열 안의 값을 전부 더하고 합과 평균을 출력
		int sum = 0;
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -5 };

		for (int i = 0; i < 7; i++) {
			sum += arr1[i];

		}
		System.out.println("총합 :" + sum);
		System.out.println("평균값 : " + sum / 7);
		
		
		
		// 2 -주어진 배열 안의 값을 출력하는데 인덱스 2의 배수인 경우만 출력한다

		
		
		
		for (int i = 0; i < 7; i++) {
			if (arr1[i] % 2 == 0) {
				System.out.println("2의배수 : " + arr1[i]);
			}

			
		}
		//3- 인덱스번호 2개를 입력받아 , 그 값을 서로 바꿔보세요.
		
		
		
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째 값 입력");
		int index1 = scanner.nextInt();
		System.out.print("두번째 값 입력");
		int index2 = scanner.nextInt();
		
		int temp = arr1[index1];
		arr1[index1] = arr1[index2];
		arr1[index2] = temp;
		
		for(int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		
	
		
		
		
		
		
		
		
		
		
		
		
	}
}
