package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ppt121 - 배열의 비교 연습문제
		
		int[] leftArray = new int[] {10,20,30};
		int[] rightArray = new int[] {12,25,30};
		
		//방 갯수 비교
		if (leftArray.length == rightArray.length) { // 방 갯수가 같으면
			for (int i=0; i<leftArray.length; i++) {
				if (leftArray[i] != rightArray[i]) {
					System.out.println(i+" 번째 값이 다릅니다.");
				}
				
			}
			} else { // 방 갯수가 다르면
			
			System.out.println("두배열의 크기가 다릅니다.");
			
		}
		

		

	}

}
