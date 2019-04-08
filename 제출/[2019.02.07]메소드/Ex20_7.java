/*

작성자 : xxHANIxx
작성일자 : 2019.02.07.

요구사항7. 숫자를 전달하면 '짝수' 혹은 '홀수'라는 단어를 반환하는 메소드를 선언하고 호출하시오.

입력]
숫자 : 5

출력]
입력하신 숫자 '5'는(은) '홀수'입니다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex20_7
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 : ");
		String input = reader.readLine();

		int number = Integer.parseInt(input);

		String result = getNumber(number);
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", number, result);
	}

	public static String getNumber(int number)
	{
		// 숫자를 2로 나눠지면 짝수, 아니면 홀수
		String result = number % 2 == 0 ? "짝수" : "홀수";

		return result;
	}
}
