package com.javaex.ex01;

public class Ex02 {
	public static void main(String[] args) {

		double var01 = 3.14;
		float var02 = 3.14F; //F 안붙이면 오류
		// 둘다 실수를 저장하지만 저장 방식이 다름
		//f를 붙이는 이유 : float 타입임을 구별하기 위함 붙이지 않으면 double로 인식
		
		System.out.println(var01);
		System.out.println(var02);
		
		double var03 = 0.1234567891234569789;
		float var04 = 0.123456789123456789F;
		System.out.println(var03);
		System.out.println(var04);
		
	}
}
