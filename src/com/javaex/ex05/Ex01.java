package com.javaex.ex05;

public class Ex01 {
	public static void main(String[] args) {
		
		int no1 = (int)(Math.random()*45)+1;
		int no2 = (int)(Math.random()*45)+1;
		int no3 = (int)(Math.random()*45)+1;
		int no4 = (int)(Math.random()*45)+1;
		int no5 = (int)(Math.random()*45)+1;
		int no6 = (int)(Math.random()*45)+1;
		System.out.println(no1 + "\t" + no2 + "\t" + no3 + "\t" + no4 + "\t" + no5 + "\t" + no6);
		
		System.out.println("=============================================================");
		
		for(int i=1; i<=6; i++) {
			System.out.println("no"+i);
		}
		
		
		//Math.random() : 0.0~1.0의 double형 반환
		//정수 난수값이 필요하면 int로 강제 형변환 해서 사용한다
		//(int)(Math.random()*최대값)+최소값;
	}
}
