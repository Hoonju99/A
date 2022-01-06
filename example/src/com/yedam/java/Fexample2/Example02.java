package com.yedam.java.Fexample2;

public class Example02 {

	public static void main(String[] args) {
		//문제2)다음을 만족하는 클래스 SalaryMan를 작성하시오
		//필드-- salary는 월 급여액을 저장하며, int형으로 초기값으로 1,000,000 저장
		
		//메서드-- getAnnualGross() 는 연봉을 계산해 반환하는 메서드로
		//연봉은 12월치 월급여액에 한달치 월 급여액 * 500%를 더한 값으로 한다.
		
		
		//----기본생성자에서 필드 salary의 초기 값을 사용하며
		//정수형 매개변수를 가지는 생성자에서 해당 매개변수를 월 급여액으로 저장
		System.out.println(new SalaryMan().getAnnualGross());
		System.out.println(new SalaryMan(2000000).getAnnualGross());
		
		
		
		StudentScores studentHong = new StudentScores("홍길동",1);
		studentHong.setKorean(100);
		studentHong.setEnglish(60);
		studentHong.setMath(76);
		
		System.out.println("학생" + studentHong.getstudentName() 
			+ "의 총 점수는" + studentHong.getTotal()
			+ "이고, 평균은" + studentHong.getAverage() + "입니다.");
		
		
		
		Account account = new Account("신용권");
		account.deposit(10000);
		account.withdraw(4800);
		System.out.println(account.getName()+"님의 계좌 잔액은" 
							+ account.getBalance() + "입니다.");
		
/*
 문제1) 원을 표현하는 다음 Circle 클래스가 있다. 
 	   Circle 클래스를 상속받은 NamedCircle 클래스를 작성하여, 다음 main()을 실행할 때 다음 실행 결과와 같이 출력되도록 하라.
 	   - class Circle {
			private int radius;
			public Circle(int radius) {
				this.radius = radius;
			}
			public int getRadius() {
			return radius;
			}
		}
		
		- 실행코드
		public static void main(String[] args) {
			NamedCircle w = new NamedCircle(5, "Waffle");
			w.show();
		}
		
		- 실행결과
		Waffle, 반지름 = 5
*/
		
			NamedCircle w = new NamedCircle(5, "Waffle");
			w.show();
		
			/*
			
			  문제2) 다음 코드와 실행 결과를 참고하여 추상 클래스 Calculator를 상속받는 Adder와 Subtracter 클래스를 작성하라.
			  		- abstract class Calculator {
						protected int a, b;
						abstract protected int calc();
						protected void input() {
							Scanner scanner = new Scanner(System.in);
							System.out.print("정수 2개를 입력하세요 >> ");
							a = scanner.nextInt();
							b = scanner.nextInt();
						}
						public void run() {
							input();
							int res = calc();
							System.out.println("계산된 값은 " + res);
						}
					}
					
					- 실행결과
					정수 2개를 입력하세요 >> 5 3
					계산된 값은 8
					정수 2개를 입력하세요 >> 3 5
					계산된 값은 -2
		*/
		
		
		
		
		
		
		
		
		
		
	}

}
