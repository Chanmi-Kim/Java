/*

작성자 : xxHANIxx
작성일자 : 2019.02.12.

요구사항 6. 아래와 같이 출력하시오.

출력]
1 - 2 + 3 - 4 + 5 - 6 + 7 - 8 + 9 - 10 = -5

추가조건]
시작/종료 숫자를 사용자에게 입력받아 출력하시오.

*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27_06 {
	public static void main (String[] args) throws IOException {
		
		numberOp();
	}

	private static void numberOp() throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int result = 0; // 누적 변수
		
		System.out.print("시작숫자 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료숫자 : ");
		int endNum = Integer.parseInt(reader.readLine());
		
		for(int i=startNum; i<=endNum; i++) {
			
			if (i != endNum) {
				if (i % 2 != 0) { // 홀수에 - 연산자 붙여서 출력
					System.out.printf("%d - ", i);
					result += i;
				} else { // 짝수에 - 연산자 붙여서 출력
					System.out.printf("%d + ", i);
					result -= i;
				}
			} else { // 마지막 숫자에 연산자 없이 출력
				System.out.printf("%d", i);
				result -= i;
			}
		}
		System.out.printf(" = %d\n", result);
	}
}
