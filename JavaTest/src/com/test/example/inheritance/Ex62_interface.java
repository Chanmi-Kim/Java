package com.test.example.inheritance;

public class Ex62_interface {
	
	public static void main(String[] args) {
		
		//Ex62_interface.java
		
		//사무실 > 과장님 > 홍길동 직원에게 업무 시키는 중..
		Employee hong = new Employee();
		
		//과장님이 홍길동에게 업무 위임(전달) 
		hong.work();
		
	}//main(사무실+과장님)

}

//직원 클래스 > 홍길동
class Employee {

	public void work() {
		
		//위임받은 업무 > 변경
		//1. 텍스트 파일 읽기 > 내용 가져온 뒤 > 업무 처리(적용)
		//1. 데이터베이스 읽기 > 내용 가져온 뒤 > 업무 처리(적용)
		
		//m1. 업무 진행
		//String data = "파일에서 읽은 데이터";
		//String data = "데이터베이스에서 읽은 데이터"; //수정
		
		//m2. 다른 사람에게 위임
		// - 홍길동에게 업무를 위임받을 객체 필요 > 클래스 필요
		//FileData file = new FileData();
		//String data = file.getData();
		//DBData db = new DBData();
		//String data = db.getDBData();
		
		//m3. 다른 사람에게 위임
		//FileData file = new FileData();
		//String data = file.getData();
		//DBData db = new DBData();
		//String data = db.getDB();
		
		//****** 되도록 인터페이스를 상속받은(구현한) 클래스의 객체를 담는 변수는 해당 클래스 타입으로 작성하지 말고 인터페이스로 만들어서 사용할 것!!!!!!
		
		//FileData data = new FileData();
		//SubWorker sub = new FileData();//업캐스팅
		//String data = sub.getData();
		SubWorker sub = new DBData();
		String data = sub.getData();
		
		
		//업무 적용 - 변함X
		System.out.println("결과 : " + data);
		
		//System.out.println(sub.isValid());
		
	}
	
}


//인터페이스 설계 > 역할 : 길동이에게 데이터 공급
interface SubWorker {
	String getData();
}

//파일 읽기 위임
class FileData implements SubWorker {
	
	public String getData() {
		
		String data = "파일에서 읽은 데이터";
		return data;
	}
	
	public String getFile() {
		
		String data = "파일에서 읽은 데이터";
		return data;
	}
	
	public boolean isValid() {
		
		return true; //파일이 손상이 안됐는지??
	}
	
}

//데이터베이스 읽기 위임
class DBData implements SubWorker {
	
	public String getData() {
		
		String data = "데이터베이스에서 읽은 데이터";
		return data;
	}
	
	public String getDB() {
		
		String data = "데이터베이스에서 읽은 데이터";
		return data;
	}
	
	public String checkUser() {
		
		return "hong";
	}
}


























