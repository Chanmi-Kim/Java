package com.test.example.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Ex82_Collection {
	
	public static void main(String[] args) {
		
		//Ex82_Collection.java
		
		//m1();
		m2();
		
	}

	private static void m2() {
		
		//배열 or 컬렉션 > 컬렉션
		ArrayList<Integer> ns = new ArrayList<Integer>();
		Random rnd = new Random();
		
		for (int i=0; i<10; i++) {
			ns.add(rnd.nextInt(30) + 1); //1 ~ 30
		}
		
		System.out.println("원본");
		System.out.println(ns);
		
		//JDK에서 정렬 지원
		//Arrays - 배열 도움
		//Collections - List,Set 도움
		//Quick Sort
		//오름차순
		Collections.sort(ns); //List<T> <- (업캐스팅) <- ArrayList<T>
		
		System.out.println("정렬");
		System.out.println(ns);
		
		//내림차순(X) -> 순서 반대로 뒤집기 -> 오름차순+뒤집기 > 내림차순
		Collections.reverse(ns);
		
		System.out.println("정렬");
		System.out.println(ns);
		
		
		
		ArrayList<String> ss = new ArrayList<String>();
		
		ss.add("가가가");
		ss.add("마마마");
		ss.add("나나나");
		ss.add("라라라");
		ss.add("다다다");
		
		System.out.println(ss);
		Collections.sort(ss);
		System.out.println(ss);
		
		
		ArrayList<Calendar> cs = new ArrayList<Calendar>();
		
		Calendar c1 = Calendar.getInstance(); c1.set(Calendar.DATE, 1);		
		Calendar c2 = Calendar.getInstance(); c2.set(Calendar.DATE, 25);		
		Calendar c3 = Calendar.getInstance(); c3.set(Calendar.DATE, 10);		
		Calendar c4 = Calendar.getInstance(); c4.set(Calendar.DATE, 16);		
		Calendar c5 = Calendar.getInstance(); c5.set(Calendar.DATE, 5);
		
		cs.add(c1);
		cs.add(c2);
		cs.add(c3);
		cs.add(c4);
		cs.add(c5);
		
		//c1.compareTo(c2);
		
		Collections.sort(cs);
		Collections.reverse(cs); //추가


		
		for (Calendar c : cs) {
			System.out.printf("%tF\n", c);
		}

		//내림차순 + 최근 3개 추출
		for (int i=0; i<3; i++) {
			System.out.printf("%tF\n", cs.get(i));
		}
		
		
		
		ArrayList<Employee> ms = new ArrayList<Employee>();
		
		ms.add(new Employee("홍길동", 3000000));
		ms.add(new Employee("하하하", 3500000));
		ms.add(new Employee("호호호", 4000000));
		ms.add(new Employee("후후후", 2500000));
		ms.add(new Employee("아무개", 3200000));
		
		//왜 안되는지??? -> 1번째 직원의 값 > 2번째 직원의 값
		//Collections.sort(ms);
		
		System.out.println(ms);
		
		Collections.sort(ms, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				//우리가 직접 정렬을 구현했을 때 두 요소를 우위 비교하는 if문 역할의 메소드
				//.System.out.printf("%s - %s\n", o1, o2);
				
				
				//*** 스왑 유무를 판단하는 값
				//ms[j].getPrice() > ms[j+1].getPrice()
				//return -1;
				
//				if (o1.getSalary() > o2.getSalary()) {
//					return 1;
//				} else if (o1.getSalary() < o2.getSalary()) {
//					return -1;
//				} else {
//					return 0;
//				}
				
				return o2.getSalary() - o1.getSalary();
			}
			
		});
		
		System.out.println(ms);
		
		
		ArrayList<MStudent> ts = new ArrayList<MStudent>();

		ts.add(new MStudent("홍길동", 100, 90, 80));
		ts.add(new MStudent("아무개", 89, 76, 57));
		ts.add(new MStudent("하하하", 23, 65, 83));
		ts.add(new MStudent("호호호", 100, 95, 100));
		ts.add(new MStudent("후후후", 88, 77, 66));
		
		//특정값으로 정렬
		Collections.sort(ts, new Comparator<MStudent>() {

			@Override
			public int compare(MStudent o1, MStudent o2) {
				
				//return o1.getKor() - o2.getKor(); //국어점수 + 오름차순
				//return o2.getEng() - o1.getEng(); //영어점수 + 내림차순
				//return o1.getTotal() - o2.getTotal(); //총점 + 오름차순 //****
				return o2.getName().compareTo(o1.getName());
			}
			
		});
		
		System.out.println(ts);
		
		
		String s1 = "홍길동";
		String s2 = "홍길돈";
		
		System.out.println(s1.compareTo(s2));
		
		
	}

	private static void m1() {
		
		//배열 or 켈렉션
		//list[0] = list[0] + 10;
		//list.set(list.get(0) + 10);
		
		//정렬 가능 대상
		//1. 숫자(정수,실수)
		//2. 문자(코드값)
		//3. 문자열(X) -> 문자(O)
		//4. 날짜/시간
		//5. 참조형(데이터 저장 객체, X) -> 1~4(O)
		
		int[] ns1 = { 5, 3, 4, 8, 9, 7, 2, 1, 6, 0 };
		
		//오름차순 정렬 > 버블 정렬 > 2중 for문
		for (int i=0; i<ns1.length-1; i++) {
			for (int j=0; j<ns1.length-1-i; j++) {
				
				//상황에 맞게 수정
				//오름차순?(>) 내림차순?(<) + 어떤값이 정렬 기준 + Swap
				if (ns1[j] > ns1[j+1]) {
					int temp = ns1[j];
					ns1[j] = ns1[j+1];
					ns1[j+1] = temp;
				}				
				
			}
		}
		
		System.out.println(Arrays.toString(ns1));
		
		
		
		String[] names = { "홍길동", "이가신", "이하신", "이순신", "권율", "유관순", "유재석", "박명수", "하하", "정형돈", "노홍철", "정준하" };
		
		//이름 오름차순(가나다순)		
		for (int i=0; i<names.length-1; i++) {
			for (int j=0; j<names.length-1-i; j++) {
				
				//뭘? A|D? Swap
//				if (names[j] > names[j+1]) {
//					//"홍길동" > "이순신"
					//"이순신" > "홍길동"
//				}
				
				int length = (names[j].length() > names[j+1].length()) ? names[j+1].length() : names[j].length();
				
				for (int k=0; k<length; k++) {
					//System.out.println(names[j].charAt(k) + ", " + names[j+1].charAt(k));
					if (names[j].charAt(k) > names[j+1].charAt(k)) {
						//System.out.println("swap");
						String temp = names[j];
						names[j] = names[j+1];
						names[j+1] = temp;
						break;//k loop
					} else if (names[j].charAt(k) < names[j+1].charAt(k)) {
						break;
					}
				}
				//System.out.println();
			}
			//System.out.println();
		}//for
		
		System.out.println(Arrays.toString(names));
		
		
		
		//날짜 비교		
		Calendar c1 = Calendar.getInstance();
		c1.set(Calendar.DATE, 1);
		
		Calendar c2 = Calendar.getInstance();
		c2.set(Calendar.DATE, 25);
		
		Calendar c3 = Calendar.getInstance();
		c3.set(Calendar.DATE, 10);
		
		Calendar c4 = Calendar.getInstance();
		c4.set(Calendar.DATE, 16);
		
		Calendar c5 = Calendar.getInstance();
		c5.set(Calendar.DATE, 5);
		
		Calendar[] cs = { c1, c2, c3, c4, c5 };

		
		//System.out.println(Arrays.toString(cs));
		for (Calendar c : cs) {
			System.out.printf("%tF\n", c);
		}
		
		for (int i=0; i<cs.length-1; i++) {
			for (int j=0; j<cs.length-1-i; j++) {
				
				//비교 > tick값(long)
				long t1 = cs[j].getTime().getTime();
				long t2 = cs[j+1].getTime().getTime();
				
				if (t1 > t2) {
					Calendar temp = cs[j];
					cs[j] = cs[j+1];
					cs[j+1] = temp;
				}
				
			}
		}//2 for
		
		System.out.println();
		for (Calendar c : cs) {
			System.out.printf("%tF\n", c);
		}
		
		
		
		//직원 목록
		Employee[] es = { 
				new Employee("홍길동", 3000000), 
				new Employee("아무개", 2750000),
				new Employee("하하하", 3750000),
				new Employee("호호호", 2500000),
				new Employee("후후후", 4000000)
		};
		
		System.out.println();
		System.out.println(Arrays.toString(es));
		
		for (int i=0; i<es.length-1; i++) {
			for (int j=0; j<es.length-1-i; j++) {
				
				if (es[j].getSalary() > es[j+1].getSalary()) {
					Employee temp = es[j];
					es[j] = es[j+1];
					es[j+1] = temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(es));
		
	}

}


//직원 클래스
class Employee {
	
	private String name;
	private int salary;
	
	public Employee() {
		this("", 0);
	}
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		
		return this.name + "/" + this.salary;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	
}


class MStudent {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	
	//Constructor + Getter/Setter + toString()
	
	public MStudent(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public String toString() {
		return "MStudent [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
	public int getTotal() {
		
		return this.kor + this.eng + this.math;
	}
	
}//MStudent





















