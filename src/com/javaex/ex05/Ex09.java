package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt 122 - main()의 배열이해
		// String args = new Stiring(3) 자바가 이 역할을 해준다
		
		for (int i=0; i<args.length; i++) {
			System.out.println(i + "번째 방의 값 :" + args[i]);
		}
		
		// -h
		if(args[0].equals("-h")) {
			System.out.println("[-h]: 도움말");
			System.out.println("[-v]: 버전정보");
			System.out.println("[-m]: 만든사람");
			
		} else if (args[0].equals("-v")) {
			System.out.println("버전: 1.1");
		} else if (args[0].equals("-m")) {
			System.out.println("만든사람: 황일영");
		}
		

	}

}
