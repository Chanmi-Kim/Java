/*

작성자 : xxHANIxx
작성일자 : 2019.02.14.

요구사항 6. 주어진 문자열에서 (사이의)공백을 제거 후 출력하시오.

출력]
원본 문자열 : "    하나    둘    셋    "
결과 문자열 : "    하나둘셋    "

*/

public class Ex30_06 {

	public static void main(String[] args) {
		
		deleteBlank();
	}
	
	public static void deleteBlank() {
		
		String content = "하나    둘    셋";
		System.out.print("원본 문자열 : \"    하나    둘    셋    \"\n");
		
		content = content.replace("    ", "");
		System.out.printf("결과 문자열 : \"    %s    \"\n", content);
	}
	
}
