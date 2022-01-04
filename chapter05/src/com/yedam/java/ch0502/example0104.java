package com.yedam.java.ch0502;

public class example0104 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] javaScores = { {95, 80}, {92, 96, 80}};
		for(int i = 0; i<javaScores[i].length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
				System.out.println("javaScores["+i+"]["+k+"]:"+javaScores[i][k]);
			}
			
		}
		
		
		
		int[] oldIntArray = {1, 2, 3};
		int[] newIntArray = new int[5];
		
		for(int i=0; i<oldIntArray.length; i++) {
			newIntArray[i] = oldIntArray[i];
		}
		
		
		for(int value : newIntArray) {
			System.out.println(value);
		}
		
		
		String[] oldStrArray = {"java", "array", "copy"};
		String[] newStrArray = new String[5];
		
		System.arraycopy(oldStrArray, 0, newStrArray, 0, 0);		
		
	}

}
