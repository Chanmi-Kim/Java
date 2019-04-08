class Ex18_Method_Parameter 
{
	public static void main(String[] args) 
	{
		//Ex18_Method_Parameter.java

		//접근지정자 [정적키워드] 반환값 메소드명(인자리스트) 
		//{}

		//메소드 인자리스트
		// - 파라미터(Parameter)
		// - 인자(Argument)
		// - 매개변수
		// - 가인자/실인자
		// - 메소드 가용성 향상 + 다형성 지원

		//** 메소드의 실인자와 가인자는 자료형이 동일해야 한다.

		//요구사항] 인사하는 메소드
		//추가사항] 아무개 추가
		//추가사항] 하하하 추가
		hello();
		hello2();

		hi("홍길동"); //실인자
		hi("아무개");

		add(10);//int a = 10

		int num = 20;
		add(num);//int a = num

		//add("홍길동");//int a = "홍길동"

		byte num2 = 30;
		add(num2);//int a = num2;

		//add();

		add2(10, 20);
		add2(555, 222);

		//add2();
		//add2(10, 20, 30);


		buy("운동화", 10);
		buy("티셔츠", 5);

		//buy(5, "바지");


	} //main

	public static void hello() {
		System.out.println("홍길동님 안녕하세요.");
	}

	public static void hello2() {
		System.out.println("아무개님 안녕하세요.");
	}

	public static void hi(String name) //name 가인자
	{
		//String name = "아무개";
		System.out.printf("%s님 안녕하세요.\n", name);
	}

	public static void add(int a)
	{
		System.out.printf("%d + 100 = %d\n", a, a + 100);
	}

	public static void add2(int a, int b)
	{
		System.out.printf("%d + %d = %d\n", a, b, a + b);
	}

	public static void buy(String item, int count)
	{
		System.out.printf("%s을(를) %d개 주문했습니다.\n", item, count);
	}

} //Ex18










