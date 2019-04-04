package example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Ex25_if {

	public static void main(String[] args) throws Exception { 

		/*
		
		제어문
		- 프로그램 코드의 실행 순서를 제어하는 역할
		
		1. 조건문
			a. if
			b. switch
			
		2. 반복문
			a. for
			b. while
			c. do while
			d. for(향상된 for문, Enhanced For Statement)
			
		3. 분기문
			a. break
			b. continue
			c. goto(JDK 1.5 -> 폐기)
		
		
		
		if문
		- 조건을 제시한 후 결과에 따라 실행할 코드를 선택하는 제어
		- 조건은 반드시 boolean값을 가진다.
		- A ? B : C
		
		
		if (조건식) { 
			
			실행문; 
		
		}
		
		
		
		if (조건식) { 
			
			실행문; 
		
		} else {
		
			실행문;
			
		}
		
		
		
		//다중 if문
		if (조건식) { //1회. 필수
			
			실행문; 
		
		} else if (조건식) { //0~N회. 선택
		
			실행문;
			
		} else { //0~1회. 선택
		
			실행문;
			
		}
		
		
		
		*/
		
		
		//리팩토링
		// - 이미 완성된 코드의 일부를 개선하는 작업
		
		
		//Eclipse
		// - IDE. Integrated Development Environment. 통합 개발 환경
		// - RAD. Rapid Application Development. 빠른 속도 개발
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//m1(reader);
		//m2(reader);
		//m3(reader);
		//m4(reader);
		m5(reader);
	}
	
	private static void m5(BufferedReader reader) throws IOException {
		
		//조건식
		// - 대다수 언어는 조건으로 boolean이 아닌 값을 사용한다.
		// - 정수 : 0(false), 1(true).. 0이 아닌 숫자(true)
		// - 실수 : 0.0(false), 그 외의 숫자(true)
		// - 문자 : \0(null - false), 그 외의 문자(true)
		// - 문자열 : ""(false), 그외의 문자열(true)
		
//		int n = 10;
//		
//		if (n) {
//			System.out.println("참");
//		} else {
//			System.out.println("거짓");
//		}
		
	}
	
	private static void m4(BufferedReader reader) throws IOException {
		
		//Calendar
		//요구사항] 생일 입력 -> 무슨 요일?
		
		System.out.print("년 : ");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.print("월 : ");
		int month = Integer.parseInt(reader.readLine());
		
		System.out.print("일 : ");
		int date = Integer.parseInt(reader.readLine());
		
		
		Calendar birthday = Calendar.getInstance();
		
		birthday.set(year, month - 1, date);
		
		System.out.printf("생일인 %tF은 %tA입니다.\n"
							, birthday
							, birthday);
	}


	private static void m3(BufferedReader reader) throws IOException {
		
		//요구사항] 나이 입력 -> 원하는 나이대?
		//19세 이상 ~ 60세 미만
		
		System.out.print("나이 : ");
		
		int age = Integer.parseInt(reader.readLine());
		
		if (age >= 19 && age < 60) {
			//참
			System.out.println("합격");
		} else {
			//거짓
			System.out.println("불합격");
		}
		
		
		
		if (age >= 19 && age < 60) {
			System.out.println("합격");
		} else {
			//중첩 if문, Nested if Statement
			if (age < 19) {
				System.out.println("불합격 - 어려서");
			} else {
				System.out.println("불합격 - 많아서");
			}
		}
		
		
		//안좋은 코드
		if (age >= 19 && age < 60) {
			System.out.println("합격");
		} else if (age < 19) {
			System.out.println("불합격 - 어려서");
		} else if (age >= 60) {
			System.out.println("불합격 - 많아서");			
		}
		
		
	}


	private static void m2(BufferedReader reader) throws IOException {
		
		//숫자입력
		System.out.print("숫자 : ");
		
		int num = Integer.parseInt(reader.readLine());
		
		//짝수 or 홀수
		if (num % 2 == 0) {
			System.out.println("짝수");
		} else { //if (num % 2 == 1) {
			System.out.println("홀수");
		}
		
		
	}


	private static void m1(BufferedReader reader) throws IOException {
		//Ctrl + 1
		//Ctrl + Shift + O
		
		
		//숫자입력
		System.out.print("숫자 입력 : ");
		
		int num = Integer.parseInt(reader.readLine());
		
		//입력 숫자가 양수인지?
//		if (num > 0) {
//			System.out.println("양수");
//		}
		
		
//		if (num > 0) {
//			System.out.println("양수입니다.");
//		} else {
//			System.out.println("양수가 아닙니다.");
//		}
		
		
		
		// TODO 점심 먹고 오류 체크할 것
		if (num > 0) {
			System.out.println("양수입니다.");
		} else if (num < 0) {
			System.out.println("음수가 아닙니다.");
		} else {
			System.out.println("0");
		}
		
		
		
		System.out.println("종료");
	}

}


























