class Ex05_Variable 
{
	public static void main(String[] args) 
	{
		//Ex05_Variable.java

		//변수, Variable
		// - 자료형을 사용해서 얻어내는 메모리의 공간
		// - 값(데이터)를 저장하는 용도(입출력)

		//1. 변수 선언하기
		// - 메모리의 일부 공간을 얻어내기
		// - 자료형 변수명
		byte kor; //; 문장 종결자

		//2. 변수 초기화
		//대입 연산자, 할당 연산자
		// 공간(LValue) = 값(RValue)
		kor = 100; 
		
		//3. 변수 접근(호출)
		System.out.println(kor);
		System.out.println(kor + 100);


		System.out.println(100);
		System.out.println(100 + 100);

		//4. 변수 치환
		kor = 120;
		System.out.println(kor);



		//int kor; //variable kor is already defined

		//변수 만드는 방법
		//국어 점수
		//byte kor;
		//수학 점수
		byte math;
		//영어 점수
		byte eng;

		byte m1, m2, m3; //byte형 x 3개

		byte n1;
		n1 = 10; //초기화

		byte n2 = 10;

		byte b1 = 10, b2 = 20, b3 = 30;

		byte o1, o2 = 20, o3;


		byte x1 = 100; //국어
		byte x2 = 90; //영어
		byte x3 = 98; //수학

		byte y1 = 100, y2 = 90, y3 = 98; //국어, 영어, 수학

		byte z1 = 100, //국어
			z2 = 90, //영어
			z3 = 98; //수학

		
		//byte kor
		byte KOR;
		byte Kor;
		byte kOr;
		byte koR;
	
		
		//에러 메시지 별도 저장 + 기억
		//cannot find symbol
		//System.out.println(aaa);

		int aaa;
		aaa = 10;
		//variable aaa might not have been initialized
		//자바의 변수는 초기화를 하지 않으면 사용이 불가능하다.
		System.out.println(aaa);

		


		//변수명 명명법
		//1. 영문자 + 숫자 + '_'
		//2. 숫자로 시작
		//3. 예약어 사용 불가
		//4. 의미있게

		//byte 10num;
		//byte _10num;

		//byte num num;
		byte num_num;

		//byte ~!@#$%^&*;

		byte 국어 = 80;
		System.out.println(국어);

		//byte byte;
		//byte class;


		//명명법
		//1. 헝가리언 표기법
		// - 자료형을 식별자에 넣는 방법
		// 사용) 인터페이스명
		//		- interface IEmployee
		int num;
		int int_num;
		int i_num;
		int inum;

		//2. 파스칼 표기법
		// - 식별자가 한 단어 혹은 여러 단어 표기되는 경우
		// - 모든 단어를 공백없이 연결 + _ 사용X
		// - 각단어의 첫문자를 대문자 표기, 나머지 문자를 소문자 표기
		// 사용) 클래스명

		//kor score
		byte KorScore;


		//3. 캐멀 표기법
		// - 식별자가 한 단어 혹은 여러 단어 표기되는 경우
		// - 모든 단어를 공백없이 연결 + _ 사용X
		// - 각단어의 첫문자를 대문자 표기, 나머지 문자를 소문자 표기
		// - 식별자의 첫문자는 소문자
		// 사용) 변수명, 메소드명
		byte engScore;


		//4. 스네이크 표기법
		// - 식별자가 한 단어 혹은 여러 단어 표기되는 경우
		// - 각단어를 _ 로 연결
		byte eng_score;


	}
}










