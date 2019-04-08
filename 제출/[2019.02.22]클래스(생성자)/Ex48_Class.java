/*

작성자 : xxHANIxx
작성일자 : 2019.02.22.

013_클래스(생성자)
요구사항 1. 학생 클래스를 구현하시오.(생성자 오버로딩)

*/

package example;

public class Ex48_Class {

	public static void main(String[] args) {
		
		//학생 1
		Student s1 = new Student(); //기본 생성자 호출
		System.out.println(s1.info());

		//학생 2
		Student s2= new Student("홍길동", 13); //오버로딩 생성자 호출
		System.out.println(s2.info());

		//학생 3
		Student s3= new Student(3, 10, 30); //오버로딩 생성자 호출
		System.out.println(s3.info());

		//학생 4
		Student s4= new Student("아무개", 12, 1, 5, 11); //오버로딩 생성자 호출
		System.out.println(s4.info());
		
	}
}