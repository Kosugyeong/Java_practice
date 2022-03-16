package com.test.java.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q04 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 남녀 커플의 이름과 만난날을 입력받아 기념일을 출력하시오.
		
		<입력>
		남자 이름 : 하하하 
		여자 이름 : 호호호 	
		만난날(년) : 2022 		
		만난날(월) : 3 		
		만난날(일) : 15 
		
		<출력>
		'하하하'과(와) '호호호'의 기념일
		100일 : 2022-06-23
		200일 : 2022-10-01
		300일 : 2023-01-09
		500일 : 2023-07-28
		1000일 : 2024-12-09
		
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("남자 이름 : ");
		String boy = reader.readLine();

		System.out.print("여자 이름 : ");
		String girl = reader.readLine();

		System.out.print("만난날(년) : ");
		int year = Integer.parseInt(reader.readLine());

		System.out.print("만난날(월) : ");
		int month = Integer.parseInt(reader.readLine()) - 1;

		System.out.print("만난날(일) : ");
		int days = Integer.parseInt(reader.readLine());


		Calendar anniversary = Calendar.getInstance();

		anniversary.set(year, month, days);
		anniversary.add(Calendar.DATE, 100);
		System.out.printf("'%s'과(와) '%s'의 기념일\n", boy, girl);
		System.out.printf("100일 : %tF\n", anniversary);

		anniversary.add(Calendar.DATE, 100);
		System.out.printf("200일 : %tF\n", anniversary);

		anniversary.add(Calendar.DATE, 100);
		System.out.printf("300일 : %tF\n", anniversary);

		anniversary.add(Calendar.DATE, 200);
		System.out.printf("500일 : %tF\n", anniversary);

		anniversary.add(Calendar.DATE, 500);
		System.out.printf("1000일 : %tF", anniversary);



	}// main



}
