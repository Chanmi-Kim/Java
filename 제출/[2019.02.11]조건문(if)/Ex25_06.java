/*

작성자 : xxHANIxx
작성일자 : 2019.02.11.

요구사항 6. 숫자 5개를 입력받아 짝수와 홀수의 개수를 출력하시오.

입력] 
숫자 입력 : 3
숫자 입력 : 2
숫자 입력 : 7
숫자 입력 : 1
숫자 입력 : 8

출력]
짝수는 2개 홀수는 3개 입력했습니다.
홀수가 짝수보다 1개 더 많습니다.

// 추가문제
입력받는 숫자를 한글로 바꾸시오.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_6 {
	public static void main(String[] args) throws IOException {
		
		numCompare();
	}
	
	public static void numCompare() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자 입력 : ");
		int n1 = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력 : ");
		int n2 = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력 : ");
		int n3 = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력 : ");
		int n4 = Integer.parseInt(reader.readLine());
		
		System.out.print("숫자 입력 : ");
		int n5 = Integer.parseInt(reader.readLine());
		
		result(n1, n2, n3, n4, n5);
		korOutput_n1(n1);
		korOutput_n2(n2);
		korOutput_n3(n3);
		korOutput_n4(n4);
		korOutput_n5(n5);
		
	}
	
	public static void result(int n1, int n2, int n3, int n4, int n5) {
		
		int oddNum = 0; // 홀수
		int evenNum = 0; // 짝수
		int result = 0;
		
		// 짝수 비교 후 홀수 비교
		if (n1 % 2 == 0) { evenNum += 1; } else { oddNum += 1; }
		if (n2 % 2 == 0) { evenNum += 1; } else { oddNum += 1; }
		if (n3 % 2 == 0) { evenNum += 1; } else { oddNum += 1; }
		if (n4 % 2 == 0) { evenNum += 1; } else { oddNum += 1; }
		if (n5 % 2 == 0) { evenNum += 1; } else { oddNum += 1; }
			
		System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다.\n", evenNum, oddNum);
		
		if(evenNum > oddNum) {
			result = evenNum - oddNum;
			System.out.printf("짝수가 홀수보다 %d개 더 많습니다.\n", result);
		} else {
			result = oddNum - evenNum;
			System.out.printf("홀수가 짝수보다 %d개 더 많습니다.\n", result);
		}
			
	}
	
	public static void korOutput_n1(int n) {
		if (n == 1) {
			System.out.println("하나");
		} else if (n == 2) {
			System.out.println("둘");
		} else if (n == 3) {
			System.out.println("셋");
		} else if (n == 4) {
			System.out.println("넷");
		} else if (n == 5) {
			System.out.println("다섯");
		} else if (n == 6) {
			System.out.println("여섯");
		} else if (n == 7) {
			System.out.println("일곱");
		} else if (n == 8) {
			System.out.println("여덟");
		} else if (n == 9) {
			System.out.println("아홉");
		} else if (n == 10) {
			System.out.println("열");	
		} else {
			System.out.println("정수가 아닙니다.");
		}
	}
	
	public static void korOutput_n2(int n) {
		if (n == 1) {
			System.out.println("하나");
		} else if (n == 2) {
			System.out.println("둘");
		} else if (n == 3) {
			System.out.println("셋");
		} else if (n == 4) {
			System.out.println("넷");
		} else if (n == 5) {
			System.out.println("다섯");
		} else if (n == 6) {
			System.out.println("여섯");
		} else if (n == 7) {
			System.out.println("일곱");
		} else if (n == 8) {
			System.out.println("여덟");
		} else if (n == 9) {
			System.out.println("아홉");
		} else if (n == 10) {
			System.out.println("열");	
		} else {
			System.out.println("정수가 아닙니다.");
		}
	}
	
	public static void korOutput_n3(int n) {
		if (n == 1) {
			System.out.println("하나");
		} else if (n == 2) {
			System.out.println("둘");
		} else if (n == 3) {
			System.out.println("셋");
		} else if (n == 4) {
			System.out.println("넷");
		} else if (n == 5) {
			System.out.println("다섯");
		} else if (n == 6) {
			System.out.println("여섯");
		} else if (n == 7) {
			System.out.println("일곱");
		} else if (n == 8) {
			System.out.println("여덟");
		} else if (n == 9) {
			System.out.println("아홉");
		} else if (n == 10) {
			System.out.println("열");	
		} else {
			System.out.println("정수가 아닙니다.");
		}
	}
	
	public static void korOutput_n4(int n) {
		if (n == 1) {
			System.out.println("하나");
		} else if (n == 2) {
			System.out.println("둘");
		} else if (n == 3) {
			System.out.println("셋");
		} else if (n == 4) {
			System.out.println("넷");
		} else if (n == 5) {
			System.out.println("다섯");
		} else if (n == 6) {
			System.out.println("여섯");
		} else if (n == 7) {
			System.out.println("일곱");
		} else if (n == 8) {
			System.out.println("여덟");
		} else if (n == 9) {
			System.out.println("아홉");
		} else if (n == 10) {
			System.out.println("열");	
		} else {
			System.out.println("정수가 아닙니다.");
		}
	}
	
	public static void korOutput_n5(int n) {
		if (n == 1) {
			System.out.println("하나");
		} else if (n == 2) {
			System.out.println("둘");
		} else if (n == 3) {
			System.out.println("셋");
		} else if (n == 4) {
			System.out.println("넷");
		} else if (n == 5) {
			System.out.println("다섯");
		} else if (n == 6) {
			System.out.println("여섯");
		} else if (n == 7) {
			System.out.println("일곱");
		} else if (n == 8) {
			System.out.println("여덟");
		} else if (n == 9) {
			System.out.println("아홉");
		} else if (n == 10) {
			System.out.println("열");	
		} else {
			System.out.println("정수가 아닙니다.");
		}
	}
}
