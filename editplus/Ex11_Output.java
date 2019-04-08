class Ex11_Output 
{
	public static void main(String[] args) 
	{
		//Ex11_Output.java
		
		//형식 문자 추가 기능
		//1. %숫자d
		//	- 출력 너비(문자수)
		//	- +(우측), -(좌측)
		//2. %.숫자f
		//	- 실수형 가능
		//	- 소수이하 출력 자릿수 지정
		//3. %,d
		//	- %d, %f 둘다 가능
		//	- 자릿수 표기(천단위 표기)
		//4. %,너비.소수f
		//   %,너비d



		int num = 10;

		System.out.printf("숫자 : %d입니다.\n", num);
		System.out.printf("숫자 : %10d입니다.\n", num);
		System.out.printf("숫자 : %-10d입니다.\n", num);

		//***
		System.out.println("========");
		System.out.println(" [가격(원)] ");
		System.out.println("========");
		System.out.printf("%,8d\n", 1000000);
		System.out.printf("%,8d\n", 9500);
		System.out.printf("%,8d\n", 100);
		System.out.printf("%,8d\n", 12300);
		System.out.printf("%,8d\n", 928476);

		System.out.printf("10 / 3 = %.0f\n", 10.0 / 3.0);

		System.out.printf("10 / 3 = %.1f\n", 3.399); //반올림O


		System.out.printf("%d\n", 10000000);
		System.out.printf("%,d\n", 10000000);

		System.out.printf("%,10.2f\n", 12345.12345);
	}
}
 













