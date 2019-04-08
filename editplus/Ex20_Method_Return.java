class Ex20_Method_Return 
{
	public static void main(String[] args) 
	{
		//Ex20_Method_Return.java

		//public static 반환값 메소드명(인자리스트) {}

		//두 숫자를 입력받음
		int n1 = 10;
		int n2 = 20;

		int result = add(n1, n2);
		System.out.println(result);

		//String result2 = add(n1, n2);


		//int result = sub(n1, n2); //return 10 - 5, 5 - 10;

		

		result = square(5);
		System.out.println(result);

		System.out.println(square(6));


	}//main

	public static int add(int n1, int n2)
	{
		//System.out.println(n1 + n2);
		int sum = n1 + n2;

		return sum;
	}

	public static int sub(int n1, int n2)
	{
		System.out.println("sub 메소드 호출 완료");
		//return n1 - n2;

		//return문은 1개의 값만 돌려줄 수 있다.(***)
		//return n1 - n2, n2 - n1;
		return 100;
		//System.out.println("sub 메소드 호출 완료"); //unreachable statement
	}

	public static void test()
	{
		System.out.println("test");

		//return 100;
	}
	
	//매개변수의 제곱값 구해서 반환하는 메소드
	public static int square(int num)
	{
		//int result = num * num;
		//return result;

		return num * num;
	}

}















