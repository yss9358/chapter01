package com.javaex.ex02;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt80 ) - 조건문 연습문제4
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 : ");
		
		int s = sc.nextInt();
		
		if(s>=90) {
			
			System.out.println("A등급");
		
		} else if(s>=80) {
			// else if(point<90&& point>+80) 으로도 작성할 수 있다.
			// &&와 ||를 사용해 조건들을 만족하도록 작성할 수 있다.
			System.out.println("B등급");
		
		} else if(s>=70) {
			
			System.out.println("C등급");
			
		} else if(s>=60) {
			
			System.out.println("D등급");
			
		} else  {
			
			System.out.println("F등급");
				
			}
		
		sc.close();

	}

}
