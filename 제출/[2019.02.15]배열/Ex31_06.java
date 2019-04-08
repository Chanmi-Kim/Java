/*

작성자 : xxHANIxx
작성일자 : 2019.02.15.

요구사항 6. 배열에 요소를 삽입하시오.

입력]
삽입 위치 : 2
값 : 100

출력]
원본 : [5, 6, 1, 3, 2, 0, 0, 0, 0, 0]
결과 : [5, 6, 100, 1, 3, 2, 0, 0, 0, 0]

조건]
- 배열의 시작 길이 : 10
- 난수 대입

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex31_06 {
	public static void main(String[] args) throws Exception {
		insertArray();
	}

	public static void insertArray() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("삭제 위치 : ");
		int index = Integer.parseInt(reader.readLine());
		System.out.print("값 : ");
		int insert = Integer.parseInt(reader.readLine());

		int array[] = new int[10]; // 배열 선언

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

		// ========= 오른쪽으로 시프트, 루프 변수 감소
		for(int i=array.length-2; i>= index; i--) {
			array[i+1] = array[i];
		}
		
		array[index] = insert;

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
	} // insertArray
} // Ex31_06
