package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {
	
	public static void main(String[] args) throws Exception {
		
	
		//1번 문제
		//요구사항] 태어난 년도를 입력받아 나이를 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태어난 년도: ");
		
		String input = reader.readLine();
		
		int year = Integer.parseInt(input);
		
		System.out.printf("나이: %d세", 2022-year+1);

	
	
		
		
		
	
	}

}
