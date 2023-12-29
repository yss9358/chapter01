package com.javaex.ex04;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ppt105 - do~while 반복문 연습
		
		int sum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		//입력받기
		// no==0 종료
		// no!=0 받아서 합계계산
		//입력받기
		
		while(true) {
		
			int no = sc.nextInt();
		
			if (no==0) {
			System.out.println("종료");
			break;
			} 
			sum = sum + no;
			System.out.println("합계: "+ sum);
			}
		
		sc.close();
		
	}
		
	    
 }



