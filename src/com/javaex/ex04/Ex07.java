package com.javaex.ex04;

public class Ex07 {
	public static void main(String[] args) {
		
		//y축 세로 이동
		for(int i=0; i<6; i++) {
			
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
