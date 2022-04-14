package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		System.out.println("이름을 입력해주세요");
		System.out.println("이름:");
		
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		
		System.out.println("당신의 이름은 " + name + " 입니다.");
		sc.close();
	}
}
