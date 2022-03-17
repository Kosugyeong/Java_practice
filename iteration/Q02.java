package com.test.java.question.iteration;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 시작 숫자, 종료 숫자, 증감치를 입력받아 숫자를 순차적으로 출력하시오.
		
		<입력>
		시작 숫자 : 5 		
		종료 숫자 : 12 		
		증감치 : 1 
		
		<출력>
		5
		6
		7
		8
		9
		10
		11
		12
		
		<입력>
		시작 숫자 : 10 		
		종료 숫자 : 1 		
		증감치 : -2 
		
		<출력>
		10
		8
		6
		4
		2
		
		
		1. 출력문 출력 후 > 입력 숫자들 각자 받고 > BufferedReader로
		2. if문으로 시작 숫자 종료 숫자 크기 비교해서 그 안에로 for문 돌리기.
				
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("시작 숫자 : ");
		int numStart = Integer.parseInt(reader.readLine());

		System.out.print("종료 숫자 : ");
		int numEnd = Integer.parseInt(reader.readLine());

		System.out.print("증감치 : ");
		int numAdd = Integer.parseInt(reader.readLine());
		
		if(numStart<numEnd) {

			for (int i = numStart; i <= numEnd; i += numAdd) {
				System.out.printf("%d\n",i);
	
			}
		}else {
			
			for (int i = numStart; i >= numEnd; i += numAdd) {
				System.out.printf("%d\n",i);
			}
			
		}

	}//main

}
