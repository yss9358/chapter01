package com.javaex.ex02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ppt-86 - swtich-case문 if문 비교
		
		//switch 문 작성
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		
		
		
		switch (month) {
		
		
		
		case 4 :
		case 6 :
		case 9 :
		case 11 :
			
			System.out.println("days = 30");
			break;
			
		case 2 :
			System.out.println("days = 28");
			break;
		
		default :
			System.out.println("days = 31");
			break;
			
		}
		
		
		
		
		// if 문 작성
		
		
		if( (month==4) || (month==6) || (month==9) || (month==11) ) {
			
			System.out.println("days = 30");
		
		} else if( (month==2)) {
			
			System.out.println("dyas = 28");
		
		} else {
			
			System.out.println("days = 31");
			
		}
		
		sc.close();
			
	}

}
