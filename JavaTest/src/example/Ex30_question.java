package example;

public class Ex30_question {

	public static void main(String[] args) {
		q8();
		q9();
	}

	private static void q9() {
		String jumin = "950215-1098765";
		
		// 1. '-' 처리
		jumin = jumin.replace("-","");
		System.out.println(jumin);
		
		// 2. 각자리에 2 ~ 9 곱하기
		//		- 9
		//		- charAt(index) : "9" -> 9 :(int)'9' -> 57
		// 		- substring(index, index+1) : "9" -> 9 : Integer.parseInt("9") -> 9
		
		// 3. 2의 값을 모두 더하기(누적)
		int sum = 0;
		for(int i=0; i<jumin.length()-1; i++) { // 마지막 번호는 제외한 조건문
			int n=Integer.parseInt(jumin.substring(i, i+1));
			// System.out.println(n);
		
			// 0(2), 1(3), 2(4), 3(5), 4(6), 5(7), 6(8), 7(9)
			// System.out.printf("i : %d, x : %d\n", i, i+2);
			// System.out.printf("i : %d, x : %d\n", i, i%8);
			// System.out.printf("i : %d, x : %d\n", i, i%8+2);
		
			sum += n * (i % 8 + 2);
		}
		
		// 4. 위의 결과를 11 나눈 나머지
		// 5. 위의 나머지를 11에서 뺀다
		// 6. 5의 결과가 10자리가 나오면 1자리만 취한다.
		int valid = (11 - (sum % 11)) % 10; // 마지막 자리 번호(유효성 번호)
		
		if (Integer.parseInt(jumin.substring(12)) == valid) {
			System.out.println("올바른 번호");
		} else {
			System.out.println("올바르지 않은 번호");
		}
	}

	private static void q8() {
		String content = "그는 \"북한은 오늘날 미국에 도달할 수 있는 무기, 핵무기를 보유하고 있다\"며 \"이것은 트럼프 대통령이 당장 처리해야 한다고 한 위협이다. 대통령은 김 위원장과 만나기로 선택했다\"고 말했다.";
	
		String word = "다";
		
		// 집합에 원하는 것이 존재 유무? indexOf(), contains()
		
		// System.out.println(content.contains(word)); //******************
		// indexOf보다 contains가 더 좋음
		// System.out.println(content.indexOf(word) > -1); // ******************
	
		// 집합에 원하는 것이 몇 개가 있는지? indexOf(), replace()
//		int index = content.indexOf(word);
//		System.out.println(index);

//		index = content.indexOf(word, index + word.length());
//		System.out.println(index);

		int index = 0;
		int count = 0;
		
		while(true) {	
			
			index = content.indexOf(word, index);
			System.out.printf("position : %d, word : %s\n", index, content.substring(index-5, index+5));
			
			if(index == -1) {
				break;
			}
			
			index += word.length();
		}
		
	}

}
