class Ex11_Output 
{
	public static void main(String[] args) 
	{
		//Ex11_Output.java
		
		//���� ���� �߰� ���
		//1. %����d
		//	- ��� �ʺ�(���ڼ�)
		//	- +(����), -(����)
		//2. %.����f
		//	- �Ǽ��� ����
		//	- �Ҽ����� ��� �ڸ��� ����
		//3. %,d
		//	- %d, %f �Ѵ� ����
		//	- �ڸ��� ǥ��(õ���� ǥ��)
		//4. %,�ʺ�.�Ҽ�f
		//   %,�ʺ�d



		int num = 10;

		System.out.printf("���� : %d�Դϴ�.\n", num);
		System.out.printf("���� : %10d�Դϴ�.\n", num);
		System.out.printf("���� : %-10d�Դϴ�.\n", num);

		//***
		System.out.println("========");
		System.out.println(" [����(��)] ");
		System.out.println("========");
		System.out.printf("%,8d\n", 1000000);
		System.out.printf("%,8d\n", 9500);
		System.out.printf("%,8d\n", 100);
		System.out.printf("%,8d\n", 12300);
		System.out.printf("%,8d\n", 928476);

		System.out.printf("10 / 3 = %.0f\n", 10.0 / 3.0);

		System.out.printf("10 / 3 = %.1f\n", 3.399); //�ݿø�O


		System.out.printf("%d\n", 10000000);
		System.out.printf("%,d\n", 10000000);

		System.out.printf("%,10.2f\n", 12345.12345);
	}
}
 













