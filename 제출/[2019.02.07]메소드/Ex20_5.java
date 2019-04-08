/*

작성자 : xxHANIxx
작성일자 : 2019.02.07.

요구사항5. 이름을 전달하면 이름 뒤에 '님'을 붙여서 반환하는 메소드를 선언하고 호출하시오.
입력]
이름 : 홍길동

출력]
고객 : 홍길동님

*/

import java.io.*;

class Ex20_5
{
	public static void main(String[] args) throws Exception
	{
		String name = "";
		name = getName(name);
		System.out.printf("고객 : %s님\n", name);
	}

	public static String getName(String name) throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));		
		
		System.out.print("이름 : ");
		name = reader.readLine();

		return name;
	}
}
