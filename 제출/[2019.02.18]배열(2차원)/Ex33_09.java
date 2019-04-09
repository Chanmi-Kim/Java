import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex33_09 {

	public static void main(String[] args) throws Exception {
		
		output();

	}

	private static void output() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("행과 열의 갯수(홀수) : ");
		int line = Integer.parseInt(reader.readLine());	
		
		int[][] square = new int[line][line];
		
		int x = 0, y = line/2;
		square[x][y] = 1; //첫 숫자인 1은 -> 첫행 가운데
		
		
		for (int i=1; i<line*line; i++) {
			
			if ((i + 1) % line == 1) { //Case 01. 다음에 넣을 값이 N의 배수일 경우,
				
				x++; //바로 아래 행으로 내려가 다음 수를 넣는다.
				if (x == line) { //아래로 내려갔는데 행이 마지막을 만나면 ,
					x = 0; //첫 행으로 이동한다.
				}
				
				square[x][y] = i + 1;
				
			} else { //Case 02. 다음에 넣을 수가 N의 배수가 아니라면, 왼쪽 위로 이동한다.
				
				x--; //위로
				if (x == -1) { //행이 처음을 벗어나면 마지막 행으로 이동한다.
					x = line - 1;
				}
				
				y--; //왼쪽으로
				if (y == -1) { //열이 처음을 벗어나면 마지막 열로 이동한다.
					y = line -1;
				}
				
				square[x][y] = i+1;
				
			}
			
		}
		
		print(square);
		
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
