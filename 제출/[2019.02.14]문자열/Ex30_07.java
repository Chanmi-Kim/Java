/*

작성자 : xxHANIxx
작성일자 : 2019.02.14.

요구사항 7. 영어 단어를 1개 입력받아 아래와 같이 출력하시오.

입력]
단어 : StudentName

출력]
결과 : Student Name

조건]
- 입력은 파스칼 표기법으로 한다.
- 출력은 각 단어를 공백으로 구분한다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex30_07 {
	public static void main(String[] args) throws Exception {
		stringChange();
	}

	public static void stringChange() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("단어 : ");
		String word = reader.readLine();
		String leftSid = "";
		String rightSid = "";

		for (int index=1; index<=word.length()-1; index++) {

			char c = word.charAt(index);

			if (c >= 'A' && c <= 'Z') {

				// 앞 단어
				index = word.indexOf(c);
				leftSid = word.substring(0, index);

				// 뒷 단어
				index = word.lastIndexOf(c);
				rightSid = word.substring(index); // (index, word.length())
			}
		}
		System.out.printf("%s %s", leftSid, rightSid);
	}
}
