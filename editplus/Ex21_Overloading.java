class Ex21_Overloading 
{
	public static void main(String[] args) 
	{
		//Ex21_Overloading.java
		
		//�޼ҵ� �����ε�, Method Overloading
		// - �޼ҵ尡 �Ű������� �پ��� ���·� �޾Ƶ��̴� ���
		// - ���� �̸��� �޼ҵ带 ������ �����ϴ� ���
		// - �����ڿ��� ����(����X, ����X) > ���꼺 + ������(**) ���

		//�޼ҵ� �����ε� ���� O
		//1. ������ ����
		//2. ������ Ÿ��

		//�޼ҵ� �����ε� ���� X
		//1. ������ �̸�
		//2. ��ȯ���� Ÿ��

		//�޼ҵ� ȣ��
		//test(); //1.
		//test(100); //3.
		//test("ȫ�浿"); //4.
		//test(100); //5. X
		//test(10, 20); //6.
		//result = test(100); //8. X

		//�޼ҵ带 �ۼ� ��..
		//1. public static void test() {}				//O
		//2. public static void test() {}				//X. 1.
		//3. public static void test(int n) {}			//O
		//4. public static void test(String s) {}		//O
		//5. public static void test(int m) {}			//X. 3.
		//6. public static void test(int n, int m) {}	//O
		//7. public static void test(int n, String s) {}//O
		//8. public static int test(int n) {}			//X. 3.


		hello();//�ѱ�
		hello("ȫ�浿");//����


		drawLine();
		System.out.println("            ����ǥ");
		drawLine();

		System.out.println();
		System.out.println();
		System.out.println();

		drawLine('*');
		System.out.println("            ����");
		drawLine('*');

	}// main



	public static void hello()
	{
		//System.out.println("�ȳ�");
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
		//output ���
	}
	public static void println(int output)
	{
		//output ���
	}
	public static void println(double output)
	{
		//output ���
	}



	//�䱸����] ���� 2�� ���ϱ�
	//1. int + int
	//2. double + double
	//3. byte + byte
	//4. short + short
	//5. int + byte
	// - 64��
	public static void add(int a, int b)
	{
		System.out.printf("%d + %d = %d\n", a, b, a + b);
	}

	public static void add(double a, double b)
	{
		System.out.printf("%f + %f = %f\n", a, b, a + b);
	}


	//�䱸����] ���߱� �޼ҵ� ����
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















