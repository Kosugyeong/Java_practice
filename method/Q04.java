package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	
	public static void main(String[] args) throws Exception{
		
		/*
		
		요구사항] 숫자를 2개 입력받아 연산식을 반환하는 메소드를 선언하시오.
		
		<조건>
		String add(int, int)
		String subtract(int, int)
		String multiply(int, int)
		String divide(int, int)
		String mod(int, int)
		
		<입력>
		첫번째 숫자 : 5 
		두번째 숫자 : 3
		
		<호출>
		result = add(n1, n2); 
		System.out.println(result);
		
		result = subtract(n1, n2);
		System.out.println(result);
		
		result = multiply(n1, n2);
		System.out.println(result);
		
		result = divide(n1, n2);
		System.out.println(result);
		
		result = mod(n1, n2);
		System.out.println(result);
		
		<출력>
		5 + 3 = 8
		5 - 3 = 2
		5 * 3 = 15
		5 / 3 = 1.7
		5 % 3 = 2
		
		1. 반환값이 있는 메소드 add, multiply, divide, mod 생성하기
		2. 반환 타입은 모두 String
		3. 메소드 구현부 내용에 반환할 값인 result 선언해 result에 각 구현할 값(식) 넣고 반환하기
		5. main메소드 안에서 라벨 출력 => "첫번째 숫자 : "
		6. BufferedReader를 생성한다. > throws Exception 적는다.
		7. 숫자를 입력 받는다 > reader.readLine()
		8. "두번째 숫자 :" 출력
		9. 숫자 입력 받는다 > reader.readLine()
		10. main메소드 안에서 호출하기 ex) add(n1, n2)
		11. 출력형식에 맞게 출력하기
		*/
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : ");	
		String input = reader.readLine();
		int num = Integer.parseInt(input);
		
		System.out.print("두번째 숫자 : ");
		String input2 = reader.readLine();
		int num2 = Integer.parseInt(input2);
		
		String result = add(num,num2);
		System.out.println(result);
		
		result = substract(num,num2);
		System.out.println(result);
		
		
		result = multiply(num,num2);
		System.out.println(result);
		
		result = divide(num,num2);
		System.out.println(result);
		
		result = mod(num,num2);
		System.out.println(result);
		
	}//main
	
	
	public static String add(int num,int num2) {
		
		String result = num + " + " + num2 + " = " + (num + num2);
		
		return result;
		
	}
	
	public static String substract(int num,int num2) {
		
		String result = num + " - " + num2 + " = " + (num - num2);
		
		return result;
		
	}
	
	
	public static String multiply(int num,int num2) {
		
		String result = num + " * " + num2 + " = " + (num * num2);
		
		return result;
		
	}
	
	public static String divide(int num, int num2) {
		
		
		
		String result = num + " / " + num2 + " = " + (double)num / num2; 
		
		return result;
	}
	
	public static String mod(int num, int num2) {
		
		String result = num + " % " + num2 + " = " + (num % num2);
		
		return result;
	}
	

}
