/*

작성자 : xxHANIxx
작성일자 : 2019.02.13.

요구사항 5. 아래와 같이 출력하시오.

출력]

    aa
   abba
  abccba
 abcddbca
abcdeedcba

추가조건]
행의 갯수를 입력받으시오. (홀수만)

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex28_05 {
	
	public static void main(String[] args) throws IOException{
	
		// originalCode(); // 출력할 때 문자로 바꿔주는 메소드
		ascii(); // 아스키코드값을 이용한 메소드	
	}

	public static void ascii() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("행의 갯수 : ");
		int num = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<num; i++) { // 행
			for (int j=i+1; j<num; j++) {
				System.out.print(" ");
			}
			
			
			for (int j=97; j<=97+i; j++) { // 열
				System.out.print((char)j);
			} 
			
			for (int j=97+i; j>=97; j--) {
				System.out.print((char)j);
			}
			
			System.out.println();
		}
	}
	
	public static void originalCode() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
		System.out.print("행의 갯수 : ");
		int num = Integer.parseInt(reader.readLine());
		
		for (int i=0; i<num; i++) { // 행
			for (int j=i+1; j<num; j++) {
				System.out.print(" ");
			}
			
			for (int j=0; j<=i; j++) { // 열
				System.out.printf("%c", 97 + j);
			} 
			
			for (int j=i; j>=0; j--) {
				System.out.printf("%c", 97 + j);
			}
			
			System.out.println();
		}
	}
}
