package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요");
		System.out.println("이름:");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.println("나이:");
		int age = sc.nextInt();
		
		/*숫자를 입력받은 후 문자열을 입력받으면 버그 생김
		sc.nextLine(); //개행문자를 받아 처리*/
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
		
		sc.close();
		
	}
}
