package example;

public class Ruler {

	private static int rulerCount;
	private int length = 0;		// 자 길이
	private String shape = "";	// 자 형태
	
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String info() {
		// 자의 정보를 반환한다.
		return length + "cm " + shape + "입니다.";
	}

	public static int getRulerCount() {
		return rulerCount;
	}

	public static void setRulerCount(int rulerCount) {
		Ruler.rulerCount = rulerCount;
	}
}
