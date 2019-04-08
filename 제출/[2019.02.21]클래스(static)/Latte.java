package example;

class Latte {

	private int bean;	// 라테 생산 시 들어가는 원두량(g)
	private int milk;	// 라테 생산 시 들어가는 우유량(ml) 
	
	
	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getMilk() {
		return milk;
	}

	public void setMilk(int milk) {
		this.milk = milk;
	}

	public void drink() {
		// 커피를 마신다.(출력)
		System.out.printf("원두 %dg, 우유 %dml으로 만들어진 라테를 마십니다.\n", bean, milk);
	
	}
}
