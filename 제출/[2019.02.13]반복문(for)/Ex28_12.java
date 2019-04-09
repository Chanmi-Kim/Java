/*

작성자 : xxHANIxx
작성일자 : 2019.02.13.

요구사항 12. 1부터 100사이의 완전수를 구하시오.

출력]

6 = [1, 2, 3]
28 = [1, 2, 4, 7, 14]

완전수 : 자기 자신을 제외한 나머지 약수들의 합이 자신과 동일한 수

*/

public class Ex28_12 {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			String txt = "";
			int sum = 0;

			for (int j = 1; j < i; j++) {

				if (i % j == 0) {

					txt += j;
					sum += j;
					if (sum != i) {
						txt += ", ";
					} else {
						continue;
					}
				}
			}

			if (sum == i) {
				System.out.printf("%2d = [%s]\n", sum, txt);
			}
		}
	}
}
