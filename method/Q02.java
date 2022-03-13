package com.test.java.question.method;

public class Q02 {
	
	public static void main(String[] args) {
		/*
		
		요구사항] 이름을 전달하면 이름뒤에 '님'을 붙여서 반환하는 메소드를 선언하시오.
		
		<조건>
		-String getName(String name)
		-name: OOO(이름)
		-return: OOO(이름)님

		<호출>
		result = getName("홍길동");
		System.out.printf("고객: %s\n", result);

		result = getName("아무개");
		System.out.printf("고객: %s\n", result);
		
		<출력>
		고객: 홍길동님
		고객: 아무개님
		
		
		1. String getName(String name) 메소드 생성
		2. result에 name +"님" 저장
		3. main에서 getName메소드의 result값 호출하기
		4. 출력문으로 출력
		
		
		*/
		
		String result = getName("홍길동");
		System.out.printf("고객: %s\n", result);
		
		result = getName("아무개");
		System.out.printf("고객: %s\n", result);
	
		
	}
	
	
	public static String getName(String name) {

		String result = name +"님";
		return result;

	}
	

}
