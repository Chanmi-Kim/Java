/*

작성자 : xxHANIxx
작성일자 : 2019.02.11.

요구사항 1. 숫자 2개를 입력받아 큰 수와 작은 수를 출력하시오.

입력] 
첫 번째 숫자 : 5
두 번째 숫자 : 3

출력]
큰 수는 5이고, 작은 수는 3입니다.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_1 {
	public static void main(String[] args) throws IOException {
		
		numCompare();
	}
	
	public static void numCompare() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("첫 번째 숫자 : ");
		int number1 = Integer.parseInt(reader.readLine());
		System.out.print("두 번째 숫자 : ");
		int number2 = Integer.parseInt(reader.readLine());
		
		if( number1 < number2) {
			System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다.", number2, number1);
		} else {
			System.out.printf("큰 수는 %d이고, 작은 수는 %d입니다.", number1, number2);
		}
	}
}
