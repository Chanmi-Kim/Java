/*

작성자 : xxHANIxx
작성일자 : 2019.02.11.

요구사항 4. 문자 1개를 입력받아 아래와 같이 출력하시오.

입력] 
문자 : f

출력]
Father

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_4 {
	public static void main(String[] args) throws IOException{
		
		charOutput();
	
	}
	public static void charOutput() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자 : ");
		String character = reader.readLine();
		
		if (character.equals("f") || character.equals("F")) {
			System.out.println("Father");
		} else if (character.equals("m") || character.equals("M")) {
			System.out.println("Mother");
		} else if (character.equals("s") || character.equals("S")) {
			System.out.println("Sister");
		} else if (character.equals("b") || character.equals("B")) {
			System.out.println("Brother");
		} else { System.out.println("해당 출력 결과가 없습니다."); }
	}
}
