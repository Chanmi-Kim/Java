class Ex06_Variable 
{
	public static void main(String[] args) 
	{
		//Ex06_Variable.java
		//변수 + 자료형
		
		//원시형 x 8개
		
		//byte -128 ~ 127
		byte b1; //변수 선언
		b1 = 10; //possible lossy conversion from int to byte
		System.out.println(b1);

		short s1;
		s1 = 10;
		System.out.println(s1);

		int n1;
		n1 = 10;
		System.out.println(n1);

		long l1;
		l1 = 10L;
		System.out.println(l1);


		
		//실수
		float f1;
		f1 = 3.14F;
		f1 = 1.2345678901234567890123456789F;
		System.out.println(f1);

		double d1;
		d1 = 6.28D;
		d1 = 1.2345678901234567890123456789D;
		System.out.println(d1);


		//문자
		char c1;
		c1 = 'A';
		c1 = '가';
		//c1 = 'AB';
		System.out.println(c1);


		
		//논리
		boolean flag;
		flag = true; //false
		System.out.println(flag);





		//범위를 가지는 자료형
		byte b2;

		b2 = Byte.MAX_VALUE;
		System.out.println(b2);

		b2 = Byte.MIN_VALUE;
		System.out.println(b2);

		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);

		
		//원시형 8개
		//참조형 1개

		//문자열, String
		//문자, char

		char name1 = '홍';
		char name2 = '길';
		char name3 = '동';

		String name = "홍길동";
		System.out.println(name);

		String str1 = "홍";
		System.out.println(str1);

		String str2 = ""; //빈문자열, Empty String
		System.out.println(str2);




	}
}













