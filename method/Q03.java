package com.test.java.question.method;

public class Q03 {
	
	public static void main(String[] args) {
		/*
		
		요구사항] 숫자 1개를 전달하면 4자리로 출력하는 메소드를 선언하시오.
		
		<조건>
		-void digit(int num)
		입력한 숫자가 4자리 이상이면 그대로 출력한다.
		
		<호출>
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
		<출력>
		1 → 0001
		12 → 0012
		321 → 0321
		5678 → 5678
		98765 → 98765
		
		
		1. void digit(int num) 메소드 생성
		2. 입력한 숫자 4자리로 출력하는 출력문 생성. %04d
		3. main에서 digit()메소드에 각 숫자 넣어서 호출
		
		*/
		
		digit(1);
		digit(12);
		digit(321);
		digit(5678);
		digit(98765);
		
		
	}//main
	
	public static void digit(int num) {
		
		System.out.printf("%d → %04d\n",num,num); //%04d - 4자리로 출력
	}

}
