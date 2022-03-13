package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q07 {
	
	public static void main(String[] args) throws Exception{
		
		/*
		
		요구사항] 지하철 탑승 소요 시간을 구하시오. 지나가는 역의 개수, 환승역의 횟수, 시간대를 전달 받아 총 걸리는 시간을 반환하는 메소드를 선언하시오.
		
		<조건>
		-int getTime(int station, int change, int time)
		-각 역간 소요 시간 : 2분 소요
		-환승 소요 시간 : N분 소요
		-시간대에 따라 환승 소요 시간이 다르다.
		-평상시: 3분
		-출근시: 4분
		-퇴근시: 5분
		
		<입력>
		역의 개수 : 15 
		환승역의 횟수 : 1 		
		시간대(1.평상시, 2.출근시, 3.퇴근시): 1
		
		<출력>
		총 소요 시간은 33분입니다.
		
		
		1. "역의 개수 : " 출력하기
		2. BufferedReader() 생성 > throws Exception 적기
		3. 역의 개수 숫자 입력받기 > reader.readLine() > 정수로 변환하기 > Integer.parseInt()
		4. "환승역의 횟수: " 출력 후 숫자 입력받기
		5. "시간대(1.평상시, 2.출근시, 3.퇴근시): " 출력 후 숫자 입력받기
		6. int getTime(int station, int change, int time) 메소드 생성
		7. 시간대 숫자 입력 받아 환승 소요 시간 받는 거는 삼항 연산자로 처리 ctime = time == 1 ? 3 : time == 2 ? 4 : time == 3 ? 5
		8. result = station*2 + change*ctime	
		9. result 값 main에서 호출해서 총 소요시간 출력
		*/
		
		System.out.print("역의 개수 : ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input = reader.readLine();
		int station = Integer.parseInt(input);
		
		System.out.print("환승역의 횟수 : ");
		String input2 = reader.readLine();
		int change = Integer.parseInt(input2);
		
		System.out.print("시간대(1.평상시, 2.출근시, 3.퇴근시): ");
		String input3 = reader.readLine();
		int time = Integer.parseInt(input3);
		
		int result = getTime(station, change, time);
		System.out.printf("총 소요 시간은 %d분입니다.", result);
		

		
	}//main
	
	public static int getTime(int station, int change, int time) {
		
		int ctime = time == 1 ? 3 : time == 2 ? 4 : time == 3 ? 5 : null;	// 환승 소요 시간 예외처리를 할 수 없어서 1,2,3이 아닌 값이 들어오면 																			null값이 받아져 에러가 뜨게 처리하였다. 
		int result = station * 2 + change * ctime;
		return result;
		
	}
	
	

}
