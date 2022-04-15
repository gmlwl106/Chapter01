package com.javaex.practice01;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		final double TAX = 0.1;
		
		System.out.print("상품가격:");
		double price = sc.nextDouble();
		
		System.out.print("받은돈:");
		double cash = sc.nextDouble();
		
		System.out.println("================");
		System.out.println("받은돈: " + cash);
		System.out.println("상품가격: " + price);
		System.out.println("부가세: " + price*TAX);
		System.out.println("잔액: " + (cash-price));
		
		sc.close();
	}
}
