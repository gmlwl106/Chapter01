package com.javaex.ex01;

public class Ex04 {
	public static void main(String[] args) {
		
		char ch01 = 'A'; //'따옴표' 사용
		char ch02 = '안';
		//char ch04 = '12'; //한글자만 저장함
		
		System.out.println(ch01);
		System.out.println(ch02);
		//System.out.println(cho4);
		
		char ch03 = 65;
		System.out.println(ch03); //글자번호 65번-> A
		
		char ch04 = '3'; // 글자 '3'
		System.out.println(ch04);
		
		String str = "안녕하세요"; //'쌍따옴표' 사용
		System.out.println(str); //String은 다른 장소에 문자열을 저장하고 그 주소를 변수'str'에 저장
	}
}
