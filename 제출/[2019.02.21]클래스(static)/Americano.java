package example;

class Americano {

	private int bean;	// 아메리카노 생산 시 들어가는 원두량(g)
	private int water;	// 아메리카노 생산 시 들어가는 물량(ml)
	private int ice;	// 아메리카노 생산 시 들어가는 얼음 개수(개)
	
	
	public int getBean() {
		return bean;
	}

	public void setBean(int bean) {
		this.bean = bean;
	}

	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getIce() {
		return ice;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}

	public void drink() {
		// 커피를 마신다.(출력)
		System.out.printf("원두 %dg, 물 %dml, 얼음 %d개로 만들어진 아메리카노를 마십니다.\n", bean, water, ice);
	}
}
