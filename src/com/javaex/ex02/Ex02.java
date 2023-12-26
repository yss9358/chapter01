package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {
	
	public static void main(String[] args) {
		
		// Scanner 를 사용할때는 미리 close를 작성해두고 가운데에 쓰면 좋다
		// Scanner 는 대문자로 작성
		// Scanner 를 작성하면 <<에 에러코드가뜸 . 클릭하면 import가 있음
		// 자동으로 import java.util.scanner; 를 입력해줌
		// system.in 은 키보드로 입력받는 경우를 말함.
	
		
		
		Scanner sc = new Scanner (System.in);
		
		
		
		
		
		//출력
		//이름출력
		//이름 입력받기 
		//결과 출력
		
		
		
		
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름: ");
		String name = sc.nextLine();
		//System.out.println(name);
		System.out.println("당신의 이름은 "+ name + " 입니다.");
		
		
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름: ");
		String name2 = sc.nextLine();
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("당신의 이름은 " + name2 + " 나이는 " + age + " 입니다.");
		
		
		
				
		// 이름입력 < 출력
		// 이름:   < 출력
		// 나이입력 < 출력
		// 나이:   < 출력
		// 결과    < 출력
		/*
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름: ");
		String name2 = sc.nextLine();
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.println("당신의 이름은 " + name2 + " 나이는 " + age + " 입니다.");
		*/
		// sc.next(); 는 띄어쓰기를 사용 시 띄어쓰기 된 이전 부분만 사용한다.
		
				
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		int age2 = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름: ");
		String name3 = sc.nextLine();
		System.out.println("당신의 나이는 " + age2 + " 이고 이름은 "+name3 + " 입니다.");
		
		// 숫자를 받고 문자열을 받을 경우 문자열 입력대기가 생기지 않고
		// 문장이 완성되는 경우가 있는데 그럴경우 버그가 발생한다.
		// 숫자를 받고 sc.nextline(); 을 입력해주면 문자열을 받을 때 
		// 대기상태로 들어가고 정상작동하게 된다.
		
	   
		System.out.println("이름을 입력해주세요.");
		System.out.print("이름: ");
		String name0 = sc.nextLine();
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		int age0 = sc.nextInt();
	
		System.out.println("키를 입력해주세요.");
		System.out.print("키: ");
		double hei0 = sc.nextDouble();
		
		System.out.println("당신의 이름은 " + name0 + " 나이는 " +
		age0 + " 키는 " + hei0 + " 입니다.");
		
		// 문자열은 nextline , 정수는 nextint , 실수는 nextdouble 사용
		// 어떤 내용이 담길지 생각하고 정하기
		
		
		
		
		
		
		sc.close();
		
	}

}
