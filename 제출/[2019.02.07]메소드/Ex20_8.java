/*

작성자 : xxHANIxx
작성일자 : 2019.02.07.

요구사항8. 국어, 영어, 수학 점수를 전달하면 '합격' 혹은 '불합격'이라는 단어를 반환하는 메소드를 선언하고 호출하시오.

입력]
국어 : 80
영어 : 75
수학 : 60

출력]
(불)합격입니다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex20_8
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("국어 : ");
		String korScore1 = reader.readLine();
		System.out.print("영어 : ");
		String engScore1 = reader.readLine();
		System.out.print("수학 : ");
		String mathScore1 = reader.readLine();

		int korScore2 = Integer.parseInt(korScore1);
		int engScore2 = Integer.parseInt(engScore1);
		int mathScore2 = Integer.parseInt(mathScore1);

		String result = test(korScore2, engScore2, mathScore2);
		System.out.printf("%s입니다.\n", result);
	}

	public static String test(int korScore2, int engScore2, int mathScore2)
	{
		// 메소드 호출
		// 평균 점수 60점 이상은 합격, 60점 미만은 불합격
		// 한 과목 이상 40점 미만이면 불합격
		String result = (korScore2 + engScore2 + mathScore2) / 3 >= 60 ? "합격" : 
			((korScore2 < 40 || engScore2 < 40 || mathScore2 < 40) ? "불합격" : "합격");
		return result;
	}
}
