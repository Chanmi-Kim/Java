package example;
import java.util.Random;

public class Ex32_Array {
	
	public static void main(String[] args) {
		
		//Ex32_Array.java
		//m1();
		//m2();
		//m3();
		
		project();
		
	}

	private static void project() {
		
		//프로젝트 > 회원 관리 프로그램
		// - 회원 정보 x 1000명
		// - 회원 정보
		//	a. 이름 : 문자열
		//	b. 나이 : 숫자
		//	c. 성별 : 숫자(1-남자, 2-여자)
		//	d. 주소 : 문자열
		
		int count = 1000;
		
		//회원 정보 저장소
		String[] name = new String[count];
		int[] age = new int[count];
		int[] gender = new int[count];
		String[] address = new String[count];
		
		//난수 생성기
		// - Math.random()
		
		//기초 데이터
		String[] n1 = { "김", "이", "박", "최", "정", "한", "지", "임", "조", "유" };
		String[] n2 = { "대", "은", "창", "미", "준", "수", "영", "우", "진", "인", "재", "하", "훈", "석", "동" };
		
		String[] a1 = { "서울시", "부산시", "대전시", "광주시", "강릉시" };
		String[] a2 = { "서대문구", "동대문구", "남구", "북구", "중구" };
		String[] a3 = { "역삼동", "중동", "대치동", "논현동", "양재동" };
		
//		int index = -1;
//		
//		index = (int)(Math.random() * n1.length);
//		System.out.print(n1[index]);
//		
//		
//		index = (int)(Math.random() * n2.length);
//		System.out.print(n2[index]);
//		index = (int)(Math.random() * n2.length);
//		System.out.print(n2[index]);
//		
//		System.out.println();
		
		
		
		//난수 발생
		// - Math.random()
		// - Random 클래스
		Random rnd = new Random();
		
		//System.out.println(rnd.nextInt()); //-21억 ~ 21억 사이의 난수
		//System.out.println(rnd.nextInt(10) + 1); //0 ~ 9
		//System.out.println(rnd.nextBoolean());
		
		for (int i=0; i<count; i++) {
			
			//이름
			name[i] = n1[rnd.nextInt(n1.length)] 
					+ n2[rnd.nextInt(n2.length)]
					+ n2[rnd.nextInt(n2.length)];
			
			//나이
			age[i] = rnd.nextInt(41) + 20;
			
			//성별
			gender[i] = rnd.nextInt(2) + 1;
			
			//주소
			address[i] = a1[rnd.nextInt(a1.length)] + " "
						+ a2[rnd.nextInt(a2.length)] + " "
						+ a3[rnd.nextInt(a3.length)];
			
		}
		
		
		//확인
		for (int i=0; i<count; i++) {
			System.out.printf("%s\t%d\t%s\t%s\n"
								, name[i]
								, age[i]
								, gender[i] == 1 ? "남자" : "여자"
								, address[i]);
		}
		
		
		
	}

	private static void m3() {
		
		//배열 초기화(리스트), 초기자(Initializer)
		int[] nums = new int[5];
		
		nums[0] = 30;
		nums[1] = 10;
		nums[2] = 50;
		nums[3] = 90;
		nums[4] = 20;
		
		int[] nums2 = new int[] { 30, 10, 50, 90, 20 };
		
		for (int num : nums2) {
			System.out.println(num);
		}
		
		String[] names = new String[] { "아무개", "홍길동", "유재석" };
		boolean[] flags = new boolean[] { true, false, false, true, true };
		
		int[] nums3 = { 10, 20, 30, 40, 50 };
		
		
	}

	private static void m2() {
		
		//*** 모든 참조형은 생성된 직후 변수들이 특정값으로 자동 초기화된다.
		//특정값(***)
		//1. 정수 -> 0
		//2. 실수 -> 0.0
		//3. 문자형 -> \0(널문자)
		//4. 논리형 -> false
		//5. 참조형(String 등등..) -> null
		
		//배열 초기화
		int[] nums = new int[5];
		
		for (int num : nums) {
			System.out.println(num);
		}
		
		double[] nums2 = new double[5];
		
		for (double num : nums2) {
			System.out.println(num);
		}
		
		boolean[] flags = new boolean[5];
		
		for (boolean flag : flags) {
			System.out.println(flag);
		}
		
		
		
	}

	private static void m1() {
		
		//배열 탐색
		String[] names = new String[5];
		
		names[0] = "홍길동";
		names[1] = "아무개";
		names[2] = "유재석";
		names[3] = "강호동";
		names[4] = "신동엽";
		
		//순차 탐색
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		//순차 탐색
		// -> (향상된) for문 -> foreach문
		// -> 배열이나 컬렉션을 대상으로 사용
		//for (변수 : 배열) {
		//
		//}
		
		//1. 루프 변수X
		//2. 배열의 0번째방 ~ 끝방까지 차례대로 접근
		for (String name : names) {
			System.out.println(name);
		}
		
		
		
		System.out.println();
		
		//둘의 차이(데이터 가공)
//		for (int i=0; i<names.length; i++) {
//			names[i] = names[i] + "님";
//			//names[i] += "님";
//		}
		
		//향상된 for문 읽기 전용으로 사용한다.(배열의 요소를 수정하는 용도로 사용 안함)
		for (String name : names) {
			name = name + "님";
		}
		
		
		
		
		for (int i=0; i<names.length; i++) {
			System.out.println(names[i]);
		}
		
		
	}

}











