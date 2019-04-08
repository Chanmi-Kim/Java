/*

작성자 : xxHANIxx
작성일자 : 2019.02.11.

요구사항 2. 학생의 국어 점수를 입력받아 성적을 출력하시오.

입력] 
점수 : 85

출력]
입력한 85점은 성적 B입니다.

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("점수 : ");
		int score = Integer.parseInt(reader.readLine());
		
		// 반환값 저장
		String grade  = scoreCalc(score); // ** 인자값 반환값 유의!
		
		if (score < 0 && score <= 100) {
			System.out.printf("입력한 %d점은 성적 %s입니다.\n", score, grade);
		} else {
			System.out.println("유효성 검사 : 0~100점 이내 점수가 아닙니다.");
		}
	}
	
	public static String scoreCalc(int score) {
		
		if ( score >= 90 && score == 100) {
			return "A";
		} else if ( score >= 80 && score < 90) {
			return "B";
		} else if ( score >= 70 && score < 80) {
			return "C";
		} else if ( score >= 60 && score < 70) {
			return "D";
		} else if ( score >= 50 && score < 60) {
			return "F";
		} else {
			return "";
		}
	}
}
