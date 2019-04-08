import java.io.BufferedReader;
import java.io.InputStreamReader;

class Ex17_Method 
{
	public static void main(String[] args) throws Exception
	{
		//Ex17_Method.java

		//프로그램 전체 흐름
		//1. 사용자 이름 입력 > 인사
		//2. 안내문 출력
		//3. 지켜야할 규칙 설명
		
		stepOne();
		//stepTwo();
		stepThree();


	}
	
	public static void stepOne() throws Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("이름 입력 : ");
		String name = reader.readLine();

		System.out.printf("%s님 반갑습니다.\n", name);		
	}

	public static void stepTwo() 
	{
		System.out.println("===== 안내문 =====");

		System.out.println("안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.");

		System.out.println("안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.");

		System.out.println("안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.안내문입니다.");
	}

	public static void stepThree() 
	{
		System.out.println("*** 규칙");
		System.out.println("1. 어쩌구 저쩌구");
		System.out.println("2. 어쩌구 저쩌구");
		System.out.println("3. 어쩌구 저쩌구");
		System.out.println("4. 어쩌구 저쩌구");
		System.out.println("5. 어쩌구 저쩌구");
	}
}

































