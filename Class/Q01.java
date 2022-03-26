package com.test.java.question.Class;

public class Q01 {
	public static void main(String[] args) {
		/*
		요구사항] Book 클래스를 설계하시오.
		
		<조건>
		-Book 객체의 정보
		  -제목, 가격, 저자, 출판사, 발행년도, ISBN, 페이지수
		-모든 멤버 변수의 접근 지정자는 private으로 한다.
		-멤버 접근을 위한 Setter와 Getter를 정의한다.
		  -제목 : 읽기/쓰기, 최대 50자 이내(한글, 영어, 숫자)
		  -가격 : 읽기/쓰기, 0 ~ 1000000원
		  -저자 : 읽기/쓰기, 제한 없음
		  -페이지수 : 읽기/쓰기, 1~무제한
		  -출판사 : 쓰기 전용
		  -발행년도 : 읽기 전용(2019년)
		  -ISBN : 읽기/쓰기
		-Book 객체의 모든 정보를 문자열로 반환하는 메소드를 구현한다.
		  -String info()
		-클래스가 잘 설계되었는지 객체를 가지고 사용해본다.
		  -Book 객체 생성
		  -멤버 값 넣기 + 값 출력
		  -유효성 검사 테스트
		
		
		
		*/

		Book b1 = new Book();

		b1.setTitle("자바의 정석");
		b1.setPrice(45000);
		b1.setAuthor("남궁성");
		b1.setPublisher("도우출판");
		b1.setIsbn("8994492038");
		b1.setPage(1022);

		System.out.println(b1.info());



	}
}


class Book {
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (checkTitle(title)) {
			this.title = title;
		} else {
			System.out.println("올바르지 않은 제목입니다. 한글, 영어, 숫자만 사용하시오.");
		}
	}



	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {

		if (price >= 0 && price <= 1000000) {
			this.price = price;
		} else {
			System.out.println("가격은 0~1000000원이여야 합니다.");
		}
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page > 0) {
			this.page = page;
		}else {
			System.out.println("올바르지 않은 페이지수입니다.");
		}
	}

	public String getPubYear() {
		return pubYear;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	private boolean checkTitle(String title) {

		if (title.length() > 50) {
			return false;
		}
		for (int i = 0; i < title.length(); i++) {
			char titleChar = title.charAt(i);
			// 스페이스바도 조건에 넣어주기 (공백이 있는 경우)
			if ((titleChar < '가' || titleChar > '힣') && (titleChar < 'A' || titleChar > 'Z')&&(titleChar < 'a' || titleChar > 'z')
					&& (titleChar < '0' || titleChar > '9') && (titleChar != ' ')) {
				return false;
			}

		}


		return true;
	}

	 public String info() {
		 
		 String txt = "제목: "+this.title
				 +String.format("가격 %,d원", this.price)
				 +"\n"+"저자: "+this.author
				 +"\n출판사: "+this.publisher
				 +"\n발행년도: "+this.pubYear+"년\n"
				 +"ISBN: "+this.isbn+"\n"
				 +String.format("페이지: %,d장", this.page);
		 
		 return txt;
		 
//		 StringBuilder sb = new StringBuilder();
//		 
//		 sb.append("제목: "+this.title);
//		 sb.append(String.format("가격 %,d원", this.price));
//		 sb.append()
//		 
//		 
//		 return sb.toString(); //StringBuilder -> String
		 
	 }


}
