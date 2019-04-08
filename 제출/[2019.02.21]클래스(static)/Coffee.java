package example;

class Coffee {
	
	private static int bean = 0;	// 총 원두량(g)
	private static int water = 0;	// 총 물 용량(ml)
	private static int ice = 0;		// 총 얼음 개수(개)
	private static int milk = 0;	// 총 우유 용량(ml)
	
	private static int beanUnitPrice = 1;	// 원두 단가(원), 1g당 1원
	private static double waterUnitPrice = 0.2;	// 물 단가(원), 1ml당 0.2원
	private static int iceUnitPrice = 3;	// 얼음 단가(원), 1개당 3원
	private static int milkUnitPrice = 4;	// 우유 단가(원), 1ml당 4원
	
	private static int beanTotalPrice = 0;	// 원두 총 판매액(원)
	private static double waterTotalPrice = 0;	// 물 총 판매액(원)
	private static int iceTotalPrice = 0;	// 얼음 총 판매액(원)
	private static int milkTotalPrice = 0;	// 우유 총 판매액(원)
	
	private static int americano = 0;		// 아메리카노 총 판매 개수(잔)
	private static int latte = 0;			// 라테 총 판매 개수(잔)
	private static int espresso = 0;		// 에스프레소 총 판매 개수(잔)
	
	public static int getBean() {
		return bean;
	}
	public static void setBean(int bean) {
		Coffee.bean = bean;
	}
	public static int getWater() {
		return water;
	}
	public static void setWater(int water) {
		Coffee.water = water;
	}
	public static int getIce() {
		return ice;
	}
	public static void setIce(int ice) {
		Coffee.ice = ice;
	}
	public static int getMilk() {
		return milk;
	}
	public static void setMilk(int milk) {
		Coffee.milk = milk;
	}
	public static int getBeanUnitPrice() {
		return beanUnitPrice;
	}
	public static void setBeanUnitPrice(int beanUnitPrice) {
		Coffee.beanUnitPrice = beanUnitPrice;
	}
	public static double getWaterUnitPrice() {
		return waterUnitPrice;
	}
	public static void setWaterUnitPrice(int waterUnitPrice) {
		Coffee.waterUnitPrice = waterUnitPrice;
	}
	public static int getIceUnitPrice() {
		return iceUnitPrice;
	}
	public static void setIceUnitPrice(int iceUnitPrice) {
		Coffee.iceUnitPrice = iceUnitPrice;
	}
	public static int getMilkUnitPrice() {
		return milkUnitPrice;
	}
	public static void setMilkUnitPrice(int milkUnitPrice) {
		Coffee.milkUnitPrice = milkUnitPrice;
	}
	public static int getBeanTotalPrice() {
		return beanTotalPrice;
	}
	public static void setBeanTotalPrice(int beanTotalPrice) {
		Coffee.beanTotalPrice = beanTotalPrice;
	}
	public static double getWaterTotalPrice() {
		return waterTotalPrice;
	}
	public static void setWaterTotalPrice(double waterTotalPrice) {
		Coffee.waterTotalPrice = waterTotalPrice;
	}
	public static int getIceTotalPrice() {
		return iceTotalPrice;
	}
	public static void setIceTotalPrice(int iceTotalPrice) {
		Coffee.iceTotalPrice = iceTotalPrice;
	}
	public static int getMilkTotalPrice() {
		return milkTotalPrice;
	}
	public static void setMilkTotalPrice(int milkTotalPrice) {
		Coffee.milkTotalPrice = milkTotalPrice;
	}
	public static int getAmericano() {
		return americano;
	}
	public static void setAmericano(int americano) {
		Coffee.americano = americano;
	}
	public static int getLatte() {
		return latte;
	}
	public static void setLatte(int latte) {
		Coffee.latte = latte;
	}
	public static int getEspresso() {
		return espresso;
	}
	public static void setEspresso(int espresso) {
		Coffee.espresso = espresso;
	}
}
