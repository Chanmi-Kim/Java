package example;

public class Eraser {

	private static int eraserCount;
	private String size = ""; // 지우개크기
	
	
	public String getSize() {
		return size;
	}
	
	public void setSize(String size) {
		this.size = size;	
	}
	
	public String info() {
		// 지우개의 정보를 반환한다.
		return size + " 사이즈 연필입니다.";
	}

	public static int getEraserCount() {
		return eraserCount;
	}

	public static void setEraserCount(int eraserCount) {
		Eraser.eraserCount = eraserCount;
	}
}
