class Ex15_Op
{
	public static void main(String[] args) 
	{
		//Ex15_Op.java(ch3)

		//������, Operator
		// - �ǿ�����(Operand)�� ������� �̸� ������ ����(���,�ൿ)�� �� �Ŀ� ������� ��ȯ�ϴ� ����(�ַ� ��ȣ�� ǥ��)
		// 1. ����(Statement)
		// 2. ǥ����(Expression)
		// 3. ������
		// 4. �ǿ�����
		// 5. ���� �켱����
		// 6. ���� ����
		int sum;

		sum = 1 + 2 + 3;

		System.out.println(sum);


		//1. ��� ������
		// - +, -, *, /, %(������ ������, mod)
		// - �ǿ����� 2�� > 2�� ������

		int a = 10;
		int b = 3;

		System.out.println(a + b); //13
		System.out.println(a - b); //7
		System.out.println(a * b); //30
		System.out.println(a / b); //3, ����/���� = ����(��)
		System.out.println(a % b); //1, ������

		//����/���� = ����
		//����/�Ǽ� = �Ǽ�
		//�Ǽ�/���� = �Ǽ�
		//�Ǽ�/�Ǽ� = �Ǽ�
		//*** ��� ������ ����� �� �ǿ����� �� �� ū �ڷ������� ��ȯ�ȴ�.
		System.out.println(10 / 3); //int
		System.out.println(10 / 3.0); //double
		System.out.println(10.0 / 3); //double
		System.out.println(10.0 / 3.0); //double

		System.out.println(10 + 10L); //long

		//***
		System.out.println(2100000000 + 2100000000L);

		System.out.println(-2100000000 - 2100000000);



		//reader
		//����ڿ��� ���ڸ� �Է� : 
		//int num = 0;
		//System.out.println(100 / num);
		

		//����, Error
		// - ����(Bug), ����, ����(Exception)

		//1. ������ ����
		// - �����Ϸ��� ������ �۾� �� �߰� �ϴ� ����
		// - ������ Ʋ�� ��� �߻�
		// - �߻� �� ����(�ʺ���)
		// - ���� ���̵� ���� > ���� �޽��� ���

		//2. ��Ÿ�� ����
		// - ��Ÿ��(Runtime) : ���α׷��� ���� ���� ����
		// - ���� �� �߻��ϴ� ����
		// - ����(Exception)
		// - ����� �۾�(�ܺ� �ڿ��� ����)
		// - �߻� �� ����(���� ���� - ���� �����ϸ�)
		// - ���� ���̵� ����(�߰� ���ϸ�.. �����־..)

		//3. �� ����
		// - ������O, ����O, ��� �̻�
		//System.out.println(10 - 20);



		//2. �� ������
		// - >, >=, <, <=, ==(equal), !=(not equal)
		// - 2�� ������
		// - �ǿ����ڵ��� �� ������ ��ȯ�ϴ� ����
		// - ������ ����� �׻� boolean���� ��ȯ(***)

		int c = 10;
		int d = 5;

		System.out.println(c > d);
		System.out.println(c >= d);
		System.out.println(c < d);
		System.out.println(c <= d);
		System.out.println(c == d);
		System.out.println(c != d);


		//������� �Է� �ùٸ��� �˻�? -> ��ȿ�� �˻�(Validation)
		
		//����� ���� �Է� : 25
		int age = 15;

		System.out.println(age >= 19);
		//System.out.println(19 <= age);
		
		//����� ���� �Է� : g
		// -> ���ҹ��ڸ� �Է� ����
		char c1 = 'A';

		//a(97) ~ z(122)
		System.out.println((int)c1 >= 97);
		System.out.println((int)c1 <= 122);


		c1 = 'c'; //���ڸ� �Է� ����

		//0(48) ~ 9(57)
		System.out.println((int)c1 >= 48);
		System.out.println((int)c1 <= 57);


		c1 = 'c'; //�ѱ۸� �Է� ����

		//�� ~ ��
		System.out.println((int)c1 >= (int)'��');
		System.out.println((int)c1 <= (int)'�R');

		System.out.println(c1 >= '��');
		System.out.println(c1 <= '�R');
		

		//==, !=
		// -> ���ڿ� ��
		//System.out.println("ȫ�浿" > "�ƹ���");
		System.out.println("ȫ�浿" == "�ƹ���"); //XXX
		System.out.println("ȫ�浿" == "ȫ�浿"); //XXX

		
		String name1 = "ȫ�浿";
		String name2 = "ȫ�浿";
		String name3 = "ȫ";
		name3 = name3 + "�浿";

		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);

