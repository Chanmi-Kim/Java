/*

작성자 : xxHANIxx
작성일자 : 2019.02.01.

문제 6.
요구사항] 숫자 2개를 입력받아 둘 중 더 큰 숫자를 출력하시오.
입력] 첫 번째 숫자 : 10
	  두 번째 숫자 : 15
출력] 10과(와) 15 중 더 큰 숫자는 15입니다.
조건] 조건 연산자
추가] 숫자 3개로 늘리기

*/

import java.io.*;

class Ex16_6 
{
	public static void main(String[] args) throws Exception
	{
		// 문자열을 입력받기 위한 호출
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 문제설명
		System.out.println("문제 6. 숫자 2개를 입력받아 둘 중 더 큰 숫자를 출력하시오.\n");
		
		// 메시지 출력
		System.out.print("- 첫 번째 숫자 : ");
		
		// 문자열 입력
		String number1 = reader.readLine();

		// 위의 내용과 같음
		System.out.print("- 두 번째 숫자 : ");
		String number2 = reader.readLine();
		System.out.print("- 세 번째 숫자 : ");
		String number3 = reader.readLine();
		
		// 첫 번째 숫자와 두 번째 숫자를 비교하여 result1에 저장
		String result1 = Integer.parseInt(number1)>Integer.parseInt(number2) ? number1 : number2;

		// 첫 번째 숫자와 두 번째 숫자를 비교한 result1과 세 번째 숫자를 비교
		String result2 = Integer.parseInt(result1)>Integer.parseInt(number3) ? result1 : number3;

		// 가장 큰 숫자는 세 개 숫자를 비교한 결과인 result2를 반환
		System.out.printf("=> %s과(와) %s, %s 중 가장 큰 숫자는 %s입니다.\n", number1, number2, number3, result2);

		System.out.println();
	}
}
