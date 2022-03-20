package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.
		
		<조건>
		난수를 20개 발생 후 배열에 넣는다.
		난수는 1 ~ 20 사이
		배열을 탐색하여 범위에 만족하는 숫자만 출력한다.
				
		<입력>
		최대 범위 : 15 		
		최소 범위 : 5 
		
		<출력>
		원본 : 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
		결과 : 10, 15, 9, 5, 11, 15, 9, 14, 5, 8
				
		*/

		int[] arr = new int[20];
		String arrTxt = "원본 : ";
		String result = "결과 : ";
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최대 범위 : ");
		int max = Integer.parseInt(reader.readLine());

		System.out.print("최소 범위 : ");
		int min = Integer.parseInt(reader.readLine());

		for (int i = 0; i < 20; i++) {

			arr[i] = (int) (Math.random() * 20) + 1;
			arrTxt += arr[i] + ", ";

			if ((arr[i] <= max) && (arr[i] >= min)) {
				result += arr[i] + ", ";
			}
		}

		System.out.printf("%s\b\b", arrTxt);
		System.out.println();
		System.out.printf("%s\b\b", result);



	}

}
