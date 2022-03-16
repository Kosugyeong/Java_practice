package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 주차 요금을 계산하시오.
		
		<조건>
		무료 주차 : 30분
		초과 10분당 : 2,000원
		
		<입력>
		[들어온 시간]		
		시 : 13 		
		분 : 30 	
		
		[나간 시간]	
		시 : 14 	
		분 : 20 
				
		<출력>
		주차 요금은 4,000원입니다.
		
		
		1. [들어온 시간] 출력
		2. "시 :" 출력 > 숫자 입력받음
		3. "분 :" 출력 > 숫자 입력받음
		4. [나간 시간] 출력
		5. "시 :" 출력 > 숫자 입력받음
		6. "분 :" 출력 > 숫자 입력받음
		7. 입력 받은 시와 분을 분으로 환산하기. > 계산하기 쉽게
		8. 주차 시간 변수 선언 > 분으로 환산한 들어온 시간 - 나간 시간
		9. if문 
			-무료 주차인 30분보다 더 오래 주차한 경우 > 주차 요금 = (주차 시간 - 30) / 10 * 2000원
			-30분 아래로 주차한 경우 > 요금 무료. > else문으로.
		
		*/


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("[들어온 시간]");
		System.out.print("시 : ");
		int hourIn = Integer.parseInt(reader.readLine());

		System.out.print("분 : ");
		int minIn = Integer.parseInt(reader.readLine());

		System.out.println("[나간 시간]");
		System.out.print("시 : ");
		int hourOut = Integer.parseInt(reader.readLine());

		System.out.print("분 : ");
		int minOut = Integer.parseInt(reader.readLine());

		int numIn = hourIn * 60 + minIn; // 들어온 시간 분으로 환산

		int numOut = hourOut * 60 + minOut; // 나간 시간 분으로 환산

		int parkTime = numOut - numIn; // 주차 시간

		if (parkTime >= 30) {
			System.out.printf("주차 요금은 %,d원입니다.", ((parkTime - 30) / 10) * 2000);
		} else {
			System.out.println("주차 요금은 0원입니다.");
		}



	}


}
