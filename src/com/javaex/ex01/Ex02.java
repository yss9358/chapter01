package com.javaex.ex01;

public class Ex02 {
	
	public static void main(String[] args) {
		
		//byte
		byte no = 127;
		
		//no = -129; byte의 범위는 -128~127까지
		
		System.out.println(no);
		
		//int
		
		int num = 2147483647;
		
		System.out.println(num);
		
		/*long , long 은 숫자 뒤에 L (대소문자 상관x) 붙여야함
		 * int 범위까지는 L 을 붙이지 않아도 됨, 그냥 붙여도 됨
		 */
		
		long no2 = 9223372036854775807L;
		
		System.out.println(no2);
		
		long no3 = 2147483647;
		
		System.out.println(no3);
		
		////////////////////////////
		//변수선언,초기화
		
		int var01 = 10;
		int var02 = 20;
		int var03 = 30;
		
		/*int var01, var02, var03; 위랑 같은 표현
		 */
		
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		
		int var04 = 100, var05 = 200, var06 = 300;
		
		System.out.println(var04);
		System.out.println(var05);
		System.out.println(var06);
		
		
	
	
		
			
	
	}
	
}
