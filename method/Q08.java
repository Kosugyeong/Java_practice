package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q08 {
	
	public static void main(String[] args) throws Exception{
		
		/*
		
		요구사항] 사과 나무가 있다. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때 사과 총 몇개가 열리는지 구하는 메소드를 선언하시오.
		
		<조건>
		-int getApple(int sunny, int foggy)
		-사과 나무를 처음 심었을 때 나무의 길이: 0m
		-맑은 날 사과 나무의 성장률: 5㎝
		-흐린 날 사과 나무의 성잘률: 2㎝
		-사과 나무는 길이가 1m 넘는 시점부터 사과가 열린다.
		-1m 넘는 시점부터 10㎝ 자랄 때마다 사과가 1개씩 열린다.
		
		<입력>
		맑은 날 : 35 
		흐린 날 : 10
		
		<출력>
		사과가 총 9개 열렸습니다.
		
		
		1. "맑은 날 : " 출력 
		2. BufferedReader() 생성 > throws Exception 적기
		3. 숫자 입력받기 > reader.readLine() > 문자열 숫자로 변환 > Integer.parseInt()
		4. "흐린 날 : " 출력 > 숫자 입력받기 > reader.readLine() > 문자열 숫자로 변환 > Integer.parseInt()
		5. int getApple(int sunny, int foggy) 메소드 생성
		6. 나무의 길이 height =  sunny * 5 + foggy * 2
		7. 1m가 넘는 시점부터 사과가 열리므로 삼항연산자로 나무 길이가 1m이상일때와 1m미만일 때를 나눠서 사과 열리는 개수 도출 
		   > apple = height >= 100 ? (height - 100) / 10 : 0 
		8. apple값 main에서 호출해 출력문 출력하기
		
		*/
		
		System.out.print("맑은 날 : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		int sunny = Integer.parseInt(input);
		
		System.out.print("흐린 날 : ");
		String input2 = reader.readLine();
		int foggy = Integer.parseInt(input2);
		
		int apple = getApple(sunny, foggy);
		System.out.printf("사과가 총 %d개 열렸습니다. ", apple);

	}//main
	
	public static int getApple(int sunny, int foggy) {
		
		int height = sunny * 5 + foggy * 2;
		int apple = height >= 100 ? (height - 100) / 10 : 0; 
		return apple;
	}

}
