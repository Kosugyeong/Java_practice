package com.test.java.question.iteration3;

public class Q10 {
	public static void main(String[] args) {
		/*
		요구사항] 아래와 같이 출력
		
		<출력>
		 1 ~  10 :  55
		11 ~  20 : 155
		21 ~  30 : 255
		31 ~  40 : 355
		41 ~  50 : 455
		51 ~  60 : 555
		61 ~  70 : 655
		71 ~  80 : 755
		81 ~  90 : 855
		91 ~ 100 : 955
		
		
		
		
		*/


		for (int i = 0; i < 10; i++) {
			int sum = 0;
			for (int j = 10 * i + 1; j <= 10 * i + 10; j++) {

				sum += j;
			}

			System.out.printf("1 ~ %3d : %4d", 10 * i + 10, sum);
			System.out.println();
		}



	}

}
