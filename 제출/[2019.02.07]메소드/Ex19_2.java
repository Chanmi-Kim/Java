/*

작성자 : xxHANIxx
작성일자 : 2019.02.07.

요구사항2. 숫자 1개를 입력받아 4자리로 출력하는 메소드를 선언하고 호출하시오.

입력]
숫자 입력 : 1
숫자 입력 : 10
숫자 입력 : 123
숫자 입력 : 5341

출력]
1 → 0001
10 → 0010
123 → 0123
5341 → 5341

*/

import java.io.*;

class Ex19_2
{
	public static void main(String[] args) throws Exception
	{
		// Ex19_2_김찬미.java
		digit();
		//digit(10);
		//digit(123);
		//digit(5341);
	}

	public static void digit() throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 입력 : ");
		String number = reader.readLine();

		// ** 연산자 주의! 
		String result = Integer.parseInt(number) < 10 ? "000" : 
			(Integer.parseInt(number) <100 ? "00" : 
			(Integer.parseInt(number) <1000 ? "0" : ""));
		System.out.printf("%s%s\n", result, number);

	}
}
