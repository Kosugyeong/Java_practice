package com.test.java.question.iteration3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws Exception {
		/*
		<조건>
		행의 갯수를 입력받으시오.
		
		<입력>
		행: 5 
		
		<출력>
		    aa
		   abba
		  abccba
		 abcddbca
		abcdeedcba
		
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("행: ");
		int row = Integer.parseInt(reader.readLine());

		for (int i = 0; i < row; i++) {// 행
			for (int j = 0; j < row - 1 - i; j++) {
				System.out.print(" ");
			}
			for (int j = 97; j < i + 98; j++) {
				System.out.print((char) j);

			}
			for (int j = 97 + i; j > 96; j--) {
				System.out.print((char) j);
			}


			System.out.println();
		}


	}



}
