package com.test.example.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class IOTest {

	public static void main(String[] args) {
		
		//q010();
		q009();
		
	}

	private static void q009() {
		
		String path = "P:\\class\\java\\editplus\\Hello.java";
		
		try {
			
			BufferedReader kreader = new BufferedReader(new FileReader(path));
			
			String line = null;
			String txt = ""; //소스 전체 누적
			
			while ((line = kreader.readLine()) != null) {
				txt += line + "\r\n";
			}
			
			kreader.close();
			
			//System.out.println(txt);
			
			
			
			//검사 용도의 Stack
			Stack<String> stack = new Stack<String>();
			
			boolean result = false;
			
			for (int i=0; i<txt.length(); i++) {
				
				String c = txt.substring(i, i+1);
				//System.out.println(c);
				
				if (c.equals("(") || c.equals("{")) {
					//여는 괄호 찾기
					stack.push(c);
					
				} else if (c.equals(")")) {
					
					//닫는 괄호 찾기
					String temp = stack.pop();
					
					if (!temp.equals("(")) {
						//짝이 안맞았음
						result = true;
						break;
					}
					
				} else if (c.equals("}")) {

					String temp = stack.pop();
					
					if (!temp.equals("{")) {
						result = true;
						break;
					}
				}
			
			}//for
			
			if (stack.size() > 0) {
				result = true;
			}
			
			System.out.println(result);
			
			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
	}

	private static void q010() {
		
		String dir = "P:\\class\\java\\파일_입출력_문제\\";
		String source = "자바소스.java";
		String keyword = "자바예약어.dat";
		
		ArrayList<String> list = new ArrayList<String>();//keyword
		HashMap<String,Integer> count = new HashMap<String,Integer>();
		
		try {
			
			//자바예약어.dat -> list
			BufferedReader kreader = new BufferedReader(new FileReader(dir + keyword));
			
			String line = null;
			
			while ((line = kreader.readLine()) != null) {
				list.add(line);
			}
			
			kreader.close();
			
			
			//모든 키워드를 count에 등록
			for (String word : list) {
				count.put(word, 0);
			}
			
			
			
			
			//소스 읽기 + 키워드 포함??(카운트)
			BufferedReader sreader = new BufferedReader(new FileReader(dir + source));
			
			String txt = "";//자바소스.java의 모든 내용을 누적
			
			while ((line = sreader.readLine()) != null) {
				
				txt += line + "\r\n";
				
			}
			
			sreader.close();
			
			System.out.println(txt);
			
			
			//txt -> 키워드 확인
			for (String word : list) {
				//System.out.printf("%s - %b\n", word, txt.contains(word));
				
//				int index = txt.indexOf(word);
//				
//				if (index > -1) {
//					카운트 누적
//				}
//				
//				index = txt.indexOf(word, index + word.length);
//				
//				if (index > -1) {
//					카운트 누적
//				}
				
				int index = -word.length();
				
				while ((index = txt.indexOf(word, index + word.length())) > -1) {
					//카운트 누적
					
					//if (!count.containsKey(word)) {
					//	count.put(word, 1);
					//} else {
						//count = count + 1
						count.put(word, count.get(word) + 1);
					//}
					
				}//while
				
			}//keyword
			
			System.out.println(count);
			
			

		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
	}
	
}




















