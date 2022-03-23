package com.test.java.question.multidimensional_array;

public class Q02 {
	public static void main(String[] args) {
		/*
		
		i도 감소, j도 감소..
		
		25	24	23	22	21
		20	19	18	17	16
		15	14	13	12	11
		10	9	8	7	6
		5	4	3	2	1
		
		
		
		
		
		
		*/


		int[][] nums = new int[5][5];


		int n = 1;
		for (int i = 4; i >= 0; i--) {
			for (int j = 4; j >= 0; j--) {
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
