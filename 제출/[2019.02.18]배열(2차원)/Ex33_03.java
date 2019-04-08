/*
  
작성자 : xxHANIxx
작성일자 : 2019.02.18.

요구사항 3. 아래와 같이 출력하시오.

출력]
    1    6   11   16   21
    2    7   12   17   22
    3    8   13   18   23
    4    9   14   19   24
    5   10   15   20   25
   
추가조건]
- 테이블의 행/열을 입력받아 출력한다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex33_03 {
	public static void main(String[] args) throws Exception {

		arrayOutput();

	}

	private static void arrayOutput() throws Exception {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행 입력 : ");
		int column = Integer.parseInt(reader.readLine());
		
		System.out.print("열 입력 : ");
		int row = Integer.parseInt(reader.readLine());

		int[][] nums = new int[column][row];
		int n = 1;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				nums[j][i] = n;
				n++;
			}
		}

		print(nums);
	}
		
	// *** 메모리 내용과 물리적 내용 그대로 출력 위해 건들면 안됨!
	private static void print(int[][] nums) {
		for (int i = 0; i < nums[0].length; i++) {
			for (int j = 0; j < nums[0].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
	}
}
