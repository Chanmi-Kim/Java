/*
  
작성자 : xxHANIxx
작성일자 : 2019.02.15.

요구사항 7. 배열에 요소를 삭제하시오.

입력]
삭제 위치 : 2

출력]
원본 : [5, 6, 1, 3, 2]
결과 : [5, 6, 3, 2, 0]

조건]
- 배열의 시작 길이 : 5
- 난수 대입

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex31_07 {

	public static void main(String[] args) throws Exception {

		deleteArray();

	}

	public static void deleteArray() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("삭제 위치 : ");
		int index = Integer.parseInt(reader.readLine());

		int array[] = new int[5]; // 배열 선언

		// ========= 원본 배열 출력
		System.out.print("원본 : [");
		for (int i = 0; i < array.length; i++) {

			// 0~9까지 난수 생성
			array[i] = (int) (Math.random() * 9) + 1;

			// array 배열의 끝에서 , 없이 처리
			if (i == array.length - 1) {
				System.out.printf("%d]\n", array[i]);
				break;
			} else {
				System.out.printf("%d, ", array[i]);
			}
		}

		// ========= 배열 요소 삭제 후 왼쪽으로 시프트
		for (int i = 0; i < array.length - 1; i++) {

			if (index <= i) { // 입력한 값보다 i가 크면
				array[i] = array[i + 1]; // 뒤에 있는 값을 앞으로 옮김
			}
		}

		// 마지막 원소는 0으로 초기화
		array[array.length - 1] = 0;

		// ========= 결과 배열 출력
		System.out.print("결과 : [");
		for (int i = 0; i < array.length; i++) {

			// array 배열의 끝에서 , 없이 처리
			if (i == array.length - 1) {
				System.out.printf("%d]\n", array[i]);
			} else {
				System.out.printf("%d, ", array[i]);
			}
		}
	}
}
