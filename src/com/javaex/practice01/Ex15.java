package com.javaex.practice01;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double km = 1.609;
		
		System.out.print("마일을 입력하세요:");
		double mile = sc.nextDouble();
		
		System.out.println(km + "마일은 " + (mile*km) + "킬로미터 입니다.");
		
		sc.close();
	}
}
