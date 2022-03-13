package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {

	public static void main(String[] args) throws Exception {
		//6번문제
		//요구사항] 사용자의 한달 수입을 입력받아 세후 금액을 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("한달 수입 금액(원): ");
		String input = reader.readLine();
		
		int num = Integer.parseInt(input);
		
		System.out.printf("세후 금액(원): %,d원\n", (int)(num-num*0.033));
		System.out.printf("세금(원): %,d원 ", (int)(num*0.033));

	}

}
