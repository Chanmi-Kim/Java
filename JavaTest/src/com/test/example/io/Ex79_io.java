package com.test.example.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ex79_io {
	
	
	
	public static void main(String[] args) {
		
		//Ex79_io.java
		
		/*
		
		파일 입출력
		- 콘솔 입출력과 유사(printXXX(), readXXX())
		- 자바 응용프로그램상에 다루는 데이터 > 저장소 > 메모리(휘발성) > 영구 보관 불가능 > 보조 기억 장치 > HDD(SDD) > 데이터 읽기/쓰기
		
		1. 텍스트 입출력(***)
		- 문자(열) 읽기/쓰기(0101000010001 > 문자 변환 가능)
		- 메모장
		
		2. 바이너리 입출력
		- 비문자열 읽기/쓰기(010100100100010 - 이진데이터)
		- 이미지, 동영상, 압축파일, 실행파일 등..
		
		
		인코딩, Encoding
		- 문자 코드를 부호화(0,1)하는 작업
		
		디코딩, Decoding
		- 부호 데이터를 문자 코드로 변환하는 작업(복호화)
		
		
		인코딩/디코딩 규칙
		- 1 = 2 = 3 = 6 
		1. ISO-8859-1
		2. EUC-KR
		3. ANSI
		4. UTF-8
		5. UTF-16
		6. MS949
		
		ANSI
		1. 영어 : 1byte
		2. 한글 : 2byte
		
		UTF-8
		1. 영어 : 1byte
		2. 한글 : 3byte
		
		UTF-16
		1. 영어 : 2byte
		2. 한글 : 2byte
		
		
		*/
		
		//m1();
		//m2();
		
		//m3();
		//m4();
		
		//m5(); //****
		//m6(); //************
		
		//m7();
		
		//m8(); //업무 적용 > 프로젝트 적용
		m9();
		
		
	}//main

	private static void m9() {
		
		try {
			
			BufferedReader reader = new BufferedReader(new FileReader(FilePath.MEMBER));
			
			System.out.println("[이름]\t[나이]\t[연락처]\t[주소]");
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				//1바퀴 > 회원 1명
				//System.out.println(line);
				String[] temp = line.split("\\|"); //&, |
				System.out.printf("%s\t%s\t%s\t%s\n"
						, temp[0], temp[1], temp[3], temp[2]);
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	private static void m8() {
		
		//회원 정보 입출력
		// - 이름, 나이, 주소, 연락처
		// - 파일 입출력
		
		//***** 데이터 파일의 포맷 설계
		// - 홍길동|20|서울시|010
		
		//파일 미리 생성
		// - 위치 > member.dat
		
		//상대 경로
		// - 나를 중심으로 표현
		// - test.txt
		// - ..\test.txt
		// - sub\test.txt
		
		//절대 경로
		// - 공통된 기준으로 중심으로 표현
		// - 드라이브명으로 시작
		// - C:\Class\Java\test.txt
		
		//File file = new File("dat\\a.dat");
		//File file = new File("P:\\class\\java\\JavaTest\\a.dat");
		
		//System.out.println(file.getPath());
		//System.out.println(file.getAbsolutePath());
		
		//System.out.println(file.exists());
		
		try {
			
			//이어쓰기 모드 + 쓰기 스트림 생성
			BufferedWriter writer 
				= new BufferedWriter(new FileWriter(FilePath.MEMBER, true)); 
			
			//사용자 입력
			Scanner scan = new Scanner(System.in);
			
			System.out.print("이름 : ");
			String name = scan.nextLine();
			
			System.out.print("나이 : ");
			String age = scan.nextLine();
			
			System.out.print("주소 : ");
			String address = scan.nextLine();
			
			System.out.print("연락처 : ");
			String tel = scan.nextLine();
			
			//홍길동|20|서울시|010
			writer.write(String.format("%s|%s|%s|%s\r\n", name, age, address, tel));
			
			writer.close();
			
			
			System.out.println("작성 완료.");
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}

	private static void m7() {
		
		try {
			
			String path = "P:\\class\\java\\JavaTest\\src\\example\\Ex30_String.java";
			
			BufferedReader reader = new BufferedReader(new FileReader(path));
			
			String line = null;
			int lineNumber = 1;
			
			while ((line = reader.readLine()) != null) {
				System.out.printf("%03d: %s\n", lineNumber, line);
				lineNumber++;
			}
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	private static void m6() {
		
		try {
			
			//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			BufferedReader reader = new BufferedReader(new FileReader("P:\\class\\java\\File\\data3.txt"));
			
			//System.out.println(reader.readLine());
			//System.out.println(reader.readLine());
			
			String line = null;
			
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			
			
			reader.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	private static void m5() {
		
		try {
			
			//쓰기(FileWriter & BufferedWriter)
			//읽기(FileReader & BufferedReader)
			BufferedWriter writer = new BufferedWriter(new FileWriter("P:\\class\\java\\File\\data3.txt"));
			
			writer.write("하나");
			writer.write("둘");
			writer.write("\r\n");
			writer.newLine();
			writer.write("셋");
			
			writer.close();
			
			System.out.println("완료");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	private static void m4() {
		
		//읽기
		try {
			
			//FileOutputStream <-> FileInputStream : 1바이트 읽기/쓰기
			//FileWriter <-> FileReader : 문자 읽기/쓰기
			
			FileReader reader = new FileReader("P:\\class\\java\\File\\data2.txt");
			
			//int code = reader.read();
			//System.out.println(code);//50504(안)
			//System.out.println((char)code);
			
			int code = -1;
			
			while ((code = reader.read()) != -1) {
				System.out.print((char)code);
			}
			
			reader.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void m3() {
		
		System.out.println("하나");
		//쓰기
		// - 바이트 단위 > 문자 단위 지원(2byte)
		// - 한글 가능
		
		
		try {
			
			//FileOutputStream
			//FileWriter
			
			//Create Mode
			//FileWriter writer = new FileWriter("P:\\class\\java\\File\\data2.txt");
			
			//Append Mode
			FileWriter writer = new FileWriter("P:\\class\\java\\File\\data2.txt", true);
			
			//writer.write(65);
			writer.write("\r\n반갑습니다.");//syso
			
			writer.close();
			
			System.out.println("완료");
			
		} catch (Exception e) {
			System.out.println("Ex79_io.m3()");
		}
		
	}

	private static void m2() {
		
		//읽기
		// - 바이트 단위 읽기
		// - System.in.read()
		
		try {
			
			//읽기 전용 스트림 객체 생성
			FileInputStream stream = new FileInputStream("P:\\class\\java\\File\\data.txt");
			
//			int code = stream.read();
//			System.out.println(code);
//			
//			code = stream.read();
//			System.out.println(code);
			
			//기억***
			int code = -1;
			
			while ((code = stream.read()) != -1) {
				//-1을 만날때까지(더 이상 읽을 내용이 없을 때까지)
				System.out.print((char)code);
			}
			
			
			//스트림 닫기
			stream.close();
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	private static void m1() {
		
		//쓰기
		//1. 바이트 단위 쓰기
		// - 1바이트 단위 > 문자 코드값 1바이트 > ASCII 코드 지원
		
		//파일에 데이터 저장하기
		//1. 스트림 객체 생성하기
		//2. 스트림 객체를 사용해 쓰기 작업 실행
		//3. 스트림 닫기
		
		File file = new File("P:\\class\\java\\File\\data.txt");
		
		try {
			
			//대상 파일을 참조하는 스트림 생성
			//스트림 모드
			//1. 생성 모드, Create Mode
			//	- 기본 모드
			//	- 파일이 없으면 파일을 생성한다.
			//	- 파일이 있으면 무조건 덮어쓰기
			//2. 추가 모드, Append Mode
			//	- 추가 지정
			//	- 이어쓰기 모드
			FileOutputStream stream = new FileOutputStream(file, true);
			
			//쓰기 작업
			//stream.write(67); //문자 코드값
//			for (int i=65; i<=65+25; i++) {
//				stream.write(i);
//				stream.write('\r');
//				stream.write('\n');
//			}
			
			stream.write('홍');
			
			//스트림 닫기(***)
			stream.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

























