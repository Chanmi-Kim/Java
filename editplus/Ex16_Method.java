class Ex16_Method 
{
	//���� �޼ҵ�
	// - Ư���� �޼ҵ�
	//	1. �̸��� ����� > main
	//	2. �����ϴ� ���(�ݹ� ��� -> �ݹ� �޼ҵ�)
	//		- main �޼ҵ�� �ڹ��� JRE(VM)�� ȣ���Ѵ�.
	//	3. ���α׷��� ������(Entry Point) ~ ���α׷��� ������(End Point)
	public static void main(String[] args) 
	{
		//Ex16_Method.java

		//�޼ҵ�, Method
		// - �޼ҵ�, �Լ�(Function), ���ν���(Procedure), �����ƾ(Sub Routine)..
		// - OOP���� ����ϴ� ���
		// - �ڵ��� ����

		//�޼ҵ带 ������ �ϴ� ����
		// 1. ���� ������ �ڵ尡 �� �ִ� ��� -> �ڵ� ������ ���
		// 2. ���� ������ �ڵ尡 2�� �̻� �ݺ��Ǵ� ��� -> �ڵ� ���뼺 ���

		/*

		�޼ҵ� ����
		1. �޼ҵ� �����ϱ�(�����ϱ� - Declaration)
			- public [static] void �޼ҵ��() 
			  {

			  }
			 
			- �޼ҵ� ��� == �޼ҵ� ����(Signature)
			- ���������� [����Ű����] ��ȯ�� �޼ҵ��(���� ����Ʈ) 
			  {
				�����ڵ�;
				�����ڵ�;
			  }
 		2. �޼ҵ� ȣ���ϱ�(�޼ҵ� ���� �ڵ带 ����)
		
		*/

		//�䱸����] "�ȳ��ϼ���" x 5�� ���
		//��������] "�ݰ����ϴ�" ����
		System.out.println("�ݰ����ϴ�.");
		System.out.println("�ȳ��ϼ���.");
		System.out.println("�ȳ��ϼ���.");
		System.out.println("�ȳ��ϼ���.");
		System.out.println("�ȳ��ϼ���.");


		//�䱸����] "�ȳ��ϼ���" x 5�� ���
		//��������] "�ݰ����ϴ�" ����
		//2. �޼ҵ� ȣ���ϱ�(�����ϱ�)
		hello();
		hello();
		hello();
		hello();
		hello();


		//�䱸����] "�ϳ�" ~ "��" x 10��
		System.out.println("�ϳ�");
		System.out.println("��");
		System.out.println("��");
		System.out.println("��");
		System.out.println("�ټ�");
		System.out.println("����");
		System.out.println("�ϰ�");
		System.out.println("����");
		System.out.println("��ȩ");
		System.out.println("��");

		countNumber();
		countNumber();
		countNumber();
		countNumber();
		countNumber();
		countNumber();
		countNumber();
		countNumber();
		countNumber();



	} //main

	//�޼ҵ� ���� ��ġ
	// - �ڹ� ���� : �ݵ�� Ŭ������ �������� ����(Ŭ���� �ڽ�����)

	//1. �޼ҵ� �����ϱ�
	public static void hello() 
	{
		//�ݺ��� ���� �ൿ ���� > �λ� 1�� �ϱ�
		System.out.println("Hi.");
	}


	public static void countNumber() 
	{
		System.out.println("�ϳ�");
		System.out.println("��");
		System.out.println("��");
		System.out.println("��");
		System.out.println("�ټ�");
		System.out.println("����");
		System.out.println("�ϰ�");
		System.out.println("����");
		System.out.println("��ȩ");
		System.out.println("��");
	}

} //class









