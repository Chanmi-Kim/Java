/*

작성자 : xxHANIxx
작성일자 : 2019.02.13.

요구사항 10. 아래와 같이 출력하시오.

출력]

1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 = 232

조건]
N이 100이 넘기 전에 출력하시오.

*/

public class Ex28_10 {

	public static void main(String[] args) {

		fibonacci();
	}

	public static void fibonacci() {
		
		int number1 = 1;
		int number2 = 1;
		int sum = number1 + number2;
		
		String txt = "1 + 1 + ";

		for (int i=1; i<100; i++) {
			
			int n = number1 + number2;
			
			if (n > 100) {
				txt += " = " + sum;
				break;
			}
			
			sum += n;
			
			if (number1 != 1 || number2 != 1) {
				txt += " + " + n;	
			} else {
				txt += n;				
				
			}
			
			number1 = number2;
			number2 = n;
		}

		System.out.println(txt);
	}

}