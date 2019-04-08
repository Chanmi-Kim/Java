
/*

작성자 : xxHANIxx
작성일자 : 2019.02.12.

요구사항 8. 숫자를 N개 입력받아 아래와 같이 출력하시오.

입력]
숫자 : 5
숫자 : 7
..
숫자 : 15
숫자 : 12

출력]
5 - 7 + .. - 15 + 12 = 1XX

조건]
누적값이 100을 넘어가는 순간 루프를 종료하시오.
짝수는 더하고 홀수는 빼시오.

추가조건]
루프를 종료할 누적값을 사용자가 입력할 수 있도록 하시오.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27_08 {
	public static void main(String[] args) throws IOException {
		numCompare();
	}

	private static void numCompare() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		System.out.print("루프를 종료할 누적값 : ");
		int result = Integer.parseInt(reader.readLine());
		
		String txt = ""; // 문자열 저장할 변수 선언
		
		for (int i=0; ; i++) {
			
			if (i == 0) {
				
				System.out.print("숫자 : ");
				int number = Integer.parseInt(reader.readLine());
				txt += number;
				sum += number;	
				
			} else if (i > 0) {
				
				System.out.print("숫자 : ");
				int number = Integer.parseInt(reader.readLine());
				
				if (number % 2 == 0) { // 짝수 : 덧셈
					txt += " + " + number;
					sum += number;
				} else { // 홀수 : 뺄셈
					txt += " - " + number;
					sum -= number;
				}
				
			}
			
			if (sum >= result) { // 누적값이 넘어가는 순간 루프 종료
				txt += " = " + sum;
				break;
			}
			
		}
		
		System.out.println(txt);
	}
}