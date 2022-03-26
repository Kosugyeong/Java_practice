package com.test.java.question.Class;

public class Q05 {
	public static void main(String[] args) {
		/*
		요구사항] Box 클래스와 Macaron 클래스를 설계하시오.
		
		<조건>
		-Box 객체의 정보
		 -1Box에는 10개의 마카롱을 담을 수 있다.(멤버 변수 = Macaron 배열)
		 -Box 객체의 사용
		  -Box 객체를 생성시 Box에 마카롱 객체를 10개 담는다.(무작위)
		  -품질 검사에 통과하지 못하는 마카롱을 구분한다.
		 -Macaron 객체의 정보
		  -생산 크기(5cm ~ 15cm) → 판매 유효 크기(8cm ~ 14cm)
		  -생산 색상(red, blue, yellow, white, pink, purple, green, black) → 판매 유효 색상(black을 제외한 모든 색상)
		  -생산 샌드 두께(1mm ~ 20mm) → 판매 유효 두께(3mm ~ 18mm)
		
		
		
		*/


		Box box1 = new Box();

		box1.cook();
		box1.check();
		box1.list();
	}

}


class Box {
	private Macaron[] list = new Macaron[10]; // 마카롱 객체 10개



	public void cook() {



		for (int i = 0; i < list.length; i++) {

			Macaron m = new Macaron();

			int n = (int) (Math.random() * 11) + 5;

			m.setSize(n);

			String[] color = {"red", "blue", "yellow", "white", "pink", "purple", "green", "black"};

			n = (int) (Math.random() * color.length);

			m.setColor(color[n]);

			n = (int) (Math.random() * 20) + 1;

			m.setThickness(n);

			this.list[i] = m;
		}


		System.out.printf("마카롱을 %d개 만들었습니다.\n", this.list.length);
	}

	public void check() {
		int pass = 0;
		int failed = 0; // 품질 검사에 통과하지 못하는 마카롱 횟수

		for (int i = 0; i < this.list.length; i++) {

			Macaron m = this.list[i];

			if (checkMacaron(m)) {
				pass++;
			} else {
				failed++;

			}

		}
		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수: %d개\nQC 불합격 개수: %d개\n", pass, failed);


	}

	private boolean checkMacaron(Macaron m) {

		if (m.getSize() <= 8 || m.getSize() >= 14) {

			return false;
		}

		if (m.getColor().equals("black")) {
			return false;
		}
		if (m.getThickness() < 3 || m.getThickness() > 18) {
			return false;
		}
		return true;
	}

	public void list() {


		for (int i = 0; i < this.list.length; i++) {
			
			Macaron m = this.list[i];

			System.out.printf("%d번 마카롱 : %dcm(%s, %dmm) :%s \n", i + 1, m.getSize(),
					m.getColor(), m.getThickness(),checkMacaron(m)?"합격":"불합격");

		}


	}


	public void setMacaron(int index, Macaron[] macaron) {

		for (int i = 0; i < this.list.length; i++) {
			Macaron[] mocaron = new Macaron[i];
			this.list[index] = macaron[i];
		}
	}

}


class Macaron {
	private int size;
	private String color;
	private int thickness;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {

		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}

	public int getThickness() {
		return thickness;
	}

	public void setThickness(int thickness) {
		this.thickness = thickness;
	}


}
