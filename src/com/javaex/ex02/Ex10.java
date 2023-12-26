package com.javaex.ex02;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt81 ) - 조건문 연습문제(중복 if문)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		
		int a = sc.nextInt();
		
		/*
		if (a<0) {
			
			System.out.println("음수입니다.");
		}
		
		
		
		if(a>0) {
			
			if(a%2==0) {
				
				System.out.println("짝수입니다.");
			
			} else if(a%2!=0) {
				
				System.out.println("홀수입니다.");
				
			} 
		*/
		
		if(a==0) {
			
			System.out.println("0입니다.");
			
		} else if (a<0){
			
			System.out.println("음수입니다.");
		} else if (a>0) {
			
			if(a%2==0) {
				
				System.out.println("짝수입니다.");
				
			} else {
				
				System.out.println("홀수입니다.");
			}
		
		sc.close();

	  }

   }
	
}
