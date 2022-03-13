package com.test.java.question.method;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q06 {
	
	public static void main(String[] args) throws Exception{
		
		/*
		
		요구사항] 국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하시오.
		
		<조건>
		String test(int kor, int eng, int math)
		평균 점수 60점 이상은 '합격'이다.
		평균 점수 60점 미만은 '불합격'이다.
		과락: 한 과목 이상 40점 미만이면 불합격이다.
		
		<입력>
		국어 : 80 
		영어 : 75 
		수학 : 60
		
		<출력>
		합격입니다.
		
		
		1. "국어 : " 출력하기
		2. BufferedReader() 생성 > throws Exception 적기
		3. 숫자 입력받기
		4. 영어와 수학도 마찬가지로 출력하고 입력받기
		5. String test(int kor, int eng, int math) 메소드 생성
		6. 삼항연산자를 사용하여 (kor + eng + math)/3 >= 60 && (kor >= 40 && eng >=40 && math >=40) ? "합격" : "불합격" 
		7. 메소드에서 return 값을 호출해서 '합격입니다' 혹은 '블합격입니다' 출력
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어 : ");
		String input = reader.readLine();
		int kor = Integer.parseInt(input);
		
		
		System.out.print("영어 : ");
		String input2 = reader.readLine();
		int eng = Integer.parseInt(input2);
		
		System.out.print("수학 : ");
		String input3 = reader.readLine();
		int math = Integer.parseInt(input3);
		
		String result = test(kor,eng,math);
		System.out.printf("%s입니다.",result);
		
		
	}//main
	
	public static String test(int kor, int eng, int math) {
		
		int avg = (kor + eng + math) / 3;
		String result = avg >= 60 && (kor >= 40 && eng >=40 && math >=40) ? "합격" : "불합격" ;
		return result;
	}

}
