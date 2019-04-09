/*
  
작성자 : xxHANIxx
작성일자 : 2019.02.18.

요구사항 8. 아래와 같이 출력하시오.

출력]
    1    2    3    4    5
   16   17   18   19    6
   15   24   25   20    7
   14   23   22   21    8
   13   12   11   10    9
   
추가조건]
- 테이블의 행/열을 입력받아 출력한다.

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex33_08 {

	public static void main(String[] args) throws Exception {
		
		output();

	}

	private static void output() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행과 열의 갯수 : ");
		int line = Integer.parseInt(reader.readLine());	
		
		int[][] nums = new int[line][line];
		
		int n = 0; //배열에 넣을 값
		int i = 0, j = -1; // 행과 열의 위치값 초기화 
		int spin = line; //총 몇 회전을 하는지 (5 X 5 행렬은 총 5번 회전한다)
		int direction = 1; //진행 방향		
		
		while (true) { //break를 만나기 전 까지는 계속해서 반복한다
			
			for (int k=0; k<spin; k++) {
					j += direction;
					n++;
					nums[i][j] = n;
				}

			spin -= 1;
			
			if (spin <= 0) {
				break;
			}
			
			for (int k=0; k<spin; k++) {
				i += direction;
				n++;
				nums[i][j] = n;
			}
			
			direction *= -1;
			
		}
		
		print(nums);
		
	}//output

	private static void print(int[][] nums) {
		
		for (int i=0; i<nums.length; i++) {
			for (int j=0; j<nums[0].length; j++) {
				System.out.printf("%5d", nums[i][j]);
			}
			System.out.println();
		}
		
	}//print

}
