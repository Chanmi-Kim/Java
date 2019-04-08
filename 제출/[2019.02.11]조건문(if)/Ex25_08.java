/*
 
작성자 : xxHANIxx
작성일자 : 2019.02.11.

요구사항 8. 년도를 입력받아 해당 년도가 '평년'인지 '윤년'인지 출력하시오.

입력] 
년도 입력 : 2019

출력]
2019년은 '평년'입니다.

조건]
a. 년도를 4로 나눈다.
떨어지면 b 검사
떨어지지 않으면 "평년"
b. 년도를 100으로 나눈다.
떨어지면 c 검사
떨어지지 않으면 "윤년"
c. 년도를 400으로 나눈다.
떨어지면 "윤년"
떨어지지 않으면 "평년"

Calendar, Date 클래스 사용 금지

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_8 {
	public static void main (String[] args) throws IOException {
		
		yearOutput();
		
	}
	
	public static void yearOutput() throws IOException{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도 입력 : ");
		int year = Integer.parseInt(reader.readLine());
		
		String yearBoolean = yearBooleanCalc(year);
		System.out.printf("%d년은 '%s'입니다.", year, yearBoolean);
	}
	
	public static String yearBooleanCalc(int year) {
		if (year % 4 != 0) {
			return "평년";
		} else if (year % 100 != 0) {
			return "윤년";
		} else if (year % 400 != 0) {
			return "윤년";
		} else {
			return "평년";
		}
	}
}
