package com.test.java.question.iteration3;

public class Q09 {
	public static void main(String[] args) {
		/*
		요구사항] 아래와 같이 출력
		
		<출력>
		1 ~  10 :   55
		1 ~  20 :  210
		1 ~  30 :  465
		1 ~  40 :  820
		1 ~  50 : 1275
		1 ~  60 : 1830
		1 ~  70 : 2485
		1 ~  80 : 3240
		1 ~  90 : 4095
		1 ~ 100 : 5050
		
		
		
		
		*/

		int sum = 0;
		for (int i = 0; i < 10; i++) {

			for (int j = 10 * i + 1; j <= 10 * i + 10; j++) {

				sum += j;


			}
			System.out.printf("1 ~ %3d : %4d", 10 * i + 10, sum);
			System.out.println();

		}



	}



}

//아래와 같이 첫 for문을 10씩 더해지게 추가해서 안의 for문을 간단히 표현할 수 있는 방법도 있다. 

//for (int i=10; i<=100; i+=10) {
//	int sum = 0;
//	for (int j=1; j<=i; j++) {
//		sum += j;
//	}
//	System.out.printf("1 ~ %3d : %4d\n", i, sum);
//}