package example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex30_String {

	public static void main(String[] args) throws Exception {
		
		//Ex30_String.java
		
		//String
		//m1();
		//m2();
		//m3();
		
		//m4();
		//m5();
		
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		
//		String txt = "123456789";
//		
//		System.out.println(txt.indexOf("5"));
		m12();
	}

	private static void m12() {
		
		System.out.println("tet");
		
		String str = "StudentName";
		
		int length = str.length();
		
		for (int i=0; i<length; i++) {
			
			char c = str.charAt(i);
			
			if (c >= 'A' && c <= 'Z') {
				//System.out.println(c);
				str = str.replace(c + "", "*" + c);
				i++;
				length++;
			}
			
		}
		
		System.out.println(str);
		
	}

	private static void m11() {
		
		//문자열 치환
		// - 대상 문자열에서 특정 문자열을 찾아서 다른 문자열로 바꾸기
		// - String replace(String old, String new)
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.replace("홍길동", "아무개"));
		
		
		
		
	}

	private static void m10() {
		
		//Quick Search
		// - Ctrl + Shift + L
		
		//문자열 추출
		// - char charAt(int index)
		// - String substring(int start, int end)
		//		- start(inclusive), end(exclusive)
		// - String substring(int start)
		
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.substring(3, 8));
		System.out.println(txt.substring(3, 4)); //'세'(X), "세"(O)
		
		
		String jumin = "950214-2019272";
		
		//남자? 여자?
		System.out.println(jumin.charAt(7) == '2');
		System.out.println(jumin.substring(7, 8) == "2");
		System.out.println(jumin.substring(7, 8).equals("2"));
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		System.out.println(s1 == s2);//true
		System.out.println(s1 == s3);//false
		
		
		
		//몇년생?
		System.out.println("19" + jumin.substring(0, 2));
		
		System.out.println(jumin.substring(7));
		
		
		//전체 경로
		//C:\class\java\JavaTest\src\Hello.java
		String path = "C:\\class\\java\\JavaTest\\src\\Hello.java";
		
		//1. 파일명?? -> Hello.java
		
		//System.out.println(path.lastIndexOf("\\"));
		int index = path.lastIndexOf("\\");
		String name = path.substring(index+1);
		System.out.println(name);
		
		//2. 확장자?
		index = name.lastIndexOf(".");
		String ext = name.substring(index);
		System.out.println(ext);
		
		//3. 확장자 뺀 파일명
		String name2 = name.substring(0, index);
		System.out.println(name2);
		
		
		
		
	}

	private static void m9() {
		
		//(패턴)검색
		// - boolean startsWith(String word)
		// - boolean endsWith(String word)
		// - indexOf()를 가지고 했던 행동 일부를 단순화 시켜놓은 메소드
		
		String name = "홍길동";
		
		//이름이 '홍'씨??
		System.out.println(name.indexOf('홍') == 0);
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.startsWith("홍"));

		//이름이 '동'으로 끝나??
		System.out.println(name.endsWith("동"));
		System.out.println(name.indexOf("동") == name.length() - 1);
		System.out.println(name.charAt(name.length()-1) == '동');


		

	}

	private static void m8() {
		
		//대문소자 변환
		// - String toUpperCase()
		// - String toLowerCase()
		String txt = "Hello Hong";
		
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());
		
		//
		String data = "주 과목은 Java입니다. 어쩌구 저쩌구~";
		
		String word = "java";
		
		//정밀도!
		//if (data.indexOf(word) > -1) {
		
		//검색율!!
		if (data.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("검색 결과O");
		} else {
			System.out.println("검색 결과X");
		}
		
	}

	private static void m7() {
		
		//문자열 검색
		// - 문자열내에서 원하는 문자(문자열)을 검색 -> 발견한 위치 반환
		// - int indexOf(char c)
		// - int indexOf(String s) ***
		// - int indexOf(char c, int fromIndex)
		// - int indexOf(String s, int fromIndex) ***
		
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		int result = txt.indexOf('홍');
		System.out.println(result);
		
		result = txt.indexOf("홍길동");
		System.out.println(result);
		
		result = txt.indexOf("홍길동");
		System.out.println(result);
		
		result = txt.indexOf("아무개");
		System.out.println(result);
		
		if (txt.indexOf("홍길동") > -1) {
			System.out.println("발견!!");
		} else {
			System.out.println("없음;;");
		}
		
		
		//게시판 글쓰기
		// - 관리자 모드 : 금지어 설정
		
		String content = "안녕하세요. 방금 가입했습니다.~ㅂㅏㅂㅗ야!!!";
		
		//유효성 검사
		String word = "바보";
		
		if (content.indexOf(word) == -1) {
			System.out.println("글쓰기 진행..");
		} else {
			System.out.println("금지어 사용 불가!!");
		}
		
		
		
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다.";
		
		System.out.println(txt.indexOf("홍길동"));//7
		System.out.println(txt.indexOf("홍길동", 10));
		System.out.println(txt.indexOf("홍길동", 25));
		
		int index = txt.indexOf("홍길동"); //7
		System.out.println(index);
		
		index = txt.indexOf("홍길동", index + "홍길동".length());
		System.out.println(index);
		
		index = txt.indexOf("홍길동", index + "홍길동".length());
		System.out.println(index);
		
	}

	private static void m6() {
		
		//공백 제거
		// - String trim()
		// - 문자열내에 존재하는 공백문자(탭,스페이스,엔터 등)를 제거한 문자열를 반환
		String txt = "     하나     둘     셋     ";
		
		System.out.printf("[%s]\n", txt);
		System.out.printf("[%s]\n", txt.trim());
	}

	private static void m5() {
		
		//1. 주민등록 번호 입력 -> 반드시 '-' 입력
		String jumin = "950214-1098765";
		
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
			
			if (jumin.charAt(7) == '1') {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}
			
		} else {
			System.out.println("올바르지 않은 주민번호");
		}
		
		
		
		//사용자 입력 > 영문자(소문자)만 입력 가능
		//사용자 입력 > 영문자(소문자 + 대문자)만 입력 가능
		String input = "aBc";
		
