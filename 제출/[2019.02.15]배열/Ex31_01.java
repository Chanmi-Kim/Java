/*

작성자 : xxHANIxx
작성일자 : 2019.02.15.

요구사항 1. 숫자 5개를 입력받아 배열에 담은 뒤 역순으로 출력하시오.

입력]
숫자 : 5
숫자 : 1
숫자 : 7
숫자 : 2
숫자 : 3

출력]
list[4] = 3
list[3] = 2
list[2] = 7
list[1] = 1
list[0] = 5

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex31_01 {

	public static void main(String[] args) throws Exception{
		numsOutput();
	}

	public static void numsOutput() throws Exception{
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int nums[] = new int[5];
		
		for(int i=0; i<nums.length; i++) {
			System.out.print("숫자 : ");
			nums[i] = Integer.parseInt(reader.readLine());
		}

		for(int i=nums.length-1; i>=0; i--) {
			System.out.printf("list[%d] = %d\n", i, nums[i]);
		}
		
	} // numsOutput

} // Ex31_01
