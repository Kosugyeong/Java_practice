package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q01 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 숫자를 5개 입력받아 배열에 담은 뒤 역순으로 출력하시오.
		
		<조건>
		int[] nums = new int[5];
		
		<입력>
		숫자 : 5 	
		숫자 : 1 		
		숫자 : 7 		
		숫자 : 2 		
		숫자 : 3 
		
		<출력>
		nums[4] = 3
		nums[3] = 2
		nums[2] = 7
		nums[1] = 1
		nums[0] = 5
				
		*/


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int nums[] = new int[5];

		for (int i = 0; i < 5; i++) {

			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			nums[i] = num;
		}

		for (int i = 4; i >= 0; i--) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);

		}



	}


}
