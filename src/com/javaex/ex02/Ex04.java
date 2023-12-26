package com.javaex.ex02;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt 75 ) if-else 조건문
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		
		int point = sc.nextInt();
		
		if(point>=60) {
			// true일 떄
			System.out.println("합격입니다.");
			
		} else { 
			// false일 때
			System.out.println("불합격입니다.");	
		}
		
		sc.close();
		
	}

}
