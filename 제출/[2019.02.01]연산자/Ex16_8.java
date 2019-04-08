/*

작성자 : xxHANIxx
작성일자 : 2019.02.01.

문제8.
요구사항] 영문자 1문자를 입력받아 그 문자가 대문자? 소문자? 구분하시오
입력] 문자 : a
출력] 'a'는 소문자입니다.
입력] 문자 : B
출력] 'B'는 대문자입니다.

*/

import java.io.*;

class Ex16_8  
{
	public static void main(String[] args) throws Exception
	{	
		// 문자열을 입력받기 위한 호출
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 문제설명
		System.out.println("문제 8. 영문자 1문자를 입력받아 그 문자가 대문자? 소문자? 구분하시오.\n");

		// 메시지 출력
		System.out.print("- 문자 : ");

		// 문자열 입력
		String letter1 = reader.readLine(); //"a"

		// 문자열을 문자로 변환
		char c1 = letter1.charAt(0);//'a'

		// 문자 비교 후 반환
		System.out.printf("=> '%c'는 %s입니다.\n\n", c1, (c1 >= 97) && (c1 <= 122) ? "소문자" : "대문자" );
		
		// 위의 내용과 같음
		System.out.print("- 문자 : ");
		String letter2 = reader.readLine();
		char c2 = letter2.charAt(0);
		System.out.printf("=> '%c'는 %s입니다.\n", c2, (c2 >= 65) && (c2 <= 90) ? "대문자" : "소문자" );

		System.out.println();
	}
}
