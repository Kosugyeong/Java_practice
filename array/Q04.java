package com.test.java.question.array;

public class Q04 {
	public static void main(String[] args) {
		/*
		요구사항] 1~20 사이의 난수를 담고 있는 배열을 생성하고 최대값과 최소값을 출력하시오.
		
		<조건>
		난수를 20개 발생 후 배열에 넣는다.
		난수는 1 ~ 20 사이
		
		<출력>
		원본 : 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17
		최대값 : 18
		최소값 : 3
		
		
		1. 20칸의 배열 생성
		2. 배열 안에 1~20의 난수 넣기
		3. for문
			- 배열에 담긴 값이 max보다 크면 그 값을 max에 저장
			- 배열에 담긴 값이 min보다 작으면 그 값을 min에 저장
			- 모든 배열 끝까지 확인할때까지 for문 돈다.
		
		
		*/



		int[] arr = new int[20];
		String txt = "";

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 20) + 1;
			txt += arr[i] + ", ";
		}

		int maxNum = arr[0];
		int minNum = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			} else if (arr[i] < minNum) {
				minNum = arr[i];
			}
		}

		System.out.print(txt + "\b\b");
		System.out.println();
		System.out.printf("최대값 : %d\n", maxNum);
		System.out.printf("최소값 : %d\n", minNum);


	}


}
