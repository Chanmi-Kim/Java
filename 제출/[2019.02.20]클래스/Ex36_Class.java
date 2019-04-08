/*

작성자 : xxHANIxx
작성일자 : 2019.02.20.

011_클래스
요구사항 1. Book 클래스를 설계하시오.
요구사항 2. Note 클래스를 설계하시오.
요구사항 3. 과자(Bugles) 클래스를 설계하시오.

*/

package example;

public class Ex36_Class {

	public static void main(String[] args) {
		
		// 실행 코드 용
		// ================================================== Book.java
		Book b1 = new Book();
		
		b1.setTitle("정의란 무엇인가");
		b1.setPrice(13500);
		b1.setAuthor("마이클 샌델");
		b1.setPublisher("와이즈베리");
		b1.setIsbn("978893");
		b1.info();

		// ================================================== Note.java
		Note note = new Note();
		note.setSize("B4");
		note.setColor("노란색");
		note.setPageNum(25);
		note.setOwner("홍길동");
		note.info();

		Note note2 = new Note();
		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPageNum(100);
		note2.info();
		
		// ================================================== Bugles.java
		Bugles snack = new Bugles();
		snack.setSize(500);
		snack.setCreationTime("2019-02-20");
		
		System.out.println("========= 과자 =========");
		System.out.println("가격 : " + snack.getPrice() + "원");
		System.out.println("유통 기한이 " + snack.getExpiration() + "일 남았습니다.");
		snack.eat();
		System.out.println("========================");

		Bugles snack2 = new Bugles();
		snack2.setSize(300);
		snack2.setCreationTime("2019-02-20");
		System.out.println("가격 : " + snack2.getPrice() + "원");
		System.out.println("유통 기한이 " + snack2.getExpiration() + "일 남았습니다.");
		snack2.eat();
		
	}
}
