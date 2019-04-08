/*

작성자 : xxHANIxx
작성일자 : 2019.02.20.

011_클래스
요구사항 4. Box 클래스와 Macaron 클래스를 설계하시오.

*/

package example;

import java.util.Random;

class Box {

	private Macaron[] list = new Macaron[10];
	Random rnd = new Random();

	int size[] = { 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }; // 생산크기
	String color[] = { "red", "blue", "yellow", "white", "pink", "purple", "green", "black" }; // 생산 색상
	int thick[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }; // 샌드두께

	public void cook() throws Exception {
		for (int i = 0; i < list.length; i++) {
			list[i] = new Macaron();
			list[i].setSize(size[rnd.nextInt(size.length)]);
			list[i].setColor(color[rnd.nextInt(color.length)]);
			list[i].setThick(thick[rnd.nextInt(thick.length)]);
		}
		System.out.printf("마카롱을 %d개 만들었습니다.\n", list.length);
	}

	public void check() {

		int pass = 0;
		for (int i = 0; i < list.length; i++) {
			if ((list[i].getSize() >= 8 && list[i].getSize() <= 14) && (!(list[i].getColor()).equals("black"))
					&& (list[i].getThick() >= 3 && list[i].getThick() <= 18)) {
				pass++;
			}
		}

		System.out.println("[박스 체크 결과]");
		System.out.printf("QC 합격 개수 : %d개\n", pass);
		System.out.printf("QC 불합격 개수 : %d개\n", (10 - pass));
	}

	public void list() {
		for (int i = 0; i < list.length; i++) {
			if ((list[i].getSize() >= 8 && list[i].getSize() <= 14) && (!(list[i].getColor()).equals("black"))
					&& (list[i].getThick() >= 3 && list[i].getThick() <= 18)) {
				System.out.printf("%2d번 마카롱 : %2dcm(%s,%2dmm) : 합격\n", i + 1, list[i].getSize(), list[i].getColor(),
						list[i].getThick());
			} else {
				System.out.printf("%2d번 마카롱 : %2dcm(%s,%2dmm) : 불합격\n", i + 1, list[i].getSize(), list[i].getColor(),
						list[i].getThick());
			}
		}
	}
}
