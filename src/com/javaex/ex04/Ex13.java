package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ppt 105 - do~while 반복문
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.[0이면 종료]");
		
		int sum = 0;
		int no;
		
		do {
			no = sc.nextInt();
			sum = sum + no;
			System.out.println("합계: " + sum);
			
		} while(no!=0);
		
		System.out.println("종료");
		
		sc.close();

	}

}
