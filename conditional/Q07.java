package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.
		
		
		<입력>
		숫자 입력 : 3 		
		숫자 입력 : 2 		
		숫자 입력 : 7 		
		숫자 입력 : 1 		
		숫자 입력 : 8 
		
		<출력>
		짝수는 2개 홀수는 3개 입력했습니다.
		홀수가 짝수보다 1개 더 많습니다.
		
		
		1. "숫자 입력 : "출력
		2. BufferedReader 생성
		3. 정수 입력 후 바로 int로 변환 > Integer.parseInt(reader.readLine())
		4. 위 과정 4번 추가
		5. if문
			- 숫자 % 2 == 0 > 짝수. 
			- 각 숫자가 짝수일 때는 짝수 개수 ++ 
			- else > 홀수일 때는 홀수 개수 ++
		6. 짝수는 2개 홀수는 3개 입력했습니다. 와 같은 출력문 출력
		7. if문
			- 짝수 개수>홀수 개수 인 경우에는 짝수가 홀수보다 1개 더 많습니다 와 같은 출력문 출력
			- else > 그와 반대일 경우 홀수가 짝수보다 1개 더 많습니다 와 같은 출력문 출력
			
		
		
		***반복되는 부분 > 메소드로 해결하기 ,,,, 
		
		
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자 입력 : ");
		int numOne = Integer.parseInt(reader.readLine());

		System.out.print("숫자 입력 : ");
		int numTwo = Integer.parseInt(reader.readLine());

		System.out.print("숫자 입력 : ");
		int numThree = Integer.parseInt(reader.readLine());

		System.out.print("숫자 입력 : ");
		int numFour = Integer.parseInt(reader.readLine());

		System.out.print("숫자 입력 : ");
		int numFive = Integer.parseInt(reader.readLine());

		int evenNum = 0;	// 짝수
		//int oddNum = 0; 	//홀수


//		if (numOne % 2 == 0) {
//			++evenNum;
//		} else {
//			++oddNum;
//		}
//
//		if (numTwo % 2 == 0) {
//			++evenNum;
//		} else {
//			++oddNum;
//		}
//
//		if (numThree % 2 == 0) {
//			++evenNum;
//		} else {
//			++oddNum;
//		}
//
//		if (numFour % 2 == 0) {
//			++evenNum;
//		} else {
//			++oddNum;
//		}
//
//		if (numFive % 2 == 0) {
//			++evenNum;
//		} else {
//			++oddNum;
//		}
		
		
		evenNum = check(numOne,evenNum);
		evenNum = check(numTwo,evenNum);
		evenNum = check(numThree,evenNum);
		evenNum = check(numFour,evenNum);
		evenNum = check(numFive,evenNum);
		
		int oddNum = 5 - evenNum;



		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", evenNum, oddNum);

		if (evenNum > oddNum) {
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", evenNum - oddNum);
		} else {
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", oddNum - evenNum);
		}

	}
	
	public static int check(int num, int evenNum) {
		
		
		if (num % 2 == 0) {
			evenNum+=1;
		} 
		
		return evenNum;
	}


}
