package com.test.java.question.method;

public class Q01 {

	public static void main(String[] args) {
		
		/*
		
		요구사항] 인삿말을 출력하는 메소드 3개를 선언하시오.
		조건
		-void hello()
		-void introduce()
		-void bye()
		
		1. 반환값이 없는 void hello(), void introduce(), void bye() 생성
		2. 각 메소드 안에 해당하는 인삿말 출력
		3. main안에 각 메소드 호출하기
		
		
		*/
		
		hello();
		
		introduce();
		
		bye();
		
		
		

	}//main
	
	public static void hello() {
		
		System.out.println("안녕하세요.");
		
	}
	
	public static void introduce() {
		
		System.out.println("저는 홍길동입니다.");
	}
	
	public static void bye() {
		
		System.out.println("안녕히가세요. ");
	}
	

}
