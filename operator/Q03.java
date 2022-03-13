package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception {
		
		//3번 문제
		//요구사항] 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("너비(cm) : ");
		String input = reader.readLine();
		
		System.out.print("높이(cm) : ");
		String input2 = reader.readLine();
		
		int width = Integer.parseInt(input);
		int heigth = Integer.parseInt(input2);
		
		System.out.printf("사각형의 넓이는 %dcm²입니다.\n",width*heigth);
		System.out.printf("사각형의 둘레는 %dcm입니다.",width*2 + heigth*2);


	}

}
