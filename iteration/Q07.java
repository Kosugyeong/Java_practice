package com.test.java.question.iteration;

public class Q07 {
	public static void main(String[] args) {
		/*
		요구사항] 아래와 같이 출력하시오
		
		<조건>
		누적값이 1000을 넘어가는 순간 루프를 종료하시오.
		
		<출력>
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 
		+ 11 + 12 + 13 + 14 + 15 + 16 + 17 + 18 + 19 + 20 + 21 + 22
		+ 23 + 24 + 25 + 26 + 27 + 28 + 29 + 30 + 31 + 32 + 33 + 34
		+ 35 + 36 + 37 + 38 + 39 + 40 + 41 + 42 + 43 + 44 + 45 = 1035
		
		1. 누적 변수 생성
		2. 루프 생성
			-값 누적
			-값 출력
			조건 > 누적값 1000이상 > break
			출력
		
		
		*/
		int sum = 0;
//		for (int i = 1;; i++) {
//
//			sum += i;
//			if (sum < 1000) {
//				System.out.printf("%d + ", i);
//
//			} else if (sum >= 1000) {
//				System.out.printf("%d = %d", i, sum);
//			}
//
//			if (sum > 1000) {
//				break;
//			}
//
//		}
		
		
		for(int i =1;;i++) {
			sum+= i;
			
			System.out.printf("%d + ", i);
			
			if(sum>1000) {
				break;
	
			}
			
		}
		System.out.printf("\b\b=%d\n", sum); //\b\b가 두칸 지워줌.


	}

}
