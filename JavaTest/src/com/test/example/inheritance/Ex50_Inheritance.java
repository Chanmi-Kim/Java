package com.test.example.inheritance;

public class Ex50_Inheritance {
	
	public static void main(String[] args) {
		
		//Ex50_Inheritance.java
		
		//상속, Inheritance
		// - 클래스와 클래스간에 발생
		// - 부모 클래스가 구현한 모든 멤버(변수, 메소드)를 자식 클래스에게 물려줌.(Ctrl + C, Ctrl + V)
		// - 상속의 목적 : 코드 재사용
		
		//상속 관계에 있는 클래스
		// - 부모클래스 <-> 자식클래스
		// - 슈퍼클래스 <-> 서브클래스
		// - 기본클래스 <-> 확장,파생클래스
		
		Parent p = new Parent();
		
		Child c = new Child();
	
		EEE e = new EEE();
		
		
		
	}//main

}

class Parent {
	public int a;
	public int b;
	
	public void aaa() {}
}

class Child extends Parent { //상속
	public int c;
	public int d;
	
	public void ccc() {}
}

class AAA {
	public int a;
}

class BBB extends AAA {
	public int b;
}

class CCC extends BBB {
	public int c;
}

class DDD extends CCC {
	public int d;
}

class EEE extends DDD {
	public int e;
}





























