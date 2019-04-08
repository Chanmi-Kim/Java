package example;

class Student {

	private String name;							// 이름
	private int age;								// 나이
	private int grade;								// 학년
	private int classNumber;						// 반
	private int number;								// 번호
	private static String school = "";	

	
	public Student() {
		// 기본 생성자
		this("미정", 0, 0, 0, 0);
	}
	
	/**
	 * == 인자리스트 변수명 ==
	 * @param name 			이름
	 * @param age			나이
	 * @param grade			학년
	 * @param classNumber	반
	 * @param number		번호
	 */
	public Student(String name, int age, int grade, int classNumber, int number) {
		// 생성자 오버로딩
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	public Student(String name, int age) {
		// 생성자 오버로딩
		this.name = name;
		this.age = age;
	}
	
	public Student(int grade, int classNumber, int number) {
		// 생성자 오버로딩
		
		this("미정", 0, 0, 0, 0);
		this.grade = grade;
		this.classNumber = classNumber;
		this.number = number;
	}
	
	static {
		// 정적 생성자
		Student.school = "역삼 중학교"; // 학교 모두 '역삼 중학교' 재학
	}
	
	public String info() {
		
		// 삼항연산자를 사용하여, 인자리스트 자리에 값이 없으면 "미정"으로 출력
		return name + "(나이 : " + ((age == 0) ? "미정" : age + "세")  
				+ ", 학년 : " + ((grade == 0) ? "미정" : grade + "반") 
				+ ", 반 : " + ((classNumber == 0) ? "미정" : classNumber)
				+ ", 번호 : " + ((number == 0) ? "미정" : number);
	}	
}