class Ex10_Output 
{
	public static void main(String[] args) 
	{
		//Ex10_Output.java
		
		//콘솔 입출력
		//Console Input/Output > IO
		// - 기본 입력 장치 : 키보드
		// - 기본 출력 장치 : 모니터
		// - 기본 에러 장치 : 모니터

		//콘솔 출력
		//1. System.out.print() 메소드
		//	- 출력한 뒤에 엔터 없음
		//2. System.out.println() 메소드
		//	- print line
		//	- 출력한 뒤에 엔터 있음
		//3. System.out.printf() 메소드

		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");

		//학생 x 3명 + 국,영,수 = 성적 출력
		String name1 = "홍길동";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;

		String name2 = "아무개";
		int kor2 = 99;
		int eng2 = 88;
		int math2 = 77;

		String name3 = "하하하";
		int kor3 = 98;
		int eng3 = 57;
		int math3 = 93;

		//Ctrl+C > Ctrl+V
	
		//print() 사용
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.print(math1 + "\n");

		System.out.print(name2 + "\t");
		System.out.print(kor2 + "\t");
		System.out.print(eng2 + "\t");
		System.out.print(math2 + "\n");


		System.out.print(name3 + "\t");
		System.out.print(kor3 + "\t");
		System.out.print(eng3 + "\t");
		System.out.print(math3 + "\n");
		

		//println()
		System.out.println(name1 + "\t" + kor1 + "\t" + eng1 + "\t" + math1);
		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		System.out.println(name3 + "\t" + kor3 + "\t" + eng3 + "\t" + math3);

		System.out.println(); //빈라인 출력

		//3. printf() 메소드
		// - print format
		// - 출력되는 문자열 형식을 여러가지 형태로 지원
		// - 형식을 정의하는 역할 문자들이 제공된다. > 형식 문자
		// - 형식 문자
		//	a. %s : String
		//	b. %d : Decimal(byte, short, int, long)
		//	c. %f : Float(float, double)
		//	d. %b : Boolean
		//	e. %c : Char

		//요구사항] "홍길동님 안녕하세요." 출력
		//수정사항] "홍길동님 안녕하세요. 홍길동님 너무 반갑습니다."
		String name = "홍길동";

		System.out.println(name + "님 안녕하세요.");
		System.out.printf("%s님 안녕하세요.\n", name);

		System.out.println(name + "님 안녕하세요. " + name + "님 너무 반갑습니다.");
		System.out.printf("%s님 안녕하세요. %s님 너무 반갑습니다.\n", name, name);
		
		//SQL
		// - 데이터베이스 추가 명령어
		// - insert into tblScore (name, kor, eng, math) values ('홍길동', 100, 90, 80);
		System.out.println("insert into tblScore (name, kor, eng, math) values ('" + name1 + "', " + kor1 + ", " + eng1 + ", " + math1 + ");");

		System.out.printf("insert into tblScore (name, kor, eng, math) values ('%s', %d, %d, %d);\n", name2, kor2, eng2, math2);





		



	



	}
}
