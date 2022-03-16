package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.
		
		<조건>
		유효성 검사를 하시오.(영문자만 입력 가능)
		
		<입력>
		문자 : a
		
		<출력>
		'a'의 대문자는 'A'입니다.
		
		<입력>
		문자 : F 
		
		<출력>
		'F'의 소문자는 'f'입니다.
		
		<입력>
		문자 : 가 
		
		<출력>
		영문자만 입력하시오.
		
		
		1. "문자 : " 출력
		2. BufferedReader 생성 > 문자 입력받기 char로
		3. if문
		  - 유효성 검사 > 영문자만 입력 가능 > 65 ~ 90 (A ~ Z) && 97 ~ 122 (a ~ z)
		  - 1) 대문자가 들어왔을 경우 소문자로 변환 > 대문자 + 32 -> if문
		  - 2) 소문자가 들어왔을 경우 대문자로 변환 > 소문자 - 32 -> else if문
		  - 3) 유효성 검사에 맞지 않은 문자가 들어왔을 때 "영문자만 입력하시오" 출력 > else문
		  
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("문자 : ");
		char alpha = reader.readLine().charAt(0);

		if (alpha >= 65 && alpha <= 90 || alpha >= 97 && alpha <= 122) {
			if (alpha >= 65 && alpha <= 90) {
				System.out.printf("'%c'의 소문자는 '%c'입니다.", alpha, alpha + 32);
			} else if (alpha >= 97 && alpha <= 122) {
				System.out.printf("'%c'의 대문자는 '%c'입니다.", alpha, alpha - 32);
			}

		} else {
			System.out.println("영문자만 입력하시오.");
		}



	}



}
