package com.javaex.ex05;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열, 반복문 이용해서 미니로또 만들기
		
		int[] no = new int[6];
		// no == lottoNoArray
		
		for (int i=0; i<no.length; i++) {
			no[i]=(int)(Math.random()*45)+1;
		}
		for (int i=0; i<no.length;i++) {
			System.out.println(no[i]);
		}
	
	     

		

	}

}
