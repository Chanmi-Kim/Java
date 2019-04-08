package example;

public class Pencil {

	private static int PencilCount;
	private String hardness =""; // 흑연 등급
		
	
	public String getHardness() {
		return hardness;
	}

	public void setHardness(String hardness) {
		this.hardness = hardness;
	}
	
	public String info() {
		// 연필의 정보를 반환한다.
		return hardness + " 진하기 연필입니다.";
	}

	public static int getPencilCount() {
		return PencilCount;
	}

	public static void setPencilCount(int pencilCount) {
		PencilCount = pencilCount;
	}
}
