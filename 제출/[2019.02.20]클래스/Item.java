/*

작성자 : xxHANIxx
작성일자 : 2019.02.20.

011_클래스
요구사항 5. Refrigerator 클래스와 Item 클래스를 설계하시오.

*/

package example;

public class Item {

	private String name = "";		// 식품명
	private String expiration = "";	// 유통기한
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}

	public String getExpiration() {
		return expiration;
	}
}