class Ex12_Input 
{
	public static void main(String[] args) throws Exception
	{
		//Ex12_Input.java

		//�ܼ� �Է�
		//1. System.in.read() �޼ҵ�
		//	- 1���ڸ� �б�
		//2. BufferedReader Ŭ���� 
		//3. Scanner Ŭ����

		//�䱸����] ����ڿ��� ���ڸ� 1�� �Է¹޾Ƽ� ȭ�鿡 �״�� ����Ͻÿ�.
		int input = System.in.read(); //�Է� ��� ����, ��

		//���� �ڵ尪(�ϱ�)
		//1. a(97), z(122)
		//2. A(65), Z(90)
		//3. 0(48), 9(57)
		//4. ��, �R
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		input = System.in.read();
		System.out.println(input);

		System.out.println("����");


	}
}










