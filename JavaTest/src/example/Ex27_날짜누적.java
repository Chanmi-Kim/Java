package example;

public class Ex27_날짜누적 {
	
	public static void main(String[] args) {
		
		//Ex27_날짜누적.java
		
		int year = 2019;
		int month = 2;
		int date = 13;
		
		int sum = 0; //누적 변수
		
		//1. 큰덩어리
		for (int i=1; i<year; i++) {
			
			sum += 365;
			
			if (isLeaf(i)) {
				sum++;
			}
		}
		
		
		//2. 중간 덩어리
		for (int i=1; i<month; i++) {
			switch (i) {
				case 1: case 3: case 5: case 7: case 8: case 10: case 12:
					sum += 31;
					break;
				case 4: case 6: case 9: case 11:
					sum += 30;
					break;
				case 2:
					if (isLeaf(year)) {
						sum += 29;
					} else {
						sum += 28;
					}
			}
		}
		
		
		//3. 작은 덩어리
		sum += date;
		
		
		//확인
		System.out.printf("%,d\n", sum);
		System.out.println(sum % 7);
		
	}//main
	
	//메소드 이름 패턴
	//1. setXXX() : 쓰기
	//2. getXXX() : 읽기
	//3. isXXX() : 확인(반환값 boolean)
	
	public static boolean isLeaf(int year) {
		
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			return true;
		} else {
			return false;
		}
		
		
		//return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) ? true : false;
		
	}

}





















