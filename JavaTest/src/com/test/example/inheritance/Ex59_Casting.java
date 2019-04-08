package com.test.example.inheritance;

public class Ex59_Casting {
	
	public static void main(String[] args) {
		
		//Ex59_Casting.java
		// ************************* 중요
		// 상속 + 참조형 형변환 + 배열 + 제어문 + 추상 클래스(메소드) 등..
		// 프로젝트 반복 패턴
		
		//상황]
		//1. 전자 제품 대리점 운영
		//2. 프린터 취급
		//3. LG300 x 5대, HP400 x 3대
		
		//운영방침] ***
		//1. 한달 1번 > 모든 제품이 정상 동작인지 확인 > 출력 기능 체크
		
		//상황 변경]
		//1. 재고량 증가 > LG300(100), HP400(50)
		//2. 브랜드 증가 > Dell500, Samsung600, BenQ700
		//3. 점검 사항 > 각 제품의 본연 기능 테스트
		
		//m1();
		//m2(); //** 선택
		m3(); //** 선택
		//m4();
		
	}

	private static void m4() {
		
		Printer p = new LG300();//업캐스팅 가능
		
		//업캐스팅의 단점(부모 클래스의 멤버만 접근 가능 + 자식 클래스가 구현 자신의 멤버는 접근 불가능(내부에 존재O))
		p.print();
		//p.call();
		
		//다운 캐스팅
		LG300 lg = (LG300)p;
		
		lg.call();
		
		
		
		
	}

	private static void m3() { 
		
//		LG300 lg = new LG300();
//		HP400 hp = new HP400();
//		
//		//Printer < LG300
//		Printer p1 = new LG300();
//		Printer p2 = lg;
//		
//		//Printer < HP400
//		Printer p3 = new HP400();
//		Printer p4 = hp;
//		
//		Printer p = new Printer();
//		Printer[] ps = new Printer[2];
//		ps[0] = new LG300();
//		ps[1] = new HP400();
		
		//재고 확보 > 배열 사용 > 클래스 업캐스팅 + 같은 부모를 가지는 서로 다른 브랜드를 하나의 배열에서 관리 가능
		
		Printer[] ps = new Printer[8];
		
		for (int i=0; i<ps.length; i++) {
			if (i < 5) {
				ps[i] = new LG300();
			} else {
				ps[i] = new HP400();
			}
		}
		
		//** 업캐스팅(하나 배열) + 일관된 접근성 제공(추상 메소드)
		for (int i=0; i<ps.length; i++) {
			ps[i].print();
			
			//i > LG or HP ?
			//System.out.println(ps[i] instanceof HP400);
			if (ps[i] instanceof LG300) {
				//LG?
				
				LG300 lg = (LG300)ps[i];
				lg.call();
				
				
				//((LG300)ps[i]).call();
				
				
			} else if (ps[i] instanceof HP400) {
				//HP?
				HP400 hp = (HP400)ps[i];
				hp.selfCheck();
			}
			
		}
		
	}

	private static void m2() {
		
		//재고 확보 > 배열 사용
		LG300[] lgs = new LG300[5];
		
		for (int i=0; i<lgs.length; i++) {
			lgs[i] = new LG300();			
		}
		
		HP400[] hps = new HP400[3];
		
		for (int i=0; i<hps.length; i++) {
			hps[i] = new HP400();
		}
		
		//정기 점검
		for (int i=0; i<lgs.length; i++) {
			lgs[i].print();			
			lgs[i].call();
		}
		
		for (int i=0; i<hps.length; i++) {
			hps[i].print();
			hps[i].selfCheck();
		}
		
		
	}

	private static void m1() {
		
		//가장 원시적인 방법
		LG300 lg1 = new LG300();
		LG300 lg2 = new LG300();
		LG300 lg3 = new LG300();
		LG300 lg4 = new LG300();
		LG300 lg5 = new LG300();
		
		HP400 hp1 = new HP400();
		HP400 hp2 = new HP400();
		HP400 hp3 = new HP400();
		
		//한달 1회 > 정기 점검
		lg1.print();
		lg2.print();
		lg3.print();
		lg4.print();
		lg5.print();
		
		hp1.print();
		hp2.print();
		hp3.print();
		
	}

}//Ex.main

//추상 클래스
// - 회사나 모델에 상관없이 모든 프린터라고 불리는 기기들이 가져야 할 공통 사항을 정의한 클래스
abstract class Printer {
	
	//구현 멤버
	// - 회사나 모델에 상관없이 모든 프린터가 가지는 완전하게 동일한 기능들
	public String model;
	public int price;
	public int ink;
	
	public void info() {
		System.out.printf("모델명 : %s, 가격 : %,d원, 잉크량 : %,dml\n"
						, this.model, this.price, this.ink);
	}
	
	//추상 멤버
	// - 회사나 모델에 상관없이 모든 프린터가 가져야할 공통 기능 + 구현은 각각의 제품이 따로 구현(회사마다 구현 기술 상이)
	public abstract void print();
	
}

//LG 프린터 설계도
class LG300 extends Printer {

	@Override
	public void print() {
		//출력 + LG만의 기술로 구현
		System.out.println("LG300으로 잉크젯으로 출력합니다.");
	}
	
	//LG300만이 가지는 특화된 기능
	public void call() {
		System.out.println("상담원과 연결중입니다.");
	}
	
}

//HP 프린터 설계도
class HP400 extends Printer {

	@Override
	public void print() {
		//출력 + HP만의 독자적인 기술 사용
		System.out.println("HP400으로 레이저 출력을 합니다.");		
	}
	
	//HP 독자적인 기능
	public void selfCheck() {
		System.out.println("자가 진행 + 수정입니다.");
	}
	
}































