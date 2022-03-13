package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {

	public static void main(String[] args) throws Exception{
		
		
		//코드 리뷰
		//- 현업
		//1. 작성된 코드를 리뷰
		
		//코드 리뷰 형태
		//1. 상급자 > 하급자 리뷰 > 검사
		//2. 동급자 > 브레인스토밍
		//3. 상급자 + 하급자 > 브레인스토밍
		
		//코드 리뷰 목적
		//1. 자신의 코드 상태 > 명확하게 인지
		//2. 다른 사람의 코드 상태 > 견문 확장 
		
		//산출물 > 코드 리뷰 > 제출  이 코드는 ~게 하면 좋다 ~게 바꾸면 좋다. 와 같이.
								//형식은 자유. 코드에 주석달아도 되고 메모장, 그림판도 가능. 
		
		
		
		
		
		
		//7번 문제
		//요구사항] 영문 소문자를 1글자 입력받은 후 대문자로 변환해서 출력하시오.
		
		//바로 코딩 시작(x)
		//무조건 설계!!! 아래와 같이 설계 단계 적고 시작하기.
		
		//문제를 풀기 위한 프로세스
		//1. 라벨을 출력한다. > "소문자 입력: "
		//2. BufferedReader를 생성한다. > throws Exception 적는다.
		//3. 소문자를 입력받는다. > reader.readLine()
		//4. 3의 반환값(문자열)을 받아서 char형을 바꾼다. 입력값.charAt(0)
		//5. 4의 char의 문자 코드값을 얻는다. > 형변환
		//6. 5의 문자 코드값에서 -32 > 대문자의 문자 코드값
		//7. 6의 문자 코드값을 char 형변환
		//8. 콘솔에 "소문자" 'a'의 대문자는 'A'입니다." 출력한다. 
		
		
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 입력: ");
		String input = reader.readLine();
		
		char alpha = input.charAt(0);
		
		System.out.printf("소문자 '%c'의 대문자는 '%c'입니다. ", alpha, (alpha-32));


	}

}
