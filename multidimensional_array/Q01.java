package com.test.java.question.multidimensional_array;

public class Q01 {
	public static void main(String[] args) {

		/*
		요구사항] 아래와 같이 출력
		
		1	2	3	4	5
		10	9	8	7	6
		11	12	13	14	15
		20	19	18	17	16
		21	22	23	24	25
		
		
		*/

		int[][] nums = new int[5][5];


		int n = 1;
		for (int i = 0; i < 5; i++) {

			if (i % 2 == 0) {

				for (int j = 0; j < 5; j++) {
					nums[i][j] = n;
					n++;
				}
			} else {
				for (int j = 4; j >= 0; j--) {
					nums[i][j] = n;
					n++;
				}
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
