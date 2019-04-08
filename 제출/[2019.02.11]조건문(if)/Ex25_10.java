/*

작성자 : xxHANIxx
작성일자 : 2019.02.11.

요구사항 10. 근무년수를 입력받아 아래와 같이 출력하시오.

입력] 
근무 년수 : 5

출력]
5년차 중급 개발자입니다.
당신은 1년전까지 초급 개발자였습니다.
앞으로 5년 더 근무를 하면 고급 개발자가 됩니다.

1~4년차 : 초급 개발자
5~9년차 : 중급 개발자
10년차 이상 : 고급 개발자

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex25_10 {
	public static void main(String[] args) throws IOException {
		
		workYearCalc();
	}
	
	public static void workYearCalc() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("근무년수 : ");
		int workYear = Integer.parseInt(reader.readLine());
		
		String grade = "초급";
		int beforeYear = 0;
		String beforeGrade = "";
		int afterYear = 0;
		String afterGrade = "";
		
		if (workYear > 0 && workYear < 5) {// 초급개발자
			System.out.printf("%d년차 %s 개발자입니다.\n", workYear, grade);
			
			afterYear = 5 - workYear;
			afterGrade = "중급";
			System.out.printf("앞으로 %d년 더 근무를 하면 %s 개발자가 됩니다.\n", afterYear, afterGrade);
		} else if (workYear >= 5 && workYear < 10) { // 중급 개발자
			grade = "중급";
			System.out.printf("%d년차 %s 개발자입니다.\n", workYear, grade);
			
			beforeYear = workYear - 4 ;
			beforeGrade = "초급";
			System.out.printf("당신은 %d년 전까지 %s 개발자였습니다.\n", beforeYear, beforeGrade);
			
			afterYear = 10 - workYear;
			afterGrade = "고급";
			System.out.printf("앞으로 %d년 더 근무를 하면 %s 개발자가 됩니다.\n", afterYear, afterGrade );
		} else { // 고급 개발자
			grade = "고급";
			System.out.printf("%d년차 %s 개발자입니다.\n", workYear, grade);
			
			beforeYear = workYear - 9 ;
			beforeGrade = "중급";
			System.out.printf("당신은 %d년 전까지 %s 개발자였습니다.\n", beforeYear, beforeGrade);
		}
	}
}
