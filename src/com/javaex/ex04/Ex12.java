package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		int sum = 0;
		int num;
		
		/*
		do { //반복영역. 꼭 한번은 실행이 됌
			num = sc.nextInt();
			sum += num;
			System.out.println("합계: " + sum);
		} while(num != 0); //반복조건
		
		*/
		
		while(true) {
			num = sc.nextInt();
			sum += num;
			System.out.println("합계: " + sum);
			
			if(num == 0) {
				break;
			}
		}
		
		System.out.println("종료");
		sc.close();
	}
}
