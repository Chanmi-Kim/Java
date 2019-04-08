/*

작성자 : xxHANIxx
작성일자 : 2019.02.08.

요구사항11. 인자로 받은 숫자들의 합을 구하는 메소드를 선언하고 호출하시오.

출력]
10 = 10
10 + 20 = 10
10 + 20 + 30 = 10

*/

class Ex21_11 
{
	public static void main(String[] args) 
	{
		sum(10);
		sum(10, 20);
		sum(10, 20, 30);
	}

	public static void sum(int n1)
	{
		System.out.printf("%d = %d\n", n1, n1);
	}

	public static void sum(int n1, int n2)
	{
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
	}

	public static void sum(int n1, int n2, int n3)
	{
		System.out.printf("%d + %d + %d = %d\n", n1, n2, n3, n1 + n2 + n3);
	}

	public static void sum(int n1, int n2, int n3, int n4)
	{
		System.out.printf("%d + %d + %d + %d = %d\n", n1, n2, n3, n4, n1 + n2 + n3 + n4);
	}

	public static void sum(int n1, int n2, int n3, int n4, int n5)
	{
		System.out.printf("%d + %d + %d + %d + %d = %d\n", n1, n2, n3, n4, n1 + n2 + n3 + n4 + n5);
	}


}
