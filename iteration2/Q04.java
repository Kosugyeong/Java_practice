package com.test.java.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 최대 9자리 정수를 입력받아 각자리의 홀수 숫자합과 짝수 숫자합을 구하시오.
		
		<조건>
		9자리 이하 숫자만 입력하시오.
		Math.pow() 메소드 사용(제곱값 구하는 메소드)
			-Math.pow(10, 2) → 100
			-Math.pow(10, 3) → 1000
			-Math.pow(10, 4) → 10000
				
		<입력>
		숫자 입력 : 273645281 
		
		<출력>
		짝수의 합 : 22
		홀수의 합 : 16
		
		
		*/



		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int num = Integer.parseInt(reader.readLine());
		
		int count = 0;
		int evenSum = 0;// 짝수 숫자합
		int oddSum = 0;// 홀수 숫자합


		while (count <= 9) { // 9자리 이하 숫자이므로
			count++;
			int placeValue = num / (int) Math.pow(10, count - 1) % 10;

			if (placeValue % 2 == 0) {
				evenSum += placeValue;

			} else {
				oddSum += placeValue;
			}

		}

		System.out.println("짝수의 합 : " + evenSum);
		System.out.println("홀수의 합 : " + oddSum);



	}


}
