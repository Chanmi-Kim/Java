import java.util.Date;
import java.util.Calendar;

class Ex22_DateTime 
{
	public static void main(String[] args)  throws Exception
	{
		//Ex22_DateTime.java

		//날짜+시간 데이터
		//1. Date 클래스(legacy)
		//2. Calendar 클래스(***)

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
		//시각 - 시각 //tick
		//시각 + 시각 //add()
		//시각 - 시각 //add()
		//시간 + 시간
		//시간 - 시간

		//시간의 최대 단위 : 시(일)

		//2시간 30분
		int hour = 2;
		int min = 30;

		//2시간 30분 + 40분 > 3시간 10분
		min = min + 40; //70 

		//단위 재정비
		hour += min / 60; //반올림
		min = min % 60; //나머지

		System.out.printf("%d시간 %d분\n", hour, min);

	}

	public static void m6()
	{
		//시각 - 시각 = 시간
		
		//현재 시각의 tick
		// - 1970.1.1 0:0:0 ~ 현재 시각 -> 밀리초
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTime().getTime()); //1549608419332
		
		System.out.println(now.getTime().getTime() / 1000 / 60 / 60 / 24 / 365);

		//Date d1 = now.getTime();
		//long tick = d1.getTime();

		//now.getTime().getTime() //메소드 체인

		System.out.println(System.currentTimeMillis());


		//요구사항] 내가 태어난지 며칠? -> 현재 - 내생일

		Calendar birthday = Calendar.getInstance();
		birthday.set(1995, 4, 10);
		long birthdayTick = birthday.getTime().getTime();

		//현재 시각의 tick
		System.out.println((System.currentTimeMillis() - birthdayTick) / 1000 / 60 / 60 / 24);


		
		Calendar christmas = Calendar.getInstance();
		christmas.set(2019, 11, 25);
		long christmasTick = christmas.getTime().getTime();
		
		System.out.println((christmasTick - System.currentTimeMillis()) / 1000 / 60 / 60 / 24);



	}

	public static void m5()
	{
		//날짜/시간의 연산
		// - void add(int, int)
		
		//시각 + 시간
		Calendar now = Calendar.getInstance(); //시각

		now.add(Calendar.MONTH, 1);
		System.out.printf("%tF %tT\n", now, now);

		
		//시각 - 시간
		now = Calendar.getInstance(); //초기화(현재 시각)
		now.add(Calendar.DATE, -5);
		System.out.printf("%tF %tT\n", now, now);


	}

	public static void m4()
	{
		//1. 현재 시각 얻어오기 -> 만들기
		//2. 특정 시각 만들기
		//	a. void set(int, int)
		//	b. void set(int, int, int)
		//	c. void set(int, int, int, int, int, int)

		//내 생일(1995, 4, 10)

		Calendar birthday = Calendar.getInstance();

		birthday.set(Calendar.YEAR, 1995);
		birthday.set(Calendar.MONTH, 3);
		birthday.set(Calendar.DATE, 10);

		birthday.set(Calendar.HOUR, 22);
		birthday.set(Calendar.MINUTE, 30);


		System.out.printf("내 생일은 %d년 %d월 %d일입니다.\n"
						, birthday.get(Calendar.YEAR)
						, birthday.get(Calendar.MONTH) + 1
						, birthday.get(Calendar.DATE));
		
		//새로운 형식 문자
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

		//어떤 작업 수행 중..(1분 넘게 소요)
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

		//캘린더내의 원하는 요소를 추출하기
		// - int get(int field)
		
		//캘린더 상수

		System.out.println(Calendar.YEAR);

		int year = 1;


		int result = c1.get(Calendar.YEAR);
		System.out.println(result);

		System.out.println();

		System.out.println(c1.get(Calendar.YEAR));			//2019. 년
		System.out.println(c1.get(Calendar.MONTH));			//1. 월(0~11)
		System.out.println(c1.get(Calendar.DATE));			//8. 일

		System.out.println(c1.get(Calendar.HOUR));			//2. 시(12H)
		System.out.println(c1.get(Calendar.MINUTE));		//17. 분
		System.out.println(c1.get(Calendar.SECOND));		//33. 초
		System.out.println(c1.get(Calendar.MILLISECOND));	//546. 밀리초(1/1000)
		System.out.println(c1.get(Calendar.HOUR_OF_DAY));	//14. 시(24H)
		System.out.println(c1.get(Calendar.DAY_OF_WEEK));	//6. 요일(일(1)~토(7))
		System.out.println(c1.get(Calendar.AM_PM));			//1. 오전(0), 오후(1)


		//요구사항] 오늘은 2019년 2월 9일입니다.
		System.out.printf("오늘은 %d년 %d월 %d일입니다.\n"
						, c1.get(Calendar.YEAR)
						, c1.get(Calendar.MONTH) + 1
						, c1.get(Calendar.DATE));
	}

	public static void m1()
	{
		//현재 시각을 얻어오기
		Date d1 = new Date();
		int n1 = 10;

		System.out.println(d1); //Fri Feb 08 12:41:01 KST 2019
		System.out.println(d1.getHours());

		Calendar c1 = Calendar.getInstance();
		System.out.println(c1);		

	}
}





















