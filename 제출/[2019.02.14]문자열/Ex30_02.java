/*

작성자 : xxHANIxx
작성일자 : 2019.02.14.

요구사항 2. 이메일 주소를 입력받아 아이디와 도메인을 각각 추출하시오.

입력]
이메일 : hong@gmail.com

출력]
아이디 : hong
도메일 : gmail.com

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex30_02 {
	public static void main(String[] args) throws Exception{
		emailAdress();
	}
	
	public static void emailAdress() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이메일 : ");
		String email = reader.readLine();
		
		System.out.print("아이디 : ");
		int index = email.indexOf("@");
		String id = email.substring(0, index);
		System.out.println(id);
		
		System.out.print("도메인 : ");
		
		index = email.lastIndexOf("@");
		String domain = email.substring(index+1);
		System.out.println(domain);
	}
}
