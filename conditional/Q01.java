package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {

	public static void main(String[] args) throws Exception {
		/*
		요구사항] 숫자 2개를 입력받아 큰수와 작은수를 출력하시오.
		
		<조건>
		두 숫자가 얼마의 차이를 보이는지 출력하시오.
		
		<입력>
		첫번째 숫자 : 5 
		두번째 숫자 : 3 
		
		<출력>
		큰수는 5이고, 작은수는 3입니다. 두 숫자는 2(가)이 차이납니다.
		
		
		1. "첫번째 숫자 : " 출력 > print
		2. BufferedReader 생성 > throws Exception 적기
		3. 첫번째 숫자 입력 받기 > 한번에 Integer.parseInt로 int값으로 받기
		4. "두번째 숫자 : " 출력 > print
		5. 두번째 숫자 입력 받기 > 한번에 Integer.parseInt로 int값으로 받기
		6. if문 사용
			- 첫번째 숫자가 두번째 숫자보다 크면 출력문 출력 > if문
			- 두번째 숫자가 첫번째 숫자보다 크면 그에 해당하는 출력문 출력 > else if문
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 숫자 : ");
		int numOne = Integer.parseInt(reader.readLine());

		System.out.print("두번째 숫자 : ");
		int numTwo = Integer.parseInt(reader.readLine());

		if (numOne > numTwo) {

			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", numOne, numTwo,
					numOne - numTwo);
		} else if (numOne < numTwo) {
			System.out.printf("큰수는 %d이고, 작은수는 %d입니다. 두 숫자는 %d(가)이 차이납니다.", numTwo, numOne,
					numTwo - numOne);
		} else {
			System.out.println("두 수는 같습니다.");
		}

	}

}
