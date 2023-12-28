package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt91 - while 반복문 문제 : 구구단 만들기
				
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		
		int no = sc.nextInt();
		
		int a = 0; // 0부터 시작하는걸 연습해보는게 좋을듯
		
		int time = 1;
		
		// 변수를 활용할 수 있으면 그냥 활용
		// 활용하기 애매하면 추가로 변수를 지정해서 사용한다
		// 변수가 늘어나면 변수도 ++ 로 수정해준다
		
		while(a<9) {
			
			System.out.println(no + " * " + time + " = " + no*time);
			
			time++;
			a++;
			
		}	
		
		sc.close();
	
	}

}
