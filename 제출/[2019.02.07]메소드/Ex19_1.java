/*

작성자 : xxHANIxx
작성일자 : 2019.02.07.

요구사항1. 호출하면 인사말을 출력하는 메소드 3개 선언하고 호출하시오.

출력]
안녕하세요. //hello()
저는 홍길동입니다. //introduce()
안녕히가세요. //bye()

*/

class Ex19_1
{
	public static void main(String[] args) 
	{
		// class Ex19_1_김찬미.java

		// 메소드 호출
		hello();
		introduce();
		bye();
	}

	public static void hello()
	{
		System.out.println("안녕하세요.");
	}

	public static void introduce()
	{
		System.out.println("저는 홍길동입니다.");
	}

	public static void bye()
	{
		System.out.println("안녕히가세요.");
	}

}
