package com.test.java.question.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Q02 {
	public static void main(String[] args) throws Exception {
		/*
		요구사항] 학생의 이름을 N개 입력받아 아래와 같이 출력하시오.
		
		<조건>
		이름을 오름차순 정렬하시오.
		
		<입력>
		학생 수 : 6 		
		학생명 : 홍길동 		
		학생명 : 아무개 		
		학생명 : 하하하 		
		학생명 : 호호호 		
		학생명 : 후후후 		
		학생명 : 헤헤헤 
				
		<출력>
		입력한 학생은 총 6명입니다.
		1. 아무개
		2. 하하하
		3. 헤헤헤
		4. 호호호
		5. 홍길동
		6. 후후후
		
		
		1. 학생 수 입력받기
		2. 학생이름 저장할 배열 생성
		3. 학생 수만큼 학생이름 배열에 이름 입력받아 저장 > for문
		4. 오름차순 정렬 > compareTo 사용 > 값이 양수이면 왼쪽 값이 오른쪽값보다 크다는 뜻 > 뒤로 보내야함. 
		
				
		*/

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("학생 수 : ");
		int studentNum = Integer.parseInt(reader.readLine());
		String[] student = new String[studentNum];

		for (int i = 0; i < studentNum; i++) {
			System.out.print("학생명 : ");
			String studentName = reader.readLine();
			student[i] = studentName;

		}

		System.out.printf("입력한 학생은 총 %d명입니다.\n", studentNum);

		for (int i = 0; i < student.length; i++) {

			for (int j = 0; j < student.length - i - 1; j++) {

				if (student[j].compareTo(student[j + 1]) > 0) {

					String temp = student[j];
					student[j] = student[j + 1];
					student[j + 1] = temp;

				}

			}
			System.out.printf("%d. %s\n", i + 1, student[i]);

		}



	}

}
