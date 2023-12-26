package com.javaex.ex01;

public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b = 10;
		
		System.out.println(b);
		System.out.println(b++); // b를 먼저 출력한후 b의 값을 올린다.
		System.out.println(b);
		
		System.out.println("--------");
		
		int a = 10;
		
		System.out.println(a);
		System.out.println(a--); // a를 먼저 출력한후 a의 값을 내린다.
		System.out.println(a); // 내려간 값을 확인하기 위해 다시 한번 출력한다.
		
		System.out.println("---------");
		
		
		int c = 10;
		
		System.out.println(c); // 10
		System.out.println(c++); // 10
		System.out.println(c++); // 11
		System.out.println(c); //12
		System.out.println(c--); //12
		System.out.println(c); //11
		
		System.out.println("---------");
		
		
		int no = 10;
		
		System.out.println(++no + 3); // 14?
		System.out.println(no-- + 3); // 16? -> 14
		System.out.println(no); // no==10
		
		System.out.println("-----");
		
		
		int num = 10;
		
		System.out.println(num-- + 3); //13
		System.out.println(num); //9
		
		System.out.println("-----");
		
		int no1 = 10;
		
		no1++;
		++no1;
		System.out.println(no1); // 12
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
