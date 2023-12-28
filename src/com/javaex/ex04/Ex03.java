package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for반복문은 for(초기값;조건식;증감식;) 순서로 작성한다.
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<5;i++) {
			
			System.out.println("I Like Java" + i );
		}
	
		sc.close();

	}

}
