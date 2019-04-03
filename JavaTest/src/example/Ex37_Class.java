package example;

import java.util.Random;

public class Ex37_Class {
	
	public static void main(String[] args) throws Exception {
	
		//클래스 -> 객체 생성 -> 사용
		
		//셔츠 클래스 > Shirts.java
		
//		Shirts s1 = new Shirts();
//		
//		s1.setSize(100);
//		s1.setPrice(25000);
//		s1.setType("반팔");
//		
//		System.out.println(s1.getSize());
//		System.out.println(s1.getColor());
//		System.out.println(s1.getType());
//		System.out.println(s1.getRecommand());
//		
//		s1.info();
		
		
		//셔츠 x 100벌
		//참조형 배열
		int n;
		int[] ns = new int[5]; 			//값형 배열
		
		
		String s;
		String[] ss = new String[5]; 	//참조형 배열
		
	
		Shirts s1 = new Shirts();
		Shirts s2;
		
		
		//질문] 현재 list안에는 셔츠가 총 몇벌이 있습니까? 0벌
		//질문] 현재 list 배열안에는 셔츠 객체가 몇개 있습니까? 0벌
		Shirts[] list = new Shirts[100];
		
		Random rnd = new Random();
		//사이즈, 가격, 타입
		int[] data1 = { 90, 95, 100, 105, 110 };
		int[] data2 = { 10000, 15000, 20000, 25000, 30000, 35000, 40000, 45000, 50000 };
		String[] data3 = { "반팔", "긴팔" };
		
		for (int i=0; i<list.length; i++) {
			list[i] = new Shirts();
			list[i].setSize(data1[rnd.nextInt(data1.length)]);
			list[i].setPrice(data2[rnd.nextInt(data2.length)]);
			list[i].setType(data3[rnd.nextInt(data3.length)]);
		}
		
		for (Shirts item : list) {
			item.info();
			System.out.println();
		}
		
//		for(int i=0; i<list.length; i++) {
//			list[0] = new Shirts();			
//		}
		
	}

}