class Ex06_Variable 
{
	public static void main(String[] args) 
	{
		//Ex06_Variable.java
		//���� + �ڷ���
		
		//������ x 8��
		
		//byte -128 ~ 127
		byte b1; //���� ����
		b1 = 10; //possible lossy conversion from int to byte
		System.out.println(b1);

		short s1;
		s1 = 10;
		System.out.println(s1);

		int n1;
		n1 = 10;
		System.out.println(n1);

		long l1;
		l1 = 10L;
		System.out.println(l1);


		
		//�Ǽ�
		float f1;
		f1 = 3.14F;
		f1 = 1.2345678901234567890123456789F;
		System.out.println(f1);

		double d1;
		d1 = 6.28D;
		d1 = 1.2345678901234567890123456789D;
		System.out.println(d1);


		//����
		char c1;
		c1 = 'A';
		c1 = '��';
		//c1 = 'AB';
		System.out.println(c1);


		
		//��
		boolean flag;
		flag = true; //false
		System.out.println(flag);





		//������ ������ �ڷ���
		byte b2;

		b2 = Byte.MAX_VALUE;
		System.out.println(b2);

		b2 = Byte.MIN_VALUE;
		System.out.println(b2);

		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);

		
		//������ 8��
		//������ 1��

		//���ڿ�, String
		//����, char

		char name1 = 'ȫ';
		char name2 = '��';
		char name3 = '��';

		String name = "ȫ�浿";
		System.out.println(name);

		String str1 = "ȫ";
		System.out.println(str1);

		String str2 = ""; //���ڿ�, Empty String
		System.out.println(str2);




	}
}













