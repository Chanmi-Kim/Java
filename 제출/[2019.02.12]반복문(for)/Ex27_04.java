/*

작성자 : xxHANIxx
작성일자 : 2019.02.12.

요구사항 4. 숫자 10개를 입력받아 짝수의 합과 홀수의 합을 각각 출력하시오.

입력]
숫자 : 5
숫자 : 2
숫자 : 12
..
숫자 : 7
숫자 : 24

출력]
짝수의 합 : 52
홀수의 합 : 42

조건]
천단위 출력하시오.

추가조건]
입력받을 숫자의 개수도 입력받으시오.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27_04 {
	public static void main(String[] args) throws IOException{
		
		sumCalc();
	
	}
	
	public static void sumCalc() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int oddNum = 0; // 홀수합
		int evenNum = 0; // 짝수합
		
		System.out.print("입력할 횟수 : ");
		int numInput = Integer.parseInt(reader.readLine());
		
		// 조건문에 입력할 횟수만큼 제어
		for(int i=0; i<numInput; i++) {
			
			// 입력한 횟수만큼 숫자 입력받기
			System.out.print("숫자 : ");
			int n = Integer.parseInt(reader.readLine());
			
			for(;;) {
				if (n % 2 == 0) { // 짝수비교
					evenNum += n; 
					break;
				} else { // 홀수 비교
					oddNum += n; 
					break;
				}
			}
		}
		
		// 결과 출력
		System.out.printf("짝수의 합 : %,d\n", evenNum);
		System.out.printf("홀수의 합 : %,d\n", oddNum);	
	}
}
