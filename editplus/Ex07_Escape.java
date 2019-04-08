class Ex07_Escape 
{ //K&R
	public static void main(String[] args) 
	{ //Allman
		//Ex07_Escape.java

		/*
		~, !, @, $, %, ^, &, *, , -, , _, |, 
	    ', "(quote), `(back-quote)

		(), [], <>, {}

		A > B
		A >= B

		http://terms.co.kr
		*/

		
		//Ư������
		//Escape Sequence
		// - Ư���� �ൿ�� �ϵ��� �̸� ��ӵǾ� �ִ� ����(char)

		//1. \n
		// - new line
		// - ���� ����
		// - ������ �ٲ��(= ����)
		char c = '\n';
		System.out.println(c);

		String str = "�ȳ��ϼ���.\n\nȫ�浿�Դϴ�.";
		System.out.println(str);


		//2. \r
		// - carriage return
		// - ĳ���� ��ġ�� ���� ������ �������� �̵��ض�(Home)
		str = "�ȳ��ϼ���.\rȫ�浿";
		System.out.println(str);


		//\n + \r
		str = "�ȳ��ϼ���.\r\nȫ�浿";
		System.out.println(str);


		//3. \t
		// - �ǹ���
		// - ���� ��ġ���� ���� ����� ������ ĳ���� �̵����Ѷ�
		System.out.println("�ϳ�\t��\t��");

		//4. \b
		// - �齺���̽�
		System.out.println("���̻�\b���");

		//5. \", \', \\
		//�ȳ��ϼ���. "ȫ�浿"�Դϴ�.
		str = "�ȳ��ϼ���. \"ȫ�浿\"�Դϴ�.";
		System.out.println(str);

		//���� ����
		String path = "D:\\class\\java";
		System.out.println(path);


	}
}
















