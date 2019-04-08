/*
 
작성자 : xxHANIxx
작성일자 : 2019.02.12.

요구사항 3. 숫자 1개를 입력받아 1부터 입력한 숫자까지의 합을 출력하시오.

입력]
숫자 : 5
 
출력]
1 ~ 5 = 15

조건]
천단위 출력하시오.

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27_03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 : ");
		int number = Integer.parseInt(reader.readLine());
		int sum = 0;
		
		for(int i=1; i<=number; i++) {
			
			sum += i;
		}
		
		System.out.printf("1 ~ %,d = %,d", number, sum);
	}
	
}
