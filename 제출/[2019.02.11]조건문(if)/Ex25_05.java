/*

작성자 : xxHANIxx
작성일자 : 2019.02.11.

요구사항 5. 영문자 1개를 입력받아 대/소문자 변환을 한 뒤 출력하시오.

입력] 
문자 : a

출력]
5 * 3 = 15

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_5 {
	public static void main (String[] args) throws IOException{
		
		charChange();
	}
	
	public static void charChange() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("문자 : ");
		String letter = reader.readLine();

		// 문자열을 문자로 변환
		char c = letter.charAt(0);
		
		if ( c >= 97 && c <= 122) { // 소문자 비교
			
			System.out.printf("결과 : %c\n", c - 32);
			
		} else if (c >= 65 && c <= 90) { // 대문자 비교
			
			System.out.printf("결과 : %c\n", c + 32);
			
		} else {
			
			System.out.println("문자가 아닙니다.");
			
		}
	}
}
