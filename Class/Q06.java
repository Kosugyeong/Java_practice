package com.test.java.question.Class;

import java.util.Calendar;

public class Q06 {
	public static void main(String[] args) {

		/*
		요구사항] Refrigerator 클래스와 Item 클래스를 설계하시오.
		
		<조건>
		-Refrigerator 객체의 정보
		  -Item을 최대 100개까지 담을 수 있다.(멤버 변수 = Item 배열)
		-Refrigerator 객체의 사용
		  -Item을 냉장고에 넣는다. void add(Item item);
		  -Item을 냉장고에서 꺼낸다. Item get(String name);
		  -냉장고에 있는 Item의 개수를 확인한다. int count();
		  -냉장고에 있는 Item을 확인한다. void listItem();
		-Item 객체의 정보
		  -식품명, 유통기한
		
		*/

		Refrigerator r = new Refrigerator();

		Item item1 = new Item();
		item1.setName("김치");
		item1.setExpiration("2022-4-9");
		r.add(item1);// 냉장고에 넣기

		Item item2 = new Item();
		item2.setName("깍두기");
		item2.setExpiration("2022-4-2");
		r.add(item2);// 냉장고에 넣기

		Item item3 = new Item();
		item3.setName("멸치볶음");
		item3.setExpiration("2022-4-4");
		r.add(item3);// 냉장고에 넣기

		Item item4 = r.get("깍두기");// 냉장고에서 꺼내기
		System.out.printf("\n%s의 유통기한 : %s\n", item4.getName(), item4.getExpiration());

		System.out.printf("냉장고 안의 총 아이템 개수 : %d개\n", r.count());

		r.listItem();


	}

}


class Refrigerator {
	private Item[] items = new Item[100];
	int index = 0;

	public void add(Item item) {

		// 메모리 관리 변수

		if (index == 99) {
			System.out.println("냉장고에 넣을 자리가 없습니다.");
		} else {
			items[this.index] = item;
			System.out.printf("'%s'를 냉장고에 넣었습니다.\n", items[index].getName());
			this.index++;
		}
		



	}

	public Item get(String name) {
		for (int i = 0; i < this.index; i++) {
			if (items[i].getName().equals(name)) {

				Item getItem = items[i];

				for (int j = i; j < items.length - 1; j++) {
					items[j] = items[j + 1];
				}
				this.index--;
				return getItem;

			}

		}
		return null;


	}

	public int count() {

		return this.index;
	}

	public void listItem() {

		System.out.println("\n[냉장고 아이템 목록]");

		for (int i = 0; i < this.index; i++) {

			System.out.printf("%s(%s)\n", this.items[i].getName(), this.items[i].getExpiration());
		}
	}
}


class Item {
	private String name;
	private Calendar expiration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpiration() {
		return String.format("%d-%d-%d", this.expiration.get(Calendar.YEAR),
				this.expiration.get(Calendar.MONTH), this.expiration.get(Calendar.DATE));
	}

	public void setExpiration(String time) {
		Calendar expiration = Calendar.getInstance();

		int index = time.indexOf("-", 4);
		int nextindex = time.indexOf("-", index + 1);


		int year = Integer.parseInt(time.substring(0, index));
		int month = Integer.parseInt(time.substring(index + 1, nextindex));
		int date = Integer.parseInt(time.substring(nextindex + 1));

		expiration.set(year, month - 1, date);
		this.expiration = expiration;
	}


}
