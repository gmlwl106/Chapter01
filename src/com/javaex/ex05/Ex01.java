package com.javaex.ex05;

public class Ex01 {
	public static void main(String[] args) {
		
		int num1 = (int)(Math.random()*45)+1;
		int num2 = (int)(Math.random()*45)+1;
		int num3 = (int)(Math.random()*45)+1;
		int num4 = (int)(Math.random()*45)+1;
		int num5 = (int)(Math.random()*45)+1;
		int num6 = (int)(Math.random()*45)+1;
		System.out.println(num1 + "\t" + num2 + "\t" + num3 + "\t" + num4 + "\t" + num5 + "\t" + num6);
		
		//Math.random() : 0.0~1.0의 double형 반환
		//정수 난수값이 필요하면 int로 강제 형변환 해서 사용한다
		//(int)(Math.random()*최대값)+최소값;
	}
}
