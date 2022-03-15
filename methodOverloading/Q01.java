package com.test.java.question.methodOverloading;

public class Q01 {

	public static void main(String[] args) {

		/*
		
		요구사항] 인자로 받은 숫자들의 합을 구하는 메소드를 선언하시오.
		
		<조건>
		void sum(int)
		void sum(int, int)
		void sum(int, int, int)
		void sum(int, int, int, int)
		void sum(int, int, int, int, int)
		
		<호출>
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);
		
		<출력>
		10 = 10
		10 + 20 = 30
		10 + 20 + 30 = 60
		10 + 20 + 30 + 40 = 100
		10 + 20 + 30 + 40 + 50 = 150
		
		
		
		
		*/

		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
		sum(10, 20, 30, 40);
		sum(10, 20, 30, 40, 50);



	}

	public static void sum(int num) {

		System.out.printf("%d = %d\n", num, num);
	}

	public static void sum(int num, int num2) {

		System.out.printf("%d + %d = %d\n", num, num2, num + num2);
	}

	public static void sum(int num, int num2, int num3) {

		System.out.printf("%d + %d + %d = %d\n", num, num2, num3, num + num2 + num3);
	}

	public static void sum(int num, int num2, int num3, int num4) {

		System.out.printf("%d + %d + %d + %d = %d\n", num, num2, num3, num4,
				num + num2 + num3 + num4);
	}

	public static void sum(int num, int num2, int num3, int num4, int num5) {

		System.out.printf("%d + %d + %d + %d + %d = %d\n", num, num2, num3, num4, num5,
				num + num2 + num3 + num4 + num5);
	}

}
