/*

작성자 : xxHANIxx
작성일자 : 2019.02.08.

요구사항3. 남녀 커플의 이름과 만난 날을 입력받아 기념일을 출력하시오.

입력]
남자 이름 : 홍길동
여자 이름 : 호호호
만난 날(년) : 2019
만난 날(월) : 2
만난 일(일) : 1

출력]
'홍길동'과(와) '호호호'의 기념일
100일 : 2019-xx-xx
200일 : xxxx-xx-xx
300일 : xxxx-xx-xx
500일 : xxxx-xx-xx
1000일 : xxxx-xx-xx

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

class Ex22_3 
{
	public static void main(String[] args) throws Exception
	{
		coupleDateCalc();
	}

	public static void coupleDateCalc() throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Calendar coupleDate = Calendar.getInstance();

		System.out.print("남자 이름 : ");
		String manName = reader.readLine();
		System.out.print("여자 이름 : ");
		String womanName = reader.readLine();
		System.out.print("만난 날(년) : ");
		String year = reader.readLine();
		System.out.print("만난 날(월) : ");
		String month = reader.readLine();
		System.out.print("만난 일(일) : ");
		String day = reader.readLine();
		
		int coupleDate_Year = Integer.parseInt(year);
		int coupleDate_Month = Integer.parseInt(month);
		int coupleDate_Day = Integer.parseInt(day);

		coupleDate.set(Calendar.YEAR, coupleDate_Year);
		coupleDate.set(Calendar.MONTH, coupleDate_Month - 1);
		coupleDate.set(Calendar.DATE, coupleDate_Day);
		// System.out.printf("%tF\n", coupleDate); // 세팅한 날짜
		

		System.out.printf("'%s'과(와) '%s'의 기념일\n", manName, womanName);
		
		coupleDate.add(Calendar.DATE, 100);
		System.out.printf("100일 : %tF\n", coupleDate);

		coupleDate = Calendar.getInstance(); // 초기화
		coupleDate.add(Calendar.DATE, 200);
		System.out.printf("200일 : %tF\n", coupleDate);
		
		coupleDate = Calendar.getInstance();
		coupleDate.add(Calendar.DATE, 300);
		System.out.printf("300일 : %tF\n", coupleDate);
		
		coupleDate = Calendar.getInstance();
		coupleDate.add(Calendar.DATE, 500);
		System.out.printf("500일 : %tF\n", coupleDate);
		
		coupleDate = Calendar.getInstance();
		coupleDate.add(Calendar.DATE, 1000);
		System.out.printf("1000일 : %tF\n", coupleDate);
	}
}
