class Ex09_Variable 
{
	public static void main(String[] args) 
	{
		//Ex09_Variable.java

		//������


		//�䱸����] "10 + 20 = 30" ���
		int a = 10;
		int b = 20;

		System.out.println(a + " ���ϱ� " + b + " �� " + (a + b));


		//���� ����? �ڷ���?
		//1. ����? byte
		//2. ������? short
		//3. �ֹε�Ϲ�ȣ(���ڸ�)? 

		//���� : ���ڷ� ������ �� �����͸� +,- ������ �ִ°�?? > "���ڿ�"

		int jumin = 950101;
		System.out.println(jumin);

		//�ڹ��� ����� ǥ�� ���
		// - ���� ǥ�� ��� > ���� ����� ����
		// 1. ������ ǥ��
		// 2. 8���� ǥ��
		// 3. 16���� ǥ��
		// 4. 2���� ǥ��(X)
		jumin = 021225;
		System.out.println(jumin);

		String tel = "01012345678";
	
		int num = 10; //10 : ������
		num = 010; //8����(0~7)
		num = 0x10; //16����(0~F)
		System.out.println(num);



	}
}


















