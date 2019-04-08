/*

작성자 : xxHANIxx
작성일자 : 2019.02.12.

요구사항 5. 아래와 같이 출력하시오.

출력]
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55

추가조건]
시작/종료 숫자를 사용자에게 입력받아 출력하시오.

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27_05 {
	public static void main (String[] args) throws IOException {
		
		numberSum();
	}

	private static void numberSum() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0; // 누적 변수
		
		System.out.print("시작숫자 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료숫자 : ");
		int endNum = Integer.parseInt(reader.readLine());
		
		for(int i=startNum; i<=endNum; i++) {
			
			if (i != endNum) {
				System.out.printf("%d + ", i);
			} else {
				System.out.printf("%d", i);
			}
			sum += i;
		}
		System.out.printf(" = %d\n", sum);
	}
}
