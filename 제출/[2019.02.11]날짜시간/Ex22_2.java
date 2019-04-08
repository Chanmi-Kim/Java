/*

작성자 : xxHANIxx
작성일자 : 2019.02.08.

요구사항2. 태어난 년도를 입력하면 나이를 출력하시오.

입력]
태어난 년도 : 1995

출력]
나이 : 25세

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;

class Ex22_2 
{
	public static void main(String[] args) throws Exception
	{
		age();
	}

	public static void age() throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Calendar birthday = Calendar.getInstance();
	
		int thisYear = birthday.get(Calendar.YEAR); // 현재년도 추출

		System.out.print("태어난 년도 : ");
		String year = reader.readLine();
		
		int birthYear = Integer.parseInt(year);

		System.out.println(thisYear - birthYear + 1);	
	}
}
