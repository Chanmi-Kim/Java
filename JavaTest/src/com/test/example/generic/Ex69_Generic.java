package com.test.example.generic;

public class Ex69_Generic {
	
	public static void main(String[] args) {
		
		//Ex69_Generic.java
		
		//제네릭 클래스
		
		//Item i1 = new Item();
		Item<String> i1 = new Item<String>();
		i1.a = 10;
		i1.b = 20;
		i1.c = "문자열";
		//i1.c = 10;
		
		i1.d = "문자열";
		i1.d = 100;
		
		Item<Integer> i2 = new Item<Integer>();
		i2.c = 10;
		//i2.c = "문자열";
		
		i2.d = 20;
		i2.d = "문자열";
		
		//값형 -> Wrapper Class
		Mouse<Double> m1 = new Mouse<Double>();
		m1.b = 3.14;
		
		
		Keyboard<String,Integer> k1 = new Keyboard<String,Integer>();
		k1.a = "문자열";
		k1.b = 200;
		
		
		Desktop<String> d1 = new Desktop<String>();
		
		
		
		//MyUtil util = new MyUtil();
		//util.swap(10, 20);
		
		//MyUtil util2 = new MyUtil();
		//util2.swap(10, 20);
		
		MyUtil.swap(10, 20);
		MyUtil.swap("홍길동", "아무개");

		MyUtil2<Integer> u1 = new MyUtil2<Integer>();
		u1.swap(30, 40);
		
		MyUtil2<String> u2 = new MyUtil2<String>();
		u2.swap("하나", "둘");
		
	}//main

}

//제네릭 클래스 선언
// - T : 타입 변수(자료형 자체를 저장하는 변수)
// - int a = 10
// - T = String
class Item<T> {
	
	//멤버 구현
	public int a;
	public int b;
	
	//타입변수를 사용해서 멤버 변수의 자료형을 정할 수 있다.(정적X -> 컴파일O)
	public T c;
	public Object d;
	
}

class Mouse<T> {
	
	public int a;
	public T b;
	public T c;
	public T d;
	
}

class Keyboard<T,U> {
	public T a;
	public U b;
}

class Desktop<T> {
	
	public T a;
	
	public void test(T a) {
		//T b; //지역 변수에는 타입 변수 적용을 잘 안한다.(너무 깊어서 제어가 불편)
	}
	
	public T getTest() {
		
		return a; 
	}
	
}


class MyUtil {
	
//	public static void swap(int a, int b) {
//		
//		System.out.printf("a : %s, b : %s\n", a, b);
//		
//		int temp;
//		
//		temp = a;
//		a = b;
//		b = temp;
//		
//		System.out.printf("a : %s, b : %s\n", a, b);
//		
//	}
	
	
	public static void swap(Object a, Object b) {
		
		System.out.printf("a : %s, b : %s\n", a, b);
		
		Object temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a : %s, b : %s\n", a, b);
		
	}
	
}

class MyUtil2<T> {
	
	public void swap(T a, T b) {
		
		System.out.printf("a : %s, b : %s\n", a, b);
		
		T temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.printf("a : %s, b : %s\n", a, b);
		
	}
}

















