/*

작성자 : xxHANIxx
작성일자 : 2019.02.14.

요구사항 3. 숫자를 입력받아 자릿수와 상관없이 모든 수의 합을 구하시오.

입력]
숫자 : 314

출력]
결과 : 3 + 1 + 4 = 8

조건]
- 산술연산자로 작성하지 마시오. (369방식 사용 금지)
- 자릿수의 길이는 제한 없음.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex30_03 {
	public static void main(String[] args) throws Exception {
		sum();
	}
	
	public static void sum() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));	
		
		int sum = 0;
		String txt = "";
		
		System.out.print("숫자 : ");
		String number = reader.readLine();
		
		
		for(int i=0; i<number.length(); i++) {
			
			sum = Integer.parseInt(number.substring(i, i+1));
			
			txt += sum;
			sum += sum; 
			
			if(i != (number.length()-1)) {
				txt += " + ";
			} 
		}
		System.out.printf("결과 : %s = %d", txt, sum);	
	}
}
