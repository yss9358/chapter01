package com.javaex.ex02;

import java.util.Scanner;

public class Ex06a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt77 - 조건문 연습문제 1 수정후 다시풀기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int time = sc.nextInt();
		int pay;
		
		if(time<9) {
			pay = time*10000;
		} else {
			pay = 8*10000 + (time-8)*12000;
		}
		
		System.out.println("임금은 " + pay + " 입니다.");
		
		sc.close();

	}

}
