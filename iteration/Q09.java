package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q09 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 컴퓨터가 1~10 사이의 숫자 1개를 생각하면 사용자가 맞추는 프로그램을 구현하시오.
		-> 난수 사용.
		
		<조건>
		시도 횟수가 10회가 넘어가면 프로그램을 강제로 종료하시오.
		
		<입/출력>
		컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.
		
		숫자 : 1 		
		틀렸습니다.
		
		
		숫자 : 3 		
		틀렸습니다.
		
		
		숫자 : 7 		
		틀렸습니다.
		
		
		숫자 : 2 		
		틀렸습니다.
		
		
		숫자 : 5 		
		맞았습니다.
		
		
		컴퓨터가 생각한 숫자는 5입니다.		
		정답을 맞추는데 시도한 횟수는 5회입니다.
				
		프로그램을 종료합니다.
		
		
		
		*/

		int comNum = (int) (Math.random() * 10) + 1; // 1~10 사이의 랜덤한 수
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("컴퓨터가 1~10 사이의 숫자를 1개 생각했습니다.");
		System.out.println();

		int tryNum = 0;

		for (;;) {

			System.out.print("숫자 : ");
			int userNum = Integer.parseInt(reader.readLine());

			if (comNum == userNum) {
				++tryNum;
				System.out.println("맞았습니다.\n\n");
				System.out.printf("컴퓨터가 생각한 숫자는 %d입니다.\n", comNum);
				System.out.printf("정답을 맞추는데 시도한 횟수는 %d회입니다.\n\n", tryNum);
				System.out.println("프로그램을 종료합니다.");
				break;

			} else {
				System.out.println("틀렸습니다.\n\n");
				++tryNum;
			}

			if (tryNum == 10) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}


	}

}
