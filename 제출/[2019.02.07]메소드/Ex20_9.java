/*

작성자 : xxHANIxx
작성일자 : 2019.02.07.

요구사항9. 지하철 탑승 소요 시간을 구하시오.
지나가는 역의 개수, 환승역의 횟수 등을 전달 받아 총 걸리는 시간을 반환하는
메소드를 선언하고 호출하시오.

입력]
역의 개수 : 15
환승역의 횟수 : 1

출력]
총 소요 시간은 33분입니다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex20_9
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("환승시간대(ex. 평상, 출근, 퇴근 중 택1) : ");
		String time = reader.readLine();
		System.out.print("역의 개수 : ");
		String station = reader.readLine();
		System.out.print("환승역의 횟수 : ");
		String transfer = reader.readLine();
		
		int stationTime = Integer.parseInt(station);
		int transferTime = Integer.parseInt(transfer);

		// 메소드 호출 및 출력
		int result = getTime(time, stationTime, transferTime);
		System.out.printf("총 소요 시간은 %d분입니다.\n", result);


	}

	public static int getTime(String time, int stationTime, int transferTime)
	{
		// 입력받은 문자열 비교 : 비교할 변수.equlas("문자열")
		// 시간대에 따라 다른 환승 소요 시간을 조건연산자로 제어
		int timeLine = time.equals("평상") ? 3 : // 평상 : 3분
			(time.equals("출근") ? 4 : // 출근 : 4분
			(time.equals("퇴근") ? 5 : null)); // 퇴근 : 5분

		int result = stationTime * 2 + transferTime * timeLine;
		return result;
	}
}
