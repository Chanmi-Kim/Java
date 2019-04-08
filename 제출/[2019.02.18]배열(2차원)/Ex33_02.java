/*
  
작성자 : xxHANIxx
작성일자 : 2019.02.18.

요구사항 2. 아래와 같이 출력하시오.

출력]
   25   24   23   22   21
   20   19   18   17   16
   15   14   13   12   11
   10    9    8    7    6
    5    4    3    2    1
   
추가조건]
- 테이블의 행/열을 입력받아 출력한다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex33_02 {

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

		for (int i = nums.length - 1; i >= 0; i--) {
			for (int j = nums[0].length - 1; j >= 0; j--) {
				nums[i][j] = n;
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
