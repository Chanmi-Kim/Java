/*

작성자 : xxHANIxx
작성일자 : 2019.02.01.

문제9.
요구사항] 섭씨 온도를 입력받아 화씨 온도를 변환하시오.
입력] 섭씨(℃) : 29
출력] 섭씨 29℃는 화씨 84.2℉입니다.
조건] ℉ = ℃ x 1.8 + 32

*/

import java.io.*;

class Ex16_9
{
	public static void main(String[] args) throws Exception
	{
		// 문자열을 입력받기 위한 호출
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 문제설명
		System.out.println("문제 9. 섭씨 온도를 입력받아 화씨 온도를 변환하시오.\n");
		
		// 메시지 출력
		System.out.print("- 섭씨(℃) : ");
		String celsius = reader.readLine();
		
		// 문자열 Double로 변환하여 계산
		Double fahrenheit = (Double.parseDouble(celsius) * 1.8 + 32);

		// 결과 출력
		System.out.printf("=> 섭씨 %s℃는 화씨 %.1f℉입니다.\n", celsius, fahrenheit);

		System.out.println();
	}
}
