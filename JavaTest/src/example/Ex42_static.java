package example;

public class Ex42_static {
	
	public static void main(String[] args) {
		
		//Ex42_static.java
		
		//멤버(객체,정적) 변수의 생명주기
		//System.out.println(b);
		System.out.println(StaticItem.b);
		
		StaticItem item = new StaticItem();
		System.out.println(item.a);
		
		item.aaa();		
		StaticItem.bbb();
		
		
		test();
		
		
	}//main

	private static void test() {
		// TODO Auto-generated method stub
		
	}

}

class StaticItem {
	
	//1. 객체 메소드
	//	a. 객체 변수 접근 O > 객체명.변수
	//	b. 정적 변수 접근 O > 클래스명.변수
	//	c. 객체 메소드 접근 O > 객체명.메소드()
	//	d. 정적 메소드 접근 O > 클래스명.메소드()
	
	//2. 정적 메소드
	//	a. 객체 변수 접근 X
	//	b. 정적 변수 접근 O > 클래스명.변수
	//	c. 객체 메소드 접근 X
	//	d. 정적 메소드 접근 O > 클래스명.메소드()
	
	
	public int a = 10;			//객체 변수
	public static int b = 20;	//정적 변수
	
	public void aaa() {			//겍체 메소드
		System.out.println("객체 메소드");
//		System.out.println(a);
//		System.out.println(b);
		System.out.println(this.a);
		System.out.println(StaticItem.b);
		
		test();
	}
	
	private void test() {
		// TODO Auto-generated method stub
		
	}

	public static void bbb() {	//정적 메소드
		System.out.println("정적 메소드");
		//System.out.println(a);
		//System.out.println(b);
		
		//System.out.println(this.a);
		System.out.println(StaticItem.b);
	}
	
	
	//객체 메소드
	public void ccc() {
		ddd();
		this.ddd();
		eee();
		StaticItem.fff();
	}
	
	public void ddd() {	}
	
	//정적 메소드
	public static void eee() {
		//this.ccc();
		fff();
		StaticItem.fff();
	}
	
	public static void fff() {	}
	
	
}