package com.javaex.ex02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt77 ) 조건문 연습문제-1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int time = sc.nextInt();
		
		if(time<=8) {
			
			System.out.println("임금은 " + (time*10000) + " 입니다.");
			
		} else {
			
			System.out.println("임금은 " + ((int)80000+(time-8)*12000) + " 입니다.");
			
		}
		
		sc.close();

	}

}
