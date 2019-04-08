/*

작성자 : xxHANIxx
작성일자 : 2019.02.13.

요구사항 6. 구구단을 출력하시오.

출력]

2 x 1 =  2  3 x 1 =  3  4 x 1 =  4  5 x 1 =  5
2 x 2 =  4  3 x 2 =  6  4 x 2 =  8  5 x 2 = 10
..
2 x 9 = 18  3 x 9 = 27  4 x 9 = 36  5 x 9 = 45

6 x 1 =  6  7 x 1 =  7  8 x 1 =  8  9 x 1 =  9
6 x 2 = 12  7 x 2 = 14  8 x 2 = 16  9 x 2 = 18
..
6 x 9 = 54  7 x 9 = 63  8 x 9 = 72  9 x 9 = 81

*/

public class Ex28_6 {
	
	public static void main(String[] args) {
		
		guguDan();
		
	}
	
	public static void guguDan() {
		
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 6; i++) {
				
				int dan = i;
				
				System.out.printf("%d x %d = %2d\t", dan, j, dan * j);
			}
			System.out.println();	
		} // for 1
		
		System.out.println();
		
		for (int j = 1; j < 10; j++) {
			for (int i = 6; i < 10; i++) {
				
				int dan = i;
				System.out.printf("%d x %d = %2d\t", dan, j, dan * j);
			}
			System.out.println();	
		} // for 2
	}
}
