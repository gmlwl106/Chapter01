package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {
		
		//논리연산자
		int a = 5;
		int b = 7;
		
		//논리연산자 기본 &&
		System.out.println("&&연산자");
		System.out.println("true&&true=" + (true&&true));
		System.out.println("true&&false=" + (true&&false));
		System.out.println("false&&true=" + (false&&true));
		System.out.println("false&&false=" + (false&&false));
		
		//논리연산자 기본 ||
		System.out.println("||연산자");
		System.out.println("true||true=" + (true||true));
		System.out.println("true||false=" + (true||false));
		System.out.println("false||true=" + (false||true));
		System.out.println("false||false=" + (false||false));
		
		//응용
		System.out.println("응용");
		System.out.println((a>b)&&(a<b)); //false && true
		System.out.println((a>b)&&(a>b)); //false && false
		System.out.println("==================");
		System.out.println((a>b)||(a<b)); //false || true
		System.out.println((a<b)||(a>b)); //true || false
		
		//논리연산자 기본 !
		System.out.println("==================");
		System.out.println("a>b=" + (a>b));
		System.out.println("!(a>b)=" + !(a>b));
		
		System.out.println("a<b=" + (a<b));
		System.out.println("!(a<b)=" + !(a<b));
	}
}
