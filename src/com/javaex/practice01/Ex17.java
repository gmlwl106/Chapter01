package com.javaex.practice01;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double PI = 3.14;
		
		System.out.print("반지름:");
		double r = sc.nextDouble();
		
		System.out.println("구의부피는: " + (4.0/3.0*PI*r*r*r) + " 입니다.");
		
		sc.close();
	}
}
