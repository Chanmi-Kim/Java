package com.test.example.inheritance;

public class Ex63_Inheriatnce {
	
	public static void main(String[] args) {
		
		//Ex63_Inheriatnce.java
		
		//상속
		// - 상속의 구성원이 될 수 있는 요소
		// - 일반클래스, 추상클래스, 인터페이스
		
		//1. 일반클래스(자식) -> 일반클래스(부모) //O
		//2. 일반클래스(자식) -> 추상클래스(부모) //O
		//3. 일반클래스(자식) -> 인터페이스(부모) //O
		//4. 추상클래스(자식) -> 일반클래스(부모) //O -> 쓰지 말것!!!
		//5. 인터페이스(자식) -> 일반클래스(부모) //X -> 인터페이스는 구현 멤버 불가능
		//6. 인터페이스(자식) -> 추상클래스(부모) //X -> 5번과 같은 이유.
		//7. 추상클래스(자식) -> 추상클래스(부모) //O
		//8. 인터페이스(자식) -> 인터페이스(부모) //O
		//9. 일반클래스 -> 일반클래스 -> 일반클래스 -> 추상클래스 -> 추상클래스 -> 인터페이스 -> 인터페이스
		
	}

}

class AAAA {
	public int a;
}

abstract class BBBB extends AAAA {
	
}

//interface CCCC extends AAAA {
//	
//}

abstract class DDDD {
	public int a;
	public abstract void aaa();
}

abstract class EEEE extends DDDD {
	//부모가 추상클래스일 경우 + 상속받은 추상 메소드??
	//1. 그대로 둔다.
	//2. 구현한다.
	public void aaa() {
		
	}
	
}

class FFFF extends EEEE {
	
}




interface GGGG {
	void gggg();
}

interface HHHH extends GGGG {
	void hhhh();
}

interface IIII extends HHHH {
	void iiii();
}

class JJJJ implements IIII {

	@Override
	public void hhhh() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gggg() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void iiii() {
		// TODO Auto-generated method stub
		
	}
	
}


//클래스 선언
interface 동물 {
	void 숨쉬다();
}

interface 포유류 extends 동물 {
	void 새끼를낳다();
}

interface 파충류 extends 동물 {
	void 알을낳다();
}

interface 원숭이 extends 포유류 {
	void 매달리다();
}

interface 개 extends 포유류 {
	void 짖다();
}

class 긴꼬리원숭이 implements 원숭이 {

	@Override
	public void 새끼를낳다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 숨쉬다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 매달리다() {
		// TODO Auto-generated method stub
		
	}
	
}


//인터페이스 다중 상속
// - 자바는 다중 상속을 지원 안한다.(일반클래스, 추상클래스)
// - 인터페이스끼리는 다중 상속을 지원한다.

interface 사람 {
	void 숨쉰다();
}

interface 남자 extends 사람 {
	void 군대를간다();
}

interface 여자 extends 사람 {
	void 아기를가진다();
}

//---------------------------------

interface 직원 {
	void 일한다();
}

interface 간부 extends 직원 {
	void 관리한다();
}

interface 사원 extends 직원 {
	void 보고서를작성한다();
}

//----------------------------------

interface 아빠 {
	void 빨래한다();
}

interface 엄마 {
	void 설거지를한다();
}


//홍길동 클래스
class Person implements 남자, 사원, 아빠 {

	@Override
	public void 숨쉰다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 일한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 빨래한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 보고서를작성한다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 군대를간다() {
		// TODO Auto-generated method stub
		
	}
	
}














