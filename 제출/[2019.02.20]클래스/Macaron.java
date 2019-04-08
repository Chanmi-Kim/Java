/*

작성자 : xxHANIxx
작성일자 : 2019.02.20.

011_클래스
요구사항 4. Box 클래스와 Macaron 클래스를 설계하시오.

*/

package example;

class Macaron {

	private int size;		// 생산크기
	private String color;	// 생산 색상
	private int thick;		// 샌드 두께
	
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;	
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getThick() {
		return thick;
	}
	
	public void setThick(int thick) {
		this.thick = thick;			
	}
}
