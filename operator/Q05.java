package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {

	public static void main(String[] args) throws Exception{
		
		//5번 문제
		//요구사항] 자전거가 있다. 자전거의 바퀴는 지름(직경)이 26인치이다. 사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("사용자가 페달을 밟은 횟수: ");
		String input = reader.readLine();
		
		int num = Integer.parseInt(input);
		final double PI = 3.1415;
		
		
		System.out.printf("사용자가 총 %,d회 페달을 밟아 자전거가 총 %,.3fm를 달렸습니다. ",num,(double)(0.6604*PI*num));
		//26인치 = 0.6604m


	}

}
