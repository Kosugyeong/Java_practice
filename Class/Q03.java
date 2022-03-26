package com.test.java.question.Class;

import java.util.Calendar;

public class Q03 {
	public static void main(String[] args) {
		/*
		
		요구사항] 과자(Bugles) 클래스를 설계하시오.
		
		<조건>
		-Bugles 객체의 정보
		 -가격, 용량, 생산일자, 유통기한
		 -모든 멤버 변수의 접근 지정자는 private으로 한다.
		 -멤버 접근을 위한 Setter와 Getter를 정의한다.
		  -용량 : 쓰기 전용, 300g, 500g, 850g
		  -가격 : 읽기 전용, 850원(300g), 1200원(500g), 1950원(850g)
		  -생산일자 : 쓰기 전용(Calendar)
		  -남은유통기한 : 읽기 전용, 생산된 제품의 유통기한 기준 : 7일(300g), 10일(500g), 15일(850g)
		 -Bugles 객체 메소드
		   -void eat() : 과자 먹기
		 -먹을수 있는 날짜 = 유통기한 - 현재 - 제조시간
		   - 5 : 먹을 수 있는 날짜가 5일 남음
		   - -3 : 먹을 수 있는 날짜가 3일 지남
				
				
		*/
		

		Bugles snack = new Bugles();

		snack.setWeight(500);
		snack.setCreationTime("2022-3-25");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");  //TODO 나와야하는 수에서 -2로 나오는데 해결하자...........

		snack.eat();


		Bugles snack2 = new Bugles();

		snack2.setWeight(300);
		snack2.setCreationTime("2022-3-25");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");

		snack2.eat();
	}

}


class Bugles {
	private int price;
	private int weight;
	private Calendar creationTime; // 생산일자
	private int expiration; // 유통기한

	// getter, setter 구현

	public int getPrice() {

		if (this.weight == 300) {
			return 850;
		} else if (this.weight == 500) {
			return 1200;
		} else if (this.weight == 850) {
			return 1950;
		}
		return price;
	}

	public int getExpiration() {

		Calendar now = Calendar.getInstance();

		long nowTick = now.getTimeInMillis();


		if (this.weight == 300) {
			
			this.creationTime.add(Calendar.DATE, 6);// 생산일자 날짜에 유통기한 일수를 더한 값 (생산당일부터 세야하므로 오늘 생산한게 7일 유통기한이다 > 오늘로부터 6일 남았다고 보기.그러므로 -1 빼고 더해주자.)
			System.out.printf("유통기한: %tF\n", creationTime);
			long creationTimeTick = this.creationTime.getTimeInMillis();
			expiration = (int)Math.ceil((creationTimeTick - nowTick) / 1000.0/ 60 / 60 / 24) ;
		} else if (this.weight == 500) {
			this.creationTime.add(Calendar.DATE, 9);// 
			 System.out.printf("유통기한: %tF\n", creationTime);
			long creationTimeTick = this.creationTime.getTimeInMillis();
			expiration = (int)Math.ceil((creationTimeTick - nowTick) / 1000.0/ 60 / 60 / 24 );
		} else if (this.weight == 850) {
			this.creationTime.add(Calendar.DATE, 14);// 
			 System.out.printf("유통기한: %tF\n", creationTime);
			long creationTimeTick = this.creationTime.getTimeInMillis();
			expiration = (int)Math.ceil((creationTimeTick - nowTick) / 1000.0/ 60 / 60 / 24) ;
		}


		return expiration;
	}

	public void setWeight(int weight) {

		if (weight == 300 || weight == 500 || weight == 850) {
			this.weight = weight;
		}
	}

	public void setCreationTime(String time) {

		Calendar creationTime = Calendar.getInstance();

		int index = time.indexOf("-", 4);
		int nextindex = time.indexOf("-", index + 1);


		int year = Integer.parseInt(time.substring(0, index));
		int month = Integer.parseInt(time.substring(index + 1, nextindex));
		int date = Integer.parseInt(time.substring(nextindex + 1));

		creationTime.set(year, month - 1, date);

		this.creationTime = creationTime;

	}


	public void eat() {

		
		
		if(this.expiration<0) {
			System.out.println("유통기한이 지나 먹을 수 없습니다.\n");
		}else {
			System.out.println("과자를 맛있게 먹습니다.\n");
		}
	}
}
