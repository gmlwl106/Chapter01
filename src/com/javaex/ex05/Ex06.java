package com.javaex.ex05;

public class Ex06 {
	public static void main(String[] args) {
		
		int[] arrA = new int[3];
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		int[] arrB = new int[3]; //arrB 새로 생성
		
		/*
		arrB[0] = arrA[0];
		arrB[1] = arrA[1];
		arrB[2] = arrA[2];
		*/
		
		//arrB<-arrA
		for(int i=0; i<arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		
		//출력
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
		
		//arrA와 arrB가 서로 다른 배열로 생성되었기 때문에 arrA의 값을 바꿔도 arrB의 값이 바뀌지 않음
	}
}
