import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex17_Method 
{
	public static void main(String[] args) throws Exception
	{
		//Ex17_Method.java

		//���α׷� ��ü �帧
		//1. ����� �̸� �Է� > �λ�
		//2. �ȳ��� ���
		//3. ���Ѿ��� ��Ģ ����
		
		stepOne();
		//stepTwo();
		stepThree();


	}
	
	public static void stepOne() throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�̸� �Է� : ");
		String name = reader.readLine();

		System.out.printf("%s�� �ݰ����ϴ�.\n", name);		
	}

	public static void stepTwo() 
	{
		System.out.println("===== �ȳ��� =====");

		System.out.println("�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.");

		System.out.println("�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.");

		System.out.println("�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.�ȳ����Դϴ�.");
	}

	public static void stepThree() 
	{
		System.out.println("*** ��Ģ");
		System.out.println("1. ��¼�� ��¼��");
		System.out.println("2. ��¼�� ��¼��");
		System.out.println("3. ��¼�� ��¼��");
		System.out.println("4. ��¼�� ��¼��");
		System.out.println("5. ��¼�� ��¼��");
	}
}

































