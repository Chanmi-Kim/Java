//Ŭ���� ����Ʈ
//import java.io.BufferedReader;
//import java.io.ItnputStreamReader;
import java.io.*; //wildcard > all > ��� (Ŭ����)

class Ex13_BufferedReader 
{
	public static void main(String[] args) throws Exception
	{
		//Ex13_BufferedReader.java

		//���� �۾�
		//1. throws Exception
		//2. Ŭ���� ����Ʈ, Class import

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


		//System.in.read() : ����Ʈ ���� �Է� ����
		//reader.readLine() : ���� ���� �Է� ����(���� - 2����Ʈ ���, �����ڵ� ���)

		//�Է�
		/*
		String input = reader.readLine();
		System.out.println(input);

		input = reader.readLine();
		System.out.println(input);

		input = reader.readLine();
		System.out.println(input);
		*/

		//�䱸����] �̸��� �Է¹޾� �λ縦 �ϼ���.
		//�Է�] �̸� : ȫ�浿
		//���] �ȳ��ϼ���. ȫ�浿��.
		
		/*
		System.out.print("�̸� : ");
		String name = reader.readLine();

		System.out.printf("�ȳ��ϼ���. %s��.\n", name);
		*/


		//�䱸����] �¾ �⵵�� �Է¹޾� ���̸� ����Ͻÿ�.
		//�Է�] �¾ �⵵(ex.1995) : 
		//���] 25���Դϴ�.

		//System.out.print("�¾ �⵵(ex.1995) : ");
		//String birthYear = reader.readLine(); //1995 -> "1995"
		
		//bad operand types for binary operator '-'
		//2019 - "1995"
		//System.out.println(2019 - Integer.parseInt(birthYear)); 

		//���ڿ� ������ -> ������ ��ȯ
		//"10" -> int -> Integer
		//"10" -> 10
		//System.out.println(10 + Integer.parseInt("10")); 

		//"���ڿ�" -> int : Integer.parseInt("���ڿ�")
		//"���ڿ�" -> byte : Byte.parseByte("���ڿ�")
		//"���ڿ�" -> short : Short.parseShort("���ڿ�")
		//"���ڿ�" -> long : Long.parseLong("���ڿ�")
		//"���ڿ�" -> float : Float.parseFloat("���ڿ�")
		//"���ڿ�" -> double : Double.parseDouble("���ڿ�")
		//"true" -> boolean : Boolean.parseBoolean("true")
		//"c" -> 'c' : X > "���ڿ�".charAt(0)

		//�䱸����] ���ڸ� 2�� �Է¹޾Ƽ� + ��������� ����� ����Ͻÿ�.
		
		//�Է�] ù��° ���� : 5
		//      �ι�° ���� : 3

		//���] 5 + 3 = 8
		
		System.out.print("ù��° ���� : ");
		String num1 = reader.readLine();

		System.out.print("�ι�° ���� : ");
		String num2 = reader.readLine();

		//"5" -> 5
		//Integer.parseInt("5")
		System.out.printf("%s + %s = %,d\n", num1, num2, Integer.parseInt(num1) + Integer.parseInt(num2));
		

	}
}





