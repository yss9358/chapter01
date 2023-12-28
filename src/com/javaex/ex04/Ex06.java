package com.javaex.ex04;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt96 - for반복문 연습문제(아래)
		
		int sum = 0 ;
		int max = 10;
		int min = 1;
		for (int i = min; i<=max; i++) {
			
			sum = sum + i;
			
			System.out.println(i + " 까지의 합은 " + sum );
			
		}
		
		System.out.println(min + "부터 " + max + "까지의 정수의 합은 " + sum + " 입니다.");

	}

}
