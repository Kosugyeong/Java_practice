package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws Exception {

		/*
		요구사항] 문자 1개를 입력받아 아래와 같이 출력하시오.
		
		<조건>
		f, F → Father
		m, M → Mother
		s, S → Sister
		b, B → Brother
		유효성 검사를 하시오.(위의 문자가 아닌 문자는 예외 처리)
		
		<입력>
		문자 : f 
		
		<출력>
		Father
		
		<입력>
		문자 : a 
		
		<출력>
		입력한 문자가 올바르지 않습니다.
		
		1. "문자 : " 출력
		2. BufferedReader 생성
		3. 문자 입력받기 > 문자열로 입력받기 (char로 입력받으면 fs가 들어와도 앞에 f가 조건에 맞아서 Father이 나옴. but 문자열은 전체 모두 비교해줘서 올바르지 않다고 출력됨.
		4. 조건의 모든 문자일 경우 그 다음 조건문 통과하게. 
		
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문자 : ");
		String alpha = reader.readLine();

		if (alpha.equals("f") || alpha.equals("F") || alpha.equals("m") || alpha.equals("M") || alpha.equals("s")
				|| alpha.equals("S") || alpha.equals("b") || alpha.equals("B")) {
			if(alpha.equals("f") || alpha.equals("F")) {
				System.out.println("Father");
			} else if (alpha.equals("m") || alpha.equals("M")) {
				System.out.println("Mather");
			} else if (alpha.equals("s") || alpha.equals("S")) {
				System.out.println("Sister");
			} else if (alpha.equals("b") || alpha.equals("B")) {
				System.out.println("Brother");
			}

		}else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}



	}

}
