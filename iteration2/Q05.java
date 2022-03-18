package com.test.java.question.iteration2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q05 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 자판기 프로그램을 구현하시오.
		
		*/


		

		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		boolean loop = true;
		
		while (loop) {
			System.out.println("=================");
			System.out.println("       자판기");
			System.out.println("=================");
			System.out.println("1. 콜라 : 700원");
			System.out.println("2. 사이다 : 600원");
			System.out.println("3. 비타500 : 500원");
			System.out.println("------------------");
			System.out.print("금액 투입(원) : ");

			int money = Integer.parseInt(reader.readLine());

			System.out.println("------------------");
			System.out.print("음료 선택(번호) : ");

			String num = reader.readLine();

			if (num.equals("1")) {

				System.out.println("+콜라를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.", money - 700);
			} else if (num.equals("2")) {
				System.out.println("+사이다를 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.", money - 600);

			} else if (num.equals("3")) {
				System.out.println("+비타500을 제공합니다.");
				System.out.printf("+잔돈 %d원을 제공합니다.", money - 500);
			} else if (num.equals("0")) { // 종료는 0
				loop = false;
			} else {
				System.out.println("자판기에 있는 음료만 선택하세요.(1~3)");
			}

			System.out.println();
			System.out.println();
			System.out.println("계속하시려면 엔터를 입력하세요.");
			String input = " ";
			input = reader.readLine();
			if(input == "") { //엔터를 입력할 시 while문이 또 돌도록! loop = true 해주기!
				loop = true;
			}



		} // while


	}// main



}

