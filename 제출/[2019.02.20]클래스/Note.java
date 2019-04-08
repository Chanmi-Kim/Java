/*

작성자 : xxHANIxx
작성일자 : 2019.02.20.

011_클래스
요구사항 2. Note 클래스를 설계하시오.

*/

package example;

class Note {

	private String size;
	private String color;
	private int pageNum;
	private String owner;
	private int price;
	private String state = "";

	public void setSize(String size) {

		if (size.equals("A3") || size.equals("A4") || size.equals("A5") || size.equals("B3") || size.equals("B4")
				|| size.equals("B5")) {
			this.size = size;
		}
	}

	public void setColor(String color) {

		if (color.equals("검정색") || color.equals("흰색") || color.equals("노란색") || color.equals("파란색")) {
			this.color = color;
		}
	}

	public void setPageNum(int pageNum) {

		this.pageNum = pageNum;

		if (pageNum >= 10 && pageNum < 200) {

			if (pageNum >= 10 && pageNum <= 50) {
				this.state = "얇은";
			} else if (pageNum >= 51 && pageNum <= 100) {
				this.state = "보통";
			} else if (pageNum >= 101 && pageNum <= 200) {
				this.state = "두꺼운";
			}
		}
	}

	public void setOwner(String owner) {
		if (owner.length() >= 2 && owner.length() <= 5) {
			this.owner = owner;
		}
	}

	public int price(String size, String color, int pageNum) {
		// 가격 계산

		this.price = 500;

		if (size.equals("A5") && color.equals("흰색") && pageNum == 10) {
			this.price = 500;
		}

		if (size.equals("A3")) {
			this.price += 400;
		} else if (size.equals("A4")) {
			this.price += 200;
		} else if (size.equals("A5")) {
			// 기본 노트 가격 포함
		} else if (size.equals("B3")) {
			this.price += 500;
		} else if (size.equals("B4")) {
			this.price += 300;
		} else if (size.equals("B5")) {
			this.price += 100;
		}

		if (color.equals("검정색")) {
			this.price += 100;
		} // else if (color.equals("흰색")) {
			// 기본 노트 가격 포함}
		else if (color.equals("노란색")) {
			this.price += 200;
		} else if (color.equals("파란색")) {
			this.price += 200;
		}

		if (pageNum > 10) {
			this.price += (pageNum - 10) * 10; // 페이지당 10원 추가

		}
		return this.price;

	}

	public void info() {

		System.out.println("■■■■■■ 노트 정보 ■■■■■■");
		if (owner == null) {

			System.out.println("주인 없는 노트");

		} else {
			System.out.printf("소유자 : %s\n", owner);
			System.out.printf("특성 : %s %s %s노트\n", color, state, size);
			System.out.printf("가격 : %,d\n", price(size, color, pageNum));
		}
		System.out.println("■■■■■■■■■■■■■■■■■");

	}
}