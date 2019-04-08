/*

작성자 : xxHANIxx
작성일자 : 2019.02.12.

요구사항 10. 사용자가 입력한 범위의 숫자까지 369 게임의 결과를 출력하시오.

입력]
최대 숫자 : 100

출력]
1   2   짝   4   5   짝 .. 100s

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex27_10 {
	public static void main(String[] args) throws IOException {
		
		_369Game();
	}

	private static void _369Game() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("최대 숫자 : ");
		int limit = Integer.parseInt(reader.readLine());
		int _369Num = 0;
		int clap = 0;
		
		for (int i=1; i<= limit; i++) {
			
			_369Num = i % 10;
			
			if (_369Num == 3 || _369Num == 6 || _369Num == 9) {
				clap++;
			}
			
			_369Num = i / 10;
			if (_369Num == 3 || _369Num == 6 || _369Num == 9) {
				clap++;
			}
			
			switch (clap) {
				case 1 :
					System.out.print("짝\t");
					break;
				case 2 : 
					System.out.print("짝짝\t");
					break;
				default : 
					System.out.printf("%d\t", i);
					break;
			}
			clap = 0;
		}
		
	}
	
	
	
}
