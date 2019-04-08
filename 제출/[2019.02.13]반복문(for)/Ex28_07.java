/*

작성자 : xxHANIxx
작성일자 : 2019.02.13.

요구사항 7. 아래와 같이 출력하시오.

출력]

1 ~  10 :   55
1 ~  20 :  210
..
1 ~  90 : 4095
1 ~ 100 : 5050

*/

public class Ex28_7 {

	public static void main(String[] args) {
		
		sumList();
		
	}
	
	public static void sumList() {
		
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			
			sum += i;
			
			if(i % 10 == 0) {
					
				System.out.printf("1 ~ %3d : %4d\n", i, sum);
			}		
		}
	}
}
