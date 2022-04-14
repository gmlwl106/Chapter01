package com.javaex.ex01;

public class Ex08 {
	public static void main(String[] args) {
		
		//대입연산자
		int a = 7;
		int b = 2;
		
		System.out.println("산술연산자");
		System.out.println("a+b=" + a+b);
		System.out.println("a+b=" + (a-b));
		System.out.println("a*b=" + a*b);
		System.out.println("a/b=" + a/b); // 정수/정수->정수(몫
		System.out.println("a%b=" + a%b);// 나머지
		
		//산술연산자 / % 자세히
		System.out.println("산술연산자 / % 자세히");
		System.out.println("================");
		System.out.println("7/2=" + 7/2);
		System.out.println("7.0/2.0=" + 7.0/2.0);
		System.out.println("7%2=" + 7%2);
		System.out.println("7.0%2.0=" + 7.0%2.0);
		System.out.println("================");
		
		//부호연산자
		int var = -3;
		int pVar = +var; //pVar에 var 값을 넣음
		int mVar = -var; //부호를 바꿈
		System.out.println(pVar);
		System.out.println(mVar);
		
		//증감연산자
		System.out.println("증감연산자");
		System.out.println(a);
		System.out.println(a++); //할일(출력) 먼저 하고 +1
		System.out.println(a);
		
		System.out.println(b);
		System.out.println(--b); //-1 먼저 하고 할일함(출력)
		System.out.println(b);
		
	}
}
