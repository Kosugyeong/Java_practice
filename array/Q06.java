package com.test.java.question.array;

import java.util.Arrays;

public class Q06 {
	public static void main(String[] args) {
		/*
		요구사항] 중복되지 않는 임의의 숫자 6개를 만드시오.(로또)
		
		<조건>
		숫자의 범위 : 1 ~ 45
		오름차순 정렬
				
		<출력>
		[1, 5, 23, 36, 37, 41]
		
		
		1. 6칸 배열 생성
		2. for문
			- 1~45 사이의 랜덤 숫자를 배열에 순서대로 저장한다.
			- for문(겉에 for문 돈 만큼)
				- i번째 배열까지 들어간 값들중에 같은 값이 있으면 겉 for문 -1해서 다시 도는거 계속 반복하게 함. 다른 값 나올때까지.
		3. Array.toStirng으로 배열 dump 출력
		
		*/


		int[] arr = new int[6];

		for (int i = 0; i < arr.length; i++) {

			arr[i] = (int) (Math.random() * 45) + 1;
			for (int j = 0; j < i; j++) {
				// 중복제거 > 중복이 발생하면 중복이 발생된 i 값을 - 시켜서 다시 랜덤값 생성
				if (arr[j] == arr[i]) {
					i--;
				}
			}

		}

		
		for (int i = 0; i < arr.length - 1; i++) { //오름차순 정렬(버블 정렬)

			for (int j = 0; j < arr.length - i - 1; j++) {


				if (arr[j] > arr[j + 1]) {

					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(arr));



	}

}
