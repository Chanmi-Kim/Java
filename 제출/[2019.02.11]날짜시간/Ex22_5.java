/*

작성자 : xxHANIxx
작성일자 : 2019.02.08.

요구사항5. 여러 배달 음식을 같은 시간에 받기를 원하는 고객이 있다.
고객이 각각의 매장에 몇 시에 전화를 해야 모든 음식을 같은 시간에 받을 수 있는지 알려주시오.

입력]
음식을 받기 원하는 시각
시 : 14
분 : 0

출력]
짜장면 : 13시 50분
치킨 : 13시 42분
피자 : 13시 35분

*** 조건
전화를 걸면 짜장면은 10분 뒤에, 치킨은 18분 뒤에, 피자는 25분 뒤에 도착합니다.
날짜가 바뀌는 경우는 처리하지 않습니다.

*/
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex22_5 
{
	public static void main(String[] args) throws Exception
	{
		deliveryTimeCalc();
	}
	public static void deliveryTimeCalc() throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


		System.out.println("음식을 받기 원하는 시각");
		System.out.print("시 : ");
		String deliveryHour = reader.readLine();
		System.out.print("분 : ");
		String deliveryMin = reader.readLine();

		int hour = Integer.parseInt(deliveryHour) * 60; // 시간을 분으로 환산
		int min = Integer.parseInt(deliveryMin);
			
		// 분으로 통합 
		int total = hour + min;

		blackNoodle(total);
		chicken(total);
		pizza(total);

	}

	public static void blackNoodle(int total) // 짜장면
	{
		int blackNoodleTime = 10;
		total -= blackNoodleTime;
		
		// 통합된 시, 분 재분배
		System.out.printf("짜장면 : %d시 %d분\n", total / 60, total % 60);
	}

	public static void chicken(int total) // 치킨
	{
		int chickenTime = 18;
		total -= chickenTime;

		// 통합된 시, 분 재분배
		System.out.printf("치킨 : %d시 %d분\n", total / 60, total % 60);
	}

	public static void pizza(int total) // 피자
	{
		int pizzaTime = 25;
		total -= pizzaTime;

		// 통합된 시, 분 재분배
		System.out.printf("피자 : %d시 %d분\n", total / 60, total % 60);
	}
}