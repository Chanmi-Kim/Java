//클래스 임포트
//import java.io.BufferedReader;
//import java.io.ItnputStreamReader;
import java.io.*; //wildcard > all > 모든 (클래스)

class Ex13_BufferedReader 
{
	public static void main(String[] args) throws Exception
	{
		//Ex13_BufferedReader.java

		//사전 작업
		//1. throws Exception
		//2. 클래스 임포트, Class import

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


		//System.in.read() : 바이트 단위 입력 도구
		//reader.readLine() : 문자 단위 입력 도구(문자 - 2바이트 기반, 유니코드 기반)

		//입력
		/*
		String input = reader.readLine();
		System.out.println(input);

		input = reader.readLine();
		System.out.println(input);

		input = reader.readLine();
		System.out.println(input);
		*/

		//요구사항] 이름을 입력받아 인사를 하세요.
		//입력] 이름 : 홍길동
		//출력] 안녕하세요. 홍길동님.
		
		/*
		System.out.print("이름 : ");
		String name = reader.readLine();

		System.out.printf("안녕하세요. %s님.\n", name);
		*/


		//요구사항] 태어난 년도를 입력받아 나이를 출력하시오.
		//입력] 태어난 년도(ex.1995) : 
		//출력] 25세입니다.

		//System.out.print("태어난 년도(ex.1995) : ");
		//String birthYear = reader.readLine(); //1995 -> "1995"
		
		//bad operand types for binary operator '-'
		//2019 - "1995"
		//System.out.println(2019 - Integer.parseInt(birthYear)); 

		//문자열 데이터 -> 원시형 변환
		//"10" -> int -> Integer
		//"10" -> 10
		//System.out.println(10 + Integer.parseInt("10")); 

		//"문자열" -> int : Integer.parseInt("문자열")
		//"문자열" -> byte : Byte.parseByte("문자열")
		//"문자열" -> short : Short.parseShort("문자열")
		//"문자열" -> long : Long.parseLong("문자열")
		//"문자열" -> float : Float.parseFloat("문자열")
		//"문자열" -> double : Double.parseDouble("문자열")
		//"true" -> boolean : Boolean.parseBoolean("true")
		//"c" -> 'c' : X > "문자열".charAt(0)

		//요구사항] 숫자를 2개 입력받아서 + 연산과정과 결과를 출력하시오.
		
		//입력] 첫번째 숫자 : 5
		//      두번째 숫자 : 3

		//출력] 5 + 3 = 8
		
		System.out.print("첫번째 숫자 : ");
		String num1 = reader.readLine();

		System.out.print("두번째 숫자 : ");
		String num2 = reader.readLine();

		//"5" -> 5
		//Integer.parseInt("5")
		System.out.printf("%s + %s = %,d\n", num1, num2, Integer.parseInt(num1) + Integer.parseInt(num2));
		

	}
}





