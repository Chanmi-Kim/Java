class Ex20_Method_Return 
{
	public static void main(String[] args) 
	{
		//Ex20_Method_Return.java

		//public static ��ȯ�� �޼ҵ��(���ڸ���Ʈ) {}

		//�� ���ڸ� �Է¹���
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
		System.out.println("sub �޼ҵ� ȣ�� �Ϸ�");
		//return n1 - n2;

		//return���� 1���� ���� ������ �� �ִ�.(***)
		//return n1 - n2, n2 - n1;
		return 100;
		//System.out.println("sub �޼ҵ� ȣ�� �Ϸ�"); //unreachable statement
	}

	public static void test()
	{
		System.out.println("test");

		//return 100;
	}
	
	//�Ű������� ������ ���ؼ� ��ȯ�ϴ� �޼ҵ�
	public static int square(int num)
	{
		//int result = num * num;
		//return result;

		return num * num;
	}

}















