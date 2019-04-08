/*

작성자 : xxHANIxx
작성일자 : 2019.02.14.

요구사항 1. 문장을 입력받아 역순으로 출력하시오.

입력]
문장 입력 : 안녕하세요. 홍길동입니다.

출력]
역순 결과 : .다니입동길홍 .요세하녕안

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex30_01 {

	public static void main(String[] args) throws Exception {
		stringOutput();
	}
	
	public static void stringOutput() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력 : ");
		String txt = reader.readLine();
		
		System.out.print("역순 결과 : ");
		for (int index=txt.length()-1; index>=0; index--) {
			System.out.print(txt.charAt(index));			
		}
	}
	
}
