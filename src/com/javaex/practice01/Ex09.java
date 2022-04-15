package com.javaex.practice01;

public class Ex09 {
	public static void main(String[] args) {
		
		double f = 80.0;
		//System.out.println(5/9*(f-32.0));
		//5, 9가 정수이기 때문에 int 형식으로 자동변환되어 정수로 결과가 나옴. 정수를 실수로 바꿔주면 해결!
		
		System.out.println(5.0 / 9.0 * (f - 32.0));
	}
}
