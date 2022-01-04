package com.yedam.java.example;

import java.util.Scanner;

public class quiz20104 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		int productnum = 0;
		int[] products = null;
		
		while(run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택>");
			int menuno =scanner.nextInt();
			
			switch(menuno) {
			case 1:
				System.out.println("1.상품수 ");
				productnum = scanner.nextInt();
				products = new int[productnum];
				
				break;
			case 2:
				for(int i = 0; i<products.length; i++) {
				System.out.println((i+1)+"번째 제품>");
				products[i] = scanner.nextInt();
				
				}		
				break;
			case 3:
				for(int i = 0; i<products.length; i ++) {
					System.out.println((i+1)+"번째 제품:"+products[i]);
					break;
					
					
				}
				case 4:
					int max = 0;
					for(int i=0; i<products.length; i++) {
						if(max < products[i]) {
							max = products[i];
						}
					}
					
					int index =0;
					int sum = 0;
					for(int i=0; i<products.length; i++) {
						if(products[i] == max) {
							index = i+1;
							continue;
						}
						sum += products[i];
					}
				System.out.println("최고 가격을 가진 제품은 "+ index + "번째 젶무입니다.");
				System.out.println("최고 가격을 제외한 ㅈ품들의 합은"+sum + "입니다.");
				
				break;
			case 5:
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			
			
		}
		
		
		
		
		
	}

}
