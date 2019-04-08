package com.test.example.collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.TreeMap;

public class Ex87_Collection {
	
	public static void main(String[] args) {
		
		//Ex87_Collection.java
		
		//주말
		// - 모든 컬렉션의 특징(구조, 용도, 사용방법)
		// - 1. 코드 연습, 2. 말하기
		
		//List -> ArrayList, LinkedList, Stack, Queue, (Vector)
		//Set -> HashSet, TreeSet
		//Map -> HashMap, TreeMap, (HashTable, Properties)
		
		//TreeMap, Properties
		
		//TreeMap
		// - 이진 트리 구조를 가진 Map
		// - (범위) 검색이 용이(HashMap에 비해서)
		// - Map 계열은 key는 Set으로 관리하고, values는 List로 관리
		// - key들을 이진트리로 관리
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("white", "하양");
		map.put("red", "빨강");
		map.put("yellow", "파랑");
		map.put("blue", "파랑");
		map.put("black", "검정");
		
		System.out.println(map.size());
		System.out.println(map);
		System.out.println(map.get("blue"));
		
		//이진 트리 + 기능(정렬 > 순서 지원 기능)
		System.out.println(map.subMap("blue", "white"));
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		
		
		//Properties - 구경
		//프로그램 설정값
		//1. 프로그램 동작 -> 2. 세팅값 물리 저장 -> 3. 종료 -> 4. 재기동 -> 5. 세팅값 물리 읽기 -> 6. 프로그램 적용
		
		Properties prop = new Properties();
		
		prop.setProperty("path", "C:\\Class\\Java");//프로그램 실행 경로
		prop.setProperty("font", "D2Coding");
		prop.setProperty("language", "ko");
		prop.setProperty("autosave", "1");
		
		System.out.println(prop);
		System.out.println(prop.getProperty("font"));
		
		//저장하기
		try {
			
			//파일 쓰기
			prop.store(new FileOutputStream("setting.txt"), "");
			System.out.println("저장 완료");
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		//이전에 저장된 설정값들 읽기(복구)
		Properties setting = new Properties();
		
		try {
			
			setting.load(new FileInputStream("setting.txt"));
			
			System.out.println(setting);
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
	}

}



































