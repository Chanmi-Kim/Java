package example;

// 1. *.java 파일 1개당 클래스 1개를 선언한다. (관리 때문)
// 2. *.java 파일명은 반드시 클래스명과 동일해야 한다. (public 클래스가 대표 클래스)
public class Student {

	public String name;
	public int age;
	public String adress;
	public int height;
	public int weight;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}

class AAA {

}