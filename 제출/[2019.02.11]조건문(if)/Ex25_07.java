/*

작성자 : xxHANIxx
작성일자 : 2019.02.11.

요구사항 7. 주차 요금을 계산하시오.

입력] 
[ 들어온 시간 ]
시 : 13
분 : 30
[나간 시간]
시 : 14
분 : 20

출력]
주차 요금은 4,000원입니다.

조건]
무료 주차 : 30분
초과 10분당 : 2,000원
Calendar를 사용해서 한 번 풀고, 사용하지 말고 한 번 푸시오.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex25_7 {
	public static void main(String[] args) throws IOException{
		
		feeCalc(); // Calendar 미사용
		// feeCalendarCalc();// Calendar 사용
		
	}
	
	public static void feeCalc() throws IOException { // Calendar 미사용
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("[ 들어온 시간 ] ");
		System.out.print("시 : ");
		int inHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int inMin = Integer.parseInt(reader.readLine());
		
		System.out.println("[ 나간 시간 ]");
		System.out.print("시 : ");
		int outHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int outMin = Integer.parseInt(reader.readLine());
		
		int fee = 0; // 주차요금
		inMin = inHour * 60 + inMin;
		outMin = outHour * 60 + outMin;
		int min = outMin - inMin;
		
		if (min < 30) {
			System.out.println("주차 요금은 무료입니다.");
		} else {
			fee = (min - 30) / 10 * 2000;
		
			System.out.printf("주차 요금은 %,d원입니다.", fee);
		}
	}
	
	public static void feeCalendarCalc() throws IOException { // Calendar 사용
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Calendar in = Calendar.getInstance();
		
		System.out.println("[ 들어온 시간 ] ");
		System.out.print("시 : ");
		int inHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int inMin = Integer.parseInt(reader.readLine());
		
		in.set(0, 0, 0, inHour, inMin, 0);
		long inTick = in.getTime().getTime();
		
		
		Calendar out = Calendar.getInstance();
		
		System.out.println("[ 나간 시간 ]");
		System.out.print("시 : ");
		int outHour = Integer.parseInt(reader.readLine());
		System.out.print("분 : ");
		int outMin = Integer.parseInt(reader.readLine());
		
		out.set(0, 0, 0, outHour, outMin, 0);
		long outTick = out.getTime().getTime();
		
		long time = (outTick - inTick) / 1000 / 60;
		long fee = 0; // 주차요금
		
		if (time < 30) {
			System.out.println("주차 요금은 무료입니다.");
		} else {
			fee = (time - 30) / 10 * 2000;
			System.out.printf("주차 요금은 %,d원입니다.", fee);
		}
	}
}
