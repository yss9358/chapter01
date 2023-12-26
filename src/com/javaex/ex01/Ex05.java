package com.javaex.ex01;

public class Ex05 {
	
	public static void main(String[] args) {
		
		char ch01 = 'A', ch02 = '한';
		// char 에서는 작은따옴표만 써야함,''
		// char 은 무조건 한글자만 사용 
		
		System.out.println(ch01);
		System.out.println(ch02);
		
		char ch03 = 65;
		// 한글자 이상은 적용x
		System.out.println(ch03);
		
		
		char ch04  = '3';
		System.out.println(ch04);
		// char ch05 = "황" , 쌍따옴표, 두글자이상 안됨
		////////////
		//String 사용법만 익히자 , 한글자이상 쌍따옴표를 사용
		
		
		String name = "유승수";
		// String 은 쌍따옴표 "" 써야함
		
		System.out.println(name);
		
		
		// String name2 = '유' << 쌍따옴표가 아니라서 안됨
		// 한글자나 공백이어도 되지만 쌍따옴표 사용 필수
		
		
	}

}
