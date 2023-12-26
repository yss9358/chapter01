package com.javaex.ex01;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//증감 연산자
		
		int a = 7; 
		
		System.out.println(a);
		System.out.println(++a);
		System.out.println(a);
		
		// 변수 앞에 ++이 붙으면 제일 먼저 실행된다.
		System.out.println("----------");
		
		
		int b;
		
		b = 7;
		
		System.out.println(b);
		System.out.println(--b);
		System.out.println(b);
		
		/*
		 * (1) b 라는 공간을 만들고 int로 저장 , (2) b 에 7 을 대입한다
		 * (3) b를 출력한다 (b가 출력됨), (4) b를 하나 감소 시키고 출력한다
		 * (5) b를 출력한다 (감소된 b가 저장되어 출력됨) */
		
		System.out.println("---------");
		
		
		int c;
		
		c = 7;
		
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
		System.out.println(++c);
		System.out.println(c);
		System.out.println(--c);
		System.out.println(c);
		System.out.println(--c);
		System.out.println(--c);
		System.out.println(c);
		
		

	}

}