		System.out.println(name1 == name2);
		System.out.println(name1 == name3);

		System.out.println(name1.equals(name2));
		System.out.println(name1.equals(name3));



		//3. �� ������
		// - &&(and), ||(or), !(not)
		// - �ǿ����ڸ� ������ Ư�� ��Ģ�� ���� ������ ������� ��ȯ
		// - &&, || : 2�� ������
		// - ! : 1�� ������
		// - �ǿ����ڴ� �ݵ�� boolean
		// - ������ ����� boolean�� ��ȯ

		boolean b1 = true;
		boolean b2 = false;

		System.out.println(b1 && b2);
		System.out.println(b1 || b2);

		//�������� + �񱳿�����
		//age : 19 �̻� ~ 60 �̸�
		// 19 <= age < 60
		age = 100;

		//System.out.println(19 <= age < 60);
		System.out.println(19 <= age && age < 60);
		System.out.println(age >= 19 && age < 60);
		System.out.println((age >= 19) && (age < 60));

		//������ �켱 ����
		// - ��� > �� > ��
		//������ ����
		// - ���� -> ������

		c1 = 'v';
		System.out.println(c1 >= '��' && c1 <= '�R');
		System.out.println(c1 < '��' || c1 > '�R'); //v
		System.out.println(!(c1 >= '��' && c1 <= '�R')); //v

		//���θ� �Ƿ�
		// - ��, ��, ��
		String color = "black";

		System.out.println(color.equals("red") || color.equals("blue") || color.equals("yellow"));


		//4. ����(�Ҵ�) ������
		// - =
		// - +=, -=, *=, /=, %= //���� ���� ������
		// - LValue(����) = RValue(���, ����)
		// - LValue�� RValue�� �ڷ��� �ݵ�� ����
		// - ���� �����ڴ� ��� �����ڸ� ��� ������ �켱 ������ ���� ����.
		// - ������ ������ ������ -> ���� �̴�.

		int n = 10;

		n = n + 1; //����
		System.out.println(n); //11
		
		n += 1;
		System.out.println(n); //12

		n = n - 3;
		System.out.println(n); //9

		n -= 3;
		System.out.println(n); //6

		n = 100 - n;
		n -= 100; //n = n - 100

		n = n * 2;
		System.out.println(n); //12

		n *= 2;
		System.out.println(n); //24

		n = n / 3;
		System.out.println(n); //8

		n /= 3;
		System.out.println(n); //2

		n = 10;
		n = n % 3;
		System.out.println(n); //1

		n = 10;
		n %= 3;
		System.out.println(n); //1



		//5. ���� ������
		// - ++(����), --(����)
		// - 1�� ������(���� ������)
		// - ������ �ǿ����ڸ� +1, -1
		// - �������� ����� ��쿡 ���� �޶�����.(������ �켱 ������ ����)
		// - ++n : ���� ��ġ(��ġ). ������ �켱 ���� ���� ����
		// - n++ : ���� ��ġ(��ġ). ������ �켱 ���� ���� ����

		n = 10;

		n = n + 1;

		n += 1;

		++n;

		System.out.println(n);

		n = n - 1;

		n -= 1;

		--n;

		System.out.println(n);


		n = 10;

		sum = 10 + ++n;

		++n; //n++;
		sum = 10 + n;

		
		sum = 10 + n++;

		sum = 10 + n;
		++n; //n++;

		System.out.println(sum);
		System.out.println(n);

		int o = 10;
		System.out.println(--o-o--);// --o - o--
		
		//--o;
		//o - o;
		//--o;



		//6. ���� ������
		// - A ? B : C
		// - 3�� ������
		// - A : boolean
		// - B, C : ��� or ���� or ǥ���� -> ��
		// - B�� C�� �ڷ����� �����ؾ� �Ѵ�.
		// - if�� ���Ұ� ����

		age = 15;

		//���? ���� or �̼�����
		String result = age >= 19 ? "����" : "�̼�����"; 
		System.out.println(result);


		int money = age >= 19 ? 1000 : 500;
		System.out.println(money);

	}
}

















