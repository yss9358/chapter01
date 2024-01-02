package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 20240102 / ppt118 / 배열의 복사		
		
				// A배열		
				int[] arrA = new int[3];
				
				arrA[0]=3;
				arrA[1]=6;
				arrA[2]=9;
				
				for(int i=0; i<arrA.length; i++) {
					
					System.out.println(arrA[i]);
					
				}
				
				System.out.println("===============================");
				
				// B배열
				int[] arrB;
				
				//A배열의 주소(참조값)을 변수 arrB에 대입
				arrB =arrA;
				
				for(int i=0; i<arrB.length; i++) {
					System.out.println(arrB[i]);
					
				}
				
				System.out.println("===============================");
				
				// arrA[0] 의 값을 3에서 99로 변경
				// arrA 와 arrB의 값을 각각 출력
				// 두배열의 값이 같으면 같은 주소(저장소)를 사용한다.<- 를 확인하기 위한 출력
				
				arrA[0]=99;
				
				for(int i=0; i<arrA.length; i++) {
					System.out.println(arrA[i]);
				}
				
				System.out.println("=====================");
				
				for(int i=0; i<arrB.length; i++) {
					System.out.println(arrB[i]);
				}

	}

}
