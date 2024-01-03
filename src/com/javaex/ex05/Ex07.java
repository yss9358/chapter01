package com.javaex.ex05;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt117 / 배열의복사
		
		// A 배열 만들기
		int[] arrA = new int[3];
		
		arrA[0]=3;
		arrA[1]=6;
		arrA[2]=9;
		
		// B 배열 만들기
		int[] arrB = new int[3];
		
		// A배열의 값을 B배열에 복사
		for (int i=0; i<arrA.length; i++) {
			arrB[i] = arrA[i];
		}
		
		// A배열과 B배열을 각각 출력
		
		for (int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("=========================");
		
		for (int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
			
		}
		
		System.out.println("===================");
		
		arrA[2]=10000;
		
		for (int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
			
		}
		
		for (int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
	}

}
