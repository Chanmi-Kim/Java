package com.test.example.inheritance;

public class Ex61_interface {
	
	public static void main(String[] args) {
		
		//Ex61_interface.java
		
		//인터페이스, interface
		// - 자바의 구성요소
		// - 클래스의 일종(자료형 -> 변수 생성 가능)
		// - 추상 클래스와 유사
		//	
		
		Bose1000 bose = new Bose1000();
		bose.on();
		bose.off();
		
		
		Dell2000 dell = new Dell2000();
		dell.on();
		dell.off();
		
	}//main
}

/*

class 일반클래스 {
	구현 멤버
}

abstract class 추상클래스 {
	구현 멤버
	추상 멤버
}

interface 인터페이스 {
	추상 멤버
	//인터페이스 구현된 멤버를 가질 수 없다.(극단적인 추상화 개념)
}

*/

//인터페이스 설계
interface ISpeaker {
	
	//구현 멤버를 가질 수 없다.
	//public int a;
	//public void test() {
	//}
	
	//인터페이스의 추상멤버 특징
	//1. public
	//2. abstract
	
	void on();
	void off();	
	
}

class Bose1000 implements ISpeaker {

	@Override
	public void on() {
		//전원켜기 + Bose만 기술
		System.out.println("전원 On");
	}

	@Override
	public void off() {
		System.out.println("전원 Off");
	}
	
}

class Dell2000 implements ISpeaker {

	@Override
	public void on() {
		//전원켜기 + 델만의 기술
		System.out.println("Power On");
	}

	@Override
	public void off() {
		System.out.println("Power Off");
	}
	
}
















