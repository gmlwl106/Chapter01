package com.javaex.practice01;

public class Ex19 {
	public static void main(String[] args) {
		
		long lightSpeed = 300000;
		long distance = lightSpeed * 60 * 60 * 24 * 365L;
		
		//lightSpeed 변수를 만들지 않고 계산을 하면 깨짐
		
		System.out.println("빛이 1년 동안 가는 거리는 " + distance + " km 입니다.");
		
		
		
		/*
			int(4byte) - -2147483648~2147483647
			long(8byte) - -9223372036854775808~9223372036854775807
			
			1000.1001.1010.1100.0011.1001.1111.1001.0000.0000.0000
			?????
			몰?루
		*/
	}
}
