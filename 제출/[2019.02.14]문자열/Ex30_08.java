/*

작성자 : xxHANIxx
작성일자 : 2019.02.14.

요구사항 8. 특정 단어가 문장내에 몇 회 있는지 수를 세시오.

출력]
'길동'을 총 2회 발견했습니다.

조건]
String content = "안녕~ 길동아~ 잘가~ 길동아~";
String word = "길동";

*/

public class Ex30_08 {
	public static void main(String[] args) {
		wordCount();
	}

	public static void wordCount() {

		String content = "안녕~ 길동아~ 잘가~ 길동아~";
		String word = "길동";
		int count = 0;
		int index = 0;

		while (true) {

			if (content.indexOf(word) > -1) {
				count++;
				index = content.indexOf(word, index + word.length()); // 문자 길이만큼 추가
			}

			if (content.indexOf(word, index + word.length()) < 0) {
				break;
			}
		}
		System.out.printf("'%s'을 총 %d회 발견했습니다.", word, count);
	} // wordCount
} // Ex30_08