//		for (int i=0; i<input.length(); i++) {
//			
//			char c = input.charAt(i);
//			
//			if (c >= 'a' && c <= 'z') {
//				System.out.println("O");
//			} else {
//				System.out.println("X");
//			}
//			
//		}
		
		
		if (valid(input)) {
			System.out.println("O");
		} else {
			System.out.println("X");
		}
		
	}
	
	public static boolean valid(String input) {
		
		boolean result = true;
		
		for (int i=0; i<input.length(); i++) {
			
			char c = input.charAt(i);
			
			//*** 유효성 검사는 잘못된 부분을 찾는 조건을 만들어라
			//if (c < 'a' || c > 'z') {
			if ((c < 'a' || c > 'z') //소문자
					&& (c < 'A' || c > 'Z') //대문자
					&& (c < '0' || c > '9')
					&& (c < '가' || c > '힣')
					) {
				result = false;
				break;
			}
			
		}
		
		return result;
		
	}

	private static void m4() {
		
		//문자열 추출
		// - char charAt(int index)
		// - 원하는 위치의 문자 추출 + 반환
		// - Zero-based Index
		
		String txt = "안녕하세요. 홍길동님.";
		System.out.println(txt.charAt(3));
		System.out.println((int)txt.charAt(3));
		
		//마지막 문자 추출
		System.out.println(txt.charAt(11));
		
		//java.lang.StringIndexOutOfBoundsException: String index out of range: 12
		System.out.println(txt.charAt(txt.length() - 1));
		
		//"ABC"
		//"012"
		//length() -> 3
		//charAt(3)
		
		//for문
		//txt -> 1글자씩 읽기
		for (int index=0; index<txt.length(); index++) {
			System.out.println(txt.charAt(index));
		}
	}

	private static void m3() throws IOException {
		
		//회원가입, 글쓰기, 검색 등..
		//회원가입 > 이름 입력 > 이름을 2~5자 이내로 입력하세요.
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력(2~5자) : ");
		
		String name = reader.readLine();
		
		//유효성 검사
		if (name.length() >= 2 && name.length() <= 5) {
			//통과
			System.out.println("회원 가입 진행..");
		} else {
			//거절
			System.out.println("이름은 2~5자 이내로만 입력하세요.");
		}
		
	}

	private static void m2() throws Exception {
		
		//문자열 길이
		// - 문자열을 구성하는 문자의 갯수(몇글자?)
		// - int length()
		
		String txt = "ABCDEFG";
		System.out.println(txt.length());
		
		txt = "ABC123가나다*&^%";
		System.out.println(txt.length());
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장 입력 : ");
		String input = reader.readLine();
		
		System.out.printf("입력한 문장은 총 %d글자로 되어있습니다.\n", input.length());
		
	}

	private static void m1() {
		
		//문자열(String) -> 참조형(References Type)
		int a = 10;
		String s = "홍길동";
		
		a = 100;
		s = "홍길동입니다.";
		
		
		
	}
	
}


















