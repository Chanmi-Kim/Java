/*

작성자 : xxHANIxx
작성일자 : 2019.02.15.

요구사항 2. 학생의 이름을 N개 입력받아 아래와 같이 출력하시오.

입력]
학생 수 : 6
학생명 : 홍길동
학생명 : 아무개
학생명 : 하하하
학생명 : 호호호
학생명 : 후후후
학생명 : 헤헤헤

출력]
입력한 학생은 총 6명입니다.
1. 홍길동
2. 아무개
3. 하하하
4. 호호호
5. 후후후
6. 헤헤헤

추가조건]
- 입력받은 학생 이름은 일단 동적 배열에 저장한다.
- 입력받은 순서의 반대로 출력한다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex31_02 {
	public static void main(String[] args) throws Exception {
		nameOutput();
	}

	public static void nameOutput() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("학생 수 : ");
		int studentNum = Integer.parseInt(reader.readLine());

		String studentName[] = new String[studentNum];

		for (int i = 0; i < studentNum; i++) {
			System.out.print("학생명 : ");
			studentName[i] = reader.readLine();
		}

		System.out.printf("\n입력한 학생은 총 %d명입니다.\n", studentNum);
		for (int i = studentNum - 1; i >= 0; i--) {
			System.out.printf("%d. %s\n", studentNum - i, studentName[i]);
		}
	} // nameOutput
} // Ex31_02
