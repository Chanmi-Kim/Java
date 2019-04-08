/*

작성자 : xxHANIxx
작성일자 : 2019.02.13.

요구사항 8. 아래와 같이 출력하시오.

출력]

1 ~  10 :   55
11 ~  20 : 155
..
81 ~  90 : 855
91 ~ 100 : 955

*/

public class Ex28_8 {

	public static void main(String[] args) {

		sumList();

	}

	public static void sumList() {

		

		for (int i=10; i<=100; i+=10) {
			
			int sum = 0;
			
			for (int j = i-9; j<=i; j++) {
				sum += j;
			}
			System.out.printf("%2d ~ %3d : %4d\n", i - 9, i, sum);

		}

	}
}
