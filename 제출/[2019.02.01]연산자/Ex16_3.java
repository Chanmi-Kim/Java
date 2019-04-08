/*

작성자 : xxHANIxx
작성일자 : 2019.02.01.

문제 3.
요구사항] 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.
입력] 너비(cm) : 20
	  높이(cm) : 10
출력] 사각형의 넓이는 200cm2입니다.
	  사각형의 둘레는 60cm입니다.

*/

import java.io.*;

class Ex16_3
{
	public static void main(String[] args) throws Exception
	{
		// 문자열을 입력받기 위한 호출
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		// 문제설명
		System.out.println("문제 3. 사각형의 너비와 높이를 입력받아 넓이와 둘레를 출력하시오.\n");
		
		// 메시지 출력
		System.out.print("- 너비(cm) : ");

		// 문자열 입력
		String width = reader.readLine();

		// 위의 내용과 같음
		System.out.print("- 높이(cm) : ");
		String height = reader.readLine();
		
		// 결과 출력
		// , : 천단위 표시
		// 문자열을 정수형으로 변환
		System.out.printf("\n(1) 사각형의 넓이는 %,dcm2입니다.\n", 
			(Integer.parseInt(width) * Integer.parseInt(height)));
		System.out.printf("(2) 사각형의 둘레는 %,dcm입니다.\n", 
			((Integer.parseInt(width) + Integer.parseInt(height))*2));

		System.out.println();
	}
}
