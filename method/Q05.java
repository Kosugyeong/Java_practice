package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
	
	public static void main(String[] args) throws Exception{
		
		/*
		요구사항] 숫자를 전달하면 '짝수' 혹은 '홀수' 라는 단어를 반환하는 메소드를 선언하시오.
		
		<조건>
		String getNumber(int)
		
		<입력>
		숫자 : 5
		
		<호출>
		result = getNumber(n); 
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n, result);
		
		<출력>
		입력하신 숫자 '5'는(은) '홀수'입니다.
		
		
		1. "숫자 : " 출력 System.out.print();
		2. BufferedReader 생성 > throws Exception 적기
		3. 숫자 입력 받기 > reader.readLine()
		4. String을 int 값으로 바꾸기 Integer.parseInt()
		5. String getNumber(int) 메소드 생성하기
		6. 삼항연산자를 이용하여 num%2==0 일 때는 짝수, num%2!=0일 때는 홀수 라는 값이 나오도록 하기
		7. return 값으로 짝수 혹은 홀수 문자열 반환값으로 나오게 하기
		8. main 메소드에서 getNumber를 호출하여 result 값 호출하기
		9. 출력 문장 입력하신 숫자 '5'는(은) '홀수'입니다. 출력하기
		
		*/
		
		System.out.print("숫자 : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String input = reader.readLine();
		int num = Integer.parseInt(input);
		
		String result = getNumber(num);
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", num, result);
		
		
		
		
		
	}//main
	
	
	public static String getNumber(int num) {
		
		String result = num % 2 == 0 ? "짝수" : "홀수" ;
		
		return result;
	}

}
