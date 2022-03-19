package com.test.java.question.iteration3;

public class Q11 {
	public static void main(String[] args) {
		/*
		요구사항] 아래와 같이 출력
		
		<조건>
		마지막 숫자가 100이 넘기 전까지 출력하시오.
		
		<출력>
		1 + 2 + 4 + 7 + 11 + 16 + 22 + 29 + 37 + 46 + 56 + 67 + 79 + 92 = 469
		
		
		
		*/
		String result = "";
		int num = 1;
		int sum = 0;
		int plus = 1;//늘어나는 값 

		while (num < 100) {


			result += num + " + ";
			sum += num;
			num += plus;

			plus++;



		}
		System.out.printf("%s\b\b= %d", result, sum);


	}

}
