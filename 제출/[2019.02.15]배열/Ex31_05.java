/*

작성자 : xxHANIxx
작성일자 : 2019.02.15.

요구사항 5. 중복되지 않는 임의의 숫자 5개를 만드시오.

출력]
[5, 6, 1, 3, 2]

조건]
- 숫자의 범위 : 1~9

추가조건]
- 숫자의 범위를 입력받으시오.
- 숫자의 개수를 입력받으시오.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Ex31_05 {

	public static void main(String[] args) throws Exception {
		lottoLogic();
	}

	public static void lottoLogic() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 범위 : ");
		int maxNum = Integer.parseInt(reader.readLine());

		System.out.print("숫자 개수 : ");
		int countNum = Integer.parseInt(reader.readLine());

		// 배열 생성
		int lotto[] = new int[countNum];

		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) (Math.random() * maxNum) + 1; // 난수 생성

			for (int j = 0; j < i; j++) {

				if (lotto[i] == lotto[j]) { // 중복값 제거
					i--;
					break;
				}
			}
		}
		
		// 출력
		System.out.print("[");
		for (int i = 0; i < lotto.length; i++) {

			// 배열 lotto[]의 마지막 요소에서 , 제거
			if (i == lotto.length-1) {
				System.out.printf("%d", lotto[i]);
				break;
			} else {
				System.out.printf("%d, ", lotto[i]);		
			}	
		}
		System.out.print("]");
	} // lottoLogic
} // Ex31_05
