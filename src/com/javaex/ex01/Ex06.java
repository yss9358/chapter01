package com.javaex.ex01;

public class Ex06 {

	public static void main(String[] args) {
		 // 일반적인 경우
		 double pi = 3.14;
		 double result = pi*5*5;
		 System.out.println(result);
		 
		 // pi 값을 변경하는 경우
		 pi = 3.141592;
		 double circlearea = pi*5*5;
		 System.out.println(circlearea);
		 
		 // pi 값을 상수로 선언하는 경우
		 // final 을 사용해 상수 선언을 하는 경우 변수를 대문자로 설정해주면 좋다
		 
		 final double Pi = 3.14;
		 double result02 = Pi*5*5;
		 System.out.println(result02);
		 
		 //Pi2 = 3.141592; -> final 로 선언한 변수는 상수가 되어 변경불가
		 // 변경하려고 하면 오류가 나오니 확인해서 변경
		 double circlearea2 = Pi*5*5;
		 System.out.println(circlearea2);
		 

	}

}
