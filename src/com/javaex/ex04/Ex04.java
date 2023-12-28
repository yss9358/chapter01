package com.javaex.ex04;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for 문으로 구구단 만들기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력하세요.");
		System.out.print("단 : ");
		
		int dan = sc.nextInt();
		
		for (int i=0;i<9;i++) {
			
			System.out.println(dan +  " * " + (i+1) + " = " + ( dan * (i+1) ) );
			
		}
		
		// 횟수를 정하고 반복 for / 횟수를 정할 수 없을때 while
		
		sc.close();

	}

}
