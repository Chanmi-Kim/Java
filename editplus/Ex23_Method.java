class Ex23_Method 
{
	public static void main(String[] args) 
	{
		//Ex23_Method.java

		//요구사항] 2개의 int -> 매개변수 -> 서로 교환 + 출력
		//요구사항] 2개의 String -> 매개변수 -> 서로 교환 + 출력
		
		int a = 10;
		int b = 20;

		swap(a, b);

		swap("홍길동", "아무개");

	} //main

	public static void swap(String a, String b)
	{
		String temp;

		System.out.printf("a = %s, b = %s\n", a, b);

		//교환
		temp = a;
		a = b;
		b = temp;

		System.out.printf("a = %s, b = %s\n", a, b);
	}

	public static void swap(int a, int b)
	{
		//a = 20, b = 10

		//빈컵
		int temp;

		System.out.printf("a = %d, b = %d\n", a, b);

		//교환
		temp = a;
		a = b;
		b = temp;

		System.out.printf("a = %d, b = %d\n", a, b);
	}
}
