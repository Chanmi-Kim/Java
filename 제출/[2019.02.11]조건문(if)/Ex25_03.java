/*

작성자 : xxHANIxx
작성일자 : 2019.02.11.

요구사항 3. 숫자 2개와 연산자 1개를 입력받아 연산 과정과 결과를 출력하시오.

입력] 
첫 번째 숫자 : 5
두 번째 숫자 : 3
연산자 : *

출력]
5 * 3 = 15

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_3 {
	public static void main(String[] args) throws IOException{
		calc();
	}
	public static void calc() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫 번째 숫자 : ");
		int n1 = Integer.parseInt(reader.readLine());
		
		System.out.print("두 번째 숫자 : ");
		int n2 = Integer.parseInt(reader.readLine());
		
		System.out.print("연산자 : ");
		String op = reader.readLine();
		
		if (op.equals("+") && op.equals("-") && op.equals("*") && op.equals("/")) {
			
			int result = operator(n1, n2, op);
			
			System.out.printf("%d %s %d = %d", n1, op, n2, result);
		} else {
			System.out.println("산술 연산자가 아닙니다.");
		}
	}
	
	public static int operator(int n1, int n2, String op) {
		
		int result = 0;
		
		if (op.equals("+")) { // 덧셈
			result = n1 + n2;
			return result;
		} else if (op.equals("-")) { // 뺄셈
			if(n1 > n2) {
				result = n1 - n2;
			} else {
				result = n2 - n1;
			}
			return result;
		} else if (op.equals("*")) { // 곱셈
			result = n1 * n2;
			return result;
		} else if (op.equals("/")) { // 나눗셈
			if(n1 > n2) {
				result = n1 / n2;
			} else {
				result = n2 / n1;
			}
			return result;
		} else {
			return 0;
		}
	}
	
}
