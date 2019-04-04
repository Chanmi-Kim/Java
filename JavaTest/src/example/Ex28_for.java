package example;

public class Ex28_for {
	
	public static void main(String[] args) {
		
		//Ex28_for.java
		
		//제어문 중첩
		// - 모든 제어문들은 종류에 상관없이 서로 중첩이 가능하다.
		
		//for문끼리 중첩
		
		//m1();
		//m2();
		//m3();
		m4();
		
	}

	private static void m4() {
		
		//별찍기
		
		for (int i=0; i<5; i++) { //행
			for (int j=0; j<5; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<5; i++) { //행
			for (int j=i; j<5; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<5; i++) { //행
			for (int j=0; j<=i; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i=0; i<5; i++) { //행
			for (int j=i+1; j<5; j++) {
				System.out.print(" ");
			}
			for (int j=0; j<=i; j++) { //열
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	private static void m3() {
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				
				//if (i == 5) {
				//if (j == 5) {
				if (i == 5 || j == 5) {
					//break; //탈출 대상?? -> 자신이 직접 속한 제어문을 탈출(j for문 탈출)
					continue;
				}
				
				System.out.printf("i : %d, j : %d\n", i, j);
				
			}
		}
		
	}

	private static void m2() {
		
		//구구단
		
		//2단 출력
		
		for (int j=2; j<10; j++) {
		
			//int dan = 2;
			
			for (int i=1; i<10; i++) {
				System.out.printf("%d x %d = %2d\n", j, i, j * i);
			}
			
			System.out.println();
		
		}
		
	}

	private static void m1() {
		
		//2중 for문
//		for (int i=0; i<24; i++) {
//			
//			for (int j=0; j<60; j++) {
//				
//				//System.out.println("반복문");
//				System.out.printf("i : %d, j : %d\n", i, j);
//				
//			}
//			
//		}
		
		
		//3중 for문
		for (int i=0; i<10; i++) {
			for (int j=0; j<10; j++) {
				for (int k=0; k<10; k++) {
					System.out.println("실행문");
				}
			}
		}
		
		
	}

}





















