/*

작성자 : xxHANIxx
작성일자 : 2019.02.01.

문제 5.
요구사항] 영문 소문자(1문자)를 받아서 대문자로 변환 후 출력하시오.
입력] 문자 : a
출력] 결과 : A
조건] 문자 코드값 + 형변환

		// *** 참고
		// String input = reader.readLine(); // "a"
		// char c = input.charAt(0); // 'a'

*/

import java.io.*;

class Ex16_5 
{
	public static void main(String[] args) throws Exception
	{
		// 문자열을 입력받기 위한 호출
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 문제설명
		System.out.println("문제 5. 영문 소문자(1문자)를 받아서 대문자로 변환 후 출력하시오.\n");
		
		// 메시지 출력
		System.out.print("- 문자 : ");

		// 문자열 입력
		String letter = reader.readLine();

		// 문자열을 문자로 변환
		char c = letter.charAt(0);

		// 소문자와 대문자의 아스키코드값이 32 차이나므로, 문자에 32를 빼준 값으로 반환
		System.out.printf("=> 결과 : %c\n", c-32);

		System.out.println();
	}
}
