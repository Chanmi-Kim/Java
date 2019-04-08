/*

작성자 : xxHANIxx
작성일자 : 2019.02.07.

요구사항3. 숫자 2개를 입력받아 산술 연산을 각각하는 메소드 5개를 선언하고 호출하시오.

입력]
첫번째 숫자 : 5
두번째 숫자 : 3

출력]
5 + 3 = 8 //add(n1, n2)
5 + 5 = 10 //add(n1, n1)

5 - 3 = 2 //subtract(n1, n2)

5 * 3 = 15 //multiply(n1, n2)
5 * 5 = 25 //multiply(n1, n1)

5 / 3 = 1.7 //divide(n1, n2)

5 % 3 = 2 //mod(n1, n2)

*/

import java.io.*;

class Ex19_3
{
	public static void main(String[] args) throws Exception
	{
		// Ex19_3_김찬미.java

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫번째 숫자 : ");
		String number1 = reader.readLine();

		System.out.print("두번째 숫자 : ");
		String number2 = reader.readLine();

		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);

		add(n1, n2);
		add(n1, n1);

		subtract(n1, n2);

		multiply(n1, n2);
		multiply(n1, n1);

		divide(n1, n2);

		mod(n1, n2);
		
	}

	public static void add(int n1, int n2)
	{
		System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);
	}

	public static void subtract(int n1, int n2)
	{
		System.out.printf("%d - %d = %d\n", n1, n2, n1 - n2);
	}

	public static void multiply(int n1, int n2)
	{
		System.out.printf("%d * %d = %d\n", n1, n2, n1 * n2);
	}

	public static void divide(int n1, int n2) // ** 형변환 주의!
	{
		System.out.printf("%d / %d = %.1f\n", n1, n2, (double)n1 / (double)n2);
	}

	public static void mod(int n1, int n2)
	{
		System.out.printf("%d %% %d = %d\n", n1, n2, n1 % n2);
	}

}
