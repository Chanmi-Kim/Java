import java.io.BufferedReader;
import java.io.InputStreamReader;//2.

class Example 
{
    public static void main(String[] args) throws Exception //7.
    {
        //�䱸����] ���ڸ� 2�� �Է¹޾� ��� ������ �����ϴ� �޼ҵ� 5���� �����ϰ� ȣ���Ͻÿ�.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//1.

        System.out.print("���� 1 : ");
        String input1 = reader.readLine();

        System.out.print("���� 2 : ");
        String input2 = reader.readLine();


		//int n1 = Integer.parseInt(reader.readLine());


		int n1 = Integer.parseInt(input1);
		int n2 = Integer.parseInt(input2);

        add(Integer.parseInt(input1), Integer.parseInt(input2));//3.
        subtract(n1, n2);
        multiply(n1, n2);
        divide(n1, n2);
        mod(n1, n2);

    } //main

    //���ϱ�
    public static void add(int a, int b)
    {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }

    //����
    public static void subtract(int a, int b)
    {
        System.out.printf("%d - %d = %d\n", a, b, a - b);//8.
    }

    //���ϱ�
    public static void multiply(int a, int b)
    {
        System.out.printf("%d * %d = %d\n", a, b, a * b);//9.
    }

    //������
    public static void divide(int a, int b)//4.
    {
        System.out.printf("%d / %d = %.1f\n", a, b, (double)a / b);//10. 11.
    }

    //������
    public static void mod(int a, int b)//5.
    {
        System.out.printf("%d %% %d = %d\n", a, b, a % b); //12.

		//return 100;
    }

}