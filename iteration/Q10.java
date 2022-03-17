package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q10 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 숫자를 N개 입력받아 아래와 같이 출력하시오.
		
		<조건>
		누적값이 100을 넘어가는 순간 루프를 종료하시오.
		짝수는 더하고 홀수는 빼시오.
		
		<입력>
		숫자 : 12 		
		숫자 : 28 		
		숫자 : 39 		
		숫자 : 15 		
		숫자 : 38 		
		숫자 : 24 		
		숫자 : 78 
		
		<출력>
		12 + 28 - 39 - 15 + 38 + 24 + 78 = 126
		
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


		boolean loop = true;
		int sum = 0;
		String result = "";// 출력할 문장 저장할 문자열 변수
		System.out.print("숫자 : ");
		int num = Integer.parseInt(reader.readLine());
		result += num;
		sum += num;

		while (loop) {
			System.out.print("숫자 : ");
			num = Integer.parseInt(reader.readLine());


			if (num % 2 == 0) { // 짝수이면

				sum += num;
				result += " + " + num;

			} else {

				sum -= num;
				result += " - " + num;
			}

			if (sum > 100) {
				loop = false;
			}


		}
		System.out.printf("%s = %d", result, sum);



	}

}
