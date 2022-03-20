package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q09 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 배열의 요소를 순차적으로 2개씩 더한 결과를 배열로 생성한 뒤 출력하시오.
		
		<조건>
		원본 배열 길이: 사용자 입력
		원본 배열 요소: 난수(1~9)
		결과 배열 길이: 사용자 입력 / 2
				
		<입력>
		배열 길이: 10 
		
		<출력>
		원본 : [ 1, 5, 3, 6, 2, 7, 8, 2, 2, 9 ]
		결과 : [ 6, 9, 9, 10, 11 ]
		
		<입력>
		배열 길이: 4 
		
		<출력>
		원본 : [ 5, 3, 9, 1 ]
		결과 : [ 8, 10 ]
		
		<입력>
		배열 길이: 5 
		
		<출력>
		원본 : [ 1, 5, 3, 2, 7 ]
		결과 : [ 6, 5, 7 ]
		
		
		1. 배열 길이 입력받기
		2. 입력 받은 배열의 길이에 해당하는 원본 배열 생성
		3. 1~9의 랜덤하는 숫자들 Math.random 함수로 생성해 원본 배열에 순차적으로 입력
		4. 결과배열 길이를 원본 배열 길이 / 2 해서 변수에 넣기 > 5/2면 반올림해서 3으로 저장되게 처리하기 > Math.round로
		5. 결과배열 생성하기
		6. for문 > 결과배열 길이만큼 실행
			- 원본 배열 길이 홀수일 때 > 결과 배열의 마지막 요소에는 원본 배열 마지막 요소 그대로 복사하기
								  > 마지막 요소를 제외한 다른 요소들은 원본 배열 요소를 순차적으로 2개씩 더하여 복사하기
			- 원본 배열 길이 짝수일 때 > 조건 따질것 없이 그대로 원본 배열 요소 순차적으로 2개씩 더하여 복사하기
		7. Arrays.ToString으로 덤프 출력
		
		
		*/


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("배열 길이: ");
		int arrLength = Integer.parseInt(reader.readLine());

		int[] arr = new int[arrLength];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 9) + 1; // 1~9난수

		}
		

		double length = (double) arrLength / 2;
		int resultLength = (int) Math.round(length); // 결과배열 길이

		int[] resultArr = new int[resultLength];



		for (int i = 0; i < resultArr.length; i++) {


			if (arrLength % 2 != 0) { // 원본 배열의 길이가 홀수일 때

				if (i == resultLength - 1) { // 결과 배열의 마지막 요소에는 원본 배열 마지막 요소 그대로 복사하기
					
					resultArr[i] = arr[2 * i];
					
				} else { // 마지막 요소를 제외한 다른 요소들은 원본 배열 요소를 순차적으로 2개씩 더하여 복사하기
					
					resultArr[i] = arr[2 * i] + arr[2 * i + 1];
				}

			} else { // 원본 배열의 길이가 짝수일 때는 조건 따질것 없이 그대로 원본 배열 요소 순차적으로 2개씩 더하여 복사하기
				
				resultArr[i] = arr[2 * i] + arr[2 * i + 1];
			}



		}


		System.out.println("원본 : " + Arrays.toString(arr));
		System.out.println("결과 : " + Arrays.toString(resultArr));

	}

}
