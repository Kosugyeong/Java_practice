package com.test.java.question.multidimensional_array;

public class Q04 {
	public static void main(String[] args) {
		/*
		
		별 찍기 문제 > 0인 부분은 초기화 안돼서 자동으로 0 들어간 부분
		
		
		1	2	3	4	5
		6	7	8	9	0
		10	11	12	0	0
		13	14	0	0	0
		15	0	0	0	0
		
		
		
		*/

		int[][] nums = new int[5][5];


		int n = 1;
		for (int i = 0; i < 5; i++) { //5행
			for (int j = 0; j < 5-i; j++) {//5~1번 실행
				nums[i][j] = n;
				n++;
			}
		}


		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", nums[i][j]);

			}
			System.out.println();
		}


	}

}
