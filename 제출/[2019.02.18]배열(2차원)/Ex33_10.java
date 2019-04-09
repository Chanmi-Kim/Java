import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex33_10 {

	public static void main(String[] args) throws Exception {
		
		output();

	}

	private static void output() throws Exception {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String[][] score = new String[10][3];
		
		for (int i=0; i<score[0].length; i++) { //행
			
			if (i == 0) {
				
				System.out.print("국어 점수 : ");
				int kor = (Integer.parseInt(reader.readLine())) / 10;	
				for (int j=0; j<score.length; j++) {
					
					if (j < 10 - kor) {
						score[j][i] = " □";
					} else {
						score[j][i] = " ■";
					}
					
				}
				
			} else if (i == 1) {
				
				System.out.print("영어 점수 : ");
				int eng = (Integer.parseInt(reader.readLine())) / 10;	
				for (int j=0; j<score.length; j++) {
					
					if (j < 10 - eng) {
						score[j][i] = "\t □";
					} else {
						score[j][i] = "\t ■";
					}
					
				}
				
			} else if (i == 2 ){
				
				System.out.print("수학 점수 : ");
				int mat = (Integer.parseInt(reader.readLine())) / 10;
				for (int j=0; j<score.length; j++) {
					
					if (j < 10 - mat) {
						score[j][i] = "\t □";
					} else {
						score[j][i] = "\t ■";
					}
					
				}
				
			}
				
		}
		
		System.out.println("--------------------");
		print(score);
		System.out.println("--------------------");
		System.out.printf("국어\t영어\t수학");
		
	}//output

	private static void print(String[][] score) {
		
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score[0].length; j++) {
				System.out.printf("%s", score[i][j]);
			}
			System.out.println();
		}
		
	}//print

}
