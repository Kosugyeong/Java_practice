package com.test.java.question.iteration3;

public class Q12 {
	public static void main(String[] args) {
		/*
		요구사항] 아래와 같이 출력
		
		<조건>
		마지막 숫자가 100이 넘기 전까지 출력하시오.
		
		<출력>
		1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 = 232 
		
		
		-피보나치 수열..
		
		
		
		
		*/

		int numOne = 1;
		int numTwo = 1;
		int numThree, temp = 0;
		int sum = 0;
		String result = numOne + " + " + numTwo + " + ";



		for (int i = 1;; i++) {



			numThree = numOne + numTwo;

			temp = numThree;

			if ((numOne > 100) || (numTwo > 100) || (numThree > 100)) {
				break;
			}

			if (i == 1) {
				sum += (temp + numThree);
			} else {
				sum += temp;
			}

			result += numThree + " + ";

			numOne = numTwo;
			numTwo = temp;



		}

		System.out.printf("%s\b\b = %d", result, sum);


	}// main



}
