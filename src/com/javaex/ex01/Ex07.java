package com.javaex.ex01;

public class Ex07 {

	public static void main(String[] args) {
		
		int var00 = 3+5;
		System.out.println(var00);
		
		
		
		double var01 = 3+3.5;
		System.out.println(var01);
		
		int a = 3;
		float b = 3.5f;
		double var02 = a+b;
		// int + float 의 경우 int 가 float형으로 바뀌어 계산
		// int a = 3 이  3.0으로 자동형변환되어 계산됨
		
		System.out.println(var02);
		
		///////////////////////////
		
		float var04 = 1111.6345f;
		int var05 = (int)var04;
		System.out.println(var04);
		System.out.println(var05);
		
		//축소 형변환 (int->byte)
		int v01 =10;
		byte v02 = (byte)v01;
		System.out.println(v02); // 값이 변하지 않는 이유
		
		// 축소 형변환 int->byte
		int v03 = 203029770;
		byte v04 = (byte)v03;
		System.out.println(v04); //값이 변하는 이유
		
		// 확대 형변환 byte->int
		byte v05 = 103;
		int v06 = (int)v05;
		System.out.println(v06);
		
				

		
		
		//실수 -> 정수
		
		double v07 = 5.57;
		int v08 = (int)v07;
		System.out.println(v08);
		
		//정수 ->실수
		int v09 = 7;
		double v10 = (double)v09;
		System.out.println(v10);
		
		
		
		
		
		
	}

}
