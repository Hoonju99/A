package com.yedam.java.example;

import java.util.Scanner;

public class quiz0104 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		int[] scores = null;
		int studentnum = 0;

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택>");
			int menuNo = scanner.nextInt();

			switch (menuNo) {
			case 1:
				System.out.println("학생 수 >");
				studentnum = scanner.nextInt();
				scores = new int[studentnum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = scanner.nextInt();
				}
				break;
			case 3:
				for(int i = 0 ; i<scores.length; i++)
					System.out.println("scores["+i+"] : " + scores[i]); {
						
					}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				
				double avg = (double)sum / scores.length;
				System.out.println("최고점수 "   + max);
				System.out.println("평균점수 : " + avg);
				
				break;
			case 5:
				
				run = false;
				System.out.println("프로그램 종료");
				break;

			}

		}

	}

}
