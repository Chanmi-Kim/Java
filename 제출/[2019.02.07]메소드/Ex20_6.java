/*

작성자 : xxHANIxx
작성일자 : 2019.02.07.

요구사항6. 숫자 2개를 입력받아 산술 결과를 반환하는 메소드 5개를 선언하고 호출하시오.
입력]
첫번째 숫자 : 5
두번째 숫자 : 3

출력]
8
10
2
15
25
1.7
2

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex20_6 
{
	public static void main(String[] args) throws Exception
	{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("첫번째 숫자 : ");
		String number1 = reader.readLine();
		System.out.print("두번째 숫자 : ");
		String number2 = reader.readLine();

		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		int result = 0;

		result = add(n1, n2); 
		System.out.println(result);
		result = add(n1, n1);
		System.out.println(result);

		result = subtract(n1, n2);
		System.out.println(result);

		result = multiply(n1, n2);
		System.out.println(result);
		result = multiply(n1, n1);
		System.out.println(result);

		double result2 = divide(n1, n2); // ** 형변환 주의
		System.out.printf("%.1f\n", result2); // ** 출력문 주의

		result = mod(n1, n2);
		System.out.println(result);
	}

	public static int add(int n1,int n2) 
	{
		return n1 + n2;
	}

	public static int subtract(int n1,int n2) 
	{
		return n1 - n2;
	}

	public static int multiply(int n1,int n2) 
	{
		return n1 * n2;
	}

	public static double divide(int n1,int n2)
	{
		return (double) n1 / (double) n2; // ** 형변환 주의
	}

	public static int mod(int n1,int n2)
	{
		return n1 % n2;
	}
}
