package com.test.java.question.datetime;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Q06 {
	public static void main(String[] args) throws Exception{
		/*
		요구사항] 여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다. 고객이 각각의 매장에 몇시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.
		
		<조건>
		전화를 걸면 짜장면은 10분 뒤에 도착합니다.
		전화를 걸면 치킨은 18분 뒤 도착합니다.
		전화를 걸면 피자는 25분 뒤 도착합니다.
		음식을 받기 원하는 시간은 오후 11시 이전에만 가능합니다.(날짜 변경 금지)
		
		<입력>
		음식을 받기 원하는 시각
		시 : 13 		
		분 : 23 
		
		<출력>
		짜장면 : 13시 13분
		치킨 : 13시 5분
		피자 : 12시 58분
		
		
		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		int hour = Integer.parseInt(reader.readLine());
		
		System.out.print("분 : ");
		int min = Integer.parseInt(reader.readLine());
		
		//짜장면
		int minJja = min - 13 < 0 ? 60 + (min - 10) : min - 10;
		int hourJja =  (min - 13) < 0 ? hour - 1 : hour;
		
		System.out.printf("짜장면 : %d시 %d분\n",hourJja, minJja);
		
		//치킨
		int minChiken = min - 18 < 0 ? 60 + (min - 18) : min - 18;
		int hourChiken =  (min - 18) < 0 ? hour - 1 : hour;
		
		System.out.printf("치킨 : %d시 %d분\n",hourChiken, minChiken);
		
		//피자
		int minPizza = min - 25 < 0 ? 60 + (min - 25) : min - 25;
		int hourPizza = (min - 25) < 0 ? hour - 1 : hour;
		
		System.out.printf("피자 : %d시 %d분",hourPizza, minPizza);
		
	}
	

}
