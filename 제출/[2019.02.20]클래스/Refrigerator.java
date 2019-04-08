/*

작성자 : xxHANIxx
작성일자 : 2019.02.20.

011_클래스
요구사항 5. Refrigerator 클래스와 Item 클래스를 설계하시오.

*/

package example;

public class Refrigerator {

	// Item을 최대 100개까지 담을 수 있다.
	private Item[] items = new Item[100];
	private int index = 0; 	// 아이템 개수를 세기 위한 변수

	public void add(Item item) {
		// Item을 냉장고에 넣는다.
		items[index] = item;
		index++;
		System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());
	}

	public Item get(String name) {
		// Item을 냉장고에서 꺼낸다.
		for (int i = 0; i < index; i++) {
			if (name.equals(items[i].getName())) {
				index--;
				return items[i];
			}
		}
		return null;
	}

	public int count() {
		// 냉장고에 있는 Item의 개수를 확인한다.
		return index;
	}

	public void listItem() {
		// 냉장고에 있는 Item을 확인한다.
		System.out.println("[냉장고 아이템 목록]");
		for (int i = 0; i < index; i++) {
			System.out.printf("%s (%s)\n", items[i].getName(), items[i].getExpiration());
		}

	}

}
