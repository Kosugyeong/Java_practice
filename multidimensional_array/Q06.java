package com.test.java.question.multidimensional_array;

public class Q06 {
	public static void main(String[] args) {
		/*
		
		5x5 배열임
		
		1	2	3	4	10
		5	6	7	8	26
		9	10	11	12	42
		13	14	15	16	58
		28	32	26	40	136
		
		
		****5행에 있는 값들 결과 도출이 제대로 안됨. 해결하기. 
		
		
		*/
		int[][] nums = new int[5][5];

		int n = 1;
		
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < 4; j++) {
				
				nums[i][j] =n;
				nums[i][4]+=n;
				nums[4][j]+=n;
				nums[4][4]+=n;
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
