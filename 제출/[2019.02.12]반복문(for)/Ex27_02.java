/*
 
작성자 : xxHANIxx
작성일자 : 2019.02.12.

요구사항 2. 숫자 2개를 입력 받아 시작 숫자에서 종료 숫자까지 1씩 증가하며 출력하시오.

입력]
시작 숫자 : 5
종료 숫자 : 12
 
출력]
5
6
7
8
9
10
11
12

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27_02 {

	public static void main(String[] args) throws IOException {
		
		//numberOutput(); // 1씩 증가
		numberOutputPlus(); // 2씩 증가치 추가
		
	}

	private static void numberOutputPlus() throws IOException { // 2씩 증가치 추가 메소드
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작숫자 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료숫자 : ");
		int endNum = Integer.parseInt(reader.readLine());
		System.out.print("증가치 설정 : ");
		int add = Integer.parseInt(reader.readLine());
		
		for(int i=startNum; i<=endNum; i += add) {
			
				System.out.println(i);
			
		}
		
	}

	private static void numberOutput() throws IOException { // 1씩 증가 메소드

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작숫자 : ");
		int startNum = Integer.parseInt(reader.readLine());
		System.out.print("종료숫자 : ");
		int endNum = Integer.parseInt(reader.readLine());
		
		for(int i=startNum; i<=endNum; i++) {
			
				System.out.println(i);
			
		}
	}
	
}
