package com.javaex.ex04;

public class Ex08 {
	public static void main(String[] args) {
		
		int num = 1;
		
		while(true) {
			if(num % 6 == 0 && num % 14 == 0) {
				//if문이 true
				System.out.println("6의 배수이고 14의 배수인 수는 " + num);
				break;
			} else {
				num++;
			}
		}
	}
}
