class Ex19_Method_Parameter 
{
	public static void main(String[] args) 
	{
		//Ex19_Method_Parameter.java

		//�ڹ��� ���� ����
		//1. Ŭ���� ��� ���� -> ���� ����(X)
		//2. ���� ����

		//���� ����, Local Variable
		// - ����(Local), ����(Scope)�� ����???
		// - ���� ������ ����(����)�� �޼ҵ带 ���Ѵ�.

		//������ �����ֱ�, Life Cycle
		// - ������ ����(Scope)
		// - ������ ���� �¾��(����) ~ ���� �״���(�Ҹ�)

		int a = 10;
		System.out.println("main() : " + a);

		test();

		//int a = 10;

		System.out.println("main() : " + b);

		String name = "ȫ�浿";
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
		System.out.println(name + "~ �ȳ�");
	}
}
