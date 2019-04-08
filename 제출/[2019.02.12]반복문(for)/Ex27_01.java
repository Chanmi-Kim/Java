/*
 
작성자 : xxHANIxx
작성일자 : 2019.02.12.

요구사항 1. 사용자의 이름과 인사할 횟수를 입력 받아 출력하시오.
 
입력]
이름 : 홍길동
횟수 : 3
 
출력]
홍길동님 안녕하세요~
홍길동님 안녕하세요~
홍길동님 안녕하세요~
  
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27_01 {

	public static void main(String[] args) throws IOException  {
		
		hello();
		
	}

	private static void hello() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 : ");
		String name = reader.readLine();
		System.out.print("횟수 : ");
		int number = Integer.parseInt(reader.readLine()); 
		
		for (int i=0; i<number; i++) {
			System.out.printf("%s님 안녕하세요~\n", name);
		}
		
	}
	
}
