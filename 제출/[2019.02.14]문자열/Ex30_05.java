
/*

작성자 : xxHANIxx
작성일자 : 2019.02.14.

요구사항 5. 숫자를 입력받아 3자리마다 ,를 붙이시오.

입력]
숫자 : 1234567

출력]
결과 : 1,234,567

조건]
- %,d 사용하지 마시오.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex30_05 {
	public static void main(String[] args) throws Exception {
		numberOutput();
	}

	public static void numberOutput() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("숫자 : ");
		String number = reader.readLine();

		for (int index=number.length()-3; index>0; index-= 3) {
			String tmp1 = number.substring(0, index);
			String tmp2 = number.substring(index);
			number = tmp1 + "," + tmp2;

		}
		System.out.printf("결과 : %s", number);
	}
}
