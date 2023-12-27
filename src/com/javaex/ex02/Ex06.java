package com.javaex.ex02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ppt77 ) 조건문 연습문제-1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		
		int time = sc.nextInt();
		
		if(time<=8) {
			// time<9 로 작성하는게 더 깔끔해보인다.
			
			int pay = time*10000;
			//변수를 한번더 지정해주면 좋다.
			
			System.out.println("임금은 " + pay + " 입니다.");
			
		} else {
			
			int pay = 8*10000 + (time-8)*12000;
			// 변수는 괄호가 끝나면 사라진다 
			// 따라서 if 의 변수 pay 와 else의 변수 pay는 이름은 같지만 다른 내용으로 사용된다
			System.out.println("임금은 " + pay + " 입니다.");
			// 출력되어 나오는 최종 메세지가 같다면 괄호 밖으로 빼서 한번만 입력하면 좋다.
			// 변수 pay는 괄호 밖에서 int pay; 로 지정해주고
			// 조건문안의 괄호에서는 pay = a 로 작성만 해준다.
			
		}
		
		sc.close();

	}

}
