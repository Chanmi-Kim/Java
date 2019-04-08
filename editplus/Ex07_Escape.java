class Ex07_Escape 
{ //K&R
	public static void main(String[] args) 
	{ //Allman
		//Ex07_Escape.java

		/*
		~, !, @, $, %, ^, &, *, , -, , _, |, 
	    ', "(quote), `(back-quote)

		(), [], <>, {}

		A > B
		A >= B

		http://terms.co.kr
		*/

		
		//특수문자
		//Escape Sequence
		// - 특정한 행동을 하도록 미리 약속되어 있는 문자(char)

		//1. \n
		// - new line
		// - 개행 문자
		// - 라인을 바꿔라(= 엔터)
		char c = '\n';
		System.out.println(c);

		String str = "안녕하세요.\n\n홍길동입니다.";
		System.out.println(str);


		//2. \r
		// - carriage return
		// - 캐럿의 위치를 현재 라인의 시작으로 이동해라(Home)
		str = "안녕하세요.\r홍길동";
		System.out.println(str);


		//\n + \r
		str = "안녕하세요.\r\n홍길동";
		System.out.println(str);


		//3. \t
		// - 탭문자
		// - 현재 위치에서 가장 가까운 탭으로 캐럿을 이동시켜라
		System.out.println("하나\t둘\t셋");

		//4. \b
		// - 백스페이스
		System.out.println("일이삼\b사오");

		//5. \", \', \\
		//안녕하세요. "홍길동"입니다.
		str = "안녕하세요. \"홍길동\"입니다.";
		System.out.println(str);

		//수업 폴더
		String path = "D:\\class\\java";
		System.out.println(path);


	}
}
















