/*
  
작성자 : xxHANIxx
작성일자 : 2019.02.18.

요구사항 5. 아래와 같이 출력하시오.

출력]
    0    0    1    0    0
    0    2    3    4    0
    5    6    7    8    9
    0   10   11   12    0
    0    0   13    0    0
   
추가조건]
- 테이블의 행/열을 입력받아 출력한다. (홀수만)

*/

public class Ex33_05 {

	public static void main(String[] args) {
		arrayOutput();
	}
	
	private static void arrayOutput() {
		
		int[][] nums = new int[5][5];
		int n = 1;
		int startPosition = 2;
		

		for (int i = 0; i < nums.length; i++) {
			
			for (int j = startPosition; j < nums[0].length-startPosition; j++) {
				nums[i][j] = n;
				n++;
			}
			startPosition -= 1;
			
			for (int j = startPosition; j < nums[0].length-startPosition; j++) {
				nums[i][j] = n;
				n++;
			}
			startPosition += 1;
			
			if(startPosition < 0) {
				startPosition *= -1;
				
			}
			
			//System.out.println(startPosition);
			
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
