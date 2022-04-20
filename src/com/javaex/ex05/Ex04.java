package com.javaex.ex05;

public class Ex04 {
	public static void main(String[] args) {
		
		//배열 작성방법
		
		//첫번째 방법
		int[] intArray = new int[3];
		intArray[0] = 3;
		intArray[1] = 6;
		intArray[2] = 9;
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		
		
		/* 두번째 방법
		int[] intArray = new int[] {3,6,9};
		
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/
		
		/* 세번째 방법
		int[] intArray = {3, 6, 9};
		for(int i=0; i<intArray.length; i++) {
			System.out.println(intArray[i]);
		}
		*/
		
		System.out.println("=============double=================");
		double[] dArray = new double[3];
		dArray[0] = 1.1;
		dArray[1] = 7.3;
		dArray[2] = 5.2;
		
		for(int i=0; i<dArray.length; i++) {
			System.out.println(dArray[i]);
		}
		
		System.out.println("==============char================");
		char[] cArray = new char[3];
		cArray[0] = 'p';
		cArray[1] = 'h';
		cArray[2] = 'j';
		
		for(int i=0; i<cArray.length; i++) {
			System.out.println(cArray[i]);
		}
		
	}
}
