package com.test.java.question.iteration;

public class Q08 {
	public static void main(String[] args) {
		/*
		요구사항] 서기 1년 1월 1일부터 오늘까지 며칠째인지 합을 구하시오.
		
		<조건>
		Calendar 클래스 사용 금지
		
		<출력>
		2022년 3월 16일은 738,230일째 되는 날이고 수요일입니다.
		
		
		
		
		
		
		*/

		int year = 2022;
		int month = 3;
		int day = 17;
		String dayKor = "";



		int convertDateToDay = convertDateToDay(year, month, day);

		System.out.printf("%d년 %d월 %d일은 %,d째 되는 날이고 %s요일입니다.", year, month, day, convertDateToDay,
				getDay(convertDateToDay));



	}// main

	public static boolean isLeapYear(int year) { // 윤년 검사 메소드
		return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
	}

	public static int endOfMonth(int year, int month) { // 각 달의 마지막 일 반환하는 메소드



		switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31; // break 역할 겸함
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				return isLeapYear(year) ? 29 : 28;
		}

		return 0;


	}

	public static String getDay(int day) {

		if (day % 7 == 1) {
			return "월";
		} else if (day % 7 == 2) {
			return "화";
		} else if (day % 7 == 3) {
			return "수";
		} else if (day % 7 == 4) {
			return "목";
		} else if (day % 7 == 5) {
			return "금";
		} else if (day % 7 == 6) {
			return "토";
		} else {
			return "일";
		}

		// return X

		// return ""; //return null;

	}

	public static int convertDateToDay(int year, int month, int day) {

		int total = 0;

		// 1년 1월 1일 ~ 2021년 12월 31일
		for (int i = 1; i < year; i++) {
			total += 365;

			// 현재 i년이 윤년인지 검사!
			if (isLeapYear(i)) {
				total++;


			}

		}

		// 2022년 1월 1일 ~ 2022년 2월 28일
		for (int i = 1; i < month; i++) {

			total += endOfMonth(year, i);
		}

		// 2022년 3월 1일 ~ 2022년 3월 17일
		total += day;

		return total;


	}



}
