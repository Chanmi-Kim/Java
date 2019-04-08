/*

작성자 : xxHANIxx
작성일자 : 2019.02.11.

요구사항 9. 날짜를 입력받아 아래의 조건에 맞게 결과를 출력하시오.

입력] 
년 : 2019
월 : 2
일 : 11

출력]
입력하신 날짜는 '평일'입니다.
해당 주의 토요일로 이동합니다.
이동한 날짜는 '2019-02-16' 입니다.

입력] 
년 : 2019
월 : 2
일 : 17

출력]
입력하신 날짜는 '휴일'입니다.
결과가 없습니다.

조건]
입력받은 날짜가 평일이면 해당 주의 토요일을 알아낸다.
입력받은 날짜가 휴일이면 아무것도 안한다.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex25_9 {
	public static void main (String[] args) throws IOException {
		calendarCalc();
	}
	
	public static void calendarCalc() throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Calendar satDay = Calendar.getInstance();
		
		System.out.print("년 : ");
		int year = Integer.parseInt(reader.readLine());
		System.out.print("월 : ");
		int month = Integer.parseInt(reader.readLine());
		System.out.print("일 : ");
		int date = Integer.parseInt(reader.readLine());
		
		satDay.set(year, month - 1, date); // 입력한 날짜 세팅
		
		String day = "휴일";
		
		if (satDay.get(Calendar.DAY_OF_WEEK) == 1 || satDay.get(Calendar.DAY_OF_WEEK) == 7) {
			System.out.printf("입력하신 날짜는 '%s'입니다.\n", day);
			System.out.println("결과가 없습니다.");
		} else {
			day = "평일";
			
			System.out.printf("입력하신 날짜는 '%s'입니다.\n", day);
			System.out.println("해당 주의 토요일로 이동합니다.");
			
			if(satDay.get(Calendar.DAY_OF_WEEK) == 2) {
				satDay.add(Calendar.DATE, 5);
				System.out.printf("이동한 날짜는 '%tF' 입니다.", satDay);
			} else if(satDay.get(Calendar.DAY_OF_WEEK) == 3) {
				satDay.add(Calendar.DATE, 4);
				System.out.printf("이동한 날짜는 '%tF' 입니다.", satDay);
			} else if(satDay.get(Calendar.DAY_OF_WEEK) == 4) {
				satDay.add(Calendar.DATE, 3);
				System.out.printf("이동한 날짜는 '%tF' 입니다.", satDay);
			} else if(satDay.get(Calendar.DAY_OF_WEEK) == 5) {
				satDay.add(Calendar.DATE, 2);
				System.out.printf("이동한 날짜는 '%tF' 입니다.", satDay);
			} else if(satDay.get(Calendar.DAY_OF_WEEK) == 6) {
				satDay.add(Calendar.DATE, 1);
				System.out.printf("이동한 날짜는 '%tF' 입니다.", satDay);
			}
		}
	}
}
