class Ex21_Overloading 
{
	public static void main(String[] args) 
	{
		//Ex21_Overloading.java
		
		//메소드 오버로딩, Method Overloading
		// - 메소드가 매개변수를 다양한 형태로 받아들이는 기술
		// - 같은 이름의 메소드를 여러개 선언하는 기술
		// - 개발자에게 도움(성능X, 유저X) > 생산성 + 가독성(**) 향상

		//메소드 오버로딩 조건 O
		//1. 인자의 갯수
		//2. 인자의 타입

		//메소드 오버로딩 조건 X
		//1. 인자의 이름
		//2. 반환값의 타입

		//메소드 호출
		//test(); //1.
		//test(100); //3.
		//test("홍길동"); //4.
		//test(100); //5. X
		//test(10, 20); //6.
		//result = test(100); //8. X

		//메소드를 작성 중..
		//1. public static void test() {}				//O
		//2. public static void test() {}				//X. 1.
		//3. public static void test(int n) {}			//O
		//4. public static void test(String s) {}		//O
		//5. public static void test(int m) {}			//X. 3.
		//6. public static void test(int n, int m) {}	//O
		//7. public static void test(int n, String s) {}//O
		//8. public static int test(int n) {}			//X. 3.


		hello();//한글
		hello("홍길동");//영어


		drawLine();
		System.out.println("            성적표");
		drawLine();

		System.out.println();
		System.out.println();
		System.out.println();

		drawLine('*');
		System.out.println("            석차");
		drawLine('*');

	}// main



	public static void hello()
	{
		//System.out.println("안녕");
		//System.out.println(100);
		//System.out.println(True);
		//System.out.println(3.5);
	}

	public static void hello(String name)
	{
		System.out.println("Hi~ " + name);
	}

	public static void println(String output)
	{
		//output 출력
	}
	public static void println(int output)
	{
		//output 출력
	}
	public static void println(double output)
	{
		//output 출력
	}



	//요구사항] 숫자 2개 더하기
	//1. int + int
	//2. double + double
	//3. byte + byte
	//4. short + short
	//5. int + byte
	// - 64개
	public static void add(int a, int b)
	{
		System.out.printf("%d + %d = %d\n", a, b, a + b);
	}

	public static void add(double a, double b)
	{
		System.out.printf("%f + %f = %f\n", a, b, a + b);
	}


	//요구사항] 선긋기 메소드 구현
	public static void drawLine()
	{
		System.out.println("==============================");
	}

	public static void drawLine(char c)
	{
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.println();
	}
}















