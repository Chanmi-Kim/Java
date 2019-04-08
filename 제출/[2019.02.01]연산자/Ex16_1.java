/*

작성자 : xxHANIxx
작성일자 : 2019.02.01.

문제 1.
요구사항] 태어난 년도를 입력받아 나이를 출력하시오.
입력] 태어난 년도 ex.1999 : 1995
출력] 나이 : 25세
조건] 우리나라 나이 기준, 2019년

*/
import java.io.*;

class Ex16_1 
{
	public static void main(String[] args) throws Exception
	{
		// 문자열을 입력받기 위한 호출
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 문제설명
		System.out.println("문제 1. 태어난 년도를 입력받아 나이를 출력하시오.\n");

		// 메시지 출력
		System.out.print("- 태어난 년도 : ");

		// 문자열 입력
		String birthYear = reader.readLine();

		// 문자열을 정수형으로 변환 후, 우리나라 나이 기준을 표현하기 위해 +1한 결과값 반환
		System.out.printf("- 나이 : %d\n", (2019 - Integer.parseInt(birthYear)+1));

		System.out.println();
	}
}
