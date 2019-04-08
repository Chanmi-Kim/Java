/*

작성자 : xxHANIxx
작성일자 : 2019.02.08.

요구사항13. 인자로 받은 숫자들 중 양수의 갯수를 반환하는 메소드를 선언하고 호출하시오.

출력]
양수 : 4개

*/

class Ex21_13 
{
	public static void main(String[] args) 
	{
		int count = positive(10, 20, -30, 40, 50);
		System.out.printf("양수 : %d개\n\n", count);
	}

	public static int positive(int n1)
	{
		int count = n1 < 0 ? 0 : 1;

		return count;
	}

	public static int positive(int n1, int n2)
	{
		int result = 0;
		int count = n1 < 0 ? 0 : 1;
		result = result + count;

		count = n2 < 0 ? 0 : 1;
		result = result + count;

		return result;
	}

	public static int positive(int n1, int n2, int n3)
	{
		int result = 0;
		int count = n1 < 0 ? 0 : 1;
		result = result + count;

		count = n2 < 0 ? 0 : 1;
		result = result + count;

		count = n3 < 0 ? 0 : 1;
		result = result + count;

		return result;
	}

	public static int positive(int n1, int n2, int n3, int n4)
	{
		int result = 0;
		int count = n1 < 0 ? 0 : 1;
		result = result + count;

		count = n2 < 0 ? 0 : 1;
		result = result + count;

		count = n3 < 0 ? 0 : 1;
		result = result + count;

		count = n4 < 0 ? 0 : 1;
		result = result + count;

		return result;
	}

	public static int positive(int n1, int n2, int n3, int n4, int n5)
	{
		int result = 0;
		int count = n1 < 0 ? 0 : 1;
		result = result + count;

		count = n2 < 0 ? 0 : 1;
		result = result + count;

		count = n3 < 0 ? 0 : 1;
		result = result + count;

		count = n4 < 0 ? 0 : 1;
		result = result + count;

		count = n5 < 0 ? 0 : 1;
		result = result + count;

		return result;
	}
}
