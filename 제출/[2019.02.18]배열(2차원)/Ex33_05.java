
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
