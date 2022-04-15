package com.javaex.practice01;

public class Ex07 {
	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i %2; //i가 1 증가한 후 계산
		
		System.out.println(i); //11
		System.out.println(n); //1
	}
}
