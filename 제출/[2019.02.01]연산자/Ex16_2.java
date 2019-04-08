/*

작성자 : xxHANIxx
작성일자 : 2019.02.01.

문제 2.
요구사항] 숫자 2개를 입력받아 연산과정과 결과 출력하시오.
입력] 첫 번째 숫자 : 5
	  두 번째 숫자 : 3
결과] 5 + 3 = 8
	  5 - 3 = 2
	  5 * 3 = 15
	  5 / 3 = 1.7
	  5 % 3 = 2
조건] 천단위 표기, 나누기 결과 소수이하 1자리까지 출력

*/
import java.io.*;

class Ex16_2 
{
	public static void main(String[] args) throws Exception
	{
		// 문자열을 입력받기 위한 호출
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		// 문제설명
		System.out.println("문제 2. 숫자 2개를 입력받아 연산과정과 결과 출력하시오.\n");
	
		// 메시지 출력
		System.out.print("- 첫 번째 숫자 : ");

		// 문자열 입력
		String number1 = reader.readLine();

		// 위의 내용과 같음
		System.out.print("- 두 번째 숫자 : ");
		String number2 = reader.readLine();

		System.out.println();
		
		// 연산자 결과 출력
		System.out.printf("(1) %s + %s = %,d\n", number1, number2, 
			(Integer.parseInt(number1) + Integer.parseInt(number2)));
		System.out.printf("(2) %s - %s = %,d\n", number1, number2, 
			(Integer.parseInt(number1) - Integer.parseInt(number2)));
		System.out.printf("(3) %s * %s = %,d\n", number1, number2, 
			(Integer.parseInt(number1) * Integer.parseInt(number2)));
		// Float : 문자열을 실수형으로 변환
		System.out.printf("(4) %s / %s = %,.1f\n", number1, number2, 
			(Float.parseFloat(number1) / Float.parseFloat(number2)));
		System.out.printf("(5) %s %% %s = %,d\n", number1, number2, 
			(Integer.parseInt(number1) % Integer.parseInt(number2)));

		System.out.println();
	}
}
