class Ex19_Method_Parameter 
{
	public static void main(String[] args) 
	{
		//Ex19_Method_Parameter.java

		//자바의 변수 종류
		//1. 클래스 멤버 변수 -> 전역 변수(X)
		//2. 지역 변수

		//지역 변수, Local Variable
		// - 지역(Local), 영역(Scope)이 존재???
		// - 지역 변수의 지역(영역)은 메소드를 말한다.

		//변수의 생명주기, Life Cycle
		// - 변수의 영역(Scope)
		// - 변수가 언제 태어나고(생성) ~ 언제 죽는지(소멸)

		int a = 10;
		System.out.println("main() : " + a);

		test();

		//int a = 10;

		System.out.println("main() : " + b);

		String name = "홍길동";
		hello(name);

	}//main

	public static void test()
	{
		int b = 20;
		System.out.println("test() : " + b);

		int a = 30;
		System.out.println("test() : " + a);
		
		//int a = 10;
	}//test()
	
	public static void hello(String name)
	{
		//String name;
		System.out.println(name + "~ 안녕");
	}
}
