import java.io.BufferedReader;
import java.io.InputStreamReader;//2.

class Example 
{
    public static void main(String[] args) throws Exception //7.
    {
        //요구사항] 숫자를 2개 입력받아 산술 연산을 각각하는 메소드 5개를 선언하고 호출하시오.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//1.

        System.out.print("숫자 1 : ");
        String input1 = reader.readLine();

        System.out.print("숫자 2 : ");
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

    //더하기
    public static void add(int a, int b)
    {
        System.out.printf("%d + %d = %d\n", a, b, a + b);
    }

    //빼기
    public static void subtract(int a, int b)
    {
        System.out.printf("%d - %d = %d\n", a, b, a - b);//8.
    }

    //곱하기
    public static void multiply(int a, int b)
    {
        System.out.printf("%d * %d = %d\n", a, b, a * b);//9.
    }

    //나누기
    public static void divide(int a, int b)//4.
    {
        System.out.printf("%d / %d = %.1f\n", a, b, (double)a / b);//10. 11.
    }

    //나머지
    public static void mod(int a, int b)//5.
    {
        System.out.printf("%d %% %d = %d\n", a, b, a % b); //12.

		//return 100;
    }

}