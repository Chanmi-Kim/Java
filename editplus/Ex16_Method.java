class Ex16_Method 
{
	//메인 메소드
	// - 특수한 메소드
	//	1. 이름이 예약어 > main
	//	2. 실행하는 방식(콜백 방식 -> 콜백 메소드)
	//		- main 메소드는 자바의 JRE(VM)이 호출한다.
	//	3. 프로그램의 시작점(Entry Point) ~ 프로그램의 종착점(End Point)
	public static void main(String[] args) 
	{
		//Ex16_Method.java

		//메소드, Method
		// - 메소드, 함수(Function), 프로시저(Procedure), 서브루틴(Sub Routine)..
		// - OOP에서 사용하는 용어
		// - 코드의 집합

		//메소드를 만들어야 하는 이유
		// 1. 같은 성격의 코드가 모여 있는 경우 -> 코드 가독성 향상
		// 2. 같은 성격의 코드가 2번 이상 반복되는 경우 -> 코드 재사용성 향상

		/*

		메소드 사용법
		1. 메소드 정의하기(선언하기 - Declaration)
			- public [static] void 메소드명() 
			  {

			  }
			 
			- 메소드 헤더 == 메소드 서명(Signature)
			- 접근지정자 [정적키워드] 반환값 메소드명(인자 리스트) 
			  {
				실행코드;
				실행코드;
			  }
 		2. 메소드 호출하기(메소드 내의 코드를 실행)
		
		*/

		//요구사항] "안녕하세요" x 5번 출력
		//수정사항] "반갑습니다" 수정
		System.out.println("반갑습니다.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");


		//요구사항] "안녕하세요" x 5번 출력
		//수정사항] "반갑습니다" 수정
		//2. 메소드 호출하기(실행하기)
		hello();
		hello();
		hello();
		hello();
		hello();


		//요구사항] "하나" ~ "열" x 10번
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");

		countNumber();
		countNumber();
		countNumber();
		countNumber();
		countNumber();
		countNumber();
		countNumber();
		countNumber();
		countNumber();



	} //main

	//메소드 선언 위치
	// - 자바 기준 : 반드시 클래스의 영역에서 선언(클래스 자식으로)

	//1. 메소드 선언하기
	public static void hello() 
	{
		//반복될 단위 행동 구현 > 인사 1번 하기
		System.out.println("Hi.");
	}


	public static void countNumber() 
	{
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
	}

} //class









