/*

작성자 : xxHANIxx
작성일자 : 2019.02.13.

요구사항 9. 아래와 같이 출력하시오.

출력]

1 + 2 + 4 + 7 + 11 + 16 + ... + N = 469

조건]
N이 100이 넘기 전까지 출력하시오.

*/

public class Ex28_9 {
	
	public static void main(String[] args) {

		add();

	}

	private static void add() {

		String txt = "";
		int n = 0, sum = 0;

		for (int i=1; i<100; i+=n) {

			txt += i;
			sum += i;
			n++;

			if (i+n > 100) {
				txt += " = " + sum;
				break;
			}

			txt += " + ";
		}

		System.out.println(txt);

	}// add
}
