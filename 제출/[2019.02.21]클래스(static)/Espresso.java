package example;

class Espresso {

	private int bean;	// 에스프레소 생산 시 들어가는 원두량(g)
	
	
	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public void drink() {
		// 커피를 마신다.(출력)
		System.out.printf("원두 %dg으로 만들어진 에스프레소를 마십니다.\n", bean);
	}

}
