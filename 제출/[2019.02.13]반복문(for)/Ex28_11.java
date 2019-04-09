/*

작성자 : xxHANIxx
작성일자 : 2019.02.13.

요구사항 11. 2부터 100사이의 소수를 구하시오.

출력]

2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97

*/

public class Ex28_11 {

	public static void main(String[] args) {

		primeNumber();
	}

	public static void primeNumber() {

		String txt = "";

		for (int i = 2; i <= 100; i++) {

			int count = 0;

			for (int j = 2; j <= i; j++) {

				if (i % j == 0) {
					count++;
				}
			}

			if (count == 1) {
				txt += i;

				if (i >= 90) {
					break;
				} else {
					txt += ", ";
				}
			}
		}
		System.out.println(txt);
	}
}
