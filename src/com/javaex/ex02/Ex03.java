package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt 74 ) if 조건문
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수: ");
		
		
		int point = sc.nextInt();
		
		if(point >= 60) {
			
			System.out.println("합격입니다.");
			
			
		}
		
		sc.close();	
			
		
	}

}
