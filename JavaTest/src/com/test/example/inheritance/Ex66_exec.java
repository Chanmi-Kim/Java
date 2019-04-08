package com.test.example.inheritance;

public class Ex66_exec {
	
	public static void main(String[] args) throws Exception {
		
		//Ex66_exec.java
		
		//자바에서 외부 프로그램 호출하기
		// - 예외처리 필수(try)
		// - 실행 파일의 전체 경로 호출
		// - 환경 변수 path 등록 > 실행 파일명 호출 
		
		//메모장 실행
		// - C:\Windows\System32\notepad.exe
		// - notepad.exe
		
		//Process notepad = new ProcessBuilder("notepad.exe").start();
		//Process notepad = new ProcessBuilder("mspaint.exe").start();
		//Process notepad = new ProcessBuilder("explorer.exe").start();
		//Process notepad = new ProcessBuilder("calc.exe").start();
		//Process notepad = new ProcessBuilder("C:\\Program Files\\EditPlus\\editplus.exe").start();
		
		//Process notepad = new ProcessBuilder("notepad.exe", "P:\\class\\java\\JavaTest\\src\\com\\test\\example\\inheritance\\Ex65_Scanner.java").start();
		//Process notepad = new ProcessBuilder("mspaint.exe", "P:\\dog.jpg").start();
		
		//영화관 > 미리보기
		//Process notepad = new ProcessBuilder("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe", "https://youtu.be/9s7b3_V7Up4").start();
		
		
		//Process notepad = new ProcessBuilder("javac.exe", "test.java").start();
		//Process notepad = new ProcessBuilder("java.exe", "test").start();
		
		System.out.println("실행 완료");
		
		
	}

}













