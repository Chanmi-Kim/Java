class Ex23_Method 
{
	public static void main(String[] args) 
	{
		//Ex23_Method.java

		//�䱸����] 2���� int -> �Ű����� -> ���� ��ȯ + ���
		//�䱸����] 2���� String -> �Ű����� -> ���� ��ȯ + ���
		
		int a = 10;
		int b = 20;

		swap(a, b);

		swap("ȫ�浿", "�ƹ���");

	} //main

	public static void swap(String a, String b)
	{
		String temp;

		System.out.printf("a = %s, b = %s\n", a, b);

		//��ȯ
		temp = a;
		a = b;
		b = temp;

		System.out.printf("a = %s, b = %s\n", a, b);
	}

	public static void swap(int a, int b)
	{
		//a = 20, b = 10

		//����
		int temp;

		System.out.printf("a = %d, b = %d\n", a, b);

		//��ȯ
		temp = a;
		a = b;
		b = temp;

		System.out.printf("a = %d, b = %d\n", a, b);
	}
}
