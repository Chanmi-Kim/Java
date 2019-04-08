/*

작성자 : xxHANIxx
작성일자 : 2019.02.13.

요구사항 1. 아래와 같이 출력하시오.

출력]

*****
 ****
  ***
   **
    *

추가조건]
행의 갯수를 입력받으시오.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex28_1 {
	
	public static void main(String[] args) throws IOException{
	
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("행의 갯수 : ");
		int num = Integer.parseInt(reader.readLine());
		
		
		
		for (int i=num; i>0; i--) { // 행

			for (int j=i; j<num; j++) { // 열
				System.out.print(" ");
			}
			
			for (int j=i; j>0; j--) { // 열
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
