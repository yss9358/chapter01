package com.javaex.ex02;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 12345;
		double d = 3.14;
		char c = '한';
		String s = "한";
		String Str = "안녕하세요";
		String name = "유승수";
		String hello = "굿모닝";
		
		
		// 변수들은 중간에 적지말고 위쪽에 몰아서 작성해 두는 것이 좋다.
		
		System.out.println(i);
		System.out.println(12345);
		
		
		System.out.println(Str);
		System.out.println("안녕하세요");
		// println 은 커서가 줄바꿈되어 이후 출력이 다음줄로 이어진다.
		
		System.out.print(name);
		System.out.println(Str);
		// print 는 커서가 줄바꿈 되지 않아, 출력이 옆으로 이어진다.
		
		System.out.println("-----------");
		System.out.print("안녕");
		System.out.println("하세요");
		
		System.out.println("-----------");
		
		System.out.println(hello + hello);
		System.out.println("굿모닝" + "굿모닝");
		
		// 문자끼리도 더해서 작성할 수 있다. 
		
		System.out.println(name + hello);
		System.out.println(name + " " + hello);
		System.out.println(name+"님 "+hello);
		
		
		// 공백도 글자취급 , 띄어쓰기가 필요할 경우 공백을 + 해서 작성할 수 있다.
		// 글+띄어쓰기를 할 경우 공백을 글자뒤에 포함시켜 띄어쓰기를 할 수 있다.
		
		System.out.println("제 이름은 " + name + " 입니다.");
		
		// 숫자는 그냥 사칙연산이 된다.
		System.out.println(i+i);
		System.out.println(d+d);
		System.out.println(i+d);
		// 실수 + 정수 는 정수가 실수형으로 변경되어 계산됨
		
		System.out.println(c+c);
		// char 형은 + 를 할 경우 숫자로 취급되어 숫자+숫자 계산이 되어버림
		// char 변수를 한글자로 했는데 이어서 작성하고 싶으면 String 으로
		// 변경하여 + 하는게 낫다..
		
		System.out.println(s+s);
		
		System.out.println(name+i);
		// 문자열 + 숫자 를 하게되면 문자+숫자를 이어붙여서 출력된다.
		System.out.println(name+i+d);
		// 문자+숫자+숫자 를 해도 전부 이어붙여서 출력된다.
		// 문자가 빠지면 숫자+숫자 사칙연산이 진행된다.
		System.out.println(i+d);
		
		
		System.out.println("안녕\"하\"세요");
		// 안녕"하"세요 << 문자열 중간에 쌍따옴표가 들어가야할 때는 
		// 그냥 "를 적지않고 \" 를 사용한다 . \" 는 한 세트처럼 사용
		// ex) "안녕\"하\"세요"
		
		System.out.println("안녕\\하\\세요");
		// 안녕\하\세요를 작성할 경우 \ 앞에 \를 하나 더 붙여서 \\로 사용한다.
		
		
		System.out.println("안녕\n하세요");
		// 문자열을 사용하다가 줄바꿈을 넣고 싶을 경우 줄바꿈 하려는 위치에서
		// \n 을 붙여준다
		// 그냥 println 을 두번써도 상관없음.
		
		
		System.out.println("안녕\t하세요");
		// 문자열 사용중 일정 구간을 띄워서 사용하려면 \t 를 붙여주면 된다.
		
		
		
		
		
		
		

	}

}
