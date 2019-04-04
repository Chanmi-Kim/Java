package example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27_for {

	public static void main(String[] args) throws Exception  {
		
		//Ex27_for.java
		
		/*
		
		 반복문
		 - 실행 블럭 코드를 원하는 횟수만큼 반복 실행 제어
		 
		 for문
		 
		 for (초기식; 조건식; 증감식) {
		 	실행문;
		 }
		 
		*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		
		//a1();
		
		//m7();
		m8();
		
		System.out.println("abc\bdef");
		
	}

	private static void m8() throws IOException {
		
		//반복 횟수 > 무한 반복
		
//		for (int i=0; i<10; i--) {
//			System.out.println(i);
//		}
		
		//의도적으로 무한 루프 생성
//		for (;;) {
//			System.out.println("안녕");
//		}
		
//		for (int i=Integer.MAX_VALUE - 1000000; ; i++) {
//			System.out.println(i);
//		}
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for (;;) {
			System.out.println("게임 중..");
			System.out.println("게임 종료.");
			
			System.out.print("계속하시겠습니까?(y|n)");
			String input = reader.readLine();
			
			if (input.equals("n")) {
				break;//무한 루프 탈출 방법
			}
		}//루프
		
		System.out.println("프로그램 종료");
		
		
	}

	private static void m7() {
		
		//제어문(반복문) + break, continue
		//1. break
		//	- 자신이 속한 제어문을 탈출한다.(if문 예외)
		//2. continue
		//	- 자신이 속한 제어문(반복문)의 처음으로 돌아간다.(if문 예외)
		
		for (int i=1; i<=10; i++) {
			
			
			if (i == 5) {
				//break;//자신이 속한 제어문 : if(x), for(o)
				continue;
			}
			
			System.out.println(i);

		}
		
		
		//선생님 + 학생 상담(30명)
		for (int i=1; i<=30; i++) {
			
			//흐름 제어
			//if (i == 15) {
			//	break; //반복 제어 끝내자
			//}
			if (i == 10 || i == 14) {
				continue; //10번 학생 결석
			}
			
			System.out.printf("선생님이 %d번 학생을 상담 중..\n", i);
			
		}
		
		
		
	}

	private static void a1() {
		
		//난수
		// - 임의의 수
		// -> 난수 생성기
		
		//1.
		//System.out.println(Math.PI);
		
		//0(inclusive) ~ 1(exclusive) 사이의 난수
		for (int i=0; i<10; i++) {
			//greater than or equal to 0.0 and less than 1.0.
			//System.out.println(Math.random());
			
			double d = Math.random();
			//System.out.println(d);
			
			//0 ~ 9사이의 정수
			int n = (int)(d * 10);
			//System.out.println(n);
			
			//주사위 : 1 ~ 6사이의 정수
			int dice = (int)(d * 6) + 1;//(int)(d * 최대값) + 최소값;
			System.out.println(dice);
			
		}
	}

	private static void m6() throws NumberFormatException, IOException {
		
		//요구사항] 사용자에게 숫자를 10개입력받아 그 수의 합을 구하시오.
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;//누적 변수
		
		for (int i=0; i<10; i++) {
			
			System.out.print("숫자 : ");
			int num = Integer.parseInt(reader.readLine());
			
			sum += num; //누적
			
		}
		
		System.out.println(sum);
		
	}

	private static void m5() {
		
		//Loop -> 누적
		//1 ~ 10까지의 합을 구하시오.
		//1 + 2 + 3 + 4 + ... + 9 + 10
		
		//무언가의 누적값을 구해야 한다.
		//1. 누적 변수를 선언한다. 누적 변수는 반드시 초기화(0)를 한다.
		int sum = 0;
		
		//2. 누적시킬 수열를 구한다.(1~10까지 숫자를 차례대로 만들어 낸다.) -> for문
		//for (int i=1; i<=10; i++) {
		//for (int i=5; i<=25; i++) {
		for (int i=2; i<=10; i+=2) {
			
			//3. 누적한다.
			//sum = sum + i;
			sum += i;
		}
		
		System.out.println(sum);
		
	}

	private static void m4() {
		
		//모든 제어문 + 지역변수
		//메소드 + 지역변수
		
		//지역변수의 영역(생명주기)
		// - 블럭의 종류 : 메소드 or 제어문
		
		int a = 10;
		
		if (true) {
			System.out.println(a);
			
			int b = 20;
			System.out.println(b);
		}
		
		System.out.println(a);
		//System.out.println(b);
		
		
		
		int i;
		
		for (i=0; i<10; i++) {
			System.out.println(i);
		}
		
		System.out.println(i);
		
		
		for (int j=0; j<10; j++) {
			//j와 k의 변화 - 지역변수
			System.out.println("j : " + j);
			
			int k = 0;
			System.out.println("k : " + k);
			k++;
		}

		
	}

	private static void m3() {
		
		//구구단 출력
		// - 5단
		int dan = 19;
		
		//5 x 1 = 5
		//5 x 2 = 10
		//..
		//5 x 9 = 45
		
		for (int i=1; i<10; i++) {
			System.out.printf("%d x %d = %2d\n", dan, i, dan * i);
		}
		
	}

	private static void m2() {
		
		//반복문 -> Loop(루프)
		//i -> 루프 변수
		//1. 반복 횟수
		//2. 루프 변수 변화(***)
		
//		for (int i=0; i<10; i++) {
//			System.out.println(i);
//		}
		
//		for (int i=0; i<10; i+=2) {
//			System.out.println(i);
//		}
		
//		for (int i=1; i<10; i+=2) {
//			System.out.println(i);
//		}
		
//		for (int i=0; i<10; i+=4) {
//			System.out.println(i);
//		}
		
//		for (int i=0; i<10; i--) {
//			System.out.println(i);
//		}
		
		//10, 9, 8... 1
//		for (int i=10; i>0; i--) {
//			System.out.println(i);
//		}
		
		for (int i=0; i<10; i++) {
			System.out.println(i);
			//루프 변수 수정 -> 지양 -> 예측 힘들다.
			//i = 15;
		}
		
	}

	private static void m1() {
		
		for (int i=1; i<=10; i=i+1) {
			
			System.out.println("안녕하세요.");
			
		}
		
	}
	
}
















