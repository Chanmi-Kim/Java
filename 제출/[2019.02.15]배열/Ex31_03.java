/*

작성자 : xxHANIxx
작성일자 : 2019.02.15.

요구사항 3. 1~20 사이의 난수를 담고 있는 배열을 생성하고 최대값과 최소값을 출력하시오.

출력]
원본 : 10, 9, 3, 18, 15, 9, 5, 4, 3, 11, 15, 18, 9, 14, 18, 5, 8, 7, 9, 17
최대값 : 18
최소값 : 3

조건]
- 난수를 20개 발생 후 배열에 넣는다.
- 난수는 1~20 사이

*/

public class Ex31_03 {
	public static void main(String[] args) {
		maxminOutput();
	}

	public static void maxminOutput() {

		int array[] = new int[20];


		// ========= 원본 배열 출력
		System.out.print("원본 : ");
		for (int i = 0; i < array.length; i++) {

			array[i] = (int) (Math.random() * 20) + 1;

			if (i == array.length - 1) {
				System.out.printf("%d\n", array[i]);
				break;
			} else {
				System.out.printf("%d, ", array[i]);
			}
		}

		int maxNum = array[0];
		int minNum = array[0];
		
		// ========= 최대값 최소값 구하기
		for (int i = 1; i < array.length; i++) {
			// 최대값
			if (array[i] > maxNum) {
				maxNum = array[i];
			}
			// 최소값
			if (array[i] < minNum) {
				minNum = array[i];
			}

		} 
		System.out.printf("최대값 : %d\n최소값 : %d", maxNum, minNum);

	} // maxminOutput
} // Ex31_03
