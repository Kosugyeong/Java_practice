package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 아래와 같이 출력하시오.
		
		<입력>
		시작 숫자 : 1 		
		종료 숫자 : 10 
		
		<출력>
		1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5
		
		<입력>
		시작 숫자 : 3 		
		종료 숫자 : 5 
				
		<출력>
		3 - 4 + 5 = 4
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자 : ");
		int numStart = Integer.parseInt(reader.readLine());

		System.out.print("종료 숫자 : ");
		int numEnd = Integer.parseInt(reader.readLine());

		int sum = 0;
		for (int i = numStart; i <= numEnd; i++) {



			if (i == numStart) {
				sum += i;
				System.out.printf("%d", numStart);
			} else {

				if (i % 2 != 0) { // i가 홀수번째일 떄,
					sum += i;
					System.out.printf(" + %d", i);

					if (i == numEnd) {
						System.out.printf(" = %d", sum);
					}
				} else {// i가 짝수번째일 때,
					sum -= i;
					System.out.printf(" - %d", i);

					if (i == numEnd) {
						System.out.printf(" = %d", sum);
					}

				}

			}



		}


	}

}
