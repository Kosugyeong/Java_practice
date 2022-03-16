package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q10 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.
		
		<조건>
		입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
		입력받은 날짜가 일요일이면 아무것도 안한다.
		
		<입력>
		년 : 2022 		
		월 : 3 		
		일 : 14
		
		<출력>
		입력하신 날짜는 '평일'입니다.
		해당 주의 토요일로 이동합니다.
		이동한 날짜는 '2022-03-19' 입니다.
		
		<입력>
		년 : 2022 		
		월 : 3 		
		일 : 6 
		
		<출력>
		입력하신 날짜는 '휴일'입니다.
		결과가 없습니다.
		
		
		1. BufferedReader 생성
		2. 년, 월, 일 출력구문 출력하고 각각 숫자로 값 입력받기 > int로 바로 변환해주기 > Integer.parseInt(reader.readLine());
		3. Calendar.getInstance();로 현재 시간 저장하기
		4. set()을 이용해 입력받았던 값들로 날짜 변경해주기 ***여기서 주의할 것 ! 입력받은 월값 - 1 로 month값 저장하기
		5. get(Calendar.DAY_OF_WEEK)를 이용해 이번주에서 몇번째 요일인지 값 받아내고 새 변수에 저장하기
		6. if문
			- 5에서 만든 변수의 값이 1보다 크고 7보다 작으면 평일 구문 출력.
			- 토요일로 이동하기 위한 int 변수 생성 > 7 - 5의 변수 값
			- add()를 이용하여 토요일로 이동
			- 5에서 만든 변수의 값이 7이면 토요일 > 휴일 구문 출력 후 현재 날짜 출력
			- 5에서 만든 변수의 값이 1이면 일요일 > 휴일 구문 출력 후 결과 없음 출력
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("년 : ");
		int year = Integer.parseInt(reader.readLine());

		System.out.print("월 : ");
		int month = Integer.parseInt(reader.readLine());

		System.out.print("일 : ");
		int day = Integer.parseInt(reader.readLine());

		Calendar now = Calendar.getInstance();
		now.set(year, month - 1, day); // 자바에서 month는 0부터 세니까 month - 1 해주기

		int dayofweekNum = now.get(Calendar.DAY_OF_WEEK); // 이번주에서 몇번째 요일인지 저장

		if (dayofweekNum >= 2 && dayofweekNum <= 6) {
			System.out.println("입력하신 날짜는 '평일'입니다.\n해당 주의 토요일로 이동합니다.");
			int goSaturday = 7 - dayofweekNum;
			now.add(Calendar.DATE, goSaturday);

			System.out.printf("이동한 날짜는 '%tF'입니다.", now);

		} else if (dayofweekNum == 7) { // 토요일일 때
			System.out.println("입력하신 날짜는 '휴일'입니다.\n");
			System.out.printf("%tF", now);

		} else if (dayofweekNum == 1) {
			System.out.println("입력하신 날짜는 '휴일'입니다.\n결과가 없습니다.");
		}



	}



}
