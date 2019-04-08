/*

작성자 : xxHANIxx
작성일자 : 2019.02.01.

문제 4.
요구사항] 자전거 1대. 자전거 바퀴의 지름이 26인치이다. 
사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.
입력] 사용자가 밟은 페달수 : 1000
출력] 사용자가 총 1,000회의 페달을 밟아 총 3,000m를 달렸습니다.
조건] 페달 1회전 == 자전거 바퀴1회전
	  // 원주율, 인치를 미터로 바꿀 것
	  천단위 표시

	  // *** 참고
	  // 원의 둘레 = 2파이r
	  // 26인치 = 0.6604미터

*/


import java.io.*;

class Ex16_4
{
	public static void main(String[] args) throws Exception
	{
		// 문자열을 입력받기 위한 호출
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 문제설명
		System.out.println("문제 4. 자전거 1대. 자전거 바퀴의 지름이 26인치이다.");
		System.out.println("사용자가 페달을 밟은 횟수를 입력하면 자전거가 총 몇 m를 달렸는지 출력하시오.\n");
		
		// 메시지 출력
		System.out.print("- 사용자가 밟은 페달수 : ");

		// 문자열 입력
		String pedalCount = reader.readLine();

		// 결과 메시지 출력

		// , : 천 단위 표시
		// .4 : 소수점 4자리까지 표현
		// 문자열을 실수형 Double로 변환
		System.out.printf("=> 사용자가 총 %,d회의 페달을 밟아 총 %,.4fm를 달렸습니다.\n", 
			Integer.parseInt(pedalCount), (2 * 3.14 * 0.3302 * Double.parseDouble(pedalCount)));

		System.out.println();
	}
}
