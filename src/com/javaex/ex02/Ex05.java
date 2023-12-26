package com.javaex.ex02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt 76 ) if-else if-else 조건문
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		int point = sc.nextInt();
		
		if(point>0) {
			// 양수일때
			System.out.println("양수");
		
		} else if(point<0) {
			// 음수일때
			System.out.println("음수");
		
		} else {
			// 0 일때
			System.out.println("0 입니다");
			
		}
		
		sc.close();

	}

}
