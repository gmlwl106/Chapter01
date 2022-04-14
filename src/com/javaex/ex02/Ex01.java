package com.javaex.ex02;

public class Ex01 {
	public static void main(String[] args) {
		int i = 12345;
		double pi = 3.14;
		String str = "굿모닝";
		char a = '한';
		String b = "한";
		
		//println : 줄바꿈o
		System.out.println("안녕하세요");
		System.out.println(str);
		
		//print : 줄바꿈x
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println(str + str + "안녕하세요");
		System.out.println(str + i);
		String var01 = str + i;
		System.out.println(var01);
		
		System.out.println(str + pi);
		System.out.println(a);
		System.out.println(a+a); //코드값을 숫자로 인식함
		System.out.println(b);
		System.out.println(b+b);
		
		String name = "박희지";
		System.out.println("제이름은 " + name + " 입니다.");
		
		// \n : 줄바꿈 \t : 탭 \\ : "
	}
}
