
// *** 손코딩 많이 시키는 문제!

/*

작성자 : xxHANIxx
작성일자 : 2019.02.14.

요구사항 9. 주민등록번호 유효성 검사를 하시오.

입력]
주민등록번호 : 951220-1021547

출력]
올바른(올바르지 않은) 주민등록번호입니다.

조건]
'-' 입력 유무 상관없이 검사

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex30_09 {

	public static void main(String[] args) throws Exception {
		jumin();
	}

	public static void jumin() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("주민등록번호 : ");
		String juminNum = reader.readLine();

		originalVerify(juminNum);
	}

	private static void originalVerify(String juminNum) {

		// '-' 입력 유무 상관없이 검사
		juminNum = juminNum.replace("-", ""); // '-'이 있을 경우 삭제 처리
		String leftSid = juminNum.substring(0, 6);

		// 주민번호 앞자리 범위 지정
		int yy = Integer.parseInt(leftSid.substring(0, 2)); // 년도
		int mm = Integer.parseInt(leftSid.substring(2, 4)); // 월
		int dd = Integer.parseInt(leftSid.substring(4, 6)); // 일

		// ============ 주민번호 앞자리 검증
		if (yy < 1 || yy > 99 || mm > 12 || mm < 1 || dd < 1 || dd > 31) {
			System.out.println("올바르지 않은 주민등록번호입니다.");
		} else { // === 주민번호 뒷자리 검증

			int sum = 0;
			for (int i = 0; i < juminNum.length() - 1; i++) { // 마지막 번호는 제외한 조건문
				int n = Integer.parseInt(juminNum.substring(i, i + 1));
				
				sum += n * (i % 8 + 2); // 각 자리 숫자에 각각 2 ~ 9 순으로 곱하기
			}

			// ============== 유효성번호 검증
			// 각각 곱한 수의 합을 구한 후 11로 나눠서 나머지 구하기
			int valid = (11 - (sum % 11)) % 10;

			// ------ 주민번호 끝자리(유효성번호)
			if (Integer.parseInt(juminNum.substring(12)) == valid) {
				System.out.println("올바른 번호");
			} else {
				System.out.println("올바르지 않은 번호");
			}

		} // if 주민번호 앞자리 검증
	} // Method originalVerify

}
