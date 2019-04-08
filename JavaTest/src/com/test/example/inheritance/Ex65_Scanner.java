package com.test.example.inheritance;

import java.io.IOException;
import java.util.Scanner;

public class Ex65_Scanner {
	
	public static void main(String[] args) {
		
		//Ex65_Scanner.java
		//사용자 입력 
		//1. System.in.read()
		//2. BufferedReader
		//3. Scanner
		
		
		//이름 입력
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		
//		System.out.print("이름 : ");
//		String name = reader.readLine();
//		
//		System.out.println(name);
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("이름 : ");
//		String name = scan.nextLine(); //readLine(), 엔터를 만나기 전까지의 모든 내용
//		
//		System.out.println(name);
//		
//		System.out.print("숫자 : ");
//		int num = scan.nextInt();
//		
//		System.out.println(num * 2);
		
//		System.out.println("입력 : ");
//		String data = scan.next(); //토큰 반환
//		
//		System.out.println(data);
//		
//		data = scan.next(); //토큰 반환
//		
//		System.out.println(data);
//		
//		data = scan.next(); //토큰 반환
//		
//		System.out.println(data);
		
		
//		System.out.print("입력 : ");
//		String data = scan.nextLine();
//		
//		System.out.println(data);
//		
//		//문자열 메소드(split)
//		//홍길동 20 서울시 <- 구분자(splitter)
//		String[] result = data.split(" ");
//		System.out.println(result[0]);
//		System.out.println(result[1]);
//		System.out.println(result[2]);
		
		
		System.out.print("문자열 : ");
		String str = scan.nextLine();
		System.out.println(str);
		
		System.out.print("문자열 : ");
		str = scan.nextLine();
		System.out.println(str);
		
		System.out.print("문자열 : ");
		str = scan.nextLine();
		System.out.println(str);
		
		System.out.print("숫자 : ");
		int num = scan.nextInt();
		System.out.println(num);
		
		System.out.print("숫자 : ");
		num = scan.nextInt();
		System.out.println(num);
		
		System.out.print("숫자 : ");
		num = scan.nextInt();
		System.out.println(num);
		
		//숫자를 입력받고 그 뒤에 문자열을 입력받으면 생기는 현상
		//1.
		//scan.nextLine();//공회전
		//2.
		scan.skip("\r\n");
		
		System.out.print("문자열 : ");
		str = scan.nextLine();
		System.out.println(str);
		
		System.out.print("문자열 : ");
		str = scan.nextLine();
		System.out.println(str);
		
		
		
	}

}










