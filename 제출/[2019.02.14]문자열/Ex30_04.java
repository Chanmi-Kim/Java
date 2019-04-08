/*

작성자 : xxHANIxx
작성일자 : 2019.02.14.

요구사항 4. 파일명 10개를 입력받아 각 확장자별로 총 개수를 출력하시오.

입력]
파일명 : dog.gif
파일명 : cat.jpg
..
파일명 : 이력서.hwp
파일명 : 출금내역.doc

출력]
gif : 1개
jpg : 2개
png : 1개
hwp : 4개
doc : 2개

*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Ex30_04 {
	public static void main(String[] args) throws Exception {
		fileName();
	}
	
	public static void fileName() throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int gifCount = 0;
		int jpgCount = 0;
		int pngCount = 0;
		int hwpCount = 0;
		int docCount = 0;
		
		for(int i=0; i<5; i++) {
			
			System.out.print("파일명 : ");
			String name = reader.readLine();
			
			int index = name.lastIndexOf(".");
			String ext = name.substring(index+1);
			
			if(ext.equals("gif") == true) gifCount++;
			else if(ext.equals("jpg") == true) jpgCount++;
			else if(ext.equals("png") == true) pngCount++;
			else if(ext.equals("hwp") == true) hwpCount++;
			else if(ext.equals("doc") == true) docCount++;
			else{
				System.out.println("※경고! 올바르지 않은 확장자입니다.(gif,jpg,png,hwp,doc만 가능)");
			}
		}
		System.out.printf("gif : %d개\n", gifCount);
		System.out.printf("jpg : %d개\n", jpgCount);
		System.out.printf("png : %d개\n", pngCount);
		System.out.printf("hwp : %d개\n", hwpCount);
		System.out.printf("doc : %d개\n", docCount);
	}
}
