package com.test.java.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q03 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 사용자가 입력한 범위의 숫자까지 369 게임 과정을 출력하시오.
		
		<조건>
		최대 3자리까지만 입력하시오.
		
		<입력>
		최대 숫자 : 50 
		
		<출력>
		1 2 짝 4 5 짝 7 8 짝 10 11 12 짝 14 15 짝 17 18 짝 20 
		21 22 짝 24 25 짝 27 28 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 짝 40 
		41 42 짝 44 45 짝 47 48 짝 50
		
		
		
		
		1. 3 6 9 조건 => 한 자리 수일 때 -> 10으로 나눴을 때 나머지 3, 6, 9 인 경우
						각 자릿수의 숫자를 뽑아내어서 그 수를 각각 10으로 나눴을 떄, 3, 6, 9인 경우
		
		
		
		
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최대 숫자 : ");

		int numMax = Integer.parseInt(reader.readLine());

		String result = "";
		int i = 1;

		while (i <= numMax) {

			if (i < 10) {
				if ((i == 3) || (i == 6) || (i == 9)) {
					result += "짝 ";
				} else {
					result += i + " ";
				}
			} else {
				boolean flagOfHundred = false; // 백의 자리가 3,6,9가 맞는지 확인할 boolean 변수
				boolean flagOfTen = false; // 십의 자리가 3,6,9가 맞는지 확인할 boolean 변수
				boolean flagOfOne = false; // 일의 자리가 3,6,9가 맞는지 확인할 boolean 변수

				int numOfHundred = i / 100; // 백의 자리수
				int numOfTen = i / 10; // 십의 자리수
				int numOfOne = i % 10; // 일의 자리수


				if ((numOfTen == 3) || (numOfTen == 6) || (numOfTen == 9)) {
					flagOfTen = true;
				}

				if ((numOfOne == 3) || (numOfOne == 6) || (numOfOne == 9)) {
					flagOfOne = true;
				}

				if ((numOfHundred == 3) || (numOfHundred == 6) || (numOfHundred == 9)) {
					flagOfOne = true;
				}

				if (flagOfHundred && flagOfTen && flagOfOne) {
					result += "짝 짝 짝 ";
				} else if (flagOfHundred && flagOfTen) {
					result += "짝 짝 ";

				} else if (flagOfHundred && flagOfOne) {
					result += "짝 짝 ";

				} else if (flagOfTen && flagOfOne) { // 십의 자리와 일의 자리 모두 true일때(3, 6, 9)
					result += "짝 짝 ";
				} else if (flagOfTen || flagOfOne) { // 십의 자리와 일의 자리 중 하나만 true일 때
					result += "짝 ";
				} else { // 둘 다 false일 때
					result += i + " ";
				}


			}
			i++;


		} // while

		System.out.printf("%s", result);



	}

}
