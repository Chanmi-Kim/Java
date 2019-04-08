package com.test.example.question;

import java.io.File;
import java.util.HashMap;

public class FileTest {
	
	public static void main(String[] args) {
		
		//q005();
		//q008();
		q010();
		
	}

	private static void q010() {
		
		String path = "P:\\class\\java\\파일_디렉토리_문제\\직원";
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile()) {
				
				//아무게_2014__17.txt
				String filename = file.getName();
				
				filename = filename.replace("__", "_");
				
				String[] temp = filename.split("_");
				
				//System.out.println(temp[0]);//이름
				//System.out.println(temp[1]);//년도
				
				//1. 이름으로 폴더 생성 - 부모 폴더 생성
				File nameDir = new File(path + "\\" + temp[0]);
				
				if (!nameDir.exists()) {
					nameDir.mkdir();
				}
				
				//2. 년도로 폴더 생성 - 자식 폴더 생성
				File yearDir = new File(path + "\\" + temp[0] + "\\" + temp[1]);
				
				if (!yearDir.exists()) {
					yearDir.mkdir();
				}
				
				//3. 파일을 이름에 따라 해당 이름/년도 폴더로 이동하기
				//아무게_2014__17.txt
				String destpath = path + "\\" + temp[0] + "\\" + temp[1] + "\\" + file.getName();
				File dest = new File(destpath);
				file.renameTo(dest);
				
				
			}
		}
		
	}

	private static void q008() {
		
		//String path = "P:\\class\\java\\파일_디렉토리_문제\\폴더 삭제\\delete";
		String path = "C:\\eclipse2";
		File dir = new File(path);
		
		//dir.delete();
		
		deleteDirectory(dir);
		
		System.out.println("삭제 완료");
		
	}
	

	private static void deleteDirectory(File dir) {
		
		//1. 모든 파일 삭제
		//2. 자식 폴더를 대상으로 deleteDirectory() 재귀 호출
		//3. 본인 삭제
		
		File[] list = dir.listFiles();
		
		//1.
		for (File file : list) { //for i
			if (file.isFile()) {
				file.delete();
			}
		}
		
		//2.
		for (File sub : list) {
			if (sub.isDirectory()) {
				deleteDirectory(sub); //재귀
			}
		}
		
		//3.
		dir.delete();
		
	}

	private static void q005() {
		
		//누적변수 x N개
		// - 확장자(key) & 개수(value)
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		//String path = "P:\\class\\java\\파일_디렉토리_문제\\확장자별 카운트";
		String path = "C:\\Windows\\System32";
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		for (File file : list) {
			
			if (file.isFile()) {
				
				//마우스01.jpg
				String ext = getExtension(file.getName());
				System.out.println(ext);
				
				//*****
				if (count.containsKey(ext)) {
					//누적
					count.put(ext, count.get(ext) + 1); //ext = ext + 1
				} else {
					//1 초기화 : 새로운 확장자 등록
					count.put(ext, 1);				
				}
				
				
			}
			
		}//for
		
		//모든 컬렉션류 > toString Override > dump : 개발자용
		System.out.println(count);
		
	}//q005

	private static String getExtension(String name) {
		
		//마우스01.jpg
		int index = name.lastIndexOf(".");
		
		if (index > -1) {
			return name.substring(index);
		} else {
			return null;
		}
	}
	
	

}

















