class Ex10_Output 
{
	public static void main(String[] args) 
	{
		//Ex10_Output.java
		
		//�ܼ� �����
		//Console Input/Output > IO
		// - �⺻ �Է� ��ġ : Ű����
		// - �⺻ ��� ��ġ : �����
		// - �⺻ ���� ��ġ : �����

		//�ܼ� ���
		//1. System.out.print() �޼ҵ�
		//	- ����� �ڿ� ���� ����
		//2. System.out.println() �޼ҵ�
		//	- print line
		//	- ����� �ڿ� ���� ����
		//3. System.out.printf() �޼ҵ�

		System.out.println("�ϳ�");
		System.out.println("��");
		System.out.println("��");

		//�л� x 3�� + ��,��,�� = ���� ���
		String name1 = "ȫ�浿";
		int kor1 = 100;
		int eng1 = 90;
		int math1 = 80;

		String name2 = "�ƹ���";
		int kor2 = 99;
		int eng2 = 88;
		int math2 = 77;

		String name3 = "������";
		int kor3 = 98;
		int eng3 = 57;
		int math3 = 93;

		//Ctrl+C > Ctrl+V
	
		//print() ���
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(kor1 + "\t");
		System.out.print(eng1 + "\t");
		System.out.print(math1 + "\n");

		System.out.print(name2 + "\t");
		System.out.print(kor2 + "\t");
		System.out.print(eng2 + "\t");
		System.out.print(math2 + "\n");


		System.out.print(name3 + "\t");
		System.out.print(kor3 + "\t");
		System.out.print(eng3 + "\t");
		System.out.print(math3 + "\n");
		

		//println()
		System.out.println(name1 + "\t" + kor1 + "\t" + eng1 + "\t" + math1);
		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		System.out.println(name3 + "\t" + kor3 + "\t" + eng3 + "\t" + math3);

		System.out.println(); //����� ���

		//3. printf() �޼ҵ�
		// - print format
		// - ��µǴ� ���ڿ� ������ �������� ���·� ����
		// - ������ �����ϴ� ���� ���ڵ��� �����ȴ�. > ���� ����
		// - ���� ����
		//	a. %s : String
		//	b. %d : Decimal(byte, short, int, long)
		//	c. %f : Float(float, double)
		//	d. %b : Boolean
		//	e. %c : Char

		//�䱸����] "ȫ�浿�� �ȳ��ϼ���." ���
		//��������] "ȫ�浿�� �ȳ��ϼ���. ȫ�浿�� �ʹ� �ݰ����ϴ�."
		String name = "ȫ�浿";

		System.out.println(name + "�� �ȳ��ϼ���.");
		System.out.printf("%s�� �ȳ��ϼ���.\n", name);

		System.out.println(name + "�� �ȳ��ϼ���. " + name + "�� �ʹ� �ݰ����ϴ�.");
		System.out.printf("%s�� �ȳ��ϼ���. %s�� �ʹ� �ݰ����ϴ�.\n", name, name);
		
		//SQL
		// - �����ͺ��̽� �߰� ��ɾ�
		// - insert into tblScore (name, kor, eng, math) values ('ȫ�浿', 100, 90, 80);
		System.out.println("insert into tblScore (name, kor, eng, math) values ('" + name1 + "', " + kor1 + ", " + eng1 + ", " + math1 + ");");

		System.out.printf("insert into tblScore (name, kor, eng, math) values ('%s', %d, %d, %d);\n", name2, kor2, eng2, math2);





		



	



	}
}
