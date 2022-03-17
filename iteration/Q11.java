package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q11 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 숫자를 10개 입력받아 한글로 변환 후 출력하시오.
		
		<조건>
		1~9까지만 입력하시오.
		
		<입력>
		숫자 : 5 		
		숫자 : 7 		
		숫자 : 4 		
		숫자 : 3 		
		숫자 : 5 		
		숫자 : 7 		
		숫자 : 6 		
		숫자 : 2 		
		숫자 : 1 		
		숫자 : 3 
		
		<출력>
		오칠사삼오칠육이일삼
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int count = 0;
		String result = ""; // 출력할 문장 저장할 문자열 변수
		String numKor = ""; // 숫자를 한글로 변환한 변수
		while (count < 10) {

			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			count++;

			numKor = convert(num);
			result += numKor;

		}

		System.out.printf("%s", result);



	}

	public static String convert(int num) {
		switch (num) {
			case 1:
				return "일";
			case 2:
				return "이";
			case 3:
				return "삼";
			case 4:
				return "사";
			case 5:
				return "오";
			case 6:
				return "육";
			case 7:
				return "칠";
			case 8:
				return "팔";
			case 9:
				return "구";

		}

		return "";
	}


}
