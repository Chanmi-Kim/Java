/*

작성자 : xxHANIxx
작성일자 : 2019.02.12.

요구사항 7. 아래와 같이 출력하시오.

출력]
1 + 2 + 3 + 4 + 5 + ... + XX = 10XX

조건]
누적값이 1000을 넘어가는 순간 루프s를 종료하시오.

추가조건]
루프를 종료할 누적값을 사용자가 입력할 수 있도록 하시오.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Ex27_07 {
	public static void main(String[] args) throws IOException {
		
		sumLoop();
		
	}

	private static void sumLoop() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("루프를 종료할 누적값 : ");
		int num = Integer.parseInt(reader.readLine());
		int sum = 0; // 누적변수
		
		for(int i=1; i<=num; i++) {
			
			sum += i;
			
			if (sum > num) {
				System.out.printf("%d = %d", i, sum);
				break;
			} else {
				System.out.printf("%d + ", i);		
			}
		}
			
	}

}
