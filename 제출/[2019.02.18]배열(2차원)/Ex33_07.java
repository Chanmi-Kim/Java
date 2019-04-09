import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex33_07 {

	public static void main(String[] args) throws Exception {
		
		output();

	}

	private static void output() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행과 열의 갯수 : ");
		int line = Integer.parseInt(reader.readLine());	
		
		int n = 1;
		
		int[][] nums = new int[line][line];
		
		for (int i=0; i<nums.length-1; i++) { //행
			
			int sum = 0;
			
			for (int j=0; j<nums[0].length; j++) { //각 열의 4열까지 수를 배치하고, 5열에 sum값 배치
				
				if (j == nums[0].length-1) {
					nums[i][j] = sum;
					sum = 0;
					break;
				}
				
				nums[i][j] = n;
				sum += n;
				n++;
				
			}
			
		}
		
		//5행 출력
		int sum_line = nums.length - 1; //기준 행
		
		for (int i=0; i<nums.length; i++) { //열
			
			int sum = 0;
			
			for (int j=0; j<nums[0].length; j++) {
				sum += nums[j][i];
			}
			
			nums[sum_line][i] = sum;
			
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
