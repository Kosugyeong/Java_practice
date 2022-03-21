package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q08 {
	public static void main(String[] args) throws Exception {
		/*
		
		**중요한 문제
		요구사항] 배열의 요소를 삭제하시오.
		
		<조건>
		배열 길이: 10
		마지막 요소는 0으로 채우시오.
		
		<입력>
		삭제 위치 : 2 
		
		<출력>
		원본 : [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
		결과 : [5, 6, 3, 2, 0, 0, 0, 0, 0, 0]
				
		<입력>
		삽입 위치 : 5 
		
		<출력>
		원본 : [5, 6, 1, 3, 2, 8, 7, 4, 10, 9]
		결과 : [5, 6, 1, 3, 2, 7, 4, 10, 9, 0]
		
		1. 배열 길이가 10인 배열에 초기값 넣어서 생성해주기
		2. 삽입 위치와 값 입력 받아 int변수에 저장
		3. 배열 길이 10인 새로운 배열 생성
		4. for문(배열 길이만큼 돌리기)
			- if문 > 	1. 삭제 위치 이전 값들은 모두 새로 만든 배열에 복사하기
					 	2. 삭제 위치부터는 원래 배열의 +1에 있던 값들을 새로운 배열에 복사하기
					 	3. 마지막 요소에서는 0 넣기 
		
		
		
		
		*/

		int[] arr = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("삭제 위치 : ");
		int deletePlace = Integer.parseInt(reader.readLine());

		

		int[] newArr = new int[10];

		for (int i = 0; i < arr.length; i++) {

			if (i < deletePlace) { //삭제 위치 이전 값들은 모두 새로 만든 배열에 복사하기
				
				newArr[i] = arr[i];
				
			} else if (i - 1 >= deletePlace) { //삭제 위치부터는 원래 배열의 +1에 있던 값들을 새로운 배열에 복사하기
				
				newArr[i - 1] = arr[i];
				
			} else if (i == arr.length) { //마지막 요소에서는 0 넣기 
				
				newArr[i] = 0;
			}

		}

		System.out.println("원본 : " + Arrays.toString(arr));
		System.out.println("결과 : " + Arrays.toString(newArr));

	}

}

//풀이받은 코드 이 코드 이해하고 이렇게 적용하려고 하기. > Left Shift

//int [] nums = {5, 6, 1, 3, 2, 0, 0, 0, 0, 10};
//int index = 2; //삭제 위치
//
//
//System.out.println(Arrays.toString(nums));
//
////Left Shift, 좌측 시프트 > for 증가
//for(int i=index;i<nums.length-1;i++) {
//	
//	nums[i]=nums[i+1]; //한칸씩 왼쪽으로 이동
//	
//}
//nums[nums.length-1]=0;
//
//System.out.println(Arrays.toString(nums));