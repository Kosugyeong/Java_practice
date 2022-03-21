package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q07 {
	public static void main(String[] args) throws Exception {
		/*
		
		***이 문제 좀 중요하다구 함.
		요구사항] 배열에 요소를 삽입하시오. 
		
		<조건>
		배열 길이: 10
		마지막 요소는 우측으로 옮겨질 공간이 없으면 삭제된다.
		
		<입력>
		삽입 위치 : 2 		
		값 : 100 
		
		<출력>
		원본 : [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
		결과 : [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]
		
		<입력>
		삽입 위치 : 5		
		값 : 100 
		
		<출력>
		원본 : [5, 6, 1, 3, 2, 8, 7, 4, 10, 9]
		결과 : [5, 6, 1, 3, 2, 100, 8, 7, 4, 10]
		
		
		배열 하나 더 만들어서 복사하기.
		
		1. 배열 길이가 10인 배열에 초기값 넣어서 생성해주기
		2. 삽입 위치와 값 입력 받아 int변수에 저장
		3. 배열 길이 10인 새로운 배열 생성
		4. for문(배열 길이만큼 돌리기)
			- if문 > 	1. 삽입 위치 이전 값들은 모두 새로 만든 배열에 복사하기
					 	2. 삽입 위치에 새로운 배열에는 삽입하는 값 넣기
					 	3. 삽입 위치 다음 배열들에는 원래 배열의 -1의 위치에 있던 값들 차례로 넣기.
		
		
		*/

		int[] arr = {5, 6, 1, 3, 2, 8, 7, 4, 10, 9};

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("삽입 위치 : ");
		int addPlace = Integer.parseInt(reader.readLine());
		System.out.print("값 : ");
		int addNum = Integer.parseInt(reader.readLine());

		


		int[] newArr = new int[10];


		for (int i = 0; i < arr.length; i++) {

			if (i < addPlace) { //삽입 위치 이전 값들은 모두 새로 만든 배열에 복사하기
				
				newArr[i] = arr[i];
				
			} else if (i == addPlace) { //삽입 위치에 새로운 배열에는 삽입하는 값 넣기
				
				newArr[i] = addNum;
				
			} else if (i > addPlace) { //삽입 위치 다음 배열들에는 원래 배열의 -1의 위치에 있던 값들 차례로 넣기.
				
				newArr[i] = arr[i - 1];
			}



		}

		System.out.println("원본 : " + Arrays.toString(arr));
		System.out.println("결과 : " + Arrays.toString(newArr));

	}

}

// 풀이받은 코드 이 코드 이해하고 이렇게 적용하려고 하기. > Right Shift

//int [] nums = {5, 6, 1, 3, 2, 0, 0, 0, 0, 10};
//int index = 2;
//int value = 100;
//
//System.out.println(Arrays.toString(nums));
//
//// Right Shift > for 감소
//for(int i=nums.length-2;i>=index;i--) {
//	nums[i+1] = nums[i]; //이동
//}
//nums[index]=value;
//System.out.println(Arrays.toString(nums));
