/*

작성자 : xxHANIxx
작성일자 : 2019.02.20.

011_클래스
요구사항 3. 과자(Bugles) 클래스를 설계하시오.

*/

package example;

import java.util.Calendar;

public class Bugles {

	private int price;				// 가격
	private int size;				// 용량
	private String creationTime;	// 생산일자
	private long expiration;		// 유통기한
	private long interval;

	public int getPrice() {
		if (size == 300) { price = 850; }
		else if (size == 500) { price = 1200; }
		else if (size == 850) { price = 150; }
				
		return price;
	}

	public long getExpiration() {
		if (size == 300) {
			this.expiration =  7 - interval;
		} else if (size == 500) {
			this.expiration = 10 - interval;
		} else if (size == 850) {
			this.expiration = 15 - interval;
		}
		return this.expiration;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public long setCreationTime(String creationTime) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.DAY_OF_MONTH, 1);
		long nowTick = now.getTime().getTime() / 1000 / 60 / 60 / 24;

		Calendar date = Calendar.getInstance();
		
		creationTime = creationTime.replace("-", ""); // '-'이 있을 경우 삭제 처리
		int yy = Integer.parseInt(creationTime.substring(0, 4));
		int mm = Integer.parseInt(creationTime.substring(5, 6)) -1;
		int dd = Integer.parseInt(creationTime.substring(6, 8));
		
		date.set(yy, mm, dd);
		long creationTimeTick = date.getTime().getTime() / 1000 / 60 / 60 / 24;
		interval = nowTick - creationTimeTick;
		
		return interval;
	}
	
	public void eat() {
		if(expiration > 0) {
			System.out.println("과자를 맛있게 먹습니다.");
		} else {
			System.out.println("유통기한이 지나 먹을 수 없습니다.");
		}
	}

}
