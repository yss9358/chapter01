package com.javaex.ex05;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt108 - Math.random() 이용하여 미니로또 만들기

		int no1, no2, no3, no4, no5,no6 ;
		
		
		no1 = (int)(Math.random()*45)+1;
		no2 = (int)(Math.random()*45)+1;
		no3 = (int)(Math.random()*45)+1;
		no4 = (int)(Math.random()*45)+1;
		no5 = (int)(Math.random()*45)+1;
		no6 = (int)(Math.random()*45)+1;
		
	
		System.out.println(no1);
		System.out.println(no2);
		System.out.println(no3);
		System.out.println(no4);
		System.out.println(no5);
		System.out.println(no6);	
		
	}

}
