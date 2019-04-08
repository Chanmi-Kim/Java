/*

작성자 : xxHANIxx
작성일자 : 2019.02.07.

요구사항10. 사과 나무 씨앗을 심을 날로부터 특정 시간이 흘렀을 때
사과 총 몇 개가 열리는지 구하는 메소드를 선언하시오.

입력]
맑은 날 : 20
흐린 날 : 5

출력]
사과가 총 15개 열렸습니다.

*/


import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex20_10  
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("맑은 날 : ");
		String sunny = reader.readLine();
		System.out.print("흐린 날 : ");
		String cloud = reader.readLine();
		
		int sunnyWeather = Integer.parseInt(sunny);
		int cloudWeather = Integer.parseInt(cloud);

		// 메소드 호출 및 출력
		int apple = getApple(sunnyWeather, cloudWeather);
		System.out.printf("사과가 총 %d개 열렸습니다.\n", apple);
	}

	public static int getApple(int sunnyWeather, int cloudWeather)
	{
		int height = 0; // 처음 사과나무를 심었을 때 나무의 길이
		int appleCount = 0;
	
		int sunnyHeight = sunnyWeather * 5; // 맑은 날 사과나무의 성장률 : 5cm
		int cloudHeight = cloudWeather * 2; // 흐린 날 사과나무의 성장률 : 2cm
		height = sunnyHeight + cloudHeight;
		
		// 사과나무의 길이가 1m가 넘는 시점부터 10cm 자랄 때마다 사과가 1개씩 열린다.
		int apple = height > 100 ? (height - 100) / 10 : null;
	
		return apple;
	}
}
