package com.test.java.question.operator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {

	public static void main(String[] args) throws Exception {
		
		//2번문제
		//요구사항] 숫자 2개를 입력받아 아래의 연산식을 출력하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자 : ");
		String input = reader.readLine();
		
		System.out.print("두번째 숫자 : ");
		String input2 = reader.readLine();
		
		int num = Integer.parseInt(input);
		int num2 = Integer.parseInt(input2);
		
		
		
		
		System.out.printf("%,d + %,d = %,d\n",num,num2,num+num2);
		System.out.printf("%,d - %,d = %,d\n",num,num2,num-num2);
		System.out.printf("%,d * %,d = %,d\n",num,num2,num*num2);
		System.out.printf("%,d / %,d = %,.1f\n", num, num2, (double)num/num2);
		System.out.printf("%,d %% %,d = %,d\n",num,num2,num%num2);
		
		
		
		


	}

}
