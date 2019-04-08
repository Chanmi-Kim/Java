/*

작성자 : xxHANIxx
작성일자 : 2019.02.08.

요구사항12. 인자로 받은 이름들을 직급 순으로 출력하는 메소드를 선언하고 호출하시오.

출력]
사원 : 홍길동
대리 : 유재석
과장 : 박명수

*/

class Ex21_12  
{
	public static void main(String[] args) 
	{
		position("홍길동");
		position("홍길동", "유재석");
		position("홍길동", "유재석", "박명수");
		position("홍길동", "유재석", "박명수", "정형동");
	}

	public static void position(String name1)
	{
		System.out.printf("사원 : %s\n\n", name1);
	}

	public static void position(String name1, String name2)
	{
		System.out.printf("사원 : %s\n대리 : %s\n\n", name1, name2);
	}

	public static void position(String name1, String name2, String name3)
	{
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n\n", name1, name2, name3);
	}

	public static void position(String name1, String name2, String name3, String name4)
	{
		System.out.printf("사원 : %s\n대리 : %s\n과장 : %s\n부장 : %s\n\n", name1, name2, name3, name4);
	}
}
