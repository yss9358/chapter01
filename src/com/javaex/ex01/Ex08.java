package com.javaex.ex01;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double v01 = 5/4;
		// 1.25? 1.0 정수간의 계산이므로 결과값도 정수로 나와야 한다.
		System.out.println(v01);
		
		double v02 = (double)5/4;
		// 1.25? 1.25
		System.out.println(v02);
		
		double v03 = 5/(double)4;
		//1.0? 1.25
		System.out.println(v03);
		
		double v04 = (double)5/(double)4;
		//1.25? 1.25
		System.out.println(v04);
		
		int v05 = (int)1.3 + (int)1.8;
		// 2? 2
		System.out.println(v05);
		
		int v99 = (int)(5/(double)4);
		System.out.println(v99);
		
		
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);
		

	}

}
