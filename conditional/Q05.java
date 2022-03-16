package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
	public static void main(String[] args) throws Exception{
		/*
		
		요구사항] 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.
		
		<조건>
		정수만 입력하시오.(유효성 검사 필요없음)
		나머지 연산 결과는 소수이하 첫째자리까지 출력 하시오.
		연산자는 산술 연산자(+, -, *, /, %)만 입력하시오.
		
		<입력>
		첫번째 숫자 : 5 
		두번째 숫자 : 3 
		연산자 : * 
		
		<출력>
		5 * 3 = 15
		
		<입력>
		첫번째 숫자 : 3 		
		두번째 숫자 : 2 	
		연산자 : >=
		
		<출력>
		연산이 불가능합니다.
							
		1. "첫번째 숫자 : " 출력
		2. BufferedReader 생성 후 숫자 입력받고 int로 바로 변환하기
		3. "두번째 숫자 : " 출력
		4. 숫자 입력받고 int로 바로 변환하기 
		5. "연산자 : " 출력
		6. 연산자 입력받기 String으로
		7. 연산자 유효성 검사 > 문자열 비교는 equals()로.
		8. if문 안에 각 if문들은 조건에 맞게 출력문 생성
		9. 7의 조건의 맞지 않으면 "연산이 불가능합니다." 출력하도록 else문 생성 
		
		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		int numOne = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자 : ");
		int numTwo = Integer.parseInt(reader.readLine());
		
		System.out.print("연산자 : ");
		String operator = reader.readLine();
		
		if(operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/") || operator.equals("%")) {
			if(operator.equals("+")) {
				System.out.printf("%d + %d = %d", numOne, numTwo, numOne + numTwo);
			}else if(operator.equals("-")) {
				System.out.printf("%d - %d = %d", numOne, numTwo, numOne - numTwo);
			}else if(operator.equals("*")) {
				System.out.printf("%d * %d = %d", numOne, numTwo, numOne * numTwo);
			}else if(operator.equals("/")) {
				System.out.printf("%d / %d = %.1f", numOne, numTwo, (double)numOne / numTwo);
			}else if(operator.equals("%")) {
				System.out.printf("%d %% %d = %df", numOne, numTwo, numOne % numTwo);
			}
		}else {
			System.out.println("연산이 불가능합니다.");
		}

		
		
		
		
	}//main

}
