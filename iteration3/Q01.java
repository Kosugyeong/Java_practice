package com.test.java.question.iteration3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 아래와 같이 출력하시오.
		
		<조건>
		행의 갯수를 입력받으시오.
		
		<입력>
		행: 5
		
		<출력>
		*****
		 ****
		  ***
		   **
		    *
				
		
		
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int row = Integer.parseInt(reader.readLine());

		for (int i = 0; i < row; i++) { // 행 > 5번 실행
			for (int j = 0; j < i; j++) { // 0번~4번 실행
				System.out.print(" ");

			}
			for (int j = 0; j < row - i; j++) { // 5번~1번 실행
				System.out.print("*");
			}
			System.out.println();
		}



	}



}
