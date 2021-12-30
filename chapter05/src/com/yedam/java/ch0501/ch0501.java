package com.yedam.java.ch0501;

public class ch0501 {

	public static void main(String[] args) {
		//문자열 비교
		String strVar1 = "신미철";
		String strVar2 = "신미철";
		
		
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 svtrVar2는 참조가 같음.");
		}else {
			System.out.println("strVar1과 strVar2는 참조가 다름.");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음.");
		}
		
		
		
		
		String strVar3 = new String("신미철");
		String strVar4 = new String("신미춸");
		
		if(strVar3 == strVar4) {
			System.out.println("str3 str4");
			
		}else {
			System.out.println("strvar3과 strvar4는 참조가 다름");
		}
		
		if(strVar3.equals(strVar4)) {
			System.out.println("같음");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	


}
