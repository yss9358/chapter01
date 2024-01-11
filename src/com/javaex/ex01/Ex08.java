package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double v01 = 5/4;
		// 1.25? 1.0 정수간의 계산이므로 결과값도 정수로 나와야 한다.
		// 정의되는 범위는 실수이지만 계산값이 정수이기때문에 정수값만 계산되고 
		// 계산된 정수값이 실수로 나타난다.
		System.out.println(v01);
		
		double v02 = (double)5/4;
		// 5(정수)를 실수로 형변환해서 계산되는 값이 실수로 나타난다.
		// 1.25? 1.25
		System.out.println(v02);
		
		double v03 = 5/(double)4;
		// 4(정수)를 실수로 형변환해서 계산되는 값이 실수로 나타난다.
		//1.0? 1.25
		System.out.println(v03);
		
		double v04 = (double)5/(double)4;
		// 5 와 4 모두 실수로 형변환해서 계산되는 값이 실수로 나타난다.
		//1.25? 1.25
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;
		// 1.3과 1.8을 각각 정수화해서 더한 결과 값이 나옴.
		// (int)1.3의 결과값 1 , (int)1.8의 결과값 1이 더해져 2가 나옴.
		// 2? 2
		System.out.println(v05);
		
		int v99 = (int)(5/(double)4);
		// 먼저 (5/(dobule)4)의 값을 계산. 실수의 값이 포함된 결과이므로
		// 1.25가 나옴. 1.25를 다시 (int) 해서 최종 출력값 1이 나옴;
		System.out.println(v99);
		
		
		int v06 = (int)(1.3+1.8);
		// ()안의 숫자를 먼저 더한후 정수화한 값이 출력된다.
		// (1.3+1.8) 의 계산값 3.1을 (int) 한 결과 3이 나옴.
		System.out.println(v06);
		

	}

}
