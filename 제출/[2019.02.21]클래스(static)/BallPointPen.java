package example;

public class BallPointPen {

	private static int ballPointPenCount;
	private double thickness = 0; 	// 볼펜 심 두께
	private String color = "";		// 볼펜 색상
	
	
	public double getThickness() {
		return thickness;
	}
	
	public void setThickness(double thickness) {
		this.thickness = thickness;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String info() {
		// 볼펜의 정보를 반환한다.
		return color + " 색상 " + thickness + "mm 볼펜입니다.";
	}

	public static int getBallPointPenCount() {
		return ballPointPenCount;
	}

	public static void setBallPointPenCount(int ballPointPenCount) {
		BallPointPen.ballPointPenCount = ballPointPenCount;
	}
}