package com.javaex.ex01;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//대입연산자
		// 대입연산자는 = 로 표시
		int a = 7;
		int b = 2;
		
		
		//산술연산자
		//int var01 = a+b;
		//System.out.println(var01);
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b); //나누기 ->> 몫
		System.out.println(a%b); //나누기 ->> 나머지
		
	    //  나누기( / ) 는 나누기 한 후 몫이 출력됨
		//  나누기( % ) 는 나누기 한 후 나머지가 출력됨
		
		System.out.println("------------------------------");
		// %연산자 자세히
		System.out.println(7/2);   // -> 3이 나옴
		System.out.println(7.0/2); // -> 3.5 나옴
		System.out.println(7%2);   // -> 1 나옴
		System.out.println(7.0%2); // -> 1.0 나옴
		
		// 정수인지 실수인지에 따라 나오는 표기값이 다름.
		// ( / ) 와 ( % ) 는 각각 나머지와 몫을 보여줌 
		System.out.println("---------------------------------");
		
		int var = -3;
		int pVar = +var; // +(-3) -> -3
		int mVar = -var; // -(-3) -> +3
		
		System.out.println(pVar);
		System.out.println(mVar);
		
		
		
		

	}

}
