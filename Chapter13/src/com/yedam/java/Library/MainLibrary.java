package com.yedam.java.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainLibrary {

	public static void main(String[] args) {
		
		
		//문제) 다음은 도서관리프로그램 중 일부입니다.
//		1) 메뉴는 다음과 같이 구성하세요.
//		1.책정보 입력 | 2.전체조회 | 3.단건조회 | 4.책 대여 | 5.책 반납 | 6.종료
//		2) 입력되는 책정보는 책이름과 저자명입니다.
//		3) 전체 조회 및 단건 조회 시 책번호, 책이름, 저자명, 해당 책의 대여여부(대여중, 대여가능)도 함께 출력되도록 하세요.
//		4) 책 대여 시 해당 책의 대여여부를 확인해서
//		   이미 대여 중인 책일 경우 "대여 중입니다."라는 안내문구를 출력하고
//		   대여가 가능한 책일 경우 대여처리 후 "대여되었습니다"라고 출력하도록 하세요.
//		5) 책 반납 시 반납처리 후 "반납되었습니다."라고 출력하도록 하세요.
	//  6) 종료시 "프로그램 종료"를 출력하도록 하세요.

		Scanner sc = new Scanner(System.in);
		boolean run = true ;
		
		List<Book> list = new ArrayList<Book>();
		
		
		
		
		
		while (run) {
			System.out.println("------------------------------------------------");
			System.out.println("1.책정보 입력 | 2.전체조회 | 3.분석 | 4.종료");
			System.out.println("------------------------------------------------");
			System.out.println("선택>");
			int menuno = sc.nextInt();
			
			switch (menuno) {
			case 1:
		
				break;
			case 2:
			
				break;
			case 3:
				
			

				break;
			case 4:
				
				break;
			}

		}
		
	}

}
