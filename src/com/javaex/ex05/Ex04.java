package com.javaex.ex05;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double[] d = new double[3];
		
		d[0] = 3.5;
		d[1] = 7.2;
		d[2] = 12.8;
		
		//1개만사용
		System.out.println(d[1]);
			
		//모두사용
		for (int i=0; i<d.length; i++) {
			System.out.println(d[i]);
		}
		
	}

}
