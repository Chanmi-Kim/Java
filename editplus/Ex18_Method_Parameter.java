class Ex18_Method_Parameter 
{
	public static void main(String[] args) 
	{
		//Ex18_Method_Parameter.java

		//���������� [����Ű����] ��ȯ�� �޼ҵ��(���ڸ���Ʈ) 
		//{}

		//�޼ҵ� ���ڸ���Ʈ
		// - �Ķ����(Parameter)
		// - ����(Argument)
		// - �Ű�����
		// - ������/������
		// - �޼ҵ� ���뼺 ��� + ������ ����

		//** �޼ҵ��� �����ڿ� �����ڴ� �ڷ����� �����ؾ� �Ѵ�.

		//�䱸����] �λ��ϴ� �޼ҵ�
		//�߰�����] �ƹ��� �߰�
		//�߰�����] ������ �߰�
		hello();
		hello2();

		hi("ȫ�浿"); //������
		hi("�ƹ���");

		add(10);//int a = 10

		int num = 20;
		add(num);//int a = num

		//add("ȫ�浿");//int a = "ȫ�浿"

		byte num2 = 30;
		add(num2);//int a = num2;

		//add();

		add2(10, 20);
		add2(555, 222);

		//add2();
		//add2(10, 20, 30);


		buy("�ȭ", 10);
		buy("Ƽ����", 5);

		//buy(5, "����");


	} //main

	public static void hello() {
		System.out.println("ȫ�浿�� �ȳ��ϼ���.");
	}

	public static void hello2() {
		System.out.println("�ƹ����� �ȳ��ϼ���.");
	}

	public static void hi(String name) //name ������
	{
		//String name = "�ƹ���";
		System.out.printf("%s�� �ȳ��ϼ���.\n", name);
	}

	public static void add(int a)
	{
		System.out.printf("%d + 100 = %d\n", a, a + 100);
	}

	public static void add2(int a, int b)
	{
		System.out.printf("%d + %d = %d\n", a, b, a + b);
	}

	public static void buy(String item, int count)
	{
		System.out.printf("%s��(��) %d�� �ֹ��߽��ϴ�.\n", item, count);
	}

} //Ex18










