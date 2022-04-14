package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("500원 개수:");
		int five_h = sc.nextInt();
		
		System.out.print("100원 개수:");
		int one_h = sc.nextInt();
		
		System.out.print("50원 개수:");
		int fifty = sc.nextInt();
		
		System.out.print("10원 개수:");
		int ten = sc.nextInt();
		
		int total_money = five_h*500 + one_h*100 + fifty*50 + ten*10;
		
		System.out.println("동전의 총합은 " + total_money + " 원 입니다.");
		
		sc.close();
	}
}
