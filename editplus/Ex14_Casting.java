class Ex14_Casting 
{
	public static void main(String[] args) 
	{
		//Ex14_Casting.java(p49)

		//���� ����ȯ, Type Casting
		// - A��� �ڷ����� B��� �ڷ������� �ٲٴ� �۾�

		//1. �Ͻ��� ����ȯ. �ڵ� Ÿ�� ��ȯ
		// - ū�� = ������
		// - 100% ����

		//2. ����� ����ȯ. ���� Ÿ�� ��ȯ
		// - ������ = ū��
		// - ��쿡 ���� �ٸ�(****)
		// - �����÷ο�(Overflow) �߻�
		//	a. �����÷ο�(Overflow)
		//	b. ����÷ο�(Underflow)


		int a = 30;
		int b = 30;

		int c = 20;
		int d = c;

		byte e = 10;
		int f = e; //int = byte

		//= ������
		//LValue = RValue
		//**** �ݵ�� LValue�� RValue�� �ڷ����� �����ؾ� �Ѵ�. �ٸ��� ������ �߻��Ѵ�.
		//int g = "10";

		

		byte b1 = 127; //����
		short s1; //���纻

		//short = byte
		//ū�� = ������
		//byte -> short
		//s1 = b1;
		//() : ����ȯ ������
		s1 = (short)b1;

		System.out.println(s1); //���纻 Ȯ��



		byte b2 = 20;
		long l2;

		l2 = b2;

		System.out.println(l2);



		//����� ��ȯ
		short s3 = 200;
		byte b3;

		b3 = (byte)s3;

		System.out.println(b3);


		int a4 = 2100000000;

		short b4;

		b4 = (short)a4;

		System.out.println(b4);




		

		byte b5 = (byte)10; //����� ����ȯ
		short s5 = (short)10; //����� ����ȯ
		int n5 = 10; //X
		long l5 = 10; //�Ͻ��� ����ȯ
		


		//���� -> ����
		//���� -> �Ǽ�
		//�Ǽ� -> ����
		int n6 = Integer.MAX_VALUE; //2100000000
		float f6;//2100000000.0 -> 2.1e9

		//2.14748365E9
		//2.14748365

		f6 = n6;

		System.out.println(f6);

		int n7;
		float f7 = 100F;

		//�Ͻ���(X) -> �����(O)
		//4byte = 4byte
		n7 = (int)f7;

		System.out.println(n7);

		long n8;
		float f8 = 200F;

		n8 = (long)f8;

		System.out.println(n8);


		//�Ǽ� -> �Ǽ�
		float f9 = 3.14F;
		double d9 = f9;
		System.out.println(d9);

		double f10 = 3.14F;
		float d10 = (float)f10;
		System.out.println(d10);

		
		//boolean
		//boolean m11 = true;
		//int n11;

		//n11 = m11;

		//System.out.println(n11);


		char c12 = 'A';
		int n12;

		n12 = c12;

		System.out.println(n12);

		char c13 = '��';
		short s13;

		s13 = (short)c13;

		System.out.println(s13);


		int n14 = 65;
		char c14;

		c14 = (char)n14;
		
		System.out.println(c14);


		//���� �ڵ尪
		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((int)'a');
		System.out.println((int)'z');
		System.out.println((int)'0');
		System.out.println((int)'9');

		System.out.println((int)'\r');
		System.out.println((int)'\n');
		System.out.println((int)'\t');
		System.out.println((int)'\b');
		System.out.println((int)' ');

		System.out.println((int)'��');
		System.out.println((int)'�R');

		//�ѱ� : �ϼ���, ������


		System.out.printf("%d", "a");





	}
}


















