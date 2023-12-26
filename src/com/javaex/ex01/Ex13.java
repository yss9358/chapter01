package com.javaex.ex01;

public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 논리 연산자
		 * &&  -  And 연산자 - 둘다 맞을때만 t
		 * ||  -  Or 연산자 - 둘다 틀릴때만 f
		 * !   -  Not 연산자 - !를 붙이면 결과값이 반대로
		 */
		
		System.out.println(true && true); // t
		System.out.println(true && false); // f
		System.out.println(false && true); // f
		System.out.println(false && false); // f
		
		System.out.println("----------------");
		
		
		// ||  Or 연산자 ( shift + \ )
		
		System.out.println(true || true);   // t
		System.out.println(true || false);  // t
		System.out.println(false || true);  // t
		System.out.println(false || false); // f
		
		System.out.println("------------------");
		

		int a = 5;
		int b = 7;
		
		System.out.println((a>b) && (a<b)); // 5>7=f && 5<7=t ->f
		System.out.println((a>b) && (a>b)); // 5>7=f && 5>7=f ->f
		System.out.println((a>b) || (a<b)); // 5>7=f || 5<7=t ->t
		System.out.println((a>b) && (a<b) || (a<b));
		// 5>7= f && a<7= t || a<b= t -> f&&t||t->t
		
		System.out.println((a<b)||(a>b)||(a>b)); //t
		// 5<7= t || 5>7 =f || 5>7=f
		// t || f ->t ,  t || f -> t		
		
		System.out.println("------------------------------------");
		
		// ! NOT 연산자 > 나온 결과값의 반대로 표기됨
	
		
		System.out.println(!(a<b)); //f 
		System.out.println(!(a>b)); //t
		
		
		
	
		
		

	}

}
