import java.util.Date;
import java.util.Calendar;

class Ex22_DateTime 
{
	public static void main(String[] args)  throws Exception
	{
		//Ex22_DateTime.java

		//��¥+�ð� ������
		//1. Date Ŭ����(legacy)
		//2. Calendar Ŭ����(***)

		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		m7();

	}//main

	public static void m7()
	{
		//�ð� - �ð� //tick
		//�ð� + �ð� //add()
		//�ð� - �ð� //add()
		//�ð� + �ð�
		//�ð� - �ð�

		//�ð��� �ִ� ���� : ��(��)

		//2�ð� 30��
		int hour = 2;
		int min = 30;

		//2�ð� 30�� + 40�� > 3�ð� 10��
		min = min + 40; //70 

		//���� ������
		hour += min / 60; //�ݿø�
		min = min % 60; //������

		System.out.printf("%d�ð� %d��\n", hour, min);

	}

	public static void m6()
	{
		//�ð� - �ð� = �ð�
		
		//���� �ð��� tick
		// - 1970.1.1 0:0:0 ~ ���� �ð� -> �и���
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime().getTime()); //1549608419332
		
		System.out.println(now.getTime().getTime() / 1000 / 60 / 60 / 24 / 365);

		//Date d1 = now.getTime();
		//long tick = d1.getTime();

		//now.getTime().getTime() //�޼ҵ� ü��

		System.out.println(System.currentTimeMillis());


		//�䱸����] ���� �¾�� ��ĥ? -> ���� - ������

		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 4, 10);
		long birthdayTick = birthday.getTime().getTime();

		//���� �ð��� tick
		System.out.println((System.currentTimeMillis() - birthdayTick) / 1000 / 60 / 60 / 24);


		
		Calendar christmas = Calendar.getInstance();
		christmas.set(2019, 11, 25);
		long christmasTick = christmas.getTime().getTime();
		
		System.out.println((christmasTick - System.currentTimeMillis()) / 1000 / 60 / 60 / 24);



	}

	public static void m5()
	{
		//��¥/�ð��� ����
		// - void add(int, int)
		
		//�ð� + �ð�
		Calendar now = Calendar.getInstance(); //�ð�

		now.add(Calendar.MONTH, 1);
		System.out.printf("%tF %tT\n", now, now);

		
		//�ð� - �ð�
		now = Calendar.getInstance(); //�ʱ�ȭ(���� �ð�)
		now.add(Calendar.DATE, -5);
		System.out.printf("%tF %tT\n", now, now);


	}

	public static void m4()
	{
		//1. ���� �ð� ������ -> �����
		//2. Ư�� �ð� �����
		//	a. void set(int, int)
		//	b. void set(int, int, int)
		//	c. void set(int, int, int, int, int, int)

		//�� ����(1995, 4, 10)

		Calendar birthday = Calendar.getInstance();

		birthday.set(Calendar.YEAR, 1995);
		birthday.set(Calendar.MONTH, 3);
		birthday.set(Calendar.DATE, 10);

		birthday.set(Calendar.HOUR, 22);
		birthday.set(Calendar.MINUTE, 30);


		System.out.printf("�� ������ %d�� %d�� %d���Դϴ�.\n"
						, birthday.get(Calendar.YEAR)
						, birthday.get(Calendar.MONTH) + 1
						, birthday.get(Calendar.DATE));
		
		//���ο� ���� ����
		System.out.printf("%tF\n", birthday);
		System.out.printf("%tT\n", birthday);
		System.out.printf("%tA\n", birthday);
		System.out.printf("%tR\n", birthday);
		System.out.printf("%tr\n", birthday);



		Calendar christmas = Calendar.getInstance();

		christmas.set(Calendar.YEAR, 2019);
		christmas.set(Calendar.MONTH, 11);
		christmas.set(Calendar.DATE, 25);

		christmas.set(2019, 11, 25);
		christmas.set(2019, 11, 25, 0, 0, 0);

		System.out.printf("%tF %tT %tA\n", christmas, christmas, christmas);
	}

	public static void m3() throws Exception
	{
		Calendar c1 = Calendar.getInstance();
		System.out.printf("%d : %d\n"
							, c1.get(Calendar.MINUTE)
							, c1.get(Calendar.SECOND));

		//� �۾� ���� ��..(1�� �Ѱ� �ҿ�)
		Thread.sleep(5000);

		c1 = Calendar.getInstance();
		System.out.printf("%d : %d\n"
							, c1.get(Calendar.MINUTE)
							, c1.get(Calendar.SECOND));
	}

	public static void m2()
	{
		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);

		//Ķ�������� ���ϴ� ��Ҹ� �����ϱ�
		// - int get(int field)
		
		//Ķ���� ���

		System.out.println(Calendar.YEAR);

		int year = 1;


		int result = c1.get(Calendar.YEAR);
		System.out.println(result);

		System.out.println();

		System.out.println(c1.get(Calendar.YEAR));			//2019. ��
		System.out.println(c1.get(Calendar.MONTH));			//1. ��(0~11)
		System.out.println(c1.get(Calendar.DATE));			//8. ��

		System.out.println(c1.get(Calendar.HOUR));			//2. ��(12H)
		System.out.println(c1.get(Calendar.MINUTE));		//17. ��
		System.out.println(c1.get(Calendar.SECOND));		//33. ��
		System.out.println(c1.get(Calendar.MILLISECOND));	//546. �и���(1/1000)
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));	//14. ��(24H)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));	//6. ����(��(1)~��(7))
		System.out.println(c1.get(Calendar.AM_PM));			//1. ����(0), ����(1)


		//�䱸����] ������ 2019�� 2�� 9���Դϴ�.
		System.out.printf("������ %d�� %d�� %d���Դϴ�.\n"
						, c1.get(Calendar.YEAR)
						, c1.get(Calendar.MONTH) + 1
						, c1.get(Calendar.DATE));
	}

	public static void m1()
	{
		//���� �ð��� ������
		Date d1 = new Date();
		int n1 = 10;

		System.out.println(d1); //Fri Feb 08 12:41:01 KST 2019
		System.out.println(d1.getHours());

		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);		

	}
}





















