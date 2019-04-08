/*

작성자 : xxHANIxx
작성일자 : 2019.02.08.

요구사항4. 아빠와 딸의 생일을 입력받아 아빠가 딸보다 며칠을 더 살았는지 출력하시오.

입력]
아빠 생일(년) : 1960
아빠 생일(월) : 5
아빠 생일(일) : 10
딸 생일(년) : 1995
딸 생일(월) : 7
딸 생일(일) : 22

출력]
아빠는 딸보다 총 12,856일을 더 살았습니다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

class Ex22_4 
{
	public static void main(String[] args) throws Exception
	{
		dateCalc();	
	}

	public static void dateCalc() throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Calendar fatherBirthday = Calendar.getInstance();
		Calendar daughterBirthday = Calendar.getInstance();

		System.out.print("아빠 생일(년) : ");
		String fatherBirthYear = reader.readLine();
		System.out.print("아빠 생일(월) : ");
		String fatherBirthMonth = reader.readLine();
		System.out.print("아빠 생일(일) : ");
		String fatherBirthDay = reader.readLine();
		System.out.print("딸 생일(년) : ");
		String daughterBirthYear = reader.readLine();
		System.out.print("딸 생일(월) : ");
		String daughterBirthMonth = reader.readLine();
		System.out.print("딸 생일(일) : ");
		String daughterBirthDay = reader.readLine();
		
		// 아빠 생일 형변환
		int fatherBirthday_Year = Integer.parseInt(fatherBirthYear);
		int fatherBirthday_Month = Integer.parseInt(fatherBirthMonth);
		int fatherBirthday_Day = Integer.parseInt(fatherBirthDay);

		// 아빠 생일 셋팅
		fatherBirthday.set(Calendar.YEAR, fatherBirthday_Year);
		fatherBirthday.set(Calendar.MONTH, fatherBirthday_Month);
		fatherBirthday.set(Calendar.DATE, fatherBirthday_Day);

		long fatherBirthdayTick = fatherBirthday.getTime().getTime();

		// 딸 생일 형변환
		int daughterBirthday_Year = Integer.parseInt(daughterBirthYear);
		int daughterBirthday_Month = Integer.parseInt(daughterBirthMonth);
		int daughterBirthday_Day = Integer.parseInt(daughterBirthDay);

		// 딸 생일 셋팅
		daughterBirthday.set(Calendar.YEAR, daughterBirthday_Year);
		daughterBirthday.set(Calendar.MONTH, daughterBirthday_Month);
		daughterBirthday.set(Calendar.DATE, daughterBirthday_Day);

		long daughterBirthdayTick = daughterBirthday.getTime().getTime();

		System.out.printf("아빠는 딸보다 총 %,d일을 더 살았습니다.\n", (daughterBirthdayTick - fatherBirthdayTick) / 1000 / 60 / 60 / 24);
	}
}
