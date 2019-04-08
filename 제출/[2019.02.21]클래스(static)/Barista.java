package example;

class Barista {

	public Espresso makeEspresso(int bean) {
		// 에스프레소 1잔을 만든다.
		// int bean : 원두량(g)

		Espresso e = new Espresso();
		e.setBean(bean);

		// ====================== Coffee 계산
		Coffee.setBean(Coffee.getBean() + bean);
		Coffee.setBeanTotalPrice(Coffee.getBeanTotalPrice() + Coffee.getBeanUnitPrice() * bean);
		Coffee.setEspresso(Coffee.getEspresso() + 1);

		return e; // 에스프레소 1잔
	}

	public Espresso[] makeEspressoes(int bean, int count) {
		// 에스프레소 1잔을 만든다.
		// int bean : 원두량(g)
		// int count : 음료 개수(잔)

		Espresso[] e_list = new Espresso[count];
		

		for (int i = 0; i < e_list.length; i++) {
			e_list[i] = new Espresso();
			e_list[i].setBean(bean);

			// ====================== Coffee 계산
			Coffee.setBean(Coffee.getBean() + bean);
			Coffee.setBeanTotalPrice(Coffee.getBeanTotalPrice() + Coffee.getBeanUnitPrice() * bean);
			Coffee.setEspresso(Coffee.getEspresso() + 1);	
		}
		System.out.println();

		return e_list; // 에스프레소 N잔
	}

	public Latte makeLatte(int bean, int milk) {
		// 라떼 1잔을 만든다.
		// int bean : 원두량(g)
		// int milk : 우유량(ml)

		Latte l = new Latte();
		l.setBean(bean);
		l.setMilk(milk);

		// ====================== Coffee 계산
		Coffee.setBean(Coffee.getBean() + bean);
		Coffee.setBeanTotalPrice(Coffee.getBeanTotalPrice() + Coffee.getBeanUnitPrice() * bean);
		
		Coffee.setMilk(Coffee.getMilk() + milk);
		Coffee.setMilkTotalPrice(Coffee.getMilkTotalPrice() + Coffee.getMilkUnitPrice() * milk);
		
		Coffee.setLatte(Coffee.getLatte() + 1);
		
		return l; // 라떼 1잔
	}

	public Latte[] makeLattes(int bean, int milk, int count) {
		// 라떼 N잔을 만든다.
		// int bean : 원두량(g)
		// int milk : 우유량(ml)
		// int count : 음료 개수(잔)

		Latte[] l_list = new Latte[count];

		for (int i = 0; i < l_list.length; i++) {
			l_list[i] = new Latte();
			l_list[i].setBean(bean);
			l_list[i].setMilk(milk);

			// ====================== Coffee 계산
			Coffee.setBean(Coffee.getBean() + bean);
			Coffee.setBeanTotalPrice(Coffee.getBeanTotalPrice() + Coffee.getBeanUnitPrice() * bean);
			Coffee.setMilk(Coffee.getMilk() + milk);
			Coffee.setMilkTotalPrice(Coffee.getMilkTotalPrice() + Coffee.getMilkUnitPrice() * milk);
			Coffee.setLatte(Coffee.getLatte() + 1);
		}
		
		
		System.out.println();

		return l_list; // 라떼 N잔
	}

	public Americano makeAmericano(int bean, int water, int ice) {
		// 아메리카노 1잔을 만든다.
		// int bean : 원두량(g)
		// int water : 물량(ml)
		// int ice : 얼음 개수(개)

		Americano a = new Americano();
		a.setBean(bean);
		a.setWater(water);
		a.setIce(ice);

		// ====================== Coffee 계산
		Coffee.setBean(Coffee.getBean() + bean);
		Coffee.setBeanTotalPrice(Coffee.getBeanTotalPrice() + Coffee.getBeanUnitPrice() * bean);
		
		Coffee.setWater(Coffee.getWater() + water);
		Coffee.setWaterTotalPrice(Coffee.getWaterTotalPrice() + Coffee.getWaterUnitPrice() * water);
		
		Coffee.setIce(Coffee.getIce() + ice);
		Coffee.setIceTotalPrice(Coffee.getIceTotalPrice() + Coffee.getIceUnitPrice() * ice);
		
		Coffee.setAmericano(Coffee.getAmericano() + 1);

		return a; // 아메리카노 1잔
	}

	public Americano[] makeAmericanos(int bean, int water, int ice, int count) {
		// 아메리카노 N잔을 만든다.
		// int bean : 원두량(g)
		// int water : 물량(ml)
		// int ice : 얼음 개수(개)
		// int count : 음료 개수(잔)

		Americano[] a_list = new Americano[count];

		for (int i = 0; i < a_list.length; i++) {
			a_list[i] = new Americano();
			a_list[i].setBean(bean);
			a_list[i].setWater(water);
			a_list[i].setIce(ice);

			// ====================== Coffee 계산
			Coffee.setBean(Coffee.getBean() + bean);
			Coffee.setBeanTotalPrice(Coffee.getBeanTotalPrice() + Coffee.getBeanUnitPrice() * bean);
			Coffee.setWater(Coffee.getWater() + water);
			Coffee.setWaterTotalPrice(Coffee.getWaterTotalPrice() + Coffee.getWaterUnitPrice() * water);
			Coffee.setIce(Coffee.getIce() + ice);
			Coffee.setIceTotalPrice(Coffee.getIceTotalPrice() + Coffee.getIceUnitPrice() * ice);
			Coffee.setAmericano(Coffee.getAmericano() + 1);
		}
		
		System.out.println();

		return a_list;
	}

	public void result() {
		// 판매 결과를 출력한다.
		// 음료 판매량(에스프레소 판매 개수, 라떼 판매 개수, 아메리카노 판매 개수)
		// 원자재 소비량(원두 소비량, 물 소비량, 우유 소비량, 얼음 소비량)
		// 매출액(원두 판매액, 물 판매액, 우유 판매액, 얼음 판매액)

		System.out.println("=================================");
		System.out.println("판매 결과");
		System.out.println("=================================");

		System.out.println("---------------------------------");
		System.out.println("음료 판매량");
		System.out.println("---------------------------------");
		System.out.printf("에스프레소 : %d잔\n", Coffee.getEspresso());
		System.out.printf("아메리카노 : %d잔\n", Coffee.getAmericano());
		System.out.printf("라테 : %d잔\n", Coffee.getLatte());

		System.out.println("---------------------------------");
		System.out.println("원자재 소비량");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,dg\n", Coffee.getBean());
		System.out.printf("물 : %,dml\n", Coffee.getWater());
		System.out.printf("얼음 : %,d개\n", Coffee.getIce());
		System.out.printf("우유 : %,dml\n", Coffee.getMilk());

		System.out.println("---------------------------------");
		System.out.println("매출액");
		System.out.println("---------------------------------");
		System.out.printf("원두 : %,d원\n", Coffee.getBeanTotalPrice());
		System.out.printf("물 : %,.0f원\n", Coffee.getWaterTotalPrice());
		System.out.printf("얼음 : %,d원\n", Coffee.getIceTotalPrice());
		System.out.printf("우유 : %,d원\n", Coffee.getMilkTotalPrice());
	}
}