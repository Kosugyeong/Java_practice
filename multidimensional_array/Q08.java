package com.test.java.question.multidimensional_array;

public class Q08 {
	public static void main(String[] args) {
		/*
				i와 j가 어떤 패턴을 가지는지 생각하기...
		i가 증가하면 j는 감소하는 규칙
		0,0=1
		
		0,1=2
		1,0=3
		
		0,2=4
		1,1=5		
		2,0=6
		
		0,3=7		
		1,2=8
		2,1=9		
		3,0=10
		
		0,4
		4,0
		
		
		1	2	4	7	11
		3	5	8	12	16
		6	9	13	17	20
		10	14	18	21	23
		15	19	22	24	25
		
		
		*/


		int[][] nums = new int[5][5];

		int n = 1;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j <= i; j++) {				
				nums[j][i-j] = n;
				n++;
			}
		}
		
		
		for (int i = 5; i < 9; i++) {
			for (int j = i-4; j <= 4; j++) {				
				nums[j][i-j] = n;
				n++;
			}
		}

		
//		int max =8;
//		for(int i=0;i<=max;i++) {
//			for(int j=0;j<5;j++) {
//				for(int k=0;k<5;k++) {
//					if(j+k==i) {
//						nums[j][k]=n;
//						n++;
//					}
//				}
//			}
//		}
		
		


		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%5d", nums[i][j]);

			}
			System.out.println();
		}

	}

}
