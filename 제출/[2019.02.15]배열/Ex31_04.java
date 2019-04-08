
/*

작성자 : xxHANIxx
작성일자 : 2019.02.15.

요구사항 4. 난수를 담고 있는 배열을 생성한 뒤 아래와 같이 출력하시오.

입력]
최대 범위 : 15
최소 범위 : 5

출력]
원본 : 10, 2, 3, 20, 15, 9, 5, 1, 3, 11, 15, 18, 9, 14, 18, 5, 8, 2, 1, 17
결과 : 10, 15, 9, 5, 11, 15, 9, 14, 5, 8

조건]
- 난수를 20개 발생 후 배열에 넣는다.
- 난수는 1~20 사이
- 배열을 탐색하여 범위에 만족하는 숫자만 출력한다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex31_04 {
	public static void main(String[] args) throws Exception {

		originalOutput(); // 원본 출력할 메소드

	}

	public static void originalOutput() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("최대 범위 : ");
		int maxNum = Integer.parseInt(reader.readLine());

		System.out.print("최소 범위 : ");
		int minNum = Integer.parseInt(reader.readLine());

		int input[] = new int[20]; // 원본 배열

		// ========= 원본 배열 출력
		System.out.print("원본 : ");
		for (int i = 0; i < input.length; i++) {

			// 1~20까지 난수 생성
			input[i] = (int) (Math.random() * 20) + 1;

			// input 배열의 끝에서 , 없이 처리
			if (i == input.length - 1) {
				System.out.printf("%d\n", input[i]);
				break;
			} else {
				System.out.printf("%d, ", input[i]);
			}
		}

		// 결과 출력할 메소드
		resultOutput(maxNum, minNum, input);

	} // originalOutput

	private static void resultOutput(int maxNum, int minNum, int[] input) {

		int count = 0;
		int temp[] = new int[20]; // 임시 배열 선언

		// 원본 배열에서 최대 최소 범위안에 해당하는 찾기
		for (int i = 0; i < input.length; i++) {
			if (input[i] >= minNum && input[i] <= maxNum) {

				temp[i] = input[i];
				count++; // 조건에 맞는 원소수만큼 카운트
			}
		}

		
		int output[] = new int[count]; // 카운트 된 배열 크기만큼 출력 배열 선언
		int index = 0; // output 배열 인덱스를 제어하기 위한 변수

		for (int i = 0; i < temp.length; i++) {

			
			if (temp[i] != 0) { // temp 배열에 있는 값이 0이 아닌 값이면

				output[index] = temp[i]; // output배열에 temp 배열 원소 저장
				index++; // output 배열 인덱스 증가
			}
		}

		// ========= 원본 배열 출력
		System.out.print("결과 : ");
		
		for (int i = 0; i < output.length; i++) {

			// input 배열의 끝에서 , 없이 처리
			if (i == output.length - 1) {
				System.out.printf("%d", output[i]);
				break;
			} else {
				System.out.printf("%d, ", output[i]);
			}
		}
	} // resultOutput
}// main