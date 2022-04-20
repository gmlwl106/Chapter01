package com.javaex.ex05;

public class Ex05 {
	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = arrA; //주소가 복사됨 (같은 주
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("==========");
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		System.out.println("=arrA[1] 값 변경=");
		
		arrA[1] = 100;
		
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("==========");
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
		//배열은 값이 아닌 주소값을 가지고 있고 다른 배열에 복사를 하게 되면 하나의 배열을 공유하게 됨
		//배열 안의 값을 바꾸면 복사된 배열도 같은 변경된 값을 가지게 됨
	}
}
