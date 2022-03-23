package com.test.java.question.multidimensional_array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 성적을 입력받아 아래와 같이 출력하시오.
		
		<조건>
		String[][] score = new String[10][3];
		
		<입력>
		국어 점수 : 80 		
		영어 점수 : 50 		
		수학 점수 : 70 
		
		<출력>
				 	 	 
		 	 	 
		■		
		■		■
		■		■
		■	■	■
		■	■	■
		■	■	■
		■	■	■
		■	■	■
		국어	영어	수학
		
		******** 빈 공간을 빈 문자로 채우는거 제대로 해결하기
		
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("국어 점수 : ");
		int korean = Integer.parseInt(reader.readLine());

		System.out.print("영어 점수 : ");
		int english = Integer.parseInt(reader.readLine());

		System.out.print("수학 점수 : ");
		int math = Integer.parseInt(reader.readLine());

		String[][] score = new String[10][3];
		

		int n = 1;
		
		int koreanNum = korean / 10;
		int englishNum = english / 10;
		int mathNum = math / 10;
		
		
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				score[i][j]=""; //모두 빈문자로 먼저 초기화 > 이게 맞는지 모르겠다,,
				
				if(j==0) {
					
					for(int k =10-koreanNum;k<=i;k++) {
						score[k][j] = "■";
					}
				}
				
				if(j==1) {
					for(int k =10-englishNum;k<=i;k++) {
						score[k][j] = "■";
					}
				}
				if(j==2) {
					for(int k =10-mathNum;k<=i;k++) {
						score[k][j] = "■";
					}
				}
			}
		}
				
				
		


		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%5s", score[i][j]);

			}
			System.out.println();


		}
		
		System.out.println("---------------------");
		System.out.println("   국어  영어  수학");

	}

}
