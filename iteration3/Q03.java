package com.test.java.question.iteration3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {
	public static void main(String[] args) throws Exception {
		/*
		<조건>
		행의 갯수를 입력받으시오.
		
		<입력>
		행: 5
		
		<출력>
		    *
		   ***
		  *****
		 *******
		*********
				
		
		*/


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("행: ");
		int row = Integer.parseInt(reader.readLine());

		for (int i = 0; i < row; i++) {// 행
			for (int j = row - i; j > 0; j--) { // 4~0번 실행
				System.out.print(" ");
			}
			for (int j = 1; j <= 2 * i + 1; j++) { // 1번, 3번, 5번 ... 2n+1 실행
				System.out.print("*");
			}

			System.out.println();
		}



	}


}


