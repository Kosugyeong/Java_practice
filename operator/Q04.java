package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {

	public static void main(String[] args) throws Exception{
		
		//4번 문제
		//요구사항] 섭씨 온도를 입력받아서 화씨 온도로 변환하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("섭씨 : ");
		String input = reader.readLine();
		
		double num = Double.parseDouble(input); //소수로 
		
		System.out.printf("섭씨 %.1fC는 화씨 %.1fF입니다.",num,num*1.8+32);


	}

}
