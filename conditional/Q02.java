package com.test.java.question.conditional;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 학생의 국어 점수를 입력받아 성적을 출력하시오.
		
		<조건>
		90 ~ 100 : A
		80 ~  89 : B
		70 ~  79 : C
		60 ~  69 : D
		 0 ~  59 : F
		유효성 검사를 하시오.(점수 : 0 ~ 100점 이내)
		
		<입력>
		점수 : 85 
		
		<출력>
		입력한 85점은 성적 B입니다.
		
		<입력>
		점수 : 123 
		
		<출력>
		점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.
		
		1. "점수 : "출력
		2. BufferedReader 생성 
		3. 점수 숫자 입력받기
		4. kor >= 0 && kor <= 100일 때만 조건식이 들어가도록 if문 안에 if문 생성
		5. 위 if문 안에 각 조건들 넣고 출력문 넣기
		6. 4번 조건식이 아닌경우 else 만들어서 출력문 넣기
		
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("점수 : ");
		int kor = Integer.parseInt(reader.readLine());

		if (kor >= 0 && kor <= 100) {

			if (kor >= 90 && kor <= 100) {
				System.out.printf("입력한 %d점은 성적 A입니다.", kor);
			} else if (kor >= 80 && kor <= 89) {
				System.out.printf("입력한 %d점은 성적 B입니다.", kor);
			} else if (kor >= 70 && kor < 79) {
				System.out.printf("입력한 %d점은 성적 C입니다.", kor);
			} else if (kor >= 60 && kor < 69) {
				System.out.printf("입력한 %d점은 성적 D입니다.", kor);
			} else if (kor >= 0 && kor < 59) {
				System.out.printf("입력한 %d점은 성적 E입니다.", kor);
			}

		}else {
			System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
		}



	}

}
