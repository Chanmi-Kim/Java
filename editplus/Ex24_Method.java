class Ex24_Method 
{
	public static void main(String[] args) 
	{
		//Ex24_Method.java

		//재귀 메소드, Recursive Method
		// - 메소드가 구현부에서 자기 자신을 호출하는 형태
		// - 트리 구조의 자료형을 탐색할 때 많이 사용
		//		- 파일,폴더 구조를 제어할 때 사용

		
		//test();

		//팩토리얼
		//4! = 4 x 3 x 2 x 1
		//4! = 24
		
		int n = 4;
		int result = factorial(n); //4!

		System.out.printf("%d! = %d\n", n, result);

	} //main

	public static int factorial(int n)
	{
		int temp = (n == 1) ? 1 : n * factorial(n - 1); //재귀 호출
		
		return temp;
	}

	
	//재귀 메소드
	public static void test()
	{
		System.out.println("테스트입니다.");
		test(); //자기를 호출, 재귀 호출
	}

}



















