/*

작성자 : xxHANIxx
작성일자 : 2019.02.01.

문제7.
요구사항] 2019년 2월 1일은 금요일이다. 2019년 2월 중 날짜를 입력받아 그 날짜가 무슨 요일인지 출력하시오.
입력] 날짜 : 11
출력] 입력한 2019년 2월 11일은 월요일입니다.

*/

import java.io.*;

class Ex16_7
{
	public static void main(String[] args) throws Exception
	{
		// 문자열을 입력받기 위한 호출
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 문제설명
		System.out.println("문제 7. 2019년 2월 1일은 금요일이다. 2019년 2월 중 날짜를 입력받아 그 날짜가 무슨 요일인지 출력하시오.\n");

		// 메시지 출력
		System.out.print("- 날짜 : ");

		// 문자열 입력
		String date = reader.readLine();

		// 조건 연산자를 사용하여 7일로 나눈 나머지로 요일 정함
		String day = Integer.parseInt(date) % 7 == 4 ? "월" : 
			(Integer.parseInt(date) % 7 == 5 ? "화" : 
			(Integer.parseInt(date) % 7 == 6 ? "수" : 
			(Integer.parseInt(date) % 7 == 7 ? "목" : 
			(Integer.parseInt(date) % 7 == 1 ? "금" :
			(Integer.parseInt(date) % 7 == 2 ? "토" : 
			(Integer.parseInt(date) % 7 == 3 ? "일" : null)))))); // 마지막은 null값으로 처리함

		// 연산 결과 반환
		System.out.printf("=> 입력한 2019년 2월 %s일은 \"%s요일\"입니다.\n", date, day);

		System.out.println();
	}
}
