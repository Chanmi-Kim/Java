class Ex09_Variable 
{
	public static void main(String[] args) 
	{
		//Ex09_Variable.java

		//연산자


		//요구사항] "10 + 20 = 30" 출력
		int a = 10;
		int b = 20;

		System.out.println(a + " 더하기 " + b + " 는 " + (a + b));


		//숫자 저장? 자료형?
		//1. 나이? byte
		//2. 몸무게? short
		//3. 주민등록번호(앞자리)? 

		//기준 : 숫자로 구성된 이 데이터를 +,- 할일이 있는가?? > "문자열"

		int jumin = 950101;
		System.out.println(jumin);

		//자바의 기수법 표현 방식
		// - 정수 표현 방식 > 여러 기수법 제공
		// 1. 십진수 표현
		// 2. 8진수 표현
		// 3. 16진수 표현
		// 4. 2진수 표현(X)
		jumin = 021225;
		System.out.println(jumin);

		String tel = "01012345678";
	
		int num = 10; //10 : 십진수
		num = 010; //8진수(0~7)
		num = 0x10; //16진수(0~F)
		System.out.println(num);



	}
}


















