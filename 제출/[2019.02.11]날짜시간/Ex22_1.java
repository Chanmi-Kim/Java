/*

작성자 : xxHANIxx
작성일자 : 2019.02.08.

요구사항1. 오늘 태어난 아이의 백일과 첫돌이 언제인지 출력하시오.

출력]
백일 : 2019-05-21
첫돌 : 2020-02-10

*/

import java.util.Calendar;

class Ex22_1 
{
	public static void main(String[] args) 
	{
		add();
	}

	public static void add()
	{

		Calendar today = Calendar.getInstance();
	
		today.add(Calendar.DATE, 100);
		System.out.printf("백일 : %tF\n", today);

		today = Calendar.getInstance(); // 초기화
		today.add(Calendar.YEAR, 1);
		System.out.printf("첫돌 : %tF\n", today);
	}
		
}
