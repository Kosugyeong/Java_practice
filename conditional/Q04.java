package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q04 {
	public static void main(String[] args) throws Exception{
		/*
		요구사항] 근무 년수를 입력받아 아래와 같이 출력하시오.
		
		<조건>
		1 ~ 4년차 : 초급 개발자
		5 ~ 9년차 : 중급 개발자
		10년차 이상 : 고급 개발자
		유효성 검사를 하시오.(1 미만 입력 예외 처리)
		
		<입력>
		근무 년수 : 2
		
		<출력>
		2년차 초급 개발자입니다.
		앞으로 3년 더 근무를 하면 중급 개발자가 됩니다. 	
		
		<입력>
		근무 년수 : 5 
		
		<출력>
		5년차 중급 개발자입니다.
		당신은 1년전까지 초급 개발자였습니다.
		앞으로 5년 더 근무를 하면 고급 개발자가 됩니다.
		
		<입력>
		근무 년수 : 11 
		
		<출력>
		11년차 고급 개발자입니다.
		당신은 2년전까지 중급 개발자였습니다.
		
		<입력>
		근무 년수 : -5 
		
		<출력>
		입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.
		
		
		1. "근무 년수 : " 출력
		2. BufferedReader 생성
		3. 근무 년수 숫자 입력받기 > int로 바로 변환 Integer.parseInt(reader.readLine());
		4. 유효성 검사 > if(year > = 1)
		5. 4의 if문이 true일 때 year >= 1 && year <= 4 (초급 개발자) 출력문 출력. 
		6. 중급 개발자 되기 위한 년도 계산하기 위해 mid 변수 선언
		7. else if. year >= 5 && year <= 9 (중급 개발자) 출력문 출력
		8. 고급 개발자 되기 위한 년도 계산하기 위해 advanced 변수 선언
		9. else if. year >= 10 (고급 개발자) 출력문 출력
		10. 4의 조건을 만족하지 않았을 경우 else 출력문 출력(입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.)


		
		*/
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("근무 년수 : ");
		int year = Integer.parseInt(reader.readLine());
		
		int mid = 5; //중급 개발자 커트라인
		int advanced = 10; //고급 개발자 커트라인
		
		if(year >= 1) {
			if(year >= 1 && year <= 4) {
				System.out.printf("%d년차 초급 개발자입니다.\n"
								+ "앞으로 %d년 더 근무를 하면 중급 개발자가 됩니다.", year, mid - year);
			}else if(year <= 9) {
				System.out.printf("%d년차 중급 개발자입니다.\n"
								+ "당신은 %d년전까지 초급 개발자였습니다.\n"
								+ "앞으로 %d년 더 근무를 하면 고급 개발자가 됩니다.", year, year - mid + 1, advanced - year);
			}else if(year >= 10) {
				System.out.printf("%d년차 고급 개발자입니다.\n"
								+ "당신은 %d년전까지 중급 개발자였습니다.", year, year - advanced + 1);
			}
			
		}else {
			System.out.println("입력한 값이 올바르지 않습니다. 1이상의 값을 입력하시오.");
		}

		
		

	}
	
	
	
}
