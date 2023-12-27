package com.javaex.ex02;

import java.util.Scanner;

public class Ex10a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt81 - 조건문 연습문제(중복 if문) 수정 후 다시 풀기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		
		int no = sc.nextInt();
		
		if(no>0) {
			
			if(no%2==0) {
				System.out.println("짝수입니다.");
			
			} else { 
				System.out.println("홀수입니다.");
				
			}
		}
		
		if(no<0) {
			System.out.println("음수입니다.");
		
		} else if(no==0) {
			System.out.println("0입니다");
		}
	
		sc.close();

	}

}


