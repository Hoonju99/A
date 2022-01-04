package com.yedam.java.ch0603;

public class MainExample {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메소드 호출
		Calculator myCalc = new Calculator();
		myCalc.powerOn();
		int result1 = myCalc.plus(5, 6);
		System.out.println("resutl1 : " + result1);

		int x = 10;
		int y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("restult2 : " + result2);

		// 매개변수의 개수를 모를 경우
		Computer myCom = new Computer();

		int[] values1 = { 1, 2, 3 };
		int intResult1 = myCom.sum1(values1);
		System.out.println("intResult1 : " + intResult1);

		int intResult2 = myCom.sum1(new int[] { 1, 2, 3, 4, 5, });
		System.out.println("inResult2 : " + intResult2);

		int intResult3 = myCom.sum2(1, 2, 3);
		System.out.println("intResult3 : " + intResult3);

		int intResult4 = myCom.sum2(1, 2, 3, 4, 5);
		System.out.println("intResult4 : " + intResult4);

		System.out.println();
		// return 문
		Car myCar = new Car();

		myCar.setGas(5);

		boolean gasState = myCar.isLeftGas();
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}

		if (myCar.isLeftGas()) {
			System.out.println("주입 필요 없음");

		} else {
			System.out.println("주입");
		}
		
		
		//클래스 내부에서 메소드 호출
		Calculator myCalc1  = new Calculator();
		myCalc.execute();
		
		System.out.println();
		//메서드 오버로딩
		Calculator myCalcu = new Calculator();
		
		double dbResult1 = myCalcu.areaRectangle(10);
		
		double dbResult2 = myCalcu.areaRectangle(10, 20);
		
		System.out.println("정사각형"+ dbResult1);
		System.out.println("직사각형"+ dbResult2);
		
		
	}

}